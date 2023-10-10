package com.fintech.Ada.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Slf4j
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Nome não pode ser vazio")
    private String name;

    @Column(columnDefinition = "DATE")
    @NotNull(message = "Data não pode ser vazia")
    private LocalDate date;

    @OneToMany(fetch = FetchType.LAZY)
    @NotNull(message = "Documentos não podem ser vazios")
    private List<DataDocumentation> documents;

    @NotNull(message = "Tipo do evento não pode ser vazio")
    private EventType eventType;
}
