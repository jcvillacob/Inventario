package co.com.inventario.response;

import java.util.List;

import co.com.inventario.model.Category;
import lombok.Data;

@Data
public class CategoryResponse {

	private List<Category> category;
}
