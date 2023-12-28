//на каждую вторую покупку скидка 2%
//после 18:00 +2%
//int i - номер покупки
//int after18 (0, 1) - после 18 или нет

public class Discount {

    public int discountCalc(int i,int after18){
            int discount = 0;

            // Проверяем, является ли покупка второй
            if (i % 2 == 0) {
                discount += 2; // Скидка 2% на каждую вторую покупку
            }

            // Проверяем, если время покупки после 18:00
            if (after18 == 1) {
                discount += 2; // Дополнительная скидка 2% после 18:00
            }

            return discount;
        }
    }

