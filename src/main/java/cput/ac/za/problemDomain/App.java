package cput.ac.za.problemDomain;

import cput.ac.za.problemDomain.domain.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Driver driver = new Driver();

        driver.getLicence("taxi");

        System.out.println( driver.toString());



    }

    public void c(){
        Driver d = new Driver();
    }
}
