package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * java-based
 * spring support : implements SpringJdbcMigration
 *
 * @author xhh
 * @version 1.0
 * @date 2017-09-08
 */
public class V1_4__Insert_user implements JdbcMigration {
    public void migrate(Connection connection) throws Exception {
        String sql = "insert into USER (ID, NAME, AGE) values (1, 'Axel', 20);";
        PreparedStatement statement = connection.prepareStatement(sql);
        try {
            statement.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            statement.close();
        }
    }
}
