package nirh_spaceport;

class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();
    private CommandPost commandPost = new CommandPost();

    public void launch(){
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }



    public GasStation getGasStation() {
        return gasStation;
    }

    public void setGasStation(GasStation gasStation) {
        this.gasStation = gasStation;
    }

    public ServiceTower getServiceTower() {
        return serviceTower;
    }

    public void setServiceTower(ServiceTower serviceTower) {
        this.serviceTower = serviceTower;
    }


}
