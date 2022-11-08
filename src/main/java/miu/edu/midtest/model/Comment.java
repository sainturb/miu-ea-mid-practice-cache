package miu.edu.midtest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String comment;

//    @ManyToOne
//    private Item item;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
