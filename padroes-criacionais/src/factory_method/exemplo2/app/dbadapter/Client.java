package factory_method.exemplo2.app.dbadapter;

import factory_method.exemplo2.app.dbadapter.db.DB;
import factory_method.exemplo2.app.dbadapter.factory.OracleDBFactory;
import factory_method.exemplo2.app.dbadapter.factory.PostgresDBFactory;

public class Client {

	public static void main(String[] args) {

		// Abrindo conexão com um banco Oracle
		DB oracleDB = new OracleDBFactory().getDatabase();
		System.out.println(oracleDB);

		// Abrindo conexão com um banco Postgres
		DB postgresDB = new PostgresDBFactory().getDatabase();
		System.out.println(postgresDB);
	}
}
