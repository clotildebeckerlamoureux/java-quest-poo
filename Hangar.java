public class Hangar {
    
    public static void main(String[] args) {
        Car firstCar = new Car("Clio", 15000);
        Boat lastBoat = new Boat("Titanic", 3000);


        System.out.println(firstCar.doStuff());
        System.out.println(lastBoat.doStuff());
    }

}
