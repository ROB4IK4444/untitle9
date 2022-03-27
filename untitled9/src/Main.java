public class Main {


    public static void main(String[] args){

        Sonus sonus = new Sonus();
        CommotorV12 commotorV12 = new CommotorV12();
        Transmission transmission = new Transmission();
        Trailers trailers = new Trailers();
        Seats seats = new Seats();


        Man man = new Man(sonus, commotorV12, transmission, trailers, seats);
        Bus bus = new Bus(sonus, commotorV12, transmission, trailers, seats);
        Moped moped = new Moped(sonus, commotorV12, transmission, trailers, seats);
        Tractor tractor = new Tractor(sonus, commotorV12, transmission, trailers, seats);

        System.out.println(man.klaxon.cornuSonus());
        System.out.println(man.commotor.EnginePotentia());
        System.out.println(man.tradenda.ManTransmission());
        System.out.println(man.trailer.Operimentum());
        System.out.println(man.passengers.ManPassengers());
        System.out.println(bus.klaxon.SonusBus());
        System.out.println(bus.commotor.EngineBus());
        System.out.println(bus.tradenda.BusTransmission());
        System.out.println(bus.trailer.BusTrailer());
        System.out.println(bus.passengers.BusPassengers());
        System.out.println(moped.klaxon.SonusMoped());
        System.out.println(moped.commotor.EngineMoped());
        System.out.println(moped.tradenda.MopedTransmission());
        System.out.println(moped.trailer.MopedTrailer());
        System.out.println(moped.passengers.MopedPassengers());
        System.out.println(tractor.klaxon.SonusTractor());
        System.out.println(tractor.commotor.EngineTractor());
        System.out.println(tractor.tradenda.TractorTransmission());
        System.out.println(tractor.trailer.TractorTrailer());
        System.out.println(tractor.passengers.TractorPassengers());
    }
}

