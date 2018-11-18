package org.app.service.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.app.enums.StatusTask;

@Entity
@Table(name = "Task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTask;
	private String taskName;
	private String description;
	private LocalDate deadline;
	@ManyToOne
	private Intern intern;
	private StatusTask status;
	@ManyToOne
	private Employee createdBy;
	
	
}
