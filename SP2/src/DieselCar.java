public class DieselCar extends AFuelCar {

    boolean particleFilter;

    public DieselCar(int kmPerLiter, boolean particleFilter) {
        super(kmPerLiter);
        this.particleFilter = particleFilter;
    }

    public String getFuelType() {
        return "Diesel";
    }


    public int getRegistrationFee() {
        int particleFee = particleFilter ? 1000 : 0;

        if (kmPerLiter > 20 && kmPerLiter < 50)
            return particleFee + 130;
        if (kmPerLiter > 15 && kmPerLiter < 20)
            return particleFee + 1390;
        if (kmPerLiter > 10 && kmPerLiter < 15)
            return particleFee + 1850;
        if (kmPerLiter > 5 && kmPerLiter < 10)
            return particleFee + 2770;
        if (kmPerLiter < 5)
            return particleFee + 15260;

        return particleFee;
    }


    boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString() + "Fuel type: " + getFuelType() + "\n Registration fee: " + getRegistrationFee();

    }

}