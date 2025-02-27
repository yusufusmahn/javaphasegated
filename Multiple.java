public class Multiple{
	public static void main(String[] args){
	int a =  3;
	int b = 10;
	int c = 2;
	
	System.out.println(multiple(a,b,c));



	}


	public static int[] multiple(int a, int b, int c){

		int count = 0;
		for (int i = 2; i <= 10; i++){
			if (i % 2 == 0){
				count++;
			}
		}
		
		for (int i = 2; i <= 10; i++){
			int counter = 0;
			int result[] = new int[count];
			result[counter] = count;
			counter++;

		}

		return result;
	}

}