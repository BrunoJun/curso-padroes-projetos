package command.exemplo2.migration;

import command.exemplo2.migration.commands.ProductTable;
import command.exemplo2.migration.commands.UserTable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String[] args) {

		Map<String, List<String>> database = new LinkedHashMap<String, List<String>>();
		MigrationTool tool = new MigrationTool();
		tool.addMigration(new UserTable(database));
		tool.addMigration(new ProductTable(database));

		System.out.println(database);

		tool.up();
		System.out.println(database);

		tool.up();
		System.out.println(database);

		tool.up();
		System.out.println(database);

		tool.down();
		System.out.println(database);

		tool.down();
		System.out.println(database);

		tool.down();
		System.out.println(database);

		tool.latest();
		System.out.println(database);

		tool.roolback();
		System.out.println(database);
	}
}
