import java.sql.*;

public class MYSQLPersonDAO implements PersonDAO{
    public void savePerson (Person person) throws Exception{
        String name = person.getName();

        //membuat koneksi, nama db,user,pass, meneysuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/pbo","root","");

        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        //tutup koneksi database
        con.close();
    }

    
}
