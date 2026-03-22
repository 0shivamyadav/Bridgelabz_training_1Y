package Static_Methods_in_Interfaces.Unit_Conversion_Tool;

public interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
