package com.ciberfarma.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tb_usuarios")
public class Usuario {
	@Id
	private int cod_usua ;
	private String nom_usua ;
	private String ape_usua ;
	@Column(name = "usr_usu")
	private String correo ;
	@Column(name = "cla_usua")
	private String clave ;
	private String fna_usua;
	private int idtipo ;
	private int est_usua;
	
	@ManyToOne
	@JoinColumn(name ="idtipo", insertable = false, updatable = false)
	private Tipo obtTipo;
}
