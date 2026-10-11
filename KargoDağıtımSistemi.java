package Main.java;

public class KargoDağıtımSistemi {

	public static void main(String[] args) {
	
		int toplamgelir=0;
		
	  for (int i=1; i<=10; i++) {
		  
		  int mesafe= i * 5;
	  
	    int ucret; //temel kargo ücreti
			  
			  
			 
			  if (mesafe<=10) {
			  ucret=50;
			  } else if (mesafe>30) {
			ucret=120;
			  } else { ucret=80;
		
	}

			  
			
			  //teslimat 3'ün katı ise
			  if (i % 3 == 0) {
				  ucret +=20;
			  }
			  
			  //mesafe 40 üzerinde ise %10 indirim
			  if (mesafe>=40) {
				  ucret= (int) (ucret* 0.90);
				  
			  }
			  
			  //teslimat bilgilerini yazdırma
			  
			  System.out.println (i +" Teslimat-Mesafe:"
					  +mesafe + "km-ucret:"
					  +ucret+"TL");
			  
			  toplamgelir += ucret; //toplamgelir
			  
	  }		  
			  
			  System.out.println();
			  System.out.println("Toplam Gelir: " + toplamgelir + " TL");
			  
	}
}
	
