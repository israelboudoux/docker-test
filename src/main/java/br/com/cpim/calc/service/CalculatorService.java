package br.com.cpim.calc.service;

import br.com.cpim.calc.service.vo.Result;

public interface CalculatorService {
	Result sum(double v1, double v2);
	Result subtract(double v1, double v2);
	Result multiply(double v1, double v2);
	Result divide(double v1, double v2);
}