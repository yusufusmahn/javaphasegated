import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestThatNumberIsDivisible{
	
	@Test
	public void testThatFunctionWorks(){

		Divisible myDivisible = new Divisible();
		
		int result = myDivisible.findSumOfNumbersDivible(30);
		assertEquals(165, result);


	}

}