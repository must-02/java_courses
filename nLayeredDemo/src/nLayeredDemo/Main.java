package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProductDao());
		Product product = new Product(1, 1, "Elma", 20, 50);
		productService.add(product);
		Product product2 = new Product(2, 1, "Nar", 100, 30);
		productService.add(product2);
		productService.delete(product);
		
	}
}
