package jdbcDay1;

import java.sql.*;

import static java.sql.DriverManager.getConnection;
import static javax.swing.text.html.HTML.Tag.SELECT;

public class C01 {





    public static void main(String[] args) throws ClassNotFoundException, SQLException {




        Class.forName("mysql.jdbc.Driver");

              Connection con = DriverManager.getConnection("moktok.intecbrussel.org:33062","JAVAJANNihat","JAVAJANNihat");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT*FROM Beers"  );
        while(rs.next());
        ResultSet rs2 = st.executeQuery("UPDATE Brewers SET adressenlijst = CONCAT(ZipCode,' -- ' ,City);\n" +
                "ALTER TABLE Brewers ADD COLUMN adressenlijst VARCHAR(100);\n" +
                "SELECT Name , Address , adressenlijst FROM Brewers b ; "  );
        while(rs2.next());
        System.out.println("Name  :"+ rs2.getNString("Name"));


        st.close();
        con.close();
        rs.close();



    }
}
