import java.security.SecureRandom;

public class ArcheryGame{
	public static void main(String[] args){

	int players = 4;
	int chances = 3;

	int[][] scores = new int[players][chances];
	int[] totalScores = new int[players];

	SecureRandom randomNumbers = new SecureRandom();

	System.out.printf("%-15s%-15s%-15s%-15s%-20s%n","Player Number", "First Chance", "Second Chance", "Third Chance", "Chances(Total)");


	int randomScores;
	for (int i = 0; i < players; i++){
		for (int j = 0; j < chances; j++){
			scores[i][j] = 0 + randomNumbers.nextInt(10);
			totalScores[i] += scores[i][j];
		}
	}

	
	for (int i = 0; i < players; i++){
		System.out.printf("%-15d", (i + 1) );
		for (int j = 0; j < chances; j++){
			System.out.printf("%-15d", scores[i][j]);
		}

		System.out.printf("%-20d%n", totalScores[i]);	
	}


		int champion = 0;

		for (int i = 0; i < players; i++){
			if (totalScores[i] > totalScores[champion]){
				champion = i;

			}

		}

		System.out.printf("%nThe champion is PLAYER %d with total score of %d", (champion + 1), totalScores[champion]);	




	}

}



