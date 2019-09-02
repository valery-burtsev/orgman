package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        User u = UserFactory.buildUser("test@test.com", "John", "Doe");
        assertNotNull(u);
        assertEquals("test@test.com", u.getUserEmail());
    }
}