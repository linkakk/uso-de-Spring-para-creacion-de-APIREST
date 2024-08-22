package models;

public class Product {
    //creacion de los atributos
    private  Long id;
    private  String name;
    private Long price;
    //constructor vacio
    public Product() {
    }
    //constructor con todos los atributos


    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //metodos getter and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
