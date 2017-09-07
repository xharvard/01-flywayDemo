package com.xhh.flyway.main;

import org.flywaydb.core.Flyway;

/**
 * class description goes here
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
