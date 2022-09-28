package week2;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(1,"laptop","asus laptop",3000,2,"black");
		Product product1=new Product();
		product1.setName("Laptop");
		product1.setId(1);
		product1.setDescription("Asus Laptop");
		product1.setPrice(5000);
		product1.setStockAmount(5);
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product1);
		System.out.println(product.getName());
		
		
	}

}
