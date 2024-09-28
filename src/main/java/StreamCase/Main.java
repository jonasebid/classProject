package StreamCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Alice", "Bob");
        // Using stream to filter names that start with "J", convert to uppercase, and collect the result.
        List<String> result1 = names.stream()
                .filter(name -> name.startsWith("J"))  // Intermediate operation: filter used lambda
                .map(String::toUpperCase)              // Intermediate operation: map
                .collect(Collectors.toList());         // Terminal operation: collect

        List<String> result = names.parallelStream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(result);// Output: [JOHN, JANE]
      //  System.out.println(resultPararell);
    }
}

