/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aprendiz
 */
@Entity
@Table(name = "mochila")
@NamedQueries({
    @NamedQuery(name = "Mochila.findAll", query = "SELECT m FROM Mochila m"),
    @NamedQuery(name = "Mochila.findById", query = "SELECT m FROM Mochila m WHERE m.id = :id"),
    @NamedQuery(name = "Mochila.findByPokemonId", query = "SELECT m FROM Mochila m WHERE m.pokemonId = :pokemonId"),
    @NamedQuery(name = "Mochila.findByNombre", query = "SELECT m FROM Mochila m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Mochila.findByImagen", query = "SELECT m FROM Mochila m WHERE m.imagen = :imagen"),
    @NamedQuery(name = "Mochila.findByTipo", query = "SELECT m FROM Mochila m WHERE m.tipo = :tipo"),
    @NamedQuery(name = "Mochila.findByExperienciaBase", query = "SELECT m FROM Mochila m WHERE m.experienciaBase = :experienciaBase"),
    @NamedQuery(name = "Mochila.findByEsFavorito", query = "SELECT m FROM Mochila m WHERE m.esFavorito = :esFavorito")})
public class Mochila implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "pokemon_id")
    private Integer pokemonId;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "experiencia_base")
    private Integer experienciaBase;
    @Column(name = "es_favorito")
    private Boolean esFavorito;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarios usuarioId;

    public Mochila() {
    }

    public Mochila(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Integer pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getExperienciaBase() {
        return experienciaBase;
    }

    public void setExperienciaBase(Integer experienciaBase) {
        this.experienciaBase = experienciaBase;
    }

    public Boolean getEsFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(Boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mochila)) {
            return false;
        }
        Mochila other = (Mochila) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pokemon.model.Mochila[ id=" + id + " ]";
    }
    
}
