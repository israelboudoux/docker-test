package br.com.cpim.calc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cpim.calc.service.CalculatorService;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class CalculatorServiceTest {

	@Autowired
	private CalculatorService calcService;
	
	@Test
	public void testSum1() {
		assertThat(calcService.sum(1, 1).getValue()).isEqualTo(2);
	}

	@Test
	public void testSum2() {
		assertThat(calcService.sum(1, -1).getValue()).isEqualTo(0);
	}
	
	@Test
	public void testSum3() {
		assertThat(calcService.sum(-1, -1).getValue()).isEqualTo(-2);
	}
	
	@Test
	public void testSubtract1() {
		assertThat(calcService.subtract(1, 1).getValue()).isEqualTo(0);
	}
	
	@Test
	public void testSubtract2() {
		assertThat(calcService.subtract(0, 1).getValue()).isEqualTo(-1);
	}
	
	@Test
	public void testSubtract3() {
		assertThat(calcService.subtract(1, 0).getValue()).isEqualTo(1);
	}
	
	@Test
	public void testSubtract4() {
		assertThat(calcService.subtract(-1, -1).getValue()).isEqualTo(0);
	}
	
	@Test
	public void testMutiply1() {
		assertThat(calcService.multiply(0, 1).getValue()).isEqualTo(0);
	}

	@Test
	public void testMutiply2() {
		assertThat(calcService.multiply(1, -1).getValue()).isEqualTo(-1);
	}
	
	@Test
	public void testMutiply3() {
		assertThat(calcService.multiply(-1, -1).getValue()).isEqualTo(1);
	}
	
	@Test
	public void testMutiply4() {
		assertThat(calcService.multiply(2, 0.5).getValue()).isEqualTo(1);
	}
	
	@Test
	public void testMutiply5() {
		assertThat(calcService.multiply(0.5, 0.5).getValue()).isEqualTo(0.25);
	}
	
	@Test
	public void testDivide1() {
		assertThat(calcService.divide(0.5, 0.5).getValue()).isEqualTo(1);
	}
	
	@Test
	public void testDivide2() {
		assertThat(calcService.divide(1, 2).getValue()).isEqualTo(0.5);
	}

	@Test
	public void testDivide3() {
		assertThat(calcService.divide(0.5, 0).getError()).isNotNull();
	}
	
	@Test
	public void testDivide4() {
		assertThat(calcService.divide(0, 0.5).getValue()).isEqualTo(0);
	}
	
	@Test
	public void testDivide6() {
		assertThat(calcService.divide(-2, -1).getValue()).isEqualTo(2);
	}
	
	@Test
	public void testDivide7() {
		assertThat(calcService.divide(-2, 1).getValue()).isEqualTo(-2);
	}
}
