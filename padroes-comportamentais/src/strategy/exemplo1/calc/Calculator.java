package strategy.exemplo1.calc;

import strategy.exemplo1.calc.operations.Operation;

public class Calculator {
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult(Operation operation) {

		return operation.calculate(this.num1, this.num2);
	}
}
