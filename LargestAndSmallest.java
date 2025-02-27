import java.util.Arrays;

public class LargestAndSmallest{
	public static void main(String[] args){
	
	int[] input = {1,4,6,2,5};
	int[] result = {10, 20, 30, 40,50,60,-10};
	int[] numbers = {100,10000,1000000,20,0};


	System.out.println(Arrays.toString(findLargestAndSmallest(input)));
	System.out.println(Arrays.toString(findLargestAndSmallest(result)));
	System.out.println(Arrays.toString(findLargestAndSmallest(numbers)));


	}


	public static int[] findLargestAndSmallest(int[] input){

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for(int i = 0; i < input.length; i++){
			if (input[i] > largest){
				largest = input[i];
			}
		}
		
		for(int i = 0; i < input.length; i++){
			if(input[i] < smallest){
			smallest = input[i];

			}

		}

		return new int[]{largest,smallest};

	}

}