package org.perscholas.glab.securityglab.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    public Role(String name) {
        this.name = name;
    }
}
