package pkgEmpty;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.print.Book;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBook {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void GetBook() {
		Book b = new Book("book1");
		assertTrue(b.GetBook("book1").equals(b));
	}
	
	@Test
	public void GetBook1() {
		Book b1 = new Book("book45");
		assertNotEquals(b1.GetBook("book1"), bk);
	}
	
	@Test
	public void AddBook() {
		Book b = new Book("book4000", "Billy Mays", "The power of oxyclean", "horror", 23, new Date(6,6,6,6,6), "life and times oof the legend billy mays");
		b.AddBook("book4000", b);
		assertTrue((b.GetBook("book4000") != null) && (b.GetBook("book4000").equals(b)));
	}
	
	@Test
	public void AddBook1() {
		Book b1 = new Book("book4000", "Billy Mays", "The power of oxyclean", "horror", 23, new Date(6,6,6,6,6), "life and times oof the legend billy mays");
		b1.AddBook("book4000", b1);
		assertFalse((b1.GetBook("book4000") != null) && (b1.GetBook("book40000").equals(b1)));

	}

}
