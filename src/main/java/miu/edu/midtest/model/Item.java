package miu.edu.midtest.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private float price;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories;

    @OneToMany
    private List<Comment> comments;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
