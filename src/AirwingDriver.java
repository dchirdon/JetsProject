import java.util.Scanner;

public class AirwingDriver {

	// private static int price;
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// Scanner kb = new Scanner(System.in);
		int request;
		Hanger h = new Hanger();
		//Jet jet = new Jet();
		AirwingDriver awd = new AirwingDriver();
		
		request = awd.menu();

		while (true) {
			switch (request) {
			case 1:
				request = 1;
				h.listJets();
				break;
			case 2:
				request = 2;
				System.out.println(h.fastestJet());
				break;
			case 3:
				request = 3;
				System.out.println(h.longestRange());
				break;
			case 4:
				request = 4;
				System.out.println("Add a jet to the hanger:");
				System.out.print("What is the jet's name? ");
				String model = awd.kb.next();
				System.out.print("How fast is it? ");
				double speed = awd.kb.nextInt();
				System.out.print("How long is its range? ");
				double range = awd.kb.nextInt();
				System.out.print("What is the price? ");
				int price = awd.kb.nextInt();
				System.out.print("What is the name of the pilot? ");
				String pilot = awd.kb.next();
				System.out.print("What is the capacity? ");
				int capacity = awd.kb.nextInt();
				Jet jet1 = new Jet(model, speed, range, capacity, price, pilot);
				if (h.addJet(jet1)) {
					System.out.println(jet1 + " added to hanger.");
				} else {
					System.out.println("Sorry, hanger full.");
				}
				break;
			case 5:
				request = 5;
				System.out.print("What is the name of the jet you would like to remove? ");
				String model2 = awd.kb.next();
				if (h.removedJet(model2)) {
					System.out.println(model2 + " removed from hanger.");
				}
				break;
			case 6:
				request = 6;
				System.out.println("Goodbye!");
				awd.kb.close();
				return;

			}
			request = awd.menu();
			
		}
	}

	public int menu() {
		System.out.println("+------------------------------------------+");
		System.out.println("|Please choose from the following options: |");
		System.out.println("|                                          |");
		System.out.println("| 1) List fleet                            |");
		System.out.println("| 2) View fastest jet                      |");
		System.out.println("| 3) View jet with longest range           |");
		System.out.println("| 4) Add a jet to Fleet                    |");
		System.out.println("| 5) Remove a jet from the Fleet (model)   |");
		System.out.println("| 6) Quit                                  |");
		System.out.println("+------------------------------------------+");
		return kb.nextInt();
	}
}
