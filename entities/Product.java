package entities;

public class Product {
    private String name;
    private Double price;

    /**
     * Método que cria uma etiqueta com os dados de um produto comum
     */
    public String priceTag(){
        return name + " $ " + String.format("%.2f", price);
    }

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
