package org.jagjeet.vcm.service;

import org.jagjeet.vcm.model.StudyMaterial;

/**
 * @author Developer
 *
 */
public interface StudyMaterialService {

	/**
	 * @param studayMaterial
	 */
	public void addStudyMaterial(StudyMaterial studayMaterial);

//	public StudyMaterial getStudyMaterial(String ppt, String videoLessons);

	/**
	 * @param userId
	 * @return
	 */
	public StudyMaterial getStudyMaterial(int userId);

}
