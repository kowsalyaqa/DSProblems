package ConceptsLearning;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] myNumbers= {{1,2,3,4},{5,6,7}};
		System.out.println(myNumbers[1][2]);
			
		for(int i=0;i<myNumbers.length;i++) {
			for(int j=0;j<myNumbers[i].length;j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		
		for (int[] is : myNumbers) {
			for (int n : is) {
				System.out.println(n);
			}
		}
		
		
		
		 int[][][] intArray = {
	              {{10, 20, 30},{20, 40, 60}}, 
	              { {10, 30,50,70},{50},{80, 90}} 
	              };
		 
		 for(int i=0;i<intArray.length;i++) {
			 for(int j=0;j<intArray[i].length;j++) {
					for(int k=0;k<intArray[j].length;k++) {
						for(int q=0;q<intArray[k].length;q++) {
						System.out.println(intArray[i][j][k]);	
						}
					}
			 }
		 }

	}


}
