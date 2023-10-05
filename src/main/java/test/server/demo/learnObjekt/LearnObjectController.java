package test.server.demo.learnObjekt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.Optional;

@RestController
public class LearnObjectController {
    private final LearnObjectRepository learnObjectRepository;

    public LearnObjectController(LearnObjectRepository learnObjectRepository) {
        this.learnObjectRepository = learnObjectRepository;
        LearnObject temp1 = new LearnObject(
                1,
                "Waffenkammer",
                "You find yourself trapped aboard a damaged spaceship, stranded in the vastness of " +
                        "space. The lights are flickering, the control panel seems dead," +
                        " and the oxygen level is dropping. Desperate, you spot an old emergency" +
                        " emitter. It's your only hope to send a distress signal to a nearby" +
                        " space station. You recall some coding you learned, and decide to try" +
                        " and program the emitter to broadcast a message:" +
                        " \"Houston, we have a problem\".",
                Arrays.asList(
                        "You're in a tight spot, and the emergency emitter is your only hope. Use your coding skills to program it.",
                        "`System.out.println` for printing to the console",
                        "The space station might be your only hope. But wait, isn't there an escape pod on this spaceship?"
                ),
                "public class EmergencyEmitter {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        String emergencyMessage = \"Houston, we have a problem\";  \n" +
                        "        System.out.println(emergencyMessage); \n" +
                        "    }\n" +
                        "}",
                "public class EmergencyEmitter {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        /* TODO: Set the emergencyMessage to:\n" +
                        "        Houston, we have a problem */ \n" +
                        "        String emergencyMessage = \"\"; \n" +

                        "        // TODO: Use the emergencyMessage inside the println-function to emit the emergency signal:\n" +
                        "        System.out.println(); \n" +
                        "\n" +
                        "    }\n" +
                        "}",
                180,
                "/images/learnObject1_Waffenkammer.jpg");
        learnObjectRepository.save(temp1);
        LearnObject temp2 = new LearnObject(
                2,
                "Oxygen Capsule Collector",
                "As you continue trying to escape the spaceship, you find a compartment containing oxygen capsules that could help prolong your time aboard the damaged vessel. Each capsule has a certain amount of oxygen units. Your task is to collect each capsule, keep track of the total oxygen units, and print the amount from each capsule as you go. After collecting all the capsules, print the total amount of oxygen units you've collected.",
                Arrays.asList(
                        "Computer said 'no' to your emergency signal. You're still trapped aboard the spaceship.",
                        "Use a for-loop.",
                        "Access an array.",
                        "Save all entries.",
                        "Wait, isn't there a shortcut to the escape pod? You should check the map again"
                ),
                "public class OxygenCapsuleCollector {\n" +
                        "    \n" +
                        "    public static void main(String[] args) {\n" +
                        "        int[] oxygenCapsules = {20, 25, 15, 30, 10};  // Oxygen units in each capsule\n" +
                        "        int totalOxygen = 0;\n" +
                        "        \n" +
                        "        for (int i = 0; i < 5; i++) {\n" +
                        "            int currentCapsule = oxygenCapsules[i];\n" +
                        "            System.out.println(\"Collected \" + currentCapsule + \" units from capsule \" + (i + 1) + \".\");\n" +
                        "            totalOxygen += currentCapsule;\n" +
                        "        }\n" +
                        "        System.out.println(\"Total oxygen units collected: \" + totalOxygen + \" units.\");\n" +
                        "    }\n" +
                        "}",
                "public class OxygenCapsuleCollector {\n" +
                        "    \n" +
                        "    public static void main(String[] args) {\n" +
                        "        int[] oxygenCapsules = {20, 25, 15, 30, 10};  // Oxygen units in each capsule\n" +
                        "        int totalOxygen = 0;\n" +
                        "        \n" +
                        "        // TODO: Use a loop to simulate the collection of each capsule.\n" +
                        "        for (int i = 0;) { //Complete the loop\n" +
                        "            int currentCapsule = oxygenCapsules[]; //Access each element from the capsules\n" +
                        "            // TODO: Update your computer by printing your progress to the terminal" +
                        "            System.out.println(\"Collected \" + currentCapsule + \" units from capsule \" + () + \".\");\n" +
                        "            totalOxygen = currentCapsule; //Save all the oxygen to your tank!\n" +
                        "        // Print the amount of oxygen from each capsule and keep a running total.\n" +
                        "        \n" +
                        "        // After collecting all capsules, print the total oxygen units.\n" +
                        "        System.out.println(\"Total oxygen units collected: \" + \"What is needed here?\" + \" units.\");\n" +
                        "    }\n" +
                        "}",
                180,
                "/images/picture2.jpeg");
        learnObjectRepository.save(temp2);
        LearnObject temp3 = new LearnObject(
                3,
                "SpaceStation Sequencer",
                "BlaBla",
                Arrays.asList(
                        "As you move deeper into the spacestation, you discover a locked door. A holographic interface appears in front of you, prompting you to solve a sequence to gain entry.",
                        "The sequence seems to follow the Fibonacci pattern: 0, 1, 1, 2, 3, 5, 8, ...",
                        "You need to provide the next number in the sequence to proceed. You decide to write a recursive function to find any nth number in the Fibonacci sequence."
                ),
                "public class FibonacciCalculator {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        System.out.println(fibonacci(7)); // Expected output: 13\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int fibonacci(int n) {\n" +
                        "        if (n <= 1) return n;\n" +
                        "        return fibonacci(n-1) + fibonacci(n-2);\n" +
                        "    }\n" +
                        "}",
                "public class FibonacciCalculator {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // TODO: Test your fibonacci method.\n" +
                        "        // Call the fibonacci method with a few test numbers and print the results.\n" +
                        "        // Example:\n" +
                        "        // System.out.println(fibonacci(7)); // Expected output: 13\n\n" +
                        "        // start coding here\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int fibonacci(int n) {\n" +
                        "        // TODO: Implement this method using recursion.\n" +
                        "        // Remember: \n" +
                        "        // - fibonacci(0) = 0\n" +
                        "        // - fibonacci(1) = 1\n" +
                        "        // - fibonacci(n) = fibonacci(n-1) + fibonacci(n-2) for n > 1\n\n" +
                        "        // start coding here\n" +
                        "        return 0; // Change this to return the correct value\n" +
                        "    }\n" +
                        "}",
                210,
                "/images/picture3.jpeg");
        learnObjectRepository.save(temp3);
        LearnObject temp4 = new LearnObject(
                4,
                "SpaceStation Array Multiplier",
                "BlaBLa",
                Arrays.asList(
                        "You've reached the engineering deck of the spacestation. Another holographic interface stands in your way, displaying a grid of numbers, reminiscent of an array.",
                        "To bypass this system, it prompts you: 'Multiply every element in this array by a given factor'.",
                        "To quickly get through, you decide to write a method that multiplies each element of an integer array by a given factor."
                ),
                "public class ArrayMultiplier {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        int[] arr = {2, 4, 6, 8};\n" +
                        "        int factor = 3;\n" +
                        "        int[] result = multiplyArray(arr, factor);\n" +
                        "        for(int num : result) {\n" +
                        "            System.out.print(num + \" \"); // Expected output: 6 12 18 24 \n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int[] multiplyArray(int[] arr, int factor) {\n" +
                        "        for(int i = 0; i < arr.length; i++) {\n" +
                        "            arr[i] *= factor;\n" +
                        "        }\n" +
                        "        return arr;\n" +
                        "    }\n" +
                        "}",
                "public class ArrayMultiplier {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // TODO: Test your multiplyArray method.\n" +
                        "        // Multiply each element of an integer array by a given factor and print the results.\n" +
                        "        // Example:\n" +
                        "        // int[] arr = {2, 4, 6, 8};\n" +
                        "        // int factor = 3;\n" +
                        "        // Expected output: 6 12 18 24\n\n" +
                        "        // start coding here\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int[] multiplyArray(int[] arr, int factor) {\n" +
                        "        // TODO: Implement this method.\n" +
                        "        // Each element in the array should be multiplied by the factor.\n\n" +
                        "        // start coding here\n" +
                        "        return arr; // Change this to return the modified array\n" +
                        "    }\n" +
                        "}",
                250,
                "/images/picture4.jpeg");
        learnObjectRepository.save(temp4);
        LearnObject temp5 = new LearnObject(
                5,
                "SpaceStation Fuel Calculator",
                "BlaBLa",
                Arrays.asList(
                        "After bypassing the engineering deck, you arrive at the fuel chamber of the spacestation. A digital meter indicates the total amount of fuel and the number of engines that need to be fed.",
                        "A voice echoes: 'To power up the engines evenly, determine how much fuel each engine should receive'.",
                        "You quickly decide to write a method to divide the total fuel evenly among the engines."
                ),
                "public class FuelCalculator {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        int totalFuel = 1000;\n" +
                        "        int numberOfEngines = 4;\n" +
                        "        int fuelPerEngine = divideFuel(totalFuel, numberOfEngines);\n" +
                        "        System.out.println(fuelPerEngine); // Expected output: 250\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int divideFuel(int totalFuel, int numberOfEngines) {\n" +
                        "        return totalFuel / numberOfEngines;\n" +
                        "    }\n" +
                        "}",
                "public class FuelCalculator {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // TODO: Test your divideFuel method.\n" +
                        "        // Divide the total fuel evenly among the engines and print the results.\n" +
                        "        // Example:\n" +
                        "        // int totalFuel = 1000;\n" +
                        "        // int numberOfEngines = 4;\n" +
                        "        // Expected output: 250\n\n" +
                        "        // start coding here\n" +
                        "    }\n" +
                        "\n" +
                        "    public static int divideFuel(int totalFuel, int numberOfEngines) {\n" +
                        "        // TODO: Implement this method.\n" +
                        "        // The method should divide the totalFuel evenly among the numberOfEngines.\n\n" +
                        "        // start coding here\n" +
                        "        return 0; // Change this to return the correct value\n" +
                        "    }\n" +
                        "}",
                270,
                "/images/picture5.jpeg");
        learnObjectRepository.save(temp5);

        LearnObject temp6 = new LearnObject(
                6,
                "SpaceStation Storage Checker",
                "BlaBLa",
                Arrays.asList(
                        "On your journey through the spacestation, you stumble upon a row of storage units. Each storage unit has a numeric code and only units with an odd code are accessible.",
                        "To verify if a storage unit is accessible, the station's computer system prompts you to check if the code of a storage unit is odd.",
                        "You decide to write a method to determine if a given storage unit's code is odd using the modulus operator."
                ),
                "public class StorageChecker {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        int unitCode = 105;\n" +
                        "        boolean isOdd = isCodeOdd(unitCode);\n" +
                        "        System.out.println(isOdd); // Expected output: true\n" +
                        "    }\n" +
                        "\n" +
                        "    public static boolean isCodeOdd(int unitCode) {\n" +
                        "        return unitCode % 2 != 0;\n" +
                        "    }\n" +
                        "}",
                "public class StorageChecker {\n" +
                        "\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // TODO: Test your isCodeOdd method.\n" +
                        "        // Verify if the provided storage unit code is odd and print the results.\n" +
                        "        // Example:\n" +
                        "        // int unitCode = 105;\n" +
                        "        // Expected output: true\n\n" +
                        "        // start coding here\n" +
                        "    }\n" +
                        "\n" +
                        "    public static boolean isCodeOdd(int unitCode) {\n" +
                        "        // TODO: Implement this method.\n" +
                        "        // The method should return true if the code is odd and false otherwise.\n\n" +
                        "        // start coding here\n" +
                        "        return false; // Change this to return the correct value\n" +
                        "    }\n" +
                        "}",
                320,
                "/images/picture6.jpeg");
        learnObjectRepository.save(temp6);
    }

    @GetMapping("/level/{id}")
    public ResponseEntity<LearnObject> getLearnObjerctById(@PathVariable int id) {
        Optional<LearnObject> temp = this.learnObjectRepository.findById(id);
        if (temp.isPresent()) {
            return new ResponseEntity<>(temp.get(), HttpStatus.OK);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No meme under this id found.");
    }
}
