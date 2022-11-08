package miu.edu.midtest.model;

import lombok.Data;
import miu.edu.midtest.MyCacheable;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@MyCacheable
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @OneToMany
    private List<Message> messages;
}
