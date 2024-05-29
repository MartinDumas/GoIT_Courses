public class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove){
        return (int) (startAmount-toRemove);
    }
    public byte calculateMoneySum(int sum1, int sum2){
        return  (byte) (sum2+sum1);
    }
    public short halfOfMoney(double startMoney){
        return (short) (startMoney/2);
    }
    public String makeFullName(String firstName, String lastName){
        String res = firstName.toLowerCase() + " " + lastName.toUpperCase();
        return res;
    }
    public boolean isNameLucky(String name){
        return name.contains("A") || name.contains("O") || name.contains("a") || name.contains("o");
    }
    public String getNameCode(String name){
        if (name.length() == 1){
            return Character.toUpperCase(name.charAt(0)) + "";
        } return Character.toUpperCase(name.charAt(0)) + "" + Character.toUpperCase(name.charAt(name.length()-1));
    }
    public boolean isMoneyName(String name){
        char first = name.charAt(0);
        char second = name.charAt(name.length()-1);
        return Character.isDigit(first) && Character.isDigit(second);
    }
    public boolean isInvisibleName(String name){
        return name.length() !=0 && name.strip().isEmpty();
    }
    public String makeNamePositive(String name){
        return (name.toLowerCase()).replace("no", "yes");
    }
    public String makeNameClean(String name){
        return "CLEAN" + name.strip() + "CLEAN";
    }
    public String makeHalfOfName(String name){
        return name.substring(0,name.length()/2);
    }
}
