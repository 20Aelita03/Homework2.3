public class Main {
    public static void main(String[] args) {

        insurance lada1 = new insurance("22-12-2023", "12000", "123456789");
        insurance audi1 = new insurance("17-03-2030", "20000", "987654321");
        insurance bmw1 = new insurance("10-10-2022", "15000", "111111111");
        insurance kia1 = new insurance("01-03-2025", "17500", "121212121");
        insurance hyundai1 = new insurance("01-01-2023", "5700", "22222222");

        System.out.println("Машины");
        Car lada = new Car("Lada", "Grande","Бензиновый", 1.7, "Желтый", 2015,
                "Россия", 0, " ", " ", 0, " ", "",lada1);
        lada.getMassage();
        lada.refill();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", "Бензиновый",3.0, "Черный",
                2020, "Германия", 0, " ", " ", 0, " ",
                " ", audi1);
        audi.getMassage();
        audi.refill();

        Car bmw = new Car("BMW", "Z8","Бензиновый", 3.0, "Черный", 2021,
                "Германия", 0," ", " ", 0, " ", " ", bmw1);
        bmw.getMassage();
        bmw.refill();

        Car kia = new Car("Kia", "Sportage 4","Бензиновый", 2.4, "Красный", 2018,
                "Южная Корея", 0, " ", " ", 0, " ", " ", kia1);
        kia.getMassage();
        kia.refill();

        Car hyundai = new Car("Hyundai", "Avante", "Бензиновый",1.6, "Оранжевый",
                2016, "Южная Корея", 0," ", " ", 0,
                " ", " ", hyundai1);
        hyundai.getMassage();
        hyundai.refill();


        System.out.println("Поезда");

        train lastochka = new train("Ласточка", "B-901", 2011, "России",
                "", 301, 3500, 0, "Белорусского вокзала",
                "Минск-Пассажирский",11);

        lastochka.getMassageTrain();
        lastochka.refill();

        train leningrad = new train("Ленинград", "D-125", 2019, "России", "",
                270, 1700, 0, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8);

        leningrad.getMassageTrain();
        leningrad.refill();

        System.out.println("Автобусы");

        Bus mercedes = new Bus("Mercedes-Benz", "Conecto G", "Бензиновый", 2020, "Германия",
                "белый", 96);
        mercedes.getMassageBus();
        mercedes.refill();

        Bus hyundaiBus = new Bus("Hyundai", "Super Aero City", "Бензиновый", 2018, "Южная Корея",
                "бело-желтый", 96);
        hyundaiBus.getMassageBus();
        hyundaiBus.refill();

        Bus foton = new Bus("Foton", "BJ 6126","Бензиновый", 2022, "Китай", "белый",90);
        foton.getMassageBus();
        foton.refill();




    }
}