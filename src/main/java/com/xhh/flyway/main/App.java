package com.xhh.flyway.main;

import org.flywaydb.core.Flyway;

/**
 * sql文件命名约定： V[version.version]__Description.sql
 * java命名约定： V_[version_version]__Description.java
 *
 * @author xhh
 * @version 1.0
 * @date 2017-09-07
 */
public class App {
    public static void main(String[] args) {
        // Create the Flyway instance
        Flyway flyway = new Flyway();
        // Point it to the database
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyway-demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC", "root", "root");
        // Start the migration
        flyway.migrate();
    }
}
