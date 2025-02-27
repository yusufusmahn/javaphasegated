import java.util.Arrays;

public class TwoHighestNumber{
	public static void main(String[] args){
	
	int[] input = {1,4,5,6,9,7,10,9};
	int[] result = {1,4,6,8,0,1,2,7};
	int[] numbers = {1,6,7,8,1000};


	System.out.println(Arrays.toString(findTwoHighestNumber(input)));
	System.out.println(Arrays.toString(findTwoHighestNumber(result)));
	System.out.println(Arrays.toString(findTwoHighestNumber(numbers)));


	}


	public static int[] findTwoHighestNumber(int[] input){

		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for(int i = 0; i < input.length; i++){
			if (input[i] > firstHighest){
				secondHighest = firstHighest;
				firstHighest = input[i];
			}
		
			else if(input[i] > secondHighest && input[i] != firstHighest){
			secondHighest = input[i];

			}

		}

	return new int[]{firstHighest,secondHighest};

	}

}