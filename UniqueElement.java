import java.util.Arrays;

public class UniqueElement{
	public static void main(String[] args){
	
	int[] input = {1,2,3,2};


	System.out.println(Arrays.toString(findUniqueElement(input)));


	}


	public static int[] findUniqueElement(int[] input){
		int[] result = new int[input.length];

		int count = 0;
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input.length; j++){
				if (input[i] != input[j]){
					count++;
					result[i] = input[i];
				
				}
			}
		}


/*		

int[] result = new int[count];
		int counter = 0;
		for(int i = 0; i < input.length; i++){
			for(int j = i + 1; j < input.length; j++){
				if (input[i] != input[j]){
					result[counter] = input[i];
					counter++;

				}
			}
		}

*/

		return result;
		

	}

}