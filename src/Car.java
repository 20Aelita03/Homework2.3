public class Car extends transport {


    private double engineVolumeInLiters;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;
    private insurance insurance;
    private String machineType;






    public void getMassage(){
        System.out.println( brand + " " + model + machineType + ", объем двигателя - " + engineVolumeInLiters + ", цвет кузова - "
                + bodyColor + ", год выпуска - " + productionYear + ", страна производства - " + assemblyCountry + " .Коробка передач - " + transmission +
                " .Тип кузова - " + bodyType + " .Регистрационный номер - " + registrationNumber +
                " .Количество мест - " + numberOfSeats + " .Резина - " + tires + ". Максимальная скорость - " + maximumMovementSpeed +
                " Данные страховки: Годен до: " + insurance.getValidity() +
                " Цена: " + insurance.getPrice() + " Номер: " + insurance.getNumber() + ".");
    }

    public void changeTiresToSeasonal(String tires){
        if (tires.equals("летняя") || tires.equals("Летняя")){
            tires = "зимняя";
        } else if (tires.equals("зимняя") || tires.equals("Зимняя")){
            tires = "летняя";
        }
    }

    public Car(String brand, String model, String machineType, double engineVolumeInLiters, String bodyColor, int productionYear,
               String assemblyCountry, double maximumMovementSpeed , String transmission, String bodyType, int numberOfSeats, String tires,
               String registrationNumber, insurance insurance){

        this.maximumMovementSpeed = maximumMovementSpeed;
        this.brand = brand;

        this.model = model;

        if (machineType == "Электрокар" || machineType == "электрокар" || machineType == "Бензиновый" || machineType == "бензиновый"){
            this.machineType = machineType;
        } else {
            this.machineType = "Бензиновый";
        }

        if (engineVolumeInLiters >= 0){
            this.engineVolumeInLiters = engineVolumeInLiters;
        } else {
            this.engineVolumeInLiters = Math.abs(engineVolumeInLiters);
        }

        this.bodyColor = bodyColor;

        this.productionYear = productionYear;

        this.assemblyCountry = assemblyCountry;

        if(transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "Трансмиссия";
        } else {
            this.transmission = transmission;
        }

        if(bodyType.isEmpty() || bodyType.isBlank()){
            this.bodyType = "Тип кузова";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats =Math.abs(numberOfSeats);
        }

        if(tires.isEmpty() || tires.isBlank()){
            this.tires = "летняя";
        } else {
            this.tires = tires;
        }

        this.registrationNumber = registrationNumber;
        this.insurance = insurance;
    }




    @Override
    public void refill() {
        System.out.println("Заправляем бензином или дизелем на заправке");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public double getEngineVolumeInLiters() {
        return engineVolumeInLiters;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setEngineVolumeInLiters(double engineVolumeInLiters) {
        this.engineVolumeInLiters = engineVolumeInLiters;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

