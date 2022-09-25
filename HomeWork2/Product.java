public class Product {
	
	public Product() {
		System.out.println("Yapıcı method çalıştı.");
	}
	
	
	//attribute:field
	private String name;
	private int id;
	private String description;
	private double price;
	private int stockAmount;
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		this.id=id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	

}
