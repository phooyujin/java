package ch04;

public class Arr21 {
	public static void main(String[] args) {
		int[][]i1= new int[2][3];
		i1[0][0]=100;  i1[0][1]=200;  i1[0][2]=300; 
		i1[1][0]=12;  i1[1][1]=34;  i1[1][2]=77; 
		for(int i=0; i<i1.length; i++) {//행의 개수
			for (int j=0; j<i1[i].length; j++) { //열의 개수
				System.out.print(i1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}