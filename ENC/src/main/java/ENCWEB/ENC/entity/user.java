package ENCWEB.ENC.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class user implements Serializable {
	@Override
	public String toString() {
		return "user [matricule=" + matricule + ", pwd=" + pwd + ", nom=" + nom + ", prenom=" + prenom + ", Role="
				+ Role + "]";
	}
	public user() {
		super();
	}
	public user(Long matricule, String pwd, String nom, String prenom, role role) {
		super();
		this.matricule = matricule;
		this.pwd = pwd;
		this.nom = nom;
		this.prenom = prenom;
		Role = role;
	}
	public Long getMatricule() {
		return matricule;
	}
	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public role getRole() {
		return Role;
	}
	public void setRole(role role) {
		Role = role;
	}
	@Id
	private Long matricule;
	private String pwd;
	private String nom;
	private String prenom;
	@Enumerated (EnumType.STRING)
	private role Role;
}
