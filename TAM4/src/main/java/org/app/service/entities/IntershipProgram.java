package org.app.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.app.enums.StatusInternshipProgram;

@Entity
@Table(name = "InternshipProgram")
public class IntershipProgram {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idInternship;
	private String intershipName;
	private String description;
	@OneToMany
	private List<Intern> interns;
	@OneToOne
	private Departament departament;
	private StatusInternshipProgram status;

	public Integer getIdInternship() {
		return idInternship;
	}

	public void setIdInternship(Integer idInternship) {
		this.idInternship = idInternship;
	}

	public String getIntershipName() {
		return intershipName;
	}

	public void setIntershipName(String intershipName) {
		this.intershipName = intershipName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Intern> getInterns() {
		return interns;
	}

	public void setInterns(List<Intern> interns) {
		this.interns = interns;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public StatusInternshipProgram getStatus() {
		return status;
	}

	public void setStatus(StatusInternshipProgram status) {
		this.status = status;
	}

	public IntershipProgram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntershipProgram(Integer idInternship, String intershipName, String description, List<Intern> interns,
			Departament departament, StatusInternshipProgram status) {
		super();
		this.idInternship = idInternship;
		this.intershipName = intershipName;
		this.description = description;
		this.interns = interns;
		this.departament = departament;
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInternship == null) ? 0 : idInternship.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntershipProgram other = (IntershipProgram) obj;
		if (idInternship == null) {
			if (other.idInternship != null)
				return false;
		} else if (!idInternship.equals(other.idInternship))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IntershipProgram [idInternship=" + idInternship + ", intershipName=" + intershipName + ", description="
				+ description + ", interns=" + interns + ", departament=" + departament + ", status=" + status + "]";
	}

}
