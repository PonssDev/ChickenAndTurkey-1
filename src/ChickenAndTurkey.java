import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChickenAndTurkey {

	public static void main(String[] args) {
		 String username = "admin";
	        String password = "chicken123";
	        String urlBD = "jdbc:mysql://localhost:3306/chickenandturkey";
	        try {
	            Connection conn = DriverManager.getConnection(urlBD, username, password);
			    System.out.println("Cargado correctamente");
	            System.out.println("Conexión exitosa a la base de datos chickenandturkey.");
	            conn.close();
	        } catch (SQLException e) {
	            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
	        }

	}
	
	int num = 3;

}
