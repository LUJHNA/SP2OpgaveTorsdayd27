public class GasolineCar extends AFuelCar {

    public GasolineCar(int kmPerLiter) {
        super(kmPerLiter);
    }

    public String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {
        if (kmPerLiter > 20 && kmPerLiter < 50)
            return 330;
        if (kmPerLiter > 15 && kmPerLiter < 20)
            return 1050;
        if (kmPerLiter > 10 && kmPerLiter < 15)
            return 2340;
        if (kmPerLiter > 5 && kmPerLiter < 10)
            return 5500;
        if (kmPerLiter < 5)
            return 10470;

        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Fuel type: " + getFuelType() + "\n Registration fee: " + getRegistrationFee();

    }

}