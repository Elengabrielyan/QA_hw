import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {
    private calculator calculator = new calculator();
    private int totalVal;
    @Before
    public void calculatorInit(){
        totalVal = 0;
    }

    @Test
    public void testAddLower2000(){
        System.out.println("here we are testing the add function for the conditional a<2000");

        totalVal=calculator.add(320, 230);
        //below as stated in the method it should  return a + b
        assertEquals(550, totalVal);
    }

    @Test
    public void testAddHigher2000(){
        System.out.println("here we are testing the add function for the rest of the cases");

        totalVal=calculator.add(2003, 600);
        //should return b
        assertEquals(600, totalVal);
    }
    @Test
    public void testSubtractLower200(){
        System.out.println("here we are testing the substract function for the conditional b<200");

        totalVal = calculator.subtract(400, 100);
        //return a as it is lower than 200
        assertEquals(400, totalVal);
    }

    @Test
    public void testSubtractHIgher200(){
        System.out.println("here we are testing the add function for the rest of the cases");

        totalVal = calculator.subtract(10500, 400);
        //return the difference it is higher than 200
        assertEquals(10100, totalVal);
    }
    @Test
    public void testMultiplyHigher(){
        System.out.println("here we are testing the multiply function for the conditional a > b");

        totalVal = calculator.multiply(5, 2);
        //here as state din the method we should multipy 5*2 as 5 > 2
        assertEquals(10, totalVal);
    }

    @Test
    public void testMultiplyLower(){
        System.out.println("here we are testing the multiply function for the rest of the cases");

        totalVal = calculator.multiply(2, 5);
        assertEquals(7, totalVal);
    }
    @Test
    public void testDivideNotZero(){

        totalVal = calculator.divide(50, 2);
        assertEquals(25, totalVal);
    }
    @Test
    public void testDivideZero() {
        try {
            calculator.divide(50, 0);
        } catch (Exception e) {
            assertEquals("Cannot divide by 0", e.getMessage());
        }

    }
}
