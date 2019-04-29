package net.praveen.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.categories.Categories;
import org.springframework.stereotype.Repository;

import net.praveen.shoppingbackend.dao.CategoryDAO;
import net.praveen.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Some Description of Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		// adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Some Description of Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);

		// adding Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Some Description of Laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);

		// adding Fourth category
		category = new Category();
		category.setId(4);
		category.setName("IPOD");
		category.setDescription("This is Some Description of IPOD");
		category.setImageURL("CAT_4.png");
		categories.add(category);

		System.out.println(categories);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
