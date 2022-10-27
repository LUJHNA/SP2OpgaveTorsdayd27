public abstract class ACar implements ICar {

    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public ACar(){

    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "Registration number: " + registrationNumber +
                "\n Make: " + make +
                "\n model: " + model +
                "\n Number of doors: " + numberOfDoors;
    }
}
