package JDBC.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    private static DataSource ds;
    static{
        Properties properties = new Properties();
        try{
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("druid.propeties"));
//            System.out.println(properties);
            ds = DruidDataSourceFactory.createDataSource(properties);
        }catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取链接
    public static Connection getConnection () throws SQLException {
        return ds.getConnection();
    }
    //关闭
        public static void close (Statement statement, Connection conn) {
            close( statement,  conn, null);
        }
        public static void close (Statement statement, Connection conn, ResultSet rs){
            if(statement != null){
                try{
                    conn.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    statement.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }

    public static DataSource getDateSouce(){
        return ds;
    }

    public static void setDs(DataSource ds) {
        JDBCUtil.ds = ds;
    }
}
