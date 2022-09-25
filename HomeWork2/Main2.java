public class Main2 {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.setName("laptop");
		System.out.println(product1.getName());
		product1.setDescription("Asus Laptop");
		product1.setId(1);
		product1.setPrice(5000);
		product1.setStockAmount(3);
		
		System.out.println(product1.getPrice());
		
		ProductManager manager1=new ProductManager();
		manager1.Add(product1);

	}

}
