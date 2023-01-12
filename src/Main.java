public class Main {
    public static void main(String[] args) {
    Car lada = new Car("Lada ", "Lada Granta", 1.6, "желтый",2015, "Russia" );
        System.out.println(lada.toString());
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0,"черный" , 2020, "Германия");
        System.out.println(audi.toString());
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        System.out.println(bmw.toString());
        Car kia = new Car("KIA", "Kia Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(kia.toString());
        Car hyundai  = new Car("Hyundai", "Hyundai Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundai.toString());
    }
}