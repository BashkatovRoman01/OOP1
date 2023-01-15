public class Car {
private final String brand;
    private final String model;
    private final double enginePower;
    private final String color;
    private final Integer year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = validateEnginePower(enginePower);
        this.color = validateCarParameters(color);
        this.year = validateYear(year);
        this.country = validateCarParameters(country);
    }


    @Override
    public String toString() {
        return " Марка автомобиля " + brand + " модель " + model + " объем двигателя " + enginePower + " цвет " + color + " год выпуска " + year + " страна производитель " + country ;
    }
    public static double validateEnginePower(double value) {return value<0 ? 1.5: value;}
    public static Integer validateYear (Integer value) {return value==null ? 2000:value;}
    public static String validateCarParameters(String value) {return validateString (value, "default");}
    public static String validateCarColor (String value) {return value==null ? "белый":value;}
}
