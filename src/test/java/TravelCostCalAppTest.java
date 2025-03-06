import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TravelCostCalAppTest {




    @Test
    void testTripCostCalculation() throws IOException {
        // Simulate user input: distance = 150 km, fuel price = 1.45 per liter
        String input = "150\n1.45\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        TravelCostCalApp.main(new String[0]);

        // Get the output as a string
        String output = outputStream.toString();

        // Check if the expected output is present
        assertTrue(output.contains("For a trip of 150.00 kilometers, you will need 7.50 liters of fuel."));
        assertTrue(output.contains("The total cost of the trip will be: 10.88"));
    }

    @Test
    void testAnotherScenario() throws IOException {
        // Simulate user input: distance = 200 km, fuel price = 1.2 per liter
        String input = "200\n1.2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method
        TravelCostCalApp.main(new String[0]);

        // Get the output as a string
        String output = outputStream.toString();

        // Check if the expected output is present
        assertTrue(output.contains("For a trip of 200.00 kilometers, you will need 10.00 liters of fuel."));
        assertTrue(output.contains("The total cost of the trip will be: 12.00"));
    }
}
