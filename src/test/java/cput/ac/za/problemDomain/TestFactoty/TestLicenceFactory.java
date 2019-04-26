package cput.ac.za.problemDomain.TestFactoty;

import cput.ac.za.problemDomain.Domain.Licence;
import cput.ac.za.problemDomain.Factory.LicenseFactory;
import org.junit.Test;

public class TestLicenceFactory {

    @Test
    public void createLicence()
    {
        Licence licence = LicenseFactory.createLicense("moto");

        licence.showLicence();
    }



}
