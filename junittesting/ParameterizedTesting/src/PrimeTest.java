import static org.junit.jupiter.api.Assertions.*;


import org.junit.Before;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection; 
import org.junit.Test;

class PrimeTest {

	@RunWith(Parameterized.class)
	public class PrimeNumberCheckerTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeTest p;
	@Before
	public void initialize() {
	p = new PrimeTest();
	}
	public PrimeNumberCheckerTest(Integer inputNumber, 
	Boolean expectedResult) {
	this.inputNumber = inputNumber;
	this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
	return Arrays.asList(new Object[][] {
	{ 2, true },
	{ 6, false },
	{ 19, true },
	{ 22, false },
	{ 23, true }
	});
	}
	@Test
	 public void testPrimeNumberChecker() {
		PrimeNumber o=new PrimeNumber();
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, o.validate(inputNumber));
	   }
}

}
