public class Transmission implements Tradenda{
    @Override
    public String ManTransmission() {
        return "12-ти ступенчитая коробка передач!";
    }

    @Override
    public String BusTransmission() {
        return "8-ми ступенчитая коробка передач!";
    }

    @Override
    public String MopedTransmission() {
        return "4-рех ступенчитая коробка передач!";
    }

    @Override
    public String TractorTransmission() {
        return "Трактор оснащён двухступенчатым редуктором с прямозубыми скользящими шестернями. КПП имеет 9 скоростей вперёд и две назад, при дополнительном включении понижающего редуктора количество передач удваивается до 18 вперёд и 4 назад!";
    }
}
