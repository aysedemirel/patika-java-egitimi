package org.ayse.java102.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

  private static final String DB_URL = "jdbc:postgresql://localhost:49153/demodb";
  private static final String DB_USERNAME = "postgres";
  private static final String DB_PASSWORD = "postgrespw";

  public static void main(String[] args) {
    String selectSSql = "SELECT * FROM customer";
    String insertSql = "INSERT INTO customer (customer_id,customer_name, customer_age) VALUES (?, ?, ?)";
    String deleteSql = "DELETE FROM customer WHERE customer_id=1";
    String updateSql = "UPDATE customer SET customer_name=? WHERE customer_id=?";

    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME,
        DB_PASSWORD); Statement statement = conn.createStatement()) {
      PreparedStatement prSt = conn.prepareStatement(insertSql);
      prSt.setInt(1, 1);
      prSt.setString(2, "Mustafa");
      prSt.setInt(3, 12);
      int insertResult = prSt.executeUpdate();
      System.out.println(insertResult == 1 ? "Customer is added successfully."
          : "Something is wrong with inserting customer");

      ResultSet resultSet = statement.executeQuery(selectSSql);
      while (resultSet.next()) {
        System.out.println("Id: " + resultSet.getInt("customer_id"));
        System.out.println("Name: " + resultSet.getString("customer_name"));
        System.out.println("Age: " + resultSet.getInt("customer_age"));
        System.out.println("---------------");
      }
      prSt = conn.prepareStatement(updateSql);
      prSt.setString(1, "Ayse");
      prSt.setInt(2, 1);
      int updateResult = prSt.executeUpdate();
      System.out.println(updateResult == 1 ? "Customer is updated successfully."
          : "Something is wrong with updating customer");

      resultSet = statement.executeQuery(selectSSql);
      while (resultSet.next()) {
        System.out.println("Id: " + resultSet.getInt("customer_id"));
        System.out.println("Name: " + resultSet.getString("customer_name"));
        System.out.println("Age: " + resultSet.getInt("customer_age"));
        System.out.println("---------------");
      }

      int isOk = statement.executeUpdate(deleteSql);
      System.out.println(
          isOk == 1 ? "Customer deleted" : "Something is wrong with deleting customer");
      prSt.close();
    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
  }
}
