package com.java.students;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // identity - pobiera id, nastęonir przyjmuje wartość
    //
    private Long id;
    private String imie;
    private String nazwisko;
    private String indeks;

// one (this class object ) to many (some class Objects below)
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Ocena> oceny;

}
