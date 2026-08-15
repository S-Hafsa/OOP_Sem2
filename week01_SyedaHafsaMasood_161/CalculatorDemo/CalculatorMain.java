public class CalculatorMain {

    public static void main(String[] args) {

        // Create instance of Calculator
        Calculator casio = new Calculator();
        // Create an instance of Calculator with initial values
        Calculator citizen = new Calculator(10.5, 5.0);

        //set values for casio calculator, since by default it is 0,0
        casio.setValues(8, 2);
        System.out.println("Casio values are " + casio.getA() + " and " + casio.getB());
        System.out.println("Citizen values are " + citizen.getA() + " and " + citizen.getB());

        System.out.println(" Citizen values Addition: " + citizen.add());
        System.out.println(" Casio values Subtraction: " + casio.subtract());
        System.out.println(" Citizen values Multiplication: " + citizen.multiply());

       //to check edge cases, setting casio values to 10 and 0 to check division and modulus by zero
        casio.setValues(10, 0);
        System.out.println("Casio values are now " + casio.getA() + " and " + casio.getB());
        //normal case, division by non zero number
        System.out.println(" [Normal case] Citizen values Division: " + citizen.divide());
        //edge case, division by zero
        System.out.println(" [Edge case] Casio values Division: " + casio.divide());
    
        //normal case, modulus by non zero
        System.out.println(" [Normal case] Citizen values Modulus: " + citizen.modulus());
        //edge case, modulus by zero
        System.out.println(" [Edge case] Casio values Modulus: " + casio.modulus());

        //normal case
        System.out.println(" [Normal case]Citizen values Power: " + citizen.power());
        //edge case, power with exponent as zero should return 1
        System.out.println(" [Edge case] Casio values Power: " + casio.power()); 

        //normal case
        System.out.println("Average of [10, 20, 30, 40]: " + Calculator.average(10, 20, 30, 40));
       //edge case, average of no numbers should return 0
        System.out.println("Average of [] values: " + Calculator.average());
    } 
}