package kunalDSA;

import java.util.Scanner;

class ProductMain{
	
	int productId;
	String productName;
	int quantity;
	float price;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
public class Product {

	public static void main(String[] args) {
		ProductMain p = new ProductMain();
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		p.setProductId(id);
		sc.nextLine();
		String name = sc.nextLine();
		p.setProductName(name);
		int quant = sc.nextInt();
		p.setQuantity(quant);
		float price = sc.nextFloat();
		p.setPrice(price);
		
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getQuantity());
		System.out.println(p.getPrice());
		sc.close();

	}

}
