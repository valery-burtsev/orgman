package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation o = OrganisationFactory.buildOrganisation("Test");
        assertNotNull(o);
        assertNotNull(o.getOrgCode());
        assertEquals("Test", o.getOrgName());
    }
}