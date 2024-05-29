class XFuelEngine extends Engine {


    protected String serialNumber;
    @Override
    public String getFuelType() {
        return "XFuelEngine";
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
