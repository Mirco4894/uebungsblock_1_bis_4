public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung:
	// https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen
	 * Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 6) {
				uebung6();
			}
			if (nr == 7) {
				uebung7();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1

		// Punkte
		Zeichenfenster.zeichnePunkt(30, 50);
		Zeichenfenster.zeichnePunkt(500, 200);
		Zeichenfenster.zeichnePunkt(10, 80);

		// Linien
		Zeichenfenster.zeichneLinie(200, 100, 400, 100);// obere Linie
		Zeichenfenster.zeichneLinie(200, 400, 400, 400);// untere Linie
		Zeichenfenster.zeichneLinie(200, 100, 200, 400);// links
		Zeichenfenster.zeichneLinie(400, 100, 400, 400);// rechts

		// Ellipse im Rechteck
		Zeichenfenster.zeichneEllipse(300, 250, 200, 300);
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
		for (int i = 0; i < 80; i++) {
			int r = i * 10;
			Zeichenfenster.zeichneLinie(0, r, r, 0);
		}
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
		for (int i = 0; i < 301; i=i+5) {
			Zeichenfenster.zeichneEllipse(200+i, 400, 100+i, 100+i);
		}
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
		for (int i = 0; i < 600; i=i+10) {
			Zeichenfenster.zeichneEllipse(400, 400, 800-i, 200+i);
		}
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
		for (int i = 0; i < 801; i=i+8) {
			Zeichenfenster.zeichneLinie(0+i, 0, 800, 0+i);//oben rechts
			Zeichenfenster.zeichneLinie(800, 0+i, 800-i, 800);//unten rechts
			Zeichenfenster.zeichneLinie(800-i, 800, 0, 800-i);//unten links
			Zeichenfenster.zeichneLinie(0, 800-i, 0+i, 0);//oben links
		}
	}

	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}

}
