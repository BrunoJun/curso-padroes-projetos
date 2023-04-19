package factory_method.exemplo2.app.dbadapter.factory;

import factory_method.exemplo2.app.dbadapter.db.DB;
import factory_method.exemplo2.app.dbadapter.db.OracleDB;

public class OracleDBFactory implements DBFactory{

    @Override
    public DB getDatabase() {

        return new OracleDB();
    }
}
