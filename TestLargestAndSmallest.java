import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestLargestAndSmallest{
	
	@Test
	public void testThatFunctionWorks(){

		LargestAndSmallest myLargestAndSmallest = new LargestAndSmallest();

		int[] numbers = {1,4,5,6,9,7,10,9};
		int[] result = {10, 1};
		assertArrayEquals(result, myLargestAndSmallest.findLargestAndSmallest(numbers));


	}

}