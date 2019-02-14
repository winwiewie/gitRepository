package statics;

public class ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] newarr = new int[10];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = i+1;
			System.out.println(newarr[i]);
		}
		
		int[][] newarr2 = new int[9][9];
		for (int i = 0; i < newarr2.length; i++) {
			for (int j = 0; j < newarr2[i].length; j++) {
		
				newarr2[i][j]= (i+1) * (j+1);

				System.out.println( (i+1) + " * " + (j+1)  + " = " +  newarr2[i][j] ) ;
			}
			System.out.println();
			
		}
	}
	
}
