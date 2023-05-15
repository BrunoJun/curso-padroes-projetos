package strategy.exemplo1.calc;

import strategy.exemplo1.calc.operations.Addition;
import strategy.exemplo1.calc.operations.Division;
import strategy.exemplo1.calc.operations.Multiplication;
import strategy.exemplo1.calc.operations.Subtraction;

public class Client {

	public static void main(String[] args) {

		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new Addition()));
		System.out.println(calc.getResult(new Subtraction()));
		System.out.println(calc.getResult(new Division()));
		System.out.println(calc.getResult(new Multiplication()));
	}
}
