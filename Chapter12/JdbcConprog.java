package Chapter12;


import java.sql.*;  
public class JdbcConprog { 
   public static void main(String args[]){ 
      String jdbc_url = "jdbc:mysql://localhost:3306/comeng";
      Connection conn= null; 
      
      try {
         Class.forName("com.mysql.jdbc.Driver"); 
         conn = DriverManager.getConnection(jdbc_url, "root","1234"); 
         System.out.println("데이터베이스에 접속했습니다.!");
         conn.close();
      }catch(ClassNotFoundException e) {
         System.out.println("ClassNotFoundException: " + e.getMessage()); 
    
      }catch(SQLException se){
         System.out.println(se.getMessage());
    } 
  }	}

