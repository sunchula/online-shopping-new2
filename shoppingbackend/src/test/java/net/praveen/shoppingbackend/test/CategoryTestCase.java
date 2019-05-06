package net.praveen.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.praveen.shoppingbackend.dao.CategoryDAO;
import net.praveen.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.praveen.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is Some Description of Television");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully Added a catgory inside Table", true,categoryDAO.add(category));
	}
}
