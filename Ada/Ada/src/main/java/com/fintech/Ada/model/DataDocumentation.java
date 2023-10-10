package com.fintech.Ada.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class DataDocumentation {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Versão não pode ser vazia.")
    private Long version;

    @NotNull(message = "Tipo não pode ser vazio.")
    private FinancialDataValues type;

    @NotNull(message = "Nome não pode ser vazio.")
    private String name;

    @NotNull(message = "Data não pode ser vazia.")
    private LocalDate date;

    @NotNull(message = "Data de expiração não pode ser vazia. ")
    @FutureOrPresent(message = "Data de expiração deve ser maior que o dia atual.")
    private LocalDate expirationDate;

    @NotNull(message = "Descrição não pode ser vazia. ")
    private String description;
}
