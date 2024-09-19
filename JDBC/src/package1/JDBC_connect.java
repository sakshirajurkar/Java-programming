package package1;

public class JDBC_connect {

	public static void main(String[] args) {
		try {
	  Class.forName("mysql.jdbc.driver.mysqlDriver");
	  Connection con = DriverManager.getConnection("jdbc:mysql:thin@localhost:1521:xe")
		}
		catch() {
			
		}
	}
}
