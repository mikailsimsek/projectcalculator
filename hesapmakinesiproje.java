package hesapmakine;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/* This is a test project 
 * @mikailsimsek
 * still on development
*/
public class hesapmakinesiproje {
	public static void main(String[] args) throws InterruptedException {
	System.out.println("Merhaba Hesap Makinesine Hoş geldiniz");
		 Scanner scan = new Scanner(System.in);
		 int sonuc = 0;
		 while (true) {
		 int sayi1,sayi2;
		 String secim;
		 System.out.print("İlk Sayıyı Giriniz : ");
		 sayi1 = scan.nextInt();
		 System.out.print("Yapmak İstediğiniz İşlem (+ - * /): ");
		 secim = scan.next();
		 System.out.print("İkinci Sayıyı Giriniz : ");
		 sayi2 = scan.nextInt();
		 
		 if(secim.equals("+")) {
		 	sonuc = sayi1 + sayi2;
		 	System.out.println("Sonucunuz = " + sonuc);
		 	
		 }
		 
		 
		 // to avoid unnecessary CPU usage (beneficial when dealing with massive data)
		 	else if(secim.equals("-")) {
		 		sonuc = sayi1 - sayi2;
		 		System.out.println("Sonucunuz = " + sonuc);
		 		
		 		}
		 
		 	else if(secim.equals("*")) {
		 		sonuc = sayi1 * sayi2;
		 		System.out.println("Sonucunuz = " + sonuc);
		 		
		 		}
		 
		 	else if(secim.equals("/")) {
		 		if(sayi2 == 0) {
		 			System.out.println("Hata = Bir sayının 0 ile bölümü tanımsızdır");
		 		}
		 		else {
		 			double result = (double)sayi1 / sayi2;
		 			System.out.println("Sonucunuz = " + result);
		 		}
		 		
		 		
		 	}
		
		// if any other input received or multiple calculations were asked
		 
		 	else {
		 		System.out.println("\nLütfen ikinci kısımda yapmak istedğiniz işlemin işaretini girin \n" 
		 	        + "Toplama için = + \n" 
		 	        + "Çıkartma için = - \n" 
		 	        + "Çarpma için = * \n" 
		 	        + "Bölme için = / ");
		 	}
		 	
		 	
		 	TimeUnit.SECONDS.sleep(2); // wait for 2 seconds before the next run
		 	
		 	}
	}
}