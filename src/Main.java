public class Main {
    public static void main(String[] args) {

        int initialAccountAmount = 230;
        int accountRefill = 10;
        byte minAdditionForBonus = 100;
        int bonusCount = accountRefill / minAdditionForBonus;
        boolean refillIsSufficient = bonusCount >= 1;
        int finalAccountAmount = refillIsSufficient ? initialAccountAmount + accountRefill + bonusCount : initialAccountAmount + accountRefill;
        System.out.println("Остаток на счете: " + finalAccountAmount);
    }
}