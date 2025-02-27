import java.util.Arrays;

public class TwoLowestNumber{
	public static void main(String[] args){
	
	int[] input = {2,2,1};
	int[] result = {4,1,2,1,2};
	int[] numbers = {4,7,9,-1,0};


	System.out.println(Arrays.toString(findTwoLowestNumber(input)));
	System.out.println(Arrays.toString(findTwoLowestNumber(result)));
	System.out.println(Arrays.toString(findTwoLowestNumber(numbers)));


	}


	public static int[] findTwoLowestNumber(int[] input){

		int firstLowest = Integer.MAX_VALUE;
		int secondLowest = Integer.MAX_VALUE;

		for(int i = 0; i < input.length; i++){
			if (input[i] < firstLowest){
				secondLowest = firstLowest;
				firstLowest = input[i];
			}
		
			else if(input[i] < secondLowest && input[i] != firstLowest){
			secondLowest = input[i];

			}

		}

	return new int[]{firstLowest,secondLowest};

	}



}