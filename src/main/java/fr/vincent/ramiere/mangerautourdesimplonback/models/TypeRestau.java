package fr.vincent.ramiere.mangerautourdesimplonback.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TypeRestau {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type")
    private int id;

    @Column(nullable = false)
    private String libelle;

    @ManyToMany(mappedBy="typerestaus")
    @JsonBackReference("restaurants")
    private List<Restaurant> restaurants;

    public TypeRestau(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
}
