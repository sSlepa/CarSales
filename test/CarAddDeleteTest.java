import org.junit.jupiter.api.*;
import java.sql.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarAddDeleteTest {

    private static final String URL = "jdbc:mysql://localhost:3306/proiect_cars";
    private static final String USER = "root";
    private static final String PASSWORD = "smecher12@";

    private Connection connection;

    @BeforeEach
    public void setup() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @AfterEach
    public void teardown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    @Order(1)
    public void testAddCar() throws SQLException {
        String query = "INSERT INTO cars (name, model, price, km, transmission, fuel, year, power, engine, color, imagess) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // Set test values
        preparedStatement.setString(1, "TestName");
        preparedStatement.setString(2, "TestModel");
        preparedStatement.setString(3, "10000");
        preparedStatement.setString(4, "50000");
        preparedStatement.setString(5, "Manual");
        preparedStatement.setString(6, "Gasoline");
        preparedStatement.setString(7, "2020");
        preparedStatement.setString(8, "150");
        preparedStatement.setString(9, "1.6");
        preparedStatement.setString(10, "Red");
        preparedStatement.setString(11, "test_image_path");

        int rowsInserted = preparedStatement.executeUpdate();
        Assertions.assertEquals(1, rowsInserted, "Car should be added to the database");

        preparedStatement.close();
    }

    @Test
    @Order(2)
    public void testDeleteCar() throws SQLException {
        
        String deleteQuery = "DELETE FROM cars WHERE name = ? AND model = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

        // Set the test values for the car to delete
        preparedStatement.setString(1, "TestName");
        preparedStatement.setString(2, "TestModel");

        int rowsDeleted = preparedStatement.executeUpdate();
        Assertions.assertEquals(1, rowsDeleted, "Car should be deleted from the database");

        preparedStatement.close();
    }

    @Test
    @Order(3)
    public void testVerifyCarDeletion() throws SQLException {
        String selectQuery = "SELECT * FROM cars WHERE name = ? AND model = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        // Set the test values to verify deletion
        preparedStatement.setString(1, "TestName");
        preparedStatement.setString(2, "TestModel");

        ResultSet resultSet = preparedStatement.executeQuery();
        Assertions.assertFalse(resultSet.next(), "Car should no longer exist in the database");

        resultSet.close();
        preparedStatement.close();
    }
}
