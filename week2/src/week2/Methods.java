package week2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		
	}
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi:sayilar)
		{
			if(sayi==aranacak) 
			{
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if(varMi)
		{
			mesajVer("Say� mevcuttur." + aranacak);
			mesajVer(mesaj);
			
		}
		
		else
		{
			mesajVer("Say� mevcut de�ildir." +aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
