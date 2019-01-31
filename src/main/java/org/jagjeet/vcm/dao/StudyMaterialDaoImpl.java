package org.jagjeet.vcm.dao;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jagjeet.vcm.model.StudyMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Developer
 *
 */
@Repository
public class StudyMaterialDaoImpl implements StudyMaterialDao {

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
	 * org.jagjeet.vcm.dao.StudyMaterialDao#addStudyMaterial(org.jagjeet.vcm.model.
	 * StudyMaterial)
	 */
	@Override
	public void addStudyMaterial(StudyMaterial studayMaterial) {
		sessionFactory.getCurrentSession().save(studayMaterial);

	}

//	@Override
//	public StudyMaterial getStudyMaterial(String ppt, String videoLessons) {
//		EntityManager entityManager = getEntityManager();
//		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//		CriteriaQuery<StudyMaterial> criteria = builder.createQuery(StudyMaterial.class);
//		Root<StudyMaterial> root = criteria.from(StudyMaterial.class);
//		criteria.select(root);
//		criteria.where(builder.equal(root.get("ppt"), ppt), builder.equal(root.get("videoLessons"), videoLessons));
//
//		StudyMaterial studyMaterial = entityManager.createQuery(criteria).getSingleResult();
//		return studyMaterial;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.dao.StudyMaterialDao#getStudyMaterial(int)
	 */
	@Override
	public StudyMaterial getStudyMaterial(int userId) {
		EntityManager entityManager = getEntityManager();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<StudyMaterial> criteria = builder.createQuery(StudyMaterial.class);
		Root<StudyMaterial> root = criteria.from(StudyMaterial.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("user"), userId));

		StudyMaterial studyMaterial = entityManager.createQuery(criteria).getSingleResult();
		return studyMaterial;

	}

}
