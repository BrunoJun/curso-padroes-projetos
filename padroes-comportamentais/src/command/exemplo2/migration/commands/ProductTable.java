package command.exemplo2.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ProductTable extends MigrationCommand{

    public ProductTable(Map<String, List<String>> database) {

        super(database);
    }

    @Override
    public void execute() {

        List<String> columns = new ArrayList<>(Arrays.asList("id", "nome", "validade"));
        database.put("product", columns);
    }

    @Override
    public void undo() {

        database.remove("product");
    }
}
