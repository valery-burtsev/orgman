package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography ud = UserDemographyFactory.buildUserDemography("test@test.com", "Mr", "1", "1", new Date());
        assertNotNull(ud);
        assertEquals("test@test.com", ud.getUserEmail());
    }
}