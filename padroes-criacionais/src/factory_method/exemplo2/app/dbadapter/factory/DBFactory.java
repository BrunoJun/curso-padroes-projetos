package factory_method.exemplo2.app.dbadapter.factory;

import factory_method.exemplo2.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
