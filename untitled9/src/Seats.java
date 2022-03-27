public class Seats implements Passengers{
    @Override
    public String ManPassengers() {
        return "До 5 мест в зависимости от конкретной марки!";
    }

    @Override
    public String BusPassengers() {
        return "42 места для седения!";
    }

    @Override
    public String MopedPassengers() {
        return "1 место для пассажира!";
    }

    @Override
    public String TractorPassengers() {
        return "Пассажирские места отсутствуют!";
    }
}
