package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race r = RaceFactory.buildRace("African");
        Assert.assertNotNull(r);
        Assert.assertNotNull(r.getRaceId());
        Assert.assertEquals("African", r.getRaceDescription());
    }
}