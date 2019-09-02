package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser ou = OrganisationUserFactory.buildOrganisationUser("123", "test@test.com");
        assertNotNull(ou);
        assertEquals("123", ou.getOrgCode());
        assertEquals("test@test.com", ou.getUserEmail());
    }
}