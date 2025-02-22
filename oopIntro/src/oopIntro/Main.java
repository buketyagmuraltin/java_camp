package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenova V14", 15000, "16 GB Ram", 10);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());

		Product[] products = {product1, product2};
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
