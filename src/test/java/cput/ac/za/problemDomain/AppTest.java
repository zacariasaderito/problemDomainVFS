package cput.ac.za.problemDomain;

import static org.junit.Assert.assertTrue;

import cput.ac.za.problemDomain.domain.transport.Vehicle;
import cput.ac.za.problemDomain.factory.VehicleFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Vehicle v = VehicleFactory.createVehicle("car");
        assertTrue( true );

    }


}
