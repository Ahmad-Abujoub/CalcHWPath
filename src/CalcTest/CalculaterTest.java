package CalcTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calc.Calculater;

public class CalculaterTest {

	@Test
	public void test() {
		int a = 10;
		int b = 20;
		Calculater calc = new Calculater();
		// Act
		int result = calc.CalcAdd(a, b);
		// Assert
		assertTrue(30==result);
	}

}
