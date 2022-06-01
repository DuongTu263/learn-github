
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Nam Hai
 */
public class DBContext {

    private String HOST = "localhost";
    private String PORT = "1433";
    private String DATABASE_NAME = "ClinicManagement";
    private String USERNAME = "sa";
    private String PASSWORD = "123";

    /**
     * Lookup context parameters
     */
    public DBContext() {
        try {
            InitialContext initialContext = new InitialContext();
            HOST = (String) initialContext.lookup("java:comp/env/host");
            PORT = (String) initialContext.lookup("java:comp/env/port");
            DATABASE_NAME = (String) initialContext.lookup("java:comp/env/database-name");
            USERNAME = (String) initialContext.lookup("java:comp/env/username");
            PASSWORD = (String) initialContext.lookup("java:comp/env/password");
        } catch (NamingException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Create a connection to database
     *
     * @return connection Is a connection connect to database. It's a
     * <code>java.sql.Connection</code> object
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        Connection connection = null;
        try {
            String url = "jdbc:sqlserver://" + HOST + ":"
                    + PORT + ";databaseName=" + DATABASE_NAME;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    /**
     * Close a connection from database
     *
     * @param connection Is a connection connect to database. It's a
     * <code>java.sql.Connection</code> object
     */
    protected void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Close a result set from a connection
     *
     * @param rs Is a result set from a connection. It's a
     * <code>java.sql.ResultSet</code> object
     */
    protected void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Close a prepared statement from a connection
     *
     * @param st Is a prepared statement from a connection. It's a
     * <code>java.sql.PreparedStatement</code> object
     */
    protected void closePreparedStatement(PreparedStatement st) {
        try {
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
