package br.com.cpim.calc.service.impl;

import org.springframework.stereotype.Service;

import br.com.cpim.calc.service.CalculatorService;
import br.com.cpim.calc.service.vo.Result;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	public Result sum(double v1, double v2) {
		return new Result(v1 + v2);
	}
	
	public Result subtract(double v1, double v2) {
		return new Result(v1 - v2);
	}
	
	public Result multiply(double v1, double v2) {
		return new Result(v1 * v2);
	}
	
	public Result divide(double pDividendo, double pDivisor) {
		
		if(pDivisor == 0) {
			return new Result("O divisor deve ser diferente de zero. Por favor, verifique!");
		}
		
		return new Result(pDividendo / pDivisor);
	}
	
}