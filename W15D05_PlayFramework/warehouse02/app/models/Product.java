package models;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by adis.cehajic on 28/08/15.
 */
public class Product {

    private static List<Product> products;

    static {
        products = new ArrayList<Product>();
        products.add(new Product("1111", "Paperclips 1", "Paperclips description 1."));
        products.add(new Product("2222", "Paperclips 2", "Paperclips description 2."));
        products.add(new Product("3333", "Paperclips 3", "Paperclips description 3."));
        products.add(new Product("4444", "Paperclips 4", "Paperclips description 4."));
        products.add(new Product("5555", "Paperclips 5", "Paperclips description 5."));
    }

    public String ean;
    public String name;
    public String description;

    public Product() {

    }

    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    public static List<Product> findAll() {
        return new ArrayList<Product>(products);
    }

    public static Product findByEan(String ean) {
        for(Product candidate : products) {
            if (candidate.ean.equals(ean)) {
                return candidate;
            }
        }
        return null;
    }

    public static List<Product> findByName(String term) {
        final List<Product> results = new ArrayList<Product>();
        for (Product candidate : products) {
            if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
                results.add(candidate);
            }
        }
        return results;
    }

    public static boolean remove (Product product) {
        return products.remove(product);
    }

    public void save() {
        products.remove(findByEan(this.ean));
        products.add(this);
    }

    public String toString() {
        return String.format("%s - %s - %s", ean, name, description);
    }
}
