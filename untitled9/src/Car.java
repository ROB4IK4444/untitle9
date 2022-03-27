public abstract class Car {

    Klaxon klaxon;
    Commotor commotor;
    Tradenda tradenda;
    Trailer trailer;
    Passengers passengers;

    public Car(Klaxon klaxon, Commotor commotor, Tradenda tradenda, Trailer trailer, Passengers passengers) {
        this.klaxon = klaxon;
        this.commotor = commotor;
        this.tradenda = tradenda;
        this.trailer = trailer;
        this.passengers = passengers;
    }
}