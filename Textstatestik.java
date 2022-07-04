import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Textstatestik {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		// vi passerar filereadern till våran bufferd reader som gör att vi kan läsa
		// innehållet i filen
		// deklarerar våra variabler
		float antaletord = 0;
		int meningar = 0;
		float bokstaver = 0;
		int skiljetecken = 0;

		String avslut = ".!?;:";
		String mening;
		// läser igenom varje rad

		while (reader.ready()) {// ready används som metod för att säga om denna text är redo att bli läst
			mening = reader.readLine(); // Readline läser en texten
			// charAt metoden ger tillbaka en specefik index i en string, den första
			// characktären är 0 andra 1 etc.
			for (int i = 0; i < mening.length(); i++) {
				if (Character.isAlphabetic(mening.charAt(i))) {// Isalpabetic returnerar värdet if charcahter är true,
																// annars returnerar den false
					bokstaver++; // räknas antalet meningar

				} else if (mening.charAt(i) == ' ') {
					antaletord++;
				} else {
					if (memberOff(mening.charAt(i))) {
						skiljetecken++;
					}
					if (memberOf(mening.charAt(i), avslut)) { // Här kollar deklarerar vi att om det slutar på !,. eller
																// ? så är det en mening
						meningar++;
					}
				}

			}
			if (mening.length() > 0) {
				antaletord++;
			}

		}

		float medellangd = (float) bokstaver / antaletord;
		System.out.println("Antal Ord: " + antaletord);
		System.out.println("Antal meningar: " + meningar);
		System.out.println("Antal Bokstäver: " + bokstaver);
		System.out.println("Antal Skiljetecken: " + skiljetecken);
		System.out.println("Medellängd på ord:" + String.format("%.2f", medellangd)); // Här så "rundar" vi ned våra
																						// decimaler på medellängden på
																						// ord

		reader.close();

	}

	public static boolean memberOff(char skiljetecken) {

		boolean skilje = false;
		if (skiljetecken >= 32 && skiljetecken <= 63) { // anorpar om det finns några specialtecken från ascii tabellen
			skilje = true;
			return skilje;
		} else {
			return skilje;
		}

	}

	public static boolean memberOf(char tecken, String avslut) {
		for (int i = 0; i < avslut.length(); i++) {
			if (tecken == avslut.charAt(i)) {
				return true;
			
			}
		}
		return false;

	}
}
