public class Divisible{
	public static void main(String[] args){

		int number = 30;
		System.out.println(findSumOfNumbersDivible(number));



	}

	public static int findSumOfNumbersDivible(int number){

		int sum = 0;

		for (int i = 1; i <= 30; i++){
			if (i % 3 == 0){
				sum += i;
			}
		}	

		return sum;
	}

}