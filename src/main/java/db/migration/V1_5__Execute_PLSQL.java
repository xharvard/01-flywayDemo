package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 * java-based
 * spring support : implements SpringJdbcMigration
 *
 * @author xhh
 * @version 1.0
 * @date 2017-09-08
 */
public class V1_5__Execute_PLSQL implements JdbcMigration {
    public void migrate(Connection connection) throws Exception {
        System.out.println("-------  start 测试调用存储过程：无返回值");
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall("{call TEST_INSERT_USER(?,?,?)}");
            callableStatement.setInt(1, 2);
            callableStatement.setString(2, "test");
            callableStatement.setInt(3,23);
            callableStatement.execute();
            System.out.println("-------  Test End.");
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
//            if(null != callableStatement){
//                callableStatement.close();
//            }
//            if(null != connection){
//                connection.close();
//            }
        }
    }
}
