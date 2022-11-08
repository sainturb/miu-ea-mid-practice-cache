package miu.edu.midtest.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String city;
    private String street;
    private String zip;
    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
