package com.rosales.carritocompras.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rosales.carritocompras.entity.Enum.DocumentType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String name;

    private String lastName;

    private DocumentType document;

    private String numberDocument;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateBirth;

    private String login;

    private String password;

}
