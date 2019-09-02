package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole ur = UserRoleFactory.buildUserRole("123", "test@test.com", "1");
        assertNotNull(ur);
        assertEquals("test@test.com", ur.getUserEmail());
    }
}