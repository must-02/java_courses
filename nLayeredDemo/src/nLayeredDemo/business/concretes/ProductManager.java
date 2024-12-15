package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	@Override
	public void add(Product product) {
		productDao.add(product);
	}

	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);
	}

	@Override
	public Product getProduct(int id) {
		return productDao.get(id);
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

}
