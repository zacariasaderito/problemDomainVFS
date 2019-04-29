package cput.ac.za.problemDomain.TestFactoty;

import cput.ac.za.problemDomain.domain.document.Licence;
import cput.ac.za.problemDomain.factory.LicenseFactory;
import org.junit.Test;

public class TestLicenceFactory {

    @Test
    public void createLicence()
    {
        Licence licence = LicenseFactory.createLicense("car");

        licence.showLicence();
    }



}
