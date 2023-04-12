package com.bibliotecafinsoft.clienti.entity;

import com.bibliotecafinsoft.prestiti.entity.Prestiti;
import lombok.Data;
import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "clienti")
@NamedQueries({
    @NamedQuery(name = "Clienti.findAll", query = "SELECT c FROM Clienti c")})
public class Clienti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer id_cliente;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cognome")
    private String cognome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "data_nascita")
    private String data_nascita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id_cliente")
    private List<Prestiti> prestitiList;

}
