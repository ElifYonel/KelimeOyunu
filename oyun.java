package kelime_oyunu;

import java.util.Scanner;

public class oyun {
	public static void main(String args[]) {
	    String kelime = "helikopter";
	    int i,tahmin=0,
	    sayac = 0,dogru=0;
	    String uzunluk[] = new String[kelime.length()];

	System.out.println("***Kelimeyi tahmin etmek için 4 yanlýþ hakkýnýz bulunmaktadýr***");
	Scanner scan = new Scanner(System.in);

	   for (i = 0; i < kelime.length(); i++) {
	     uzunluk[i] = "_ ";
	   }
	   finish:
		   
		   while(tahmin<5) {
			   System.out.print("Bir harf giriniz (" +(4-tahmin) + " adet harf hakkýnýz kaldý):");
			   String harf = scan.nextLine();
			   tahmin++;
			     for (i = 0; i < kelime.length(); i++) {
			        if (kelime.charAt(i) == harf.charAt(0)) {
			          uzunluk[i] = harf + " ";
			          sayac = 1;
			          dogru++;
			          if (dogru == kelime.length()) { 
			            System.out.println("Tebrikler,doðru kelimeyi buldunuz.. Kelime:" + kelime); 
			            break finish;
			          }
			       }
			    }
			     if (sayac == 1) {
				sayac = 0;
			        tahmin--;
			     }
			        for (i = 0; i < kelime.length(); i++) {
				                                          
			           System.out.print(uzunluk[i]);
			        }
				 System.out.println();
			}
	   if (dogru != kelime.length()) {
		   System.out.println("Kelimeyi tahmin edemediniz."); 
		   System.out.println("Doðru yanýt: " + kelime);
		   }
}
}
