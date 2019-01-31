package org.jagjeet.vcm.dao;

import org.jagjeet.vcm.model.Questionnaire;

/**
 * @author Developer
 *
 */
public interface QuestionnaireDao {

	/**
	 * @param questionnaire
	 * @return
	 */
	public int createQuestion(Questionnaire questionnaire);

	/**
	 * @param questionnaire
	 */
	public void createAnswer(Questionnaire questionnaire);

	/**
	 * @param questionnaireId
	 * @return
	 */
	public Questionnaire getQuestion(int questionnaireId);

//	public int createAnswer(Questionnaire questionnaire);

}
