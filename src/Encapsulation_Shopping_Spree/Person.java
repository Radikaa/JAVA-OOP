package Encapsulation_Shopping_Spree;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();

    }

    public void buyProduct(Product product) {
        if (money >= product.getCost()) {
            products.add(product);
            money -= product.getCost();
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            String errorMessage = String.format("%s can't afford %s", this.name, product.getName());
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be a negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }
}
