import static validateUtils.validateString;
public class Car {
private final String brand;
    private final String model;
    private double enginePower;
    private final String color;
    private final Integer year;
    private final String country;
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmission;
    private String number;
    private final int seatCount;
    private Key key;
    private Insuarance insuarance;
    public Car(String brand, String model, double enginePower, String color, Integer year, String country,
               String bodyType, boolean isSummerRubber, String transmission, String number, int seatCount, Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = validateEnginePower(enginePower);
        this.color = validateCarParameters(color);
        this.year = validateYear(year);
        this.country = validateCarParameters(country);
        this.bodyType = validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmission = validateTransmission(transmission);
        this.number = validateNumber(number);
        this.seatCount = validateSeatCount(seatCount);
        this.key = key;
    }
    public void changeTyres (int month) {
        if ((month>=11 && month<=12) || (month>=1&&month<=3)){
            isSummerRubber=false;
        }
        if (month>=4&& month<=10) {
            isSummerRubber=true;
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = validateEnginePower(enginePower);
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public void setNumber(String number) {
        this.number = validateNumber(number);
    }

    public void setKey(this.Key key) {
        this.key = key;
    }

    public void setInsuarance(this.Insuarance insuarance) {
        this.insuarance = insuarance;
    }


    @Override
    public String toString() {
        return " Марка автомобиля " + brand + " модель " + model + " объем двигателя " + enginePower + " цвет " + color + " год выпуска " + year + " страна производитель " + country ;
    }
    public int validateSeatCount (int seatCount) {return seatCount<=0?4:seatCount;}
    public static String validateCountry(String vslue) {return validateString(value, "Rus");}
    public static double validateEnginePower(double value) {return value<0 ? 1.5: value;}
    public static Integer validateYear (Integer value) {return value==null || value<=1900 ? 2000:value;}
    public static String validateCarParameters(String value) {return value==null? "не указано":value;}
    public static String validateCarColor (String value) {return validateString(value, "белый");}
    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }
    public static class Key{
        private final boolean remoteStart;
        private final boolean keylessAccess;
        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart=validateBoolean(remoteStart);
            this.keylessAccess=validateBoolean(keylessAccess);
        }
    }
}
