package bridge.exemplo1.converter.converters;

import bridge.exemplo1.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter{

	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s,%d,%.2f",
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
