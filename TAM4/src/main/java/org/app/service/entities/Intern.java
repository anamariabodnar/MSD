package org.app.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Intern")
public class Intern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idIntern;
	private String firstName;
	private String lastName;
	private String address;
	@ManyToOne(fetch = FetchType.LAZY)
	private IntershipProgram internshipProgram;
	@OneToMany
	private List<Task> tasks;
	@ManyToOne(fetch = FetchType.LAZY)
	private Team team;
	@OneToOne
	private Account account;

	public Integer getIdIntern() {
		return idIntern;
	}

	public void setIdIntern(Integer idIntern) {
		this.idIntern = idIntern;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public IntershipProgram getInternshipProgram() {
		return internshipProgram;
	}

	public void setInternshipProgram(IntershipProgram internshipProgram) {
		this.internshipProgram = internshipProgram;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(Integer idIntern, String firstName, String lastName, String address,
			IntershipProgram internshipProgram, List<Task> tasks, Team team, Account account) {
		super();
		this.idIntern = idIntern;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.internshipProgram = internshipProgram;
		this.tasks = tasks;
		this.team = team;
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIntern == null) ? 0 : idIntern.hashCode());
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
		Intern other = (Intern) obj;
		if (idIntern == null) {
			if (other.idIntern != null)
				return false;
		} else if (!idIntern.equals(other.idIntern))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Intern [idIntern=" + idIntern + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", internshipProgram=" + internshipProgram + ", tasks=" + tasks + ", team=" + team
				+ ", account=" + account + "]";
	}

}
