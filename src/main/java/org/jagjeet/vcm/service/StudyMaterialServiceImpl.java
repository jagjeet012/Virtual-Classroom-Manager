package org.jagjeet.vcm.service;

import org.jagjeet.vcm.dao.StudyMaterialDao;
import org.jagjeet.vcm.model.StudyMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class StudyMaterialServiceImpl implements StudyMaterialService {

	/**
	 * 
	 */
	@Autowired
	StudyMaterialDao studyMaterialDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.vcm.service.StudyMaterialService#addStudyMaterial(org.jagjeet.vcm
	 * .model.StudyMaterial)
	 */
	@Override
	@Transactional
	public void addStudyMaterial(StudyMaterial studayMaterial) {
		studyMaterialDao.addStudyMaterial(studayMaterial);

	}

//	@Override
//	@Transactional
//	public StudyMaterial getStudyMaterial(String ppt, String videoLessons) {
//		return studyMaterialDao.getStudyMaterial(ppt, videoLessons);
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.StudyMaterialService#getStudyMaterial(int)
	 */
	@Override
	@Transactional
	public StudyMaterial getStudyMaterial(int userId) {
		return studyMaterialDao.getStudyMaterial(userId);
	}

}
