public class Main {
    public static void main(String[] args) {

        int initialAccountAmount = 230;
        int accountRefill = 1007;
        byte bonusUnit = 100;
        short minAccountRefillFor_Bonus = 1000;
        int bonusCount = accountRefill / bonusUnit;
        boolean ifBonusAdded = accountRefill >= minAccountRefillFor_Bonus;
        int finalAccountAmount = ifBonusAdded ? initialAccountAmount + accountRefill + bonusCount : initialAccountAmount + accountRefill;
        System.out.println("Остаток на счете: " + finalAccountAmount);
    }
}