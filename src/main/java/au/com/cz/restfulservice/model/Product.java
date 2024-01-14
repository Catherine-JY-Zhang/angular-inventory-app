package au.com.cz.restfulservice.model;

import jakarta.persistence.*;

import java.io.Serializable;

import java.math.BigDecimal;

@Entity
@Table(name= "product")
public class Product implements Serializable {

    Product(String id, String description, BigDecimal price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSeq")
    @SequenceGenerator(name="productSeq", initialValue = 1000, sequenceName="product_seq", allocationSize=1)
    private final String id;

    @Column
    private String description;
    private BigDecimal price;

    public void setDescription(String description) { this.description = description; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Product(final String id,
                   final String description,
                   final BigDecimal price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
