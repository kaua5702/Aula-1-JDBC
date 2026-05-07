import java.sql.*;

public class Main {

    static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/escola";
        String uname = "root";
        String pass = "1234";
        String query = "SELECT * FROM estudante";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("nome");

        System.out.println(name);

        st.close();
        con.close();
    }
}
