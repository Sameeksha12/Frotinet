package junit;




	import static org.junit.Assert.*;

	import java.util.ArrayList;
	import java.util.List;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;

	import q3.KSubSet;

	public class testForQuestion3 {

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
		public void testSeparate() {
			KSubSet kSubSet = new KSubSet();
			List<Integer> mylist = new ArrayList<Integer>();
			mylist.add(2);
			mylist.add(1);
			mylist.add(4);
			mylist.add(5);
			mylist.add(6);
			mylist.add(3);
			assertTrue(kSubSet.separate(mylist, 3));
			
		}

		@Test
		public void testIsSeparable() {
			//fail("Not yet implemented");
		}
		

	}


