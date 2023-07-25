import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void warmUp(){}

    @AfterEach
    public void tearsDown(){
       DriverSingleton.quit();
    }
}
