
public final class AmericanFlag {
	public static void printAmericanFlag() {
		printStarLines();
		for(int i = 0; i < 6; i++) {
			printFlagLine();
		}
		
	}
	
	private static void printFlagLine() {
		for (int i = 0; i < 50; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	private static void printStarLines() {
		for (int i = 0; i < 3; i++) {
			// Parameter determines if the stars are shifted from center
			printFlagLineWithStar(false);
			printFlagLineWithStar(true);
		}
		printFlagLineWithStar(false);

	}
	
	private static void printFlagLineWithStar(boolean moveStars) {
		String star = moveStars ? " *": "* ";
		for (int i = 0; i < 10; i++) {
			if (moveStars && i == 9) {
				System.out.print("  ");
				continue;
			}
			System.out.print(star);
		}
		for (int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
}
