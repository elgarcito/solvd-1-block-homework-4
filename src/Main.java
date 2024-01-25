
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
Supplier: the one that sells the product.
Client: the one that buys the product.
 */

import exceptions.AutoCloseableNoResource;
import finalClasess.PayingRates;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }
    private static final Logger LOGGER= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        //Instantiations of the different implemented classes after the implementation of abstract

        LOGGER.info("Hello and welcome to hardware store!! \n");

        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        Supplier rinoMax= new Supplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        //Creating ElectricProducts Objects
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        lightBulb.setPower(10);
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //Creating GardenProduct Objects
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);
        //Creating GasProduct Objects
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        //Creating a HandTool Objects
        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        //Creating HouseholdItem Objects
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        //Creating a WaterProduct Object
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");


        //Try-catch handled in two ways and checking each exception
        //Created an employee with all wrong data to throw all exceptions
        Employee jackLalein=new Employee("jack 123 my name is too long","jack@gmail.com","12345678","seller");
        jackLalein.checkEmployeeData();
        jackLalein.setPersonName("jack lalein1");
        System.out.println();
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonName("jack lalein");
        jackLalein.setPersonEmail("jack@momo");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonEmail("jack@gmail.com");
        jackLalein.setPhoneNumber("123456789");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPhoneNumber("12345678");
        jackLalein.setSpeciality("cleaner");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setSpeciality("seller");
        //All Employee correct data result
        jackLalein.checkEmployeeData();
        System.out.println();
        //Try-catch with resource example
        try (AutoCloseable ac = new AutoCloseableNoResource()) {
            LOGGER.info("Inside try block to test Try catch with exception");
        } catch (Exception e) {
            LOGGER.error("An error occurred: " + e);
        }
        System.out.println();
    }
}
