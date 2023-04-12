package com.bibliotecafinsoft.libri.entity;

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
@Table(name = "libri")
@NamedQueries({
    @NamedQuery(name = "Libri.findAll", query = "SELECT l FROM Libri l")})
public class Libri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro")
    private Integer id_libro;
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "titolo")
    private String titolo;
    @Basic(optional = false)
    @Column(name = "autore")
    private String autore;
    @Basic(optional = false)
    @Column(name = "anno")
    private String anno;
    @Basic(optional = false)
    @Column(name = "genere")
    private String genere;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id_libro")
    private List<Prestiti> prestitiList;
}
