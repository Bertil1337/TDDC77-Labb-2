import java.util.Scanner;
public class GissaTal {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		//deklarerar variabler
        int attemptsNum = 1;
		int guess;
		int right;
		
		System.out.print("Mata in ett heltal mellan 0 och 100: ");
		right = sc.nextInt();
		linebreak();
		
		System.out.print("Gissa ett tal mellan 0 och 100:");
		guess = sc.nextInt();
		
		//en array för att hantera talen mellan 1-100
	    int[] arraytal = new int [100];
	//våran forloop
		for (int i = 0; i < arraytal.length; i++) {
			
			
			if (guess == right) {
				System.out.println("Grattis du gissade rätt!");	
				break;
				
			}
				
			else if (guess < right) {
			    System.out.println("Ditt tal var för lågt testa igen!: ");
			    attemptsNum++;
			    guess = sc.nextInt();
			    
			}  else {
				System.out.println("Ditt tal var för högt, testa igen!: ");
				attemptsNum++;
				guess = sc.nextInt();
	
				}
			
		
				
			}
		System.out.println("antal gissningar: " + attemptsNum );
			
			
			
			
		}
		public static void linebreak() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		
		}
		
	}


