import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    // Setup Method
    @Before
    public void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    // Test 1
    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Test 2
    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }

    // Teardown Method
    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}