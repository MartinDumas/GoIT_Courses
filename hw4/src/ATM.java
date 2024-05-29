public class ATM {
    // Масив, що містить номінали банкнот
    private static final int[] banknoteValues = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int countBanknotes(int sum) {
        int count = 0; // Лічильник банкнот
        int index = 0; // Індекс поточного номіналу в масиві banknoteValues

        while (sum > 0 && index < banknoteValues.length) {
            // Якщо номінал банкноти менший або рівний залишку sum, виділяємо банкноти
            if (banknoteValues[index] <= sum) {
                int numBanknotes = sum / banknoteValues[index]; // Кількість банкнот поточного номіналу
                count += numBanknotes; // Додаємо кількість банкнот до загальної кількості
                sum -= numBanknotes * banknoteValues[index]; // Віднімаємо суму банкнот від загальної суми
            }
            index++; // Переходимо до наступного номіналу банкноти
        }

        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        int sum = 578;
        System.out.println(atm.countBanknotes(sum)); // Виведе 6
    }
}
