public class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2){
        return number1 == number2;
    }
    public boolean areNumbersFatal(int first, int second){
        return (first*5+3) == second;
    }
    public boolean canPrincessMarry(int day){
        if (day>15){
            return true;
        }else return false;
    }
}
