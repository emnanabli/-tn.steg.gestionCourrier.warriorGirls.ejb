package tn.steg.gestionCourrier.warriorGirls.ejb.entity;

import java.io.Serializable;
import javax.persistence.*;
import tn.steg.gestionCourrier.warriorGirls.ejb.entity.Utilisateur;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
public class Admin extends Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

}
