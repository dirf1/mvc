package com.mvc.repository;
import java.util.ArrayList;
import java.sql.*;
import java.util.*;

public class ClassInfoRepository {

    public List<Map<String, String>> selectClassInfoList() {
       
        String driverName = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/kd";
        String user = "root";
        String pwd = "kd1824java";
        
        List<Map<String, String>> classInfoList = new ArrayList<>();
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
        	Connection con = DriverManager.getConnection(url, user, pwd);
            String sql = "SELECT * FROM CLASS_INFO WHERE 1=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, String> classInfo = new HashMap<>();
                classInfo.put("CI_NUM", rs.getString("CI_NUM"));
                classInfo.put("CI_NAME", rs.getString("CI_NAME"));
                classInfo.put("CI_DESC", rs.getString("CI_DESC"));
                classInfoList.add(classInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return classInfoList;
    }
    
    public Map<String, String> selectClassInfotwo() {
        
        String driverName = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/kd";
        String user = "root";
        String pwd = "kd1824java";
        
        List<Map<String, String>> classInfotwo = new ArrayList<>();
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
        	Connection con = DriverManager.getConnection(url, user, pwd);
            String sql = "SELECT * FROM CLASS_INFO WHERE 1=1 AND";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, String> classInfo = new HashMap<>();
                classInfo.put("CI_NUM", rs.getString("CI_NUM"));
                classInfo.put("CI_NAME", rs.getString("CI_NAME"));
                classInfo.put("CI_DESC", rs.getString("CI_DESC"));
                classInfotwo.add(classInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classInfotwo;

    public static void main(String[] args) {
        ClassInfoRepository ciRepo = new ClassInfoRepository();
        List<Map<String, String>> classInfoList = ciRepo.selectClassInfoList();
        System.out.println(classInfoList);
    }
}