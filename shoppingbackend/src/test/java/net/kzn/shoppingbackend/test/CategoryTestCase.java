package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Mobile");
	 * category.setDescription("This is some description for Mobile!");
	 * category.setImageURL("CAT_101.png");
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * 
	 * }
	 */
	
	
	
	
	/*
	 * @Test public void testGetCategory() { category = categoryDAO.get(2);
	 * assertEquals("Successfully fetched a category inside the table!","Mobile",
	 * category.getName()); }
	 * 
	 */
	
	
	/*
	 * @Test public void testUpdateCategory() { category = categoryDAO.get(2);
	 * category.setName("Phone");
	 * assertEquals("Successfully upadted a category in the table!",true,categoryDAO
	 * .update(category)); }
	 */
	
	/*
	 * @Test public void testDeleteCategory() { category = categoryDAO.get(2);
	 * category.setName("Phone");
	 * assertEquals("Successfully deleted a category in the table!",true,categoryDAO
	 * .delete(category)); }
	 */
	
	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched a list category in the table!",1,
	 * categoryDAO.list().size()); }
	 */
	
	@Test
	public void testCRUDCategory() 
	{
		
		
		category = new Category();
		
		
		category.setName("Laptop");
		  category.setDescription("This is some description for laptop!");
		  category.setImageURL("CAT_1.png");
		    assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));	
		
		  
		  category = new Category();

			category.setName("Televison");
			  category.setDescription("This is some description for television!");
			  category.setImageURL("CAT_11.png");
			  assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));	
		
		
			  
			  category = categoryDAO.get(2);
				  category.setName("TV");
				  assertEquals("Successfully upadted a category in the table!",true,categoryDAO.update(category));
	
	
			 assertEquals("Successfully deleted a category in the table!",true,categoryDAO.delete(category));
	
			 
			 
			 assertEquals("Successfully fetched a list category in the table!",4,categoryDAO.list().size());
	}
	
}
