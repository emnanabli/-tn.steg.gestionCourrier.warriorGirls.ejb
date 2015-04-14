package tn.steg.gestionCourrier.warriorGirls.ejb.entity;

import java.io.Serializable;
import javax.persistence.*;
import tn.steg.gestionCourrier.warriorGirls.ejb.entity.Utilisateur;

/**
 * Entity implementation class for Entity: Personnel
 *
 */
@Entity
public class Personnel extends Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	public Personnel() {
		super();
	}

}
