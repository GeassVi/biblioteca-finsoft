/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecafinsoft.prestiti.entity;

import com.bibliotecafinsoft.libri.entity.Libri;
import com.bibliotecafinsoft.clienti.entity.Clienti;
import lombok.Data;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "prestiti")
@NamedQueries({
    @NamedQuery(name = "Prestiti.findAll", query = "SELECT p FROM Prestiti p")})
public class Prestiti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prestito")
    private Integer id_prestito;
    @Basic(optional = false)
    @Column(name = "data_inizio")
    private String data_inizio;
    @Basic(optional = false)
    @Column(name = "data_fine")
    private String data_fine;
    @Basic(optional = false)
    @Column(name = "data_consegna")
    private String data_consegna;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Clienti id_cliente;
    @JoinColumn(name = "id_libro", referencedColumnName = "id_libro")
    @ManyToOne(optional = false)
    private Libri id_libro;
}