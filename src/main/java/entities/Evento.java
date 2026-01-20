package entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Eventi")

public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titolo", nullable = false, columnDefinition = "TEXT")
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private LocalDate data_evento;

    @Column(name = "descrizione", nullable = false, columnDefinition = "TEXT")
    private String descrizione;

    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private tipoEvento tipo_evento;

    @Column(name = "numero_max_partecipanti", nullable = false)
    private int numero_max_partecipanti;

    public Evento() {
    }

    public Evento(String titolo, String descrizione, tipoEvento tipo_evento, int numero_max_partecipanti) {
        this.titolo = titolo;
        this.data_evento = LocalDate.of(2026, 1, 20);
        this.descrizione = descrizione;
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public tipoEvento getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(tipoEvento tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public int getNumero_max_partecipanti() {
        return numero_max_partecipanti;
    }

    public void setNumero_max_partecipanti(int numero_max_partecipanti) {
        this.numero_max_partecipanti = numero_max_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento: id" + id + ", titolo " + titolo + ", descrizione " + descrizione;
    }

}

