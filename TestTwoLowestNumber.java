import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestTwoLowestNumber{
	
	@Test
	public void testThatFunctionWorks(){

		TwoLowestNumbe myTwoLowestNumbe = new TwoLowestNumbe();

		int[] numbers = {1,4,5,6,9,7,10,9};
		int[] result = {1, 4};
		assertArrayEquals(result, myLargestAndSmallest.findLargestAndSmallest(numbers));


	}

}