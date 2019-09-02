package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender g = GenderFactory.buildGender("Male");
        Assert.assertNotNull(g);
        Assert.assertNotNull(g.getGenderId());
        Assert.assertEquals("Male", g.getGenderDescription());
    }

}