public class VehicleProgram {
    public static void main(String[] args) {
        Truck t1 = new Truck(34, "no", 30,25,20,30);
        t1.display();
        Bus b1 = new Bus(420,"el",25,50,20,25);
        b1.display();
        System.out.println(b1.fuelNeeded(30));
    }
}
class Vehicle{
   private int vehicleModel;
   private String registrationNumber;
   private float vehicleSpeed, fuelCapacity, mileage;
    public Vehicle(int vehicleModel,String registrationNumber,float vehicleSpeed,float fuelCapacity,float mileage){
        this.vehicleModel = vehicleModel;
        this.registrationNumber = registrationNumber;
        this.vehicleSpeed = vehicleSpeed;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }
//    Getter and setter for Vehicle
    int getVehicleModel(){
        return this.vehicleModel;
    }
    void setVehicleModel(int vehicleModel){
        this.vehicleModel = vehicleModel;
    }
    String getRegistrationNumber(){
        return this.registrationNumber;
    }
    void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    float getVehicleSpeed(){
        return this.vehicleSpeed;
    }
    void setVehicleSpeed(float vehicleSpeed){
        this.vehicleSpeed = vehicleSpeed;
    }
    float getFuelCapacity(){
        return this.fuelCapacity;
    }
    void setFuelCapacity(float fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }
    float getMileage(){
        return this.mileage;
    }
    void setMileage(float mileage){
        this.mileage = mileage;
    }
    float fuelNeeded(float distance){
        return distance/mileage;
    }
    float distanceCovered(float time){
        return vehicleSpeed*time;
    }
    void display(){
        System.out.println(vehicleModel);
        System.out.println(registrationNumber);
        System.out.println(vehicleSpeed);
        System.out.println(fuelCapacity);
        System.out.println(mileage);
    }
}
class Truck extends Vehicle{
    private int cargoWeight;
    public Truck(int vehicleModel,String registrationNumber,float vehicleSpeed,float fuelCapacity,float mileage, int cargoWeight) {
       super(vehicleModel,registrationNumber,vehicleSpeed,fuelCapacity,mileage);
        this.cargoWeight = cargoWeight;
    }
    int getCargoWeight(){
        return cargoWeight;
    }
    void setCargoWeight(int cargoWeight){
        this.cargoWeight = cargoWeight;
    }
    @Override
    void display(){
        System.out.println("Vehicle Model is " + getVehicleModel());
        System.out.println("Vehicle registration number is "+ getRegistrationNumber());
        System.out.println("Vehicle speed is " +getVehicleSpeed());
        System.out.println("Vehicle fuel capacity is " +getFuelCapacity());
        System.out.println("Vehicle mileage is " +getMileage());
        System.out.println("Vehicle cargo weight is " +getCargoWeight());
    }
}
class Bus extends Vehicle{
   private int noOfPassengers;
    public Bus(int vehicleModel,String registrationNumber,float vehicleSpeed,float fuelCapacity,float mileage, int noOfPassengers){
        super(vehicleModel,registrationNumber,vehicleSpeed,fuelCapacity,mileage);
        this.noOfPassengers = noOfPassengers;
    }
    int getNoOfPassengers(){
        return noOfPassengers;
    }
    void setNoOfPassengers(int noOfPassengers){
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    void display(){
        System.out.println("Vehicle Model is " +getVehicleModel());
        System.out.println("Vehicle registration no. is " +getRegistrationNumber());
        System.out.println("Vehicle speed is " +getVehicleSpeed());
        System.out.println("Vehicle fuel capacity is " +getFuelCapacity());
        System.out.println("Vehicle mileage is " +getMileage());
        System.out.println("Vehicle no. of passenger is " +getNoOfPassengers());
    }
}
