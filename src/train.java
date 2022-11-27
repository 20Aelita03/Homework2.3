public class train extends transport{
    int tripPrice;
    double travelTime;
    String departureStationName;
    String endingStation;
    int numberOfWagons;

    public void getMassageTrain(){
        System.out.println("Поезд " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() + " год выпуска в " + getAssemblyCountry() +
                ", цвет корпуса " + bodyColor + " скорость передвижения — " + maximumMovementSpeed + " км/ч, отходит от "
                + departureStationName + " и следует до станции " + endingStation + ". Цена поездки — " + tripPrice +
                " рублей, в поезде " + numberOfWagons + " вагонов. Время в пути - " + travelTime + " часов.");
    }



    public train(String brand, String model, int productionYear, String assemblyCountry, String bodyColor,
                 double maximumMovementSpeed,int tripPrice, double travelTime, String departureStationName,
                 String endingStation, int numberOfWagons){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
        this.bodyColor = bodyColor;
        this.maximumMovementSpeed = maximumMovementSpeed;
        if (tripPrice >= 0){
            this.tripPrice = tripPrice;
        }else {
            this.tripPrice = Math.abs(tripPrice);
        }
        if (travelTime >= 0){
            this.travelTime = travelTime;
        }else {
            this.travelTime = Math.abs(travelTime);
        }
        if(departureStationName.isEmpty() || departureStationName.isBlank()){
            this.departureStationName = "Станция";
        } else {
            this.departureStationName = departureStationName;
        }
        if(endingStation.isEmpty() || endingStation.isBlank()){
            this.endingStation = "Конечная";
        } else {
            this.endingStation = endingStation;
        }
        if (numberOfWagons >= 0){
            this.numberOfWagons = numberOfWagons;
        }else {
            this.numberOfWagons = Math.abs(numberOfWagons);
        }
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice >= 0){
            this.tripPrice = tripPrice;
        }else {
            this.tripPrice = Math.abs(tripPrice);
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime >= 0){
            this.travelTime = travelTime;
        }else {
            this.travelTime = Math.abs(travelTime);
        }

    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if(departureStationName.isEmpty() || departureStationName.isBlank()){
            this.departureStationName = "Станция";
        } else {
            this.departureStationName = departureStationName;
        }

    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if(endingStation.isEmpty() || endingStation.isBlank()){
            this.endingStation = "Конечная";
        } else {
            this.endingStation = endingStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons >= 0){
            this.numberOfWagons = numberOfWagons;
        }else {
            this.numberOfWagons = Math.abs(numberOfWagons);
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправляем дизелем");
    }
}
