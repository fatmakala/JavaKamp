package week1;

public class MukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total=total+i;
			}
		}
		if(total==number) {
			System.out.println("M?kemmel say?d?r.");
		}
		else {
			System.out.println("M?kemmel say? de?ildir.");
		}
	}

}
