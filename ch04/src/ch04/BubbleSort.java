package ch04;

public class BubbleSort {

	public static void main(String[] args) {
		int [] score = {76,45,34,89,100,90,92};
		int temp=0;
		for (int i=0; i<score.length; i++) {
			//(-(i+1)는 하나씩 남긴다는 뜻!
			for(int j=0; j<score.length -(i+1); j++) {
				if(score[j]>score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1]=temp;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
