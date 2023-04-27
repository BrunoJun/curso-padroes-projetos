package bridge.exemplo1.converter;

import bridge.exemplo1.converter.converters.CSVConverter;
import bridge.exemplo1.converter.converters.Converter;
import bridge.exemplo1.converter.converters.JsonConverter;
import bridge.exemplo1.converter.employees.Employee;
import bridge.exemplo1.converter.employees.ITGuy;
import bridge.exemplo1.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {

		Employee itEmployer = new ITGuy("Mario", 22, 2500.00);
		Employee projectEmployer = new ProjectManager("Ana", 31, 6000.00);

		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		System.out.println(csvConverter.getEmployeeFormated(itEmployer));
		System.out.println(jsonConverter.getEmployeeFormated(itEmployer));
		System.out.println(csvConverter.getEmployeeFormated(projectEmployer));
		System.out.println(jsonConverter.getEmployeeFormated(projectEmployer));
	}
}
