package week1;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ='A';
		
		switch(grade) 
		{
		case'A':
			System.out.println("M�kemmel : Ge�tiniz.");
			break;
		case'B':
			System.out.println("�ok G�zel : Ge�tiniz.");
			break;
		case'C':
			System.out.println("�yi : Ge�tiniz.");
			break;
		case'D':
			System.out.println("Fena De�il : Ge�tiniz.");
			break;
		case'F':
			System.out.println("Maalesef Kald�n�z.");
			break;
		default:
				System.out.println("Ge�ersiz not girdiniz.");
		}

	}

}
