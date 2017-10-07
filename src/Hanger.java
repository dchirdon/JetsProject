
public class Hanger {

	Jet[] jets = new Jet[10];

	public Hanger() {
		jets[0] = new Jet("F/A 18", 900, 20_000, 2, "Jimbo");
		jets[1] = new Jet("F-35", 1000, 21_000, 1, "Bobby");
		jets[2] = new Jet("P-38", 550, 40_000, 4, "Goose");
		jets[3] = new Jet("C-130", 475, 22_000, 25, "Ned");
		jets[4] = new Jet("Y/F 22", 1050, 27_000, 2, "Cletus");
	}

	public Jet fastestJet() {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null && (jets[i].speed > fastest.speed)) {
				fastest = jets[i];
			}
		}

		return fastest;
		// find fastest jet to return

	}

	public Jet longestRange() {
		Jet longest = jets[0];
		for (Jet jet : jets) {
			if (jet != null &&(jet.range > longest.range)) {
				longest = jet;
			}
		}
		return longest;
	}

	public boolean addJet(Jet a) {
		boolean added = false;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = a;
				added = true;
				break;
			}
		}
		return added;
	}

	public void listJets() {
		System.out.println("== Jets in this Airwing ==");
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet);
			}
		}
	}
}
