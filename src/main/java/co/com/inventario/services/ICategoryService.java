package co.com.inventario.services;

import org.springframework.http.ResponseEntity;

import co.com.inventario.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();

}
