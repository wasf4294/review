class Car{
    String color;
    int door;
    void drive() {
        System.out.println("drive");
    }
    void stop() {
        System.out.println("stop");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water");
    }
}
class Ambulance extends Car {
    void siren(){
        System.out.println("siren~");
    }
}
class Test{
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine Fire = new FireEngine();
        Ambulance Amb = new Ambulance();

/*        Fire = (FireEngine)car;
        car.water();
        */
/*        Amb = (Ambulance)car;
        Amb.siren();
        car.siren();  불가능.
        다형성을 사용하여 자손의 인스턴스를 조상이 사용하나.
        * 조상의 멤버만 사용가능하다.

        Car car1 = new Car();
        car1 = Amb;
        Amb.siren();
        Amb.stop();
        car1.siren();*/

        Ambulance car2 = null;
        Ambulance Amb1 = new Ambulance();
        Car car1 = new Car();
        car1 = Amb1;    //car1의 인스턴스는 null 이었으나 이제 Amb1의 인스턴스 Ambulance를 갖는다.
        car2 = (Ambulance) car1;
        car2.siren();
    }
}
