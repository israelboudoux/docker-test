package br.com.cpim.calc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpim.calc.service.CalculatorService;
import br.com.cpim.calc.service.vo.Result;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calcService;
	
    @RequestMapping("/sum")
    public Result sum(@RequestParam(value="value1", required = true) double pValue1, 
    				  @RequestParam(value="value2", required = true) double pValue2) {
    	return calcService.sum(pValue1, pValue2);
    }
	
    @RequestMapping("/subtract")
    public Result subtract(@RequestParam(value="value1", required = true) double pValue1, 
    					   @RequestParam(value="value2", required = true) double pValue2) {
    	return calcService.subtract(pValue1, pValue2);
    }
	
    @RequestMapping("/multiply")
    public Result multiply(@RequestParam(value="value1", required = true) double pValue1, 
    					   @RequestParam(value="value2", required = true) double pValue2) {
    	return calcService.multiply(pValue1, pValue2);
    }
	
    @RequestMapping("/divide")
    public Result divide(@RequestParam(value="value1", required = true) double pValue1, 
    					 @RequestParam(value="value2", required = true) double pValue2) {
    	return calcService.divide(pValue1, pValue2);
    }

}