package fir_planet.seasons;

class Autumn extends Season{
    @Override
    public String getName() {
        return "autumn";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}
