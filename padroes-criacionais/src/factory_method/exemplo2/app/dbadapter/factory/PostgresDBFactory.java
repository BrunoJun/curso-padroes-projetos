package factory_method.exemplo2.app.dbadapter.factory;

import factory_method.exemplo2.app.dbadapter.db.DB;
import factory_method.exemplo2.app.dbadapter.db.PostgresDB;

public class PostgresDBFactory implements DBFactory{

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
