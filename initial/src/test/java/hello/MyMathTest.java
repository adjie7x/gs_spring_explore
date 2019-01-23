package hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import hello.utility.MyMath;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class MyMathTest {

	MyMath myMath = new MyMath();

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test		
    public void m5_1() {
		System.out.println("m5_1");
		List<String> list = new ArrayList<>();
        list.add("test");
        boolean isEmpty = list.isEmpty();
        System.out.println("isEmpty : "+isEmpty);
        assertFalse(isEmpty);			
        assertEquals(1, list.size());			
    }
	
	@Test		
    public void m5_2() {
		System.out.println("m5_2");
		List<String> list = new ArrayList<>();
        list.add("test");
        boolean isEmpty = list.isEmpty();
        System.out.println("isEmpty : "+isEmpty);
//        assertTrue(isEmpty);			
        assertEquals(1, list.size());			
    }

	@Ignore		
    public void m6() {
		System.out.println("m6");
        System.out.println("Using @Ignore , this execution is ignored");					
    }	
	
	@Test(timeout = 10)			
    public void m7() {
		System.out.println("m7");
        System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");					
    }		

//    @Test(expected = NoSuchMethodException.class)					
//    public void m8() {					
//        System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");					
//
//    }
	
	@Test
	public void sum_with3numbers() {
		System.out.println("sum_with3numbers");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with1number() {
		System.out.println("sum_with1number");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}
	
//	public static void main(String[] args) {
//		double a = 1.0; 
//		System.out.println(a);
//        double b = 0.10; 
//        System.out.println(b);
//        double x = 9 * b; 
//        System.out.println(x);
//        a = a - (x); 
//  
//        // Value of a is expected as 0.1 
//        System.out.println("a = " + a);
//        
//        double c = 1.0;
//        double d = 0.9;
//        double e = c - d ;
//        
////        boolean result = Math.abs(e);
//        
//        System.out.println(e);
//        System.out.println(Math.abs(e));
//	}

}
