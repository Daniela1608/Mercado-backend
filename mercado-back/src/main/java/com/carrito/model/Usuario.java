package com.carrito.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_codigo")
	private Integer codigo;
	
	@Column(name = "usu_nombre")
	private String nombre;
	
	@Column(name = "usu_clave")
	private String clave;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "est_codigo")
	private Estado estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "per_codigo")
	private Persona persona;
	
	@Column(name = "usu_ip")
	private String ip;
	
	@Column(name = "usu_usuario")
	private String usuario;
	
	@Column(name = "usu_cliente")
	private String cliente;
	
}
