package ch04;

public class SelectSort {

	public static void main(String[] args) {
		//기사시험 출제 가능성 있음!
		int [] score = {76,45,34,89,100,50,90,92};
		int temp=0;
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				//if(score[i]>score[j]) { //작은순 정렬
			  if(score[i]<score[j]) { //큰순으로 정렬
					temp=score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
