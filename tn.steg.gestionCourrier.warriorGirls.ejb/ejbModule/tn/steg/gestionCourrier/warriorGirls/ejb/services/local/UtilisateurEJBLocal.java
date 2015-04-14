package tn.steg.gestionCourrier.warriorGirls.ejb.services.local;

import javax.ejb.Local;

import tn.steg.gestionCourrier.warriorGirls.ejb.entity.Utilisateur;

@Local
public interface UtilisateurEJBLocal {
	public Utilisateur authentification(String login, String password);
	
	public void add(Utilisateur utilisateur);
}
