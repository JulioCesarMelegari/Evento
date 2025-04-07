package com.jcm.evento.entities;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_participante")
public class Participante {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	
	@Getter // Apenas o getter será gerado
	@Setter(AccessLevel.NONE) // Exclui do construtor
	@ManyToMany
	@JoinTable(name="tb_participantes_atividade",
			joinColumns = @JoinColumn(name = "participante_id"),
			inverseJoinColumns = @JoinColumn(name = "atividade_id"))
	private Set<Atividade> atividades = new HashSet<>();
	
	
}
