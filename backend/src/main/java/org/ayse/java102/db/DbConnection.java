package org.ayse.java102.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

  private static final String DB_URL = "jdbc:postgresql://localhost:49153/demodb";
  private static final String DB_USERNAME = "postgres";
  private static final String DB_PASSWORD = "postgrespw";

  public static void main(String[] args) {
    String sql = "Select * from students;";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME,
        DB_PASSWORD); Statement statement = conn.createStatement()) {
      ResultSet resultSet = statement.executeQuery(sql);
      while (resultSet.next()) {
        System.out.println("Full name: " + resultSet.getString("fullname"));
      }
    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
  }
}
