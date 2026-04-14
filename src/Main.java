public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Mentor");
        System.out.println();
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===\n");
        // Тестирование сравнения объектов класса Product
        Product product1 = new Product(1, "Ноутбук", 50000, "Электроника");
        Product product2 = new Product(2, "Мышь", 1500, "Электроника");
        Product product3 = new Product(1, "Смартфон", 30000, "Электроника");
        Product product4 = new Product(1, "Планшет", 25000, "Гаджеты");
        Product product5 = new Product(3, "Книга", 800, "Литература");
        Product product6 = new Product(4, "Телефон", 20000, null);
        Product product7 = new Product(4, "Смарт-часы", 15000, null);

        System.out.println("Созданные товары:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);
        System.out.println(product7);

        System.out.println("\nРезультаты сравнения товаров (метод equals):");
        System.out.println("1. product1 == product1: " + product1.equals(product1) + " (должно быть true)");
        System.out.println("2. product1 == product2: " + product1.equals(product2) + " (должно быть false)");
        System.out.println("3. product1 == product3: " + product1.equals(product3) +
                " (должно быть true - одинаковые id=1 и category='Электроника')");
        System.out.println("4. product1 == product4: " + product1.equals(product4) +
                " (должно быть false - разные category)");
        System.out.println("5. product1 == null: " + product1.equals(null) + " (должно быть false)");
        System.out.println("6. product6 == product7: " + product6.equals(product7) +
                " (должно быть true - одинаковые id=4 и category=null)");
        System.out.println("7. product2 == product5: " + product2.equals(product5) + " (должно быть false)");

        System.out.println("\nДополнительные тесты Product:");
        Product product8 = new Product(5, "Наушники", 3000, "Аудио");
        Product product9 = new Product(5, "Микрофон", 5000, "Аудио");
        System.out.println("product8 == product9: " + product8.equals(product9) +
                " (должно быть true - одинаковые id=5 и category='Аудио')");

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА ORDER ===\n");
        System.out.println();
        Product[] basket1 = {product1, product2, product5};
        Product[] basket2 = {product1, product2, product5};
        Product[] basket3 = {product1, product3, product5};
        Product[] basket4 = {product1, product2};
        Product[] basket5 = {product1, null, product5};
        Product[] basket6 = {product1, null, product5};

        Order order1 = new Order("Иван Петров", basket1);
        Order order2 = new Order("Иван Петров", basket2);
        Order order3 = new Order("Иван Петров", basket3);
        Order order4 = new Order("Мария Сидорова", basket1);
        Order order5 = new Order("Иван Петров", basket4);
        Order order6 = new Order("Иван Петров", basket5);
        Order order7 = new Order("Иван Петров", basket6);
        Order order8 = new Order("Петр Иванов", null);

        System.out.println("Созданные заказы:");
        System.out.println("order1: " + order1);
        System.out.println("order2: " + order2);
        System.out.println("order3: " + order3);
        System.out.println("order4: " + order4);
        System.out.println("order5: " + order5);
        System.out.println("order6: " + order6);
        System.out.println("order7: " + order7);
        System.out.println("order8: " + order8);

        System.out.println("\nРезультаты сравнения заказов (метод equals):");
        System.out.println("1. order1 == order1: " + order1.equals(order1) + " (должно быть true)");
        System.out.println("2. order1 == order2: " + order1.equals(order2) + " (должно быть true - одинаковые поля)");
        System.out.println("3. order1 == order3: " + order1.equals(order3) +
                " (должно быть true - product2 и product3 равны по id и category)");
        System.out.println("4. order1 == order4: " + order1.equals(order4) +
                " (должно быть false - разные покупатели)");
        System.out.println("5. order1 == order5: " + order1.equals(order5) +
                " (должно быть false - разная длина массивов)");
        System.out.println("6. order1 == null: " + order1.equals(null) + " (должно быть false)");
        System.out.println("7. order6 == order7: " + order6.equals(order7) +
                " (должно быть true - оба содержат null элементы)");
        System.out.println("8. order6 == order1: " + order6.equals(order1) +
                " (должно быть false - один с null, другой без)");
        System.out.println("9. order8 == order8: " + order8.equals(order8) + " (должно быть true)");
        System.out.println("10. order8 == order1: " + order8.equals(order1) + " (должно быть false)");

        System.out.println("\n=== ПРОВЕРКА hashCode ===");
        System.out.println("hashCode order1: " + order1.hashCode());
        System.out.println("hashCode order2: " + order2.hashCode());
        System.out.println("hashCode order6: " + order6.hashCode());
        System.out.println("hashCode order7: " + order7.hashCode());
        System.out.println("hashCode order1 и order2 одинаковы: " + (order1.hashCode() == order2.hashCode()));
        System.out.println("hashCode order6 и order7 одинаковы: " + (order6.hashCode() == order7.hashCode()));
        System.out.println();
        System.out.println();
        System.out.println("Finished! Thanks!");
    }
}
