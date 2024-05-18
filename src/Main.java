public class Main {

    public static void main(String[] args) {
        TransportFactory myTruckFactory = new TruckFactory();
        TransportFactory myShipFactory = new ShipFactory();
        TransportFactory myPlaneFactory = new PlaneFactory();
        Transport myTruck = myTruckFactory.createTransport();
        Transport myShip = myShipFactory.createTransport();
        Transport myPlane = myPlaneFactory.createTransport();
        myTruck.getInfo();
        myShip.getInfo();
        myPlane.getInfo();
    }
}

abstract class Transport{
    String type;
    int transportSpeed;
    public void getInfo(){
        System.out.println(STR."Тип транспорта - \{type}; средняя скорость при транспортировке - \{transportSpeed} км/ч");
    }
}

abstract class TransportFactory{
    public abstract Transport createTransport();
}

class TruckFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class ShipFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class PlaneFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}

class Truck extends Transport{
    public Truck(){
        type = "Грузовой автомобиль";
        transportSpeed = 60;
    }
}

class Ship extends Transport{
    public Ship(){
        type = "Грузовой корабль";
        transportSpeed = 37;
    }
}

class Plane extends Transport{
    public Plane(){
        type = "Грузовой самолёт";
        transportSpeed = 570;
    }
}