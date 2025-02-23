import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorExceptionTest {

	private static Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Test out the workflow
		calculator = new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBZero() {
		assertThrows(ArithmeticException.class, () -> calculator.action(5, 0));

	}

}
