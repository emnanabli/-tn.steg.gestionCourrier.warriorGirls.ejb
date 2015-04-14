package tn.steg.gestionCourrier.warriorGirls.ejb.services;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.steg.gestionCourrier.warriorGirls.ejb.entity.Utilisateur;
import tn.steg.gestionCourrier.warriorGirls.ejb.services.local.UtilisateurEJBLocal;
import tn.steg.gestionCourrier.warriorGirls.ejb.services.remote.UtilisateurEJBRemote;

/**
 * Session Bean implementation class UtilisateurEJB
 */
@Singleton
@LocalBean
public class UtilisateurEJB implements UtilisateurEJBRemote,
		UtilisateurEJBLocal {
	@PersistenceContext(name = "tn.steg.gestionCourrier.warriorGirls.ejb")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UtilisateurEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Utilisateur authentification(String login, String password) {
		Query query;
		query = entityManager
				.createQuery(
						"SELECT u FROM Utilisateur u WHERE u.login=:login AND u.password=:password",
						Utilisateur.class).setParameter("login", login)
				.setParameter("password", password);
		try {
			return (Utilisateur) query.getSingleResult();
		} catch (Exception e) {
			System.err.println("user not found "+e.getMessage());
			return null;
		}

	}

	@Override
	public void add(Utilisateur utilisateur) {
		entityManager.persist(utilisateur);		
	}

}
