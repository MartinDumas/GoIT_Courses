public class ProfShop {
    public boolean isPriceOk(int price){
       boolean result = (price != 1000) ? true:false;
       return result;
//        if (price != 1000){
//            return true;
//        } else return false;
    }
    public float calculateRegularDiscountPrice(float price){
        return price*0.9f;
    }
    public boolean isDiscount50(int price){
        boolean disc = ((price*4) == 1000)? true : false;
        return disc;
    }
    public boolean isPriceHappy(int price, int year, int day){
        boolean hap = (price == (year*day))? true : false;
        return hap;
    }
}
