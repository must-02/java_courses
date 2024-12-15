package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("hibernate ile eklendi " + product.getName());
	}

	@Override
	public void delete(Product product) {
		System.out.println("hibernate ile silindi " + product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("hibernate ile güncellendi " + product.getName());
	}

	@Override
	public Product get(int id) {
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
