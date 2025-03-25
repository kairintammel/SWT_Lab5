package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(2799, 1379, 1379);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(triangle0.isImpossible());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals((-784), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetAreaIsNegativeAndTriangleWhereIsImpossibleIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(1098, 1098, 0);
	    triangle0.classify();
	    assertEquals(2196, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle((-2146044543), (-2146044543), 2);
	    triangle0.setSideLengths(1905, 1905, 324);
	    double double0 = triangle0.getArea();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(7880.612412750674, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 28, 0);
	    assertEquals(28, triangle0.getPerimeter());
	    triangle0.setSideLengths(0, 0, 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 544, (-292));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals("1,544,-292", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    Triangle triangle1 = triangle0.setSideLengths(1379, 1379, 1379);
	    boolean boolean0 = triangle1.isEquilateral();
	    assertFalse(triangle0.isImpossible());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(2799, 1379, 1379);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isImpossible());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 544, (-292));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals("1,544,-292", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(3346, 2, 3346);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals(6694, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-2146044543), (-2146044543), 2);
	    Triangle triangle1 = triangle0.setSideLengths(1905, 1905, 324);
	    String string0 = triangle1.classify();
	    assertEquals("1905,1905,324", triangle0.getSideLengths());
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(3346, (-14), 3346);
	    String string0 = triangle0.classify();
	    assertEquals(6678, triangle0.getPerimeter());
	    assertEquals("impossible", string0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 544, (-292));
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals(253, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    assertFalse(triangle0.isEquilateral());
	    triangle0.setSideLengths(0, (-1), 0);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("0,-1,0", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 544, (-292));
	    String string0 = triangle0.getSideLengths();
	    assertEquals("1,544,-292", string0);
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(3346, 3346, 3346);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testIsIsosceles0() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), (-1), (-1));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals((-3), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles1() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-294), 1);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals((-292), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    triangle0.setSideLengths(0, 0, (-1));
	    double double0 = triangle0.getArea();
	    assertEquals("0,0,-1", triangle0.getSideLengths());
	    assertEquals((-1.0), double0, 0.01);
	}

}