
import car_sales.Car;
import car_sales.User;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adria
 */
public class Testing {
    
    public Testing() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCarConstructorAndGetters() {
        List<BufferedImage> images = new ArrayList<>();

        
        Car car = new Car("BMW", "M3", "50000", "30000", "Manual", "Petrol", "2022", "450 HP", "3.0L V6", "Black", images);

        // Verificăm valorile prin getter-e
        assertEquals("BMW", car.getName());
        assertEquals("M3", car.getModel());
        assertEquals("50000", car.getPrice());
        assertEquals("30000", car.getKilometers());
        assertEquals("Manual", car.getTransmission());
        assertEquals("Petrol", car.getFuelType());
        assertEquals("2022", car.getYear());
        assertEquals("450 HP", car.getPower());
        assertEquals("3.0L V6", car.getEngine());
        assertEquals("Black", car.getColor());
        assertEquals(images, car.getImages());
    }

    // Teste pentru clasa User
    @Test
    public void testUserConstructorAndGetters() {
        
        User user = new User("testUser", "test@example.com", "password123", true, false);

       
        assertEquals("testUser", user.getUsername());
        assertEquals("test@example.com", user.getEmail());
        //assertEquals("password123", user.getPassword());
        assertTrue(user.isAdmin());
        assertFalse(user.isGuest());
    }
}
