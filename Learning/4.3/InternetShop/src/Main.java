public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();

        vasyaBasket.add("Молоко", 89);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(200);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");
//        add("Колбаса", 76);
//        add("Молоко", 55);
//        add("Масло", 120);
//        print("Содержимое корзины: ");
//        System.out.println(getTotalPrice());
//        clear();
//        print("Содержимое корзины: ");
//        System.out.println(getTotalPrice());
    }
}
