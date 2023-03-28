
package consultorio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;        
import java.sql.ResultSet;

public class MySqlConn {
    Statement stmt=null;
    ResultSet rs=null;
    Connection conn=null;
    
    public MySqlConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql//localhost/Consultorio?"+
                    "characterEncoding=latin&"+"user=usuario&2451192002=2451192002";
            conn=DriverManager.getConnection(connectionUrl);
        }catch(SQLException e){
            System.out.println("SQL Exception: "+e.toString());
            
        }catch(ClassNotFoundException cE){
            System.out.println("Class Not Found Exception: "+cE.toString());    
        }
    }
    public void Consult(String query){
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(query);
            if(stmt.execute(query)){
                rs=stmt.getResultSet();
                rs.first();
            }
        }
        catch(SQLException ex){
            System.out.println("SQLExepcion: "+ex.getMessage());
            System.out.println("SOLState"+ex.getSQLState());
            System.out.println("Error"+ex.getErrorCode());
        }
    }
    public int Update(String query){
        int rModif=0;
        try{
            stmt=conn.createStatement();
            rModif=stmt.executeUpdate(query);
        }
        catch(SQLException ex){
            System.out.println("SQLException: "+ex.getMessage());
            System.out.println("SQLState: "+ex.getSQLState());
            System.out.println("Error: "+ex.getErrorCode());
        }
        return rModif;
    }
    
    public void closeRsStmt(){
        if(rs!=null){
            try{
                rs.close();
            }
            catch(SQLException sqlEx){
            }
            rs=null;
        }
        if(stmt!=null){
            try{
                stmt.close();
            }catch(SQLException sqlEx){
            }
            stmt=null;
        }
    }
}
