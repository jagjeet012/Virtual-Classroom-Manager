package org.jagjeet.vcm.service;

import org.jagjeet.vcm.dao.QuestionnaireDao;
import org.jagjeet.vcm.model.Questionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	/**
	 * 
	 */
	@Autowired
	QuestionnaireDao questionnaireDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.vcm.service.QuestionnaireService#createQuestion(org.jagjeet.vcm.
	 * model.Questionnaire)
	 */
	@Override
	@Transactional
	public int createQuestion(Questionnaire questionnaire) {
		return questionnaireDao.createQuestion(questionnaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.vcm.service.QuestionnaireService#createAnswer(org.jagjeet.vcm.
	 * model.Questionnaire)
	 */
	@Override
	@Transactional
	public void createAnswer(Questionnaire questionnaire) {
		questionnaireDao.createAnswer(questionnaire);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.QuestionnaireService#getQuestion(int)
	 */
	@Override
	@Transactional
	public Questionnaire getQuestion(int questionnaireId) {
		return questionnaireDao.getQuestion(questionnaireId);
	}

//	@Override
//	@Transactional
//	public int createAnswer(Questionnaire questionnaire) {
//		return questionnaireDao.createAnswer(questionnaire);
//	}

}
