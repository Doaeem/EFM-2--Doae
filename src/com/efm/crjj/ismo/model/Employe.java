package com.efm.crjj.ismo.model;

@Entity
@Table(name = "T_Employe")
public class Employe {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "departement")
    private String departement;
    
    @Column(name = "salaire")
    private double salaire;
	public Employe() {

	}

	public Employe(String nom, String prenom, String departement, double salaire) {
		super();
		this.nom = nom;
		this.prenom=prenom;
		this.departement = departement;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
