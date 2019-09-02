package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role r = RoleFactory.buildRole("admin");
        Assert.assertNotNull(r);
        Assert.assertNotNull(r.getRoleId());
        Assert.assertEquals("admin", r.getRoleName());
    }
}