import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestGreatestDivisor{
	
	
	public void testThatFunctionWorks(){

		int result = GreatestDivisor.findGreatestDivisor(4, 2);
		assertEquals(2, result);


	}

}