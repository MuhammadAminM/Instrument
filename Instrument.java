public class Instrument {
    private String type;
    private double price;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    public Instrument(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Instrument() {
        type = "Unknown";
        price = 0.0;
    }

    public void print() {
        System.out.println("Type : " + type);
        System.out.println("Price : " + price);
    }

    
}
