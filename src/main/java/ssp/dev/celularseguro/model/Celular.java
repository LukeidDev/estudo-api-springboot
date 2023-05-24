package ssp.dev.celularseguro.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_aparelhos", sequenceName = "seq_aparelhos", allocationSize = 1, initialValue = 1)
public class Celular implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aparelhos")
    private Long id;

    private String modelo;
    private String imei;
    private String nome_contato;
    private String numero_contato;

    public Celular() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public String getNumero_contato() {
        return this.numero_contato;
    }

    public void setNumero_contato(String numero_contato) {
        this.numero_contato = numero_contato;
    }

}
