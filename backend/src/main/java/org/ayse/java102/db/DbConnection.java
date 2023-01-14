package org.ayse.java102.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

  public static final String DB_URL = "jdbc:postgresql://localhost:49153/demodb";
  public static final String DB_USERNAME = "postgres";
  public static final String DB_PASSWORD = "postgrespw";

  public static void main(String[] args) {
    Connection conn = null;

    try {
      conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
  }
}
