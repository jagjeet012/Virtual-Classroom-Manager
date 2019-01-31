package org.jagjeet.vcm.dao;

import org.jagjeet.vcm.model.StudyMaterial;

/**
 * @author Developer
 *
 */
public interface StudyMaterialDao {

	/**
	 * @param studayMaterial
	 */
	void addStudyMaterial(StudyMaterial studayMaterial);
	
//	public StudyMaterial getStudyMaterial(String ppt, String videoLessons);
	
	/**
	 * @param userId
	 * @return
	 */
	public StudyMaterial getStudyMaterial(int userId);
	
	

}
