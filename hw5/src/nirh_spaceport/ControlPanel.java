package nirh_spaceport;

 class ControlPanel {
     private Altimeter altimeter = new Altimeter();
     private AirGauge airGauge = new AirGauge();
     public void control(){
         System.out.println(altimeter);
         System.out.println(airGauge);
     }

}
