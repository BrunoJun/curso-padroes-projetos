package command.exemplo2.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UserTable extends MigrationCommand {

    public UserTable(Map<String, List<String>> database) {

        super(database);
    }

    @Override
    public void execute() {

        List<String> columns = new ArrayList<>(Arrays.asList("id", "nome", "cpf"));
        database.put("user", columns);
    }

    @Override
    public void undo() {

        database.remove("user");
    }
}
