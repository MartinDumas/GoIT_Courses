package sunrise;

public class GameMenu {


    public  void act(MenuItem item){
        System.out.println(item.getAction());

    }


    static abstract class MenuItem{
        abstract String  getAction();
    }
    static class Start extends MenuItem{

        @Override
        String getAction() {
            return "start";
        }
    }
    static class Options extends MenuItem{

        @Override
        String getAction() {
            return "options";
        }
    }
     static class Exit extends MenuItem{


        @Override
        String getAction() {
            return "exit";
        }
    }
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}

