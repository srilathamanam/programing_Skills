import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

//import org.junit.Test;
import java.util.Arrays;
import java.util.Collection; 

//import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

class AdditionTest {

	private int expected;
    private int first;
    private int second; 
    public AdditionTest(int expectedResult, int firstNumber,
            int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    } 
    @Parameters
    public static Collection<Integer[]> addedNumbers() {
        return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
                { 7, 3, 4 }, { 9, 4, 5 }, });
}	@Test
	public void sum() 
		  {
				        Addition ad = new Addition();
				        System.out.println("Addition with parameters : " + first + " and "
				                + second);
				       assertEquals(expected,ad.addNumbers(first, second));

	}

}
