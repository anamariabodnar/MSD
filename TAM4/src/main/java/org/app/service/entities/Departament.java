package org.app.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departament")
public class Departament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDepartament;
	private String nameDepartament;
	@OneToMany
	private List<Employee> employees;

	public Integer getIdDepartament() {
		return idDepartament;
	}

	public void setIdDepartament(Integer idDepartament) {
		this.idDepartament = idDepartament;
	}

	public String getNameDepartament() {
		return nameDepartament;
	}

	public void setNameDepartament(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Departament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departament(Integer idDepartament, String nameDepartament, List<Employee> employees) {
		super();
		this.idDepartament = idDepartament;
		this.nameDepartament = nameDepartament;
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDepartament == null) ? 0 : idDepartament.hashCode());
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
		Departament other = (Departament) obj;
		if (idDepartament == null) {
			if (other.idDepartament != null)
				return false;
		} else if (!idDepartament.equals(other.idDepartament))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departament [idDepartament=" + idDepartament + ", nameDepartament=" + nameDepartament + ", employees="
				+ employees + "]";
	}

}
