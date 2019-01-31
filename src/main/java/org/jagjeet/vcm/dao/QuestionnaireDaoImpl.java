package org.jagjeet.vcm.dao;

import javax.persistence.EntityManager;

import org.jagjeet.vcm.model.Questionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Developer
 *
 */
@Repository
public class QuestionnaireDaoImpl implements QuestionnaireDao {

	/**
	 * 
	 */
	@Autowired
	org.hibernate.SessionFactory sessionFactory;

	/**
	 * @return
	 */
	private EntityManager getEntityManager() {
		return sessionFactory.getCurrentSession().getEntityManagerFactory().createEntityManager();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.vcm.dao.QuestionnaireDao#createQuestion(org.jagjeet.vcm.model.
	 * Questionnaire)
	 */
	@Override
	public int createQuestion(Questionnaire questionnaire) {
		return (int) sessionFactory.getCurrentSession().save(questionnaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.dao.QuestionnaireDao#createAnswer(org.jagjeet.vcm.model.
	 * Questionnaire)
	 */
	@Override
	public void createAnswer(Questionnaire questionnaire) {
		sessionFactory.getCurrentSession().update(questionnaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.dao.QuestionnaireDao#getQuestion(int)
	 */
	@Override
	public Questionnaire getQuestion(int questionnaireId) {
		return sessionFactory.getCurrentSession().get(Questionnaire.class, questionnaireId);
	}

//	@Override
//	public int createAnswer(Questionnaire questionnaire) {
//		return (int) sessionFactory.getCurrentSession().save(questionnaire);
//	}

}
