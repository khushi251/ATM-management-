package dao;

import java.sql.*;
import myconnection.OnlineConnection;
import model.Atm;

public class AtmDao {
    
    public boolean updatePin(int accno,int pin){
         int n=0;
        try{
            Connection con=null;
            PreparedStatement ps=null;
            con=OnlineConnection.getConnection();
            String sql;
            sql="update user set pin=? where accountno=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, pin);
            ps.setInt(2, accno);
            n=ps.executeUpdate();
            if(n>0)
                return true;
         }catch(Exception e){
            System.out.println(e);
        }return false;
    }
    public boolean login(int accno, int pin){
        try{
            Connection con=null;
            PreparedStatement ps=null;
            con=OnlineConnection.getConnection();
            ResultSet rs=null;
            String sql;
            sql="select * from user where accountno=? and pin=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, accno);
            ps.setInt(2, pin);
            rs=ps.executeQuery();
            if(rs.next()){
                 return true;
             }
            
        }catch(Exception e){
            System.out.println(e);
        }return false;
    }
        public boolean insertData(Atm a)
    {
        int n=0;
        try{
        
        Connection con=null;
        PreparedStatement ps= null;
        con=OnlineConnection.getConnection();
        String sql;
        sql="insert into user values(?,?,?,?,?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setInt(1,a.getAccno());
        ps.setString(2,a.getFname());
        ps.setString(3,a.getLname());
        ps.setDate(4,a.getDob());
        ps.setString(5,a.getAddress());
        ps.setInt(6,a.getPin());
        ps.setString(7,a.getEducation());
        ps.setString(8,a.getOccupation());
        ps.setString(9,a.getPhoneno());
        n=ps.executeUpdate();
          if(n>0)
              return true;
    }
       catch(Exception e){
           System.out.println(e);
       }return false;
    }
        
         public  Atm searchByUser(int accno)
    {
        
        int n=0;
        Atm s=new Atm();
        try{
            Connection con =null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            con=OnlineConnection.getConnection();
            String sql;
            sql="select * from user where accountno=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,accno);
            rs=ps.executeQuery();
            
            if(rs.next()){
                s.setAccno(rs.getInt(1));
                s.setBalance(rs.getInt(10));
            }else{
                s=null;
            }
                
        }catch(Exception e){
            System.out.println(e);
        }
        return(s);
    } 
         
     public boolean updateBalance(int accno, int total){
       int n=0;
         try{
        Connection con=null;
        PreparedStatement ps= null;
        con=OnlineConnection.getConnection();
        String sql;
        sql="update user set balance=? where accountno=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1, total);
        ps.setInt(2, accno);
        n=ps.executeUpdate();
        if(n>0)
            return true;
        }catch(Exception e){
         System.out.println(e);
     }return false;
    }
}