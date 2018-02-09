package br.com.cpim.calc.service.vo;

public class Result {
	private double value;
	private String error;
	
	public Result(double pValue) {
		this.value = pValue;
	}

	public Result(String pError) {
		this.error = pError;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getError() {
		return error;
	}
}