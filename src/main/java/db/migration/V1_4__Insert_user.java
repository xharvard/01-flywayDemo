package db.migration;

import org.flywaydb.core.api.MigrationInfo;
import org.flywaydb.core.api.callback.FlywayCallback;
import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * java-based
 * spring support : implements SpringJdbcMigration
 *
 * FlywayCallback: 回调接口
 *
 * @author xhh
 * @version 1.0
 * @date 2017-09-08
 */
public class V1_4__Insert_user implements JdbcMigration, FlywayCallback {
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

    public void beforeClean(Connection connection) {

    }

    public void afterClean(Connection connection) {

    }

    public void beforeMigrate(Connection connection) {

    }

    public void afterMigrate(Connection connection) {

    }

    public void beforeEachMigrate(Connection connection, MigrationInfo migrationInfo) {

    }

    public void afterEachMigrate(Connection connection, MigrationInfo migrationInfo) {

    }

    public void beforeValidate(Connection connection) {

    }

    public void afterValidate(Connection connection) {

    }

    public void beforeBaseline(Connection connection) {

    }

    public void afterBaseline(Connection connection) {

    }

    public void beforeRepair(Connection connection) {

    }

    public void afterRepair(Connection connection) {

    }

    public void beforeInfo(Connection connection) {

    }

    public void afterInfo(Connection connection) {

    }
}
