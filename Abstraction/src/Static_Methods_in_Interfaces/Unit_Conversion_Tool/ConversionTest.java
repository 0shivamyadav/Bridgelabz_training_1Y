package Static_Methods_in_Interfaces.Unit_Conversion_Tool;

public class ConversionTest {
    public static void main(String[] args) {

        double km = 10;
        double kg = 5;

        System.out.println("Miles: " + UnitConverter.kmToMiles(km));
        System.out.println("Pounds: " + UnitConverter.kgToPounds(kg));
    }
}
