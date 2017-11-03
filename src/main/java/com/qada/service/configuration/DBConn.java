package com.qada.service.configuration;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBConn {
  private static String dbName  = "id3311682_promo";
  private static String user    = "sangar";
  private static String pass    = "test";

  private Connection conn = null;
  private PreparedStatement ps = null;

  private void createConn() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      log("Adding MySQL JDBC Driver: Success!");
    } catch (ClassNotFoundException e) {
      log("Sorry, couldn't found JDBC driver. Make sure you have added JDBC Maven Dependency Correctly");
      e.printStackTrace();
      return;
    }

    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", user, pass);
      if (conn != null) {
        log("Create connection: Success!");
      } else {
        log("Failed to make connection!");
      }
    } catch (SQLException e) {
      log("MySQL Connection Failed!");
      e.printStackTrace();
      return;
    }
  }

  private void closeConn() {
    try {
      conn.close();
    } catch (SQLException e) {
      log("Close connection: FAILED!");
    }
    log("Close connection: Success!");
  }

  private void log(String string) {
    System.out.println(string);
  }

  public List<Object> getData(String query) {
    List<Object> res = new ArrayList<Object>();
    createConn();

    try {
      String getQueryStatement = query;
      System.out.println("query = "+query);

      ps = conn.prepareStatement(getQueryStatement);

      ResultSet rs = ps.executeQuery();
      res = convertToJSON(rs);
    } catch (

        SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    closeConn();
    return res;
  }

  public List<Object> setData(String query){
    List<Object> res = new ArrayList<Object>();
    createConn();
    try {
      String getQueryStatement = query;
      System.out.println("query = "+query);

      ps = conn.prepareStatement(getQueryStatement, Statement.RETURN_GENERATED_KEYS);

      int insRow = ps.executeUpdate();
      if (insRow == 0) {
        throw new SQLException("Creating user failed, no rows affected!");
      }

      ResultSet rs = ps.getGeneratedKeys();
      res = convertToJSON(rs);
    } catch (

        SQLException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    closeConn();
    return res;
  }

  private List<Object> convertToJSON(ResultSet resultSet){
    List<Object> arr = new ArrayList<Object>();
    try {
      while (resultSet.next()) {
        Map<String,Object> objMap = new HashMap<String, Object>();
        int total_rows = resultSet.getMetaData().getColumnCount();
        for (int i = 1; i <= total_rows; i++) {
          String key = resultSet.getMetaData().getColumnLabel(i).toLowerCase();
          Object objVal = resultSet.getObject(i);
          objMap.put(key, objVal);
        }
        arr.add(objMap);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return arr;
  }
}
