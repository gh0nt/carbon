package com.carbon.carbon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "areasasignadas")
public class AreasAsignadasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_areasasignadas;
    public Long id_usuario;
    public Long id_area;
    public Long id_landowner;
    public String status;
    public Double areaevaluada;
    public Double areaasignada;
    public Double porcentajebosque;
}
