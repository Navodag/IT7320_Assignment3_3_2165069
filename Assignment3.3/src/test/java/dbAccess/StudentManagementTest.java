package dbAccess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentManagementTest {
	StudentManagement obj;

	@Before
	public void setUp() throws Exception {
		obj = new StudentManagement ();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testFindNameByID() {
		assertEquals("Navoda",obj.findNameByID(1));
	}
	@Test
	public void testFindGenderByID() {
		assertEquals("M",obj.findGenderByID(1));
	}
	@Test
	public void testFindCourseByID() {
		assertEquals("IT",obj.findCourseByID(1));
	}

}
