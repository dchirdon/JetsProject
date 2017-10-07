
public class Jet {
	String model;
	double speed;
	double range;
	int capacity;
	int price;
	String p;

	public double convertToMach() {
		double speedInMach = speed * .0013;
		return speedInMach;

	}

	public Jet() {

	}

	public Jet(String model2, double speed2, double range2, int price2) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jet(String model, double speed, double range, int capacity, String p) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.p = p;
	}

	public Jet(String model, double speed, double range, int capacity, int price, String p) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.price = price;
		this.p = p;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", price=");
		builder.append(price);
		builder.append(", p=");
		builder.append(p);
		builder.append("]");
		return builder.toString();
	}

}
