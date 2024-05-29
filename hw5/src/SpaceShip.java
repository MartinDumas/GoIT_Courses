class SpaceShip{
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && name.length() <100) {
            this.name = name;
        } return;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        if (serialNumber.startsWith("SN") && serialNumber.length() ==8 ) {
            this.serialNumber = serialNumber;
        }return;

    }
    public void printInfo(){
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
//        ship.setName("Walker");
//        System.out.println(ship.getName()); //Should be Walker
//
//        ship.setName("");
//        System.out.println(ship.getName()); //Should be Walker, empty value ignored
//
//        ship.setName("Voyager ".repeat(100));
//        System.out.println(ship.getName()); //Should be Walker, too long value ignored
//        ship.setSerialNumber("SN506788");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788
//
//        ship.setSerialNumber("EE123456");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();

    }

}