public class GreatestDivisor{
	public static void main(String[] args){
	
	
	System.out.println(findGreatestDivisor(4,2));
	System.out.println(findGreatestDivisor(16,24));
	System.out.println(findGreatestDivisor(125,2525));


	}


	public static int findGreatestDivisor(int firstNumber, int secondNumber){

		int max = Integer.MIN_VALUE;
		int largestDivisor = Integer.MIN_VALUE;

		if (firstNumber > max){
			max = firstNumber;

		}else{
			max = secondNumber;	
		}

		for (int i = 1; i <= max; i++){

			if (firstNumber % i == 0 && secondNumber % i == 0){

				largestDivisor = Integer.MIN_VALUE;
				if (i > largestDivisor){
					largestDivisor = i;
				}
			}
		}

		return largestDivisor;		
	}

}





	