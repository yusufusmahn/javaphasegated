import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestTwoHighestNumber{
	
	@Test
	public void testThatFunctionWorks(){


		int[] numbers = {1,4,5,6,9,7,10,9};
		int[] result = {10, 9};
		assertArrayEquals(result, TestTwoHighestNumber.findTwoHighestNumber(numbers));


	}

}