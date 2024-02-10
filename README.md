# hardware store
Progressive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of products that they are going to content:
1. products.ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. products.ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. products.HandTool: hammer, hand saw, etc.
4. products.GardenProduct:shovel, plant pot, etc.
5. products.HouseholdItem: kettle, broom, brush, etc.
6. products.WaterProduct:water filter, water pump, etc.
7. products.GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. person.Employee: these are the employees of the store and could be: seller, deposit or owner
2. person.Supplier: the one that sells us the products
3. person.BigClient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:

### 07/11/2023

Extend your previous homework with next features:
* Create 5 custom exceptions.
* Handle exceptions in 2 ways
* Use try-catch with resources.
* Log messages to the console, file

### Solution
Create the 5 custom exceptions added in the package exceptions. All of them
are used in the person.Employee.java class.
These are:
* PhoneNumberException: Threw if the phone number has more digits.
The throwPhoneNumberException(String employeePhoneNumber) uses it.
* NumberInNamesException: Threw if the name has numbers.
The throwNameException(String employeeName) uses it.
* LongEmployeeNameException: Threw if the name is too long.
* The throwNameException(String employeeName) uses it.
* EmployeeSpecialityException: Threw if the speciality doesn't exist. 
The throwEmployeeSpecialityException(String employeeSpeciality) uses it.
* EmailException: Threw if the email format is wrong.
The throwEmailException(String employeeEmail) uses it.

The method checkEmployeeData() in person.Employee class uses all these methods inside a
try-catch block to have exceptions handled in 2 ways.
The implementation could be seen in the main method example.

To use the try-catch with resources, we created the AutoClosableNoResource.java class
in exception package.
This implements the Autocloseable interface and overrides the close method.
The implementation could be seen in the main method example.

Log4j was implemented. The configuration file is in the main folder with the name:
* log4j2.xml

The console messages from previous exercises were deleted to see
the console message for this exercise only.
The objects created were kept to be used in this exercise.

The configuration saves all warn and error messages in the HardwareStore.log.
All System.out.println() has been replaced with LOGGER.info(),LOGGER.warn()
or LOGGER.error().The only ones that are keep are the used to add white lines.
