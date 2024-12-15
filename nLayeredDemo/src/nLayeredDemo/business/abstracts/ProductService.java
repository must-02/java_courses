package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	void delete(Product product);
	Product getProduct(int id);
	void update(Product product);
	List<Product> getAll();
}
