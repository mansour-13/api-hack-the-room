package test.server.demo.ai;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AiController {

    final
    AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }


    @GetMapping("/fortuneCookie")
    public String getResult(@RequestParam(defaultValue = "Xena") String name){
        return this.aiService.prompt(String.format("Create a furtune cookie quote which %s should read. Make it funny and short (max 20 words).", name));
    }

    // Working to include this PostMapping
    @PostMapping(value = "/evaluateCode", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> evaluateCode(@RequestBody String code) {
        String promptToEvaluate = "Evaluate the following code for correctness: " + code + ". Answer with true or false.";

        String result = this.aiService.prompt(promptToEvaluate);
        return ResponseEntity.ok(Collections.singletonMap("result", result));
    }

    // Working to include this PostMapping
    @PostMapping(value = "/produceAHint", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> produceAHint(@RequestBody CodeComparisonRequest request) {
        String promptToEvaluate = "Here is a coding challenge:\n\n" +
                request.getCodeChallenge() +
                "\n\nHere is a proposed solution:\n\n" +
                request.getCode() +
                "Give a hint to the user on what his proposed solution is missing to solve the challenge. The hint should not be longer than 3 sentences.";

        String result = this.aiService.prompt(promptToEvaluate);
        return ResponseEntity.ok(Collections.singletonMap("result", result));
    }


    // Working to include this PostMapping
    @PostMapping(value = "/getBinaryAnswerToCode", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBinaryAnswerToCode(@RequestBody CodeComparisonRequest request) {

        String promptToEvaluate =
                "You are given two code snippets. The first snippet, 'assignment', is describing the task for a user to solve in the second snippet, 'code-to-evaluate'.\n\n" +

                        "Please focus on evaluating the 'code-to-evaluate' .\n\n" +

                        "=== assignment ===\n" +
                        request.getCodeChallenge() +
                        "\n=== end of assignment ===\n\n" +

                        "=== code-to-evaluate ===\n" +
                        request.getCode() +
                        "\n=== end of code-to-evaluate ===\n\n" +

                        "1. Has the 'code-to-evaluate' satisfied all the requirements from the 'assignment'? Is the 'code-to-evaluate' valid code that will compile? Respond with 'True' if yes and 'False' if no.\n" +
                        "2. Kindly provide a concise and constructive explanation for your answer, focusing on the most critical aspects, max 3 sentences.";

        String result = this.aiService.prompt(promptToEvaluate);
        Map<String, Object> resultMap = new HashMap<>();
        Boolean responseBoolean = null;

        if (result.toLowerCase().contains("true")) {
            responseBoolean = true;
        } else if (result.toLowerCase().contains("false")) {
            responseBoolean = false;
        }

        if (responseBoolean != null) {
            int index = result.indexOf(responseBoolean.toString()) + responseBoolean.toString().length();
            String explanation = result.substring(index).trim().replaceFirst("[\\d]\\. ", ""); // remove any single-digit number followed by period and space

            // If the result is false, trim the first 4 characters from the explanation
            if (!responseBoolean) {
                explanation = explanation.substring(4);
            }

            resultMap.put("result", responseBoolean);
            resultMap.put("explanation", explanation);
        } else {
            // Handle cases where the response does not contain a recognizable boolean.
            resultMap.put("result", false);
            resultMap.put("explanation", "Unexpected AI response.");
        }

        System.out.println("Sending response: " + resultMap.toString());
        return ResponseEntity.ok(resultMap);
    }

    // Working to include this PostMapping
    @PostMapping(value = "/getSolutionToChallenge", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSolutionToChallenge(@RequestBody String codeChallenge) {
        String promptToEvaluate = "For this codeChallenge: " + codeChallenge + "\n. Give" +
                " the solution to the challenge without any comments. Indicate a new line with \\n";

        String result = this.aiService.prompt(promptToEvaluate);
        System.out.println("ChatGPT solution: " + result);
        return ResponseEntity.ok(Collections.singletonMap("result", result));
    }
}
