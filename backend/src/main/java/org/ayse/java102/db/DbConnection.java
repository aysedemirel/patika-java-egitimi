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

  public static void insert(Connection conn) throws SQLException {
    String insertSql = "INSERT INTO customer (customer_id,customer_name, customer_age) VALUES (?, ?, ?)";
    try (PreparedStatement prSt = conn.prepareStatement(insertSql)) {
      prSt.setInt(1, 1);
      prSt.setString(2, "Mustafa");
      prSt.setInt(3, 12);
      int insertResult = prSt.executeUpdate();
      if (insertResult == 1) {
        System.out.println("Customer is added successfully.");
      }
    } catch (SQLException e) {
      throw new SQLException("Something is wrong with adding customer");
    }
  }

  public static void select(Statement statement) throws SQLException {
    String selectSSql = "SELECT * FROM customer";
    try (ResultSet resultSet = statement.executeQuery(selectSSql)) {
      while (resultSet.next()) {
        System.out.println("Id: " + resultSet.getInt("customer_id"));
        System.out.println("Name: " + resultSet.getString("customer_name"));
        System.out.println("Age: " + resultSet.getInt("customer_age"));
        System.out.println("---------------");
      }
    } catch (SQLException e) {
      throw new SQLException("Something is wrong with selecting customer");
    }
  }

  public static void update(Connection conn) throws SQLException {
    String updateSql = "UPDATE customer SET customer_name=? WHERE customer_id=?";
    try (PreparedStatement prSt = conn.prepareStatement(updateSql)) {
      prSt.setString(1, "Ayse");
      prSt.setInt(2, 1);
      int updateResult = prSt.executeUpdate();
      if (updateResult == 1) {
        System.out.println("Customer is updated successfully.");
      }
    } catch (SQLException e) {
      throw new SQLException("Something is wrong with updating customer");
    }
  }

  public static void delete(Statement statement) throws SQLException {
    String deleteSql = "DELETE FROM customer WHERE customer_id=1";
    try {
      int isOk = statement.executeUpdate(deleteSql);
      if (isOk == 1) {
        System.out.println("Customer deleted");
      }
    } catch (SQLException e) {
      throw new SQLException("Something is wrong with deleting customer");
    }
  }

  public static void main(String[] args) throws SQLException {
    Connection conn = null;
    Statement statement = null;
    try {
      conn = DriverManager.getConnection(DB_URL, DB_USERNAME,
          DB_PASSWORD);
      statement = conn.createStatement();
      conn.setAutoCommit(false);
      insert(conn);
      select(statement);
      update(conn);
      select(statement);
      delete(statement);
      conn.commit();
    } catch (SQLException ex) {
      if (conn != null) {
        conn.rollback();
      }
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    } finally {
      if (statement != null) {
        statement.close();
      }
      if (conn != null) {
        conn.close();
      }
    }
  }
}
