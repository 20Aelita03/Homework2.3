public  class Bus extends transport {

    private String busType;
    public void getMassageBus(){
        System.out.println("Автобус " + getBrand() + ". Модель " + getModel()+ busType + ". Год выпуска - " + getProductionYear() +
                ". Страна производства - " + getAssemblyCountry() + ". Цвет кузова - " + getBodyColor() + ". Максимальная " +
                "скорость - " + getMaximumMovementSpeed());
    }



    public Bus(String brand, String model,String busType, int productionYear, String assemblyCountry, String bodyColor, double maximumMovementSpeed){
        this.brand = brand;
        this.model = model;
        if (busType == "Электробус" || busType == "электробус" || busType == "Бензиновый" || busType == "бензиновый"){
            this.busType = busType;
        } else {
            this.busType = "Бензиновый";
        }
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed =maximumMovementSpeed;
    }

    @Override
    public void refill() {
            System.out.println("Заправляем бензином или дизелем на заправке");
    }
}
