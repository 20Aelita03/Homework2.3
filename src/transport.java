public abstract class transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String assemblyCountry;
    String bodyColor;
    double maximumMovementSpeed;

    public abstract void refill();

    public void setBrand(String brand) {
        if(brand.isEmpty() || brand.isBlank()){
            this.brand = "Бренд";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if(model.isEmpty() || model.isBlank()){
            this.model = "Модель";
        } else {
            this.model = model;
        }
    }

    public void setProductionYear(int productionYear) {
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear =Math.abs(productionYear);
        }
    }

    public void setAssemblyCountry(String assemblyCountry) {
        if(assemblyCountry.isEmpty() || assemblyCountry.isBlank()){
            this.assemblyCountry = "Россия";
        } else {
            this.assemblyCountry = assemblyCountry;
        }
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

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if(bodyColor.isEmpty() || bodyColor.isBlank() || bodyColor == null){
            this.bodyColor = "Цвет кузова";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        if (maximumMovementSpeed >= 0){
            this.maximumMovementSpeed = maximumMovementSpeed;
        } else {
            this.maximumMovementSpeed = Math.abs(maximumMovementSpeed);
        }
    }
}
