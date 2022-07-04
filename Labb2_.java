package learning;
import java.util.Scanner;
public class Labb2_ {

	public static void main(String[] args) {
		int rättsvar;
		int gissa;
		int antalGissningar = 1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Skriv in ett tal från 0 till 100");
			rättsvar = scan.nextInt();
		} while (rättsvar < 0 || rättsvar > 100);
		linebreak();
		
		System.out.println("Gissa på ett heltal från 0 till 100");
		gissa = scan.nextInt();
		
		while(true) {
		System.out.println("Antal gissningar:" + antalGissningar);
		if ( gissa == rättsvar ) {System.out.println("Du har gissat rätt tal!");
		break;
		} else if ( gissa > rättsvar) { 
			System.out.println( "Talet du gissade var för högt,prova igen!:" );
			antalGissningar++;
			gissa = scan.nextInt();
		} else { System.out.println("Talet du gissade var för lågt,prova igen!:");
			
			antalGissningar++ ;
		gissa = scan.nextInt();
		}
		
		
		
		
		
		
		
		
			
				
	} 

	
	} public static void linebreak() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
}
	}
}


