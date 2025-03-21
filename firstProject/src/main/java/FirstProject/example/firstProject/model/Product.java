package FirstProject.example.firstProject.model;

import jakarta.persistence.*;

@Entity  // Marks this class as a JPA entity (table in the database)
@Table(name = "products") // Specifies the table name
public class Product {
    @Id  //Marks the primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private Long id;
    private  String name;
    private double price;



    // Default constructor
    public Product() {}

    // Constructor with parameters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
