public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange) {
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getRegistrationFee() {
        return 0;
    }

    int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    int getMaxRangeKm(){
        return maxRange;
    }

    int getWhPrKm(){
        return batteryCapacity / maxRange;
    }

}
