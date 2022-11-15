package SQL_Basic.DDL._2_DROP_A_TABLE;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL sublanguage: DDL (Data Definition Language)
 *
 * In the last activity we learned how to create tables in SQL. In this activity we are going to learn how to drop a table from our database.
 *
 * The syntax for dropping a table is as follows:
 * DROP TABLE table_name;
 *
 * Additional reference material if needed: https://www.w3schools.com/sql/sql_drop_db.asp
 * */
public class DropATable {

    /**
     *      songs Table Diagram:
     *      |      title        |        artist         |
     *      ---------------------------------------------
     *      |'Let it be'        |'Beatles'              |
     *      |'Hotel California' |'Eagles'               |
     *      |'Kashmir'          |'Led Zeppelin'         |
     */
    public void problem1(){
        /**
         * Activity: Drop the table "songs"
         */
        String sql = "Write SQL statement here...";

        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            s.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage() + '\n');
        }
    }

}