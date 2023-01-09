//import org.junit.Before;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection; 
import org.junit.Test;


public class ParameterPrime {

	@RunWith(Parameterized.class)
	public class PrimeNumberCheckerTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	//private ParameterPrime p;
	//@Before
	//public void initialize() {
	//p = new ParameterPrime();
	//}
	public PrimeNumberCheckerTest(Integer inputNumber, 
	Boolean expectedResult) {
	this.inputNumber = inputNumber;
	this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public  Collection<Object[]> primeNumbers() {
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
		PrimeNumber t=new PrimeNumber();
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, t.validate(inputNumber));
	   }
}

}
