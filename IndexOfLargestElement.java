import java.util.Arrays;

public class IndexOfLargestElement{
	public static void main(String[] args){
	
	double[][] input = {{1.5,2.3,3.7,4.6},{5.1,6.2,7.3,8.4},{9.5,10.1,11.8,12.7}};

	double[][] number = {{-1.2, -3.4},{-2.5,-1.1}};

	System.out.println(Arrays.toString(findIndexOfLargestElement(input)));
	System.out.println(Arrays.toString(findIndexOfLargestElement(number)));

	;


	}


	public static int[] findIndexOfLargestElement(double[][] input){

		double largest = Integer.MIN_VALUE;

		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input.length; j++){
				if (input[i][j] > largest){
					largest = input[i][j];
					return new int[] {i,j};
				}
			}
		}

		return new int[] {};

	}

}