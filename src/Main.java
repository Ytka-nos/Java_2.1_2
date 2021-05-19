public class Main {
    public static void main(String[] args) {
        int initialAmountInCopecks = 100_00; // начальна сумма на счете в копейках
        int paymentInCopecks = 100_00; // оплата в копейках
        int oneBonusInCopecks = 100_00; // стоимость 1 бонуса в копейках
        int finalBonus;   // итоговый бонус в рублях
        int finalAmount; // итоговая сумма в рублях
        if (paymentInCopecks > 1000_00) {     //условие для получения бонуса
            finalBonus = paymentInCopecks / oneBonusInCopecks;  // финальный бонус в рублях
            finalAmount = ((initialAmountInCopecks + paymentInCopecks) / 100) + finalBonus; // финальная сумма в рублях
            System.out.println("Итоговый счет: " + finalAmount + " руб.");
            System.out.println("Бонусные рубли: " + finalBonus + "  руб");
        } else {
            finalBonus = 0;
            finalAmount = (initialAmountInCopecks + paymentInCopecks) / 100; // финальная сумма в рублях
            System.out.println("Итоговый счет: " + finalAmount + " руб");
            System.out.println("Бонусные рубли: " + finalBonus + " руб");
        }
    }
}