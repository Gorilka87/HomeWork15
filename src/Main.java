public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Mentor");
        System.out.println();
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===\n");
        Product product1 = new Product(1, "Ноутбук", 50000, "Электроника");
        Product product2 = new Product(2, "Мышь", 1500, "Электроника");
        Product product3 = new Product(1, "Смартфон", 30000, "Электроника");
        Product product4 = new Product(1, "Планшет", 25000, "Гаджеты");
        Product product5 = new Product(3, "Книга", 800, "Литература");

        System.out.println("Созданные товары:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        System.out.println("\nРезультаты сравнения товаров:");
        System.out.println("product1 == product1: " + product1.equals(product1));
        System.out.println("product1 == product2: " + product1.equals(product2));
        System.out.println("product1 == product3: " + product1.equals(product3));
        System.out.println("product1 == product4: " + product1.equals(product4));
        System.out.println("product1 == null: " + product1.equals(null));

        System.out.println("\nТестирование с null значениями:");
        Product productWithNull = new Product(5, null, 1000, null);
        Product productWithNull2 = new Product(5, "Тест", 1000, null);
        System.out.println("productWithNull: " + productWithNull);
        System.out.println("productWithNull2: " + productWithNull2);
        System.out.println("Сравнение (id=5, category=null == id=5, category=null): " +
                productWithNull.equals(productWithNull2));
        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА ORDER ===\n");
        System.out.println();
        Product[] basket1 = {product1, product2, product5};
        Product[] basket2 = {product1, product2, product5};
        Product[] basket3 = {product1, product3, product5};
        Product[] basket4 = {product1, product2};
        Product[] basket5 = {product1, null, product5};

        Order order1 = new Order("Иван Петров", basket1);
        Order order2 = new Order("Иван Петров", basket2);
        Order order3 = new Order("Иван Петров", basket3);
        Order order4 = new Order("Мария Сидорова", basket1);
        Order order5 = new Order("Иван Петров", basket4);
        Order order6 = new Order("Иван Петров", basket5);
        Order order7 = new Order("Иван Петров", basket5);

        System.out.println("Созданные заказы:");
        System.out.println("order1: " + order1);
        System.out.println("order2: " + order2);
        System.out.println("order3: " + order3);
        System.out.println("order4: " + order4);
        System.out.println("order5: " + order5);
        System.out.println("order6: " + order6);
        System.out.println("order7: " + order7);

        System.out.println("\nРезультаты сравнения заказов:");
        System.out.println("order1 == order1: " + order1.equals(order1));
        System.out.println("order1 == order2: " + order1.equals(order2));
        System.out.println("order1 == order3: " + order1.equals(order3));
        System.out.println("order1 == order4: " + order1.equals(order4));
        System.out.println("order1 == order5: " + order1.equals(order5));
        System.out.println("order1 == null: " + order1.equals(null));
        System.out.println("order6 == order7: " + order6.equals(order7));
        System.out.println("order6 == order1: " + order6.equals(order1));
    }
}