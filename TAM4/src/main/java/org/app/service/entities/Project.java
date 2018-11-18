package org.app.service.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProject;
	private String projectName;
	private LocalDate startDate;
	private LocalDate endDate;
	private String description;
	@ManyToOne
	private Team team;
}
