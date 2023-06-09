package model;

public class Order {
    int id;
    int idClient;
    int idProduct;
    int quantity;
    int price;

    public Order(int idClient, int idProduct, int quantity,int price) {
        this.idClient = idClient;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.price=price;
    }

    public Order(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
