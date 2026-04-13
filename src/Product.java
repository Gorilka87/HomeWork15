import java.util.Objects;

public class Product {
    // Свойство id - тип int
    private int id;
    // Свойство name - тип String
    private String name;
    // Свойство price - тип int
    private int price;
    // Свойство category - тип String
    private String category;


    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    // Переопределен метод toString
    @Override
    public String toString() {
        return "Product{id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' + '}';
    }
    // Переопределен метод equals
    // Сравниваются 2 поля: id и category
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Product other = (Product) obj;

        return this.id == other.id &&
                Objects.equals(this.category, other.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }
}
