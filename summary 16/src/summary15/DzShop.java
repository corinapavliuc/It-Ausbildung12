package summary15;

public class DzShop {
    public static void main(String[] args) {
        boolean isEdekaOpen = false, isReweOPen = false;


        System.out.println("Я могу купить еду");
        System.out.println("Я сижу дома");
    }


    static void canBuy(boolean isEdekaOpen, boolean isReweOPen) {
        boolean isBuy = isEdekaOpen || isReweOPen;
    }
}

        ///true true
        // true false =true
        // false true =true
        // false false=true


// Создайте две переменные isEdekaOpen и isReweOpen,
// значения которых зависят от того,
//
// открыты магазины или нет (значения задайте сами).
// Реализуйте логический метод canBuy,
// возвращающий true / false
// Значение этой переменной должно быть true,
// если хотя бы один магазин открыт,
// иначе false. Отобразите строку
// «Я могу купить еду, это ……» и значение.//