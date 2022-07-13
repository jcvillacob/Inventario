package co.com.inventario.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.inventario.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{
	
	

}
