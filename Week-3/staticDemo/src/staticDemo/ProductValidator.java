package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı blok çalıştı.");
	}
	
	public ProductValidator () {						//Main'de çalışması içi new'lenmesi gerekir. Ama üstteki static yapı direk çalışır.  
		System.out.println("Yapıcı blok çalıştı.");
	}
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void bisey() {
		
	}
	

}
