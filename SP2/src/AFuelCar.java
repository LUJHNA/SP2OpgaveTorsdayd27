public abstract class AFuelCar extends ACar {

    int kmPerLiter;

    public AFuelCar(int kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }


    abstract String getFuelType(); //return Gasoline or Diesel


    public int kmPerLiter() {
        return kmPerLiter;
    }

    @Override
    public String toString() {
        return super.toString() +"Km per liter: " + kmPerLiter;
    }
}