package cput.ac.za.problemDomain.factory.document;

import cput.ac.za.problemDomain.domain.document.Licence;
import org.junit.Test;

import static org.junit.Assert.*;

public class LicenseFactoryTest {

    @Test
    public void createLicense() {

        Licence licence = LicenseFactory.createLicense("car");

        licence.showLicence();

    }
}