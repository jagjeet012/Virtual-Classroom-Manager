package org.jagjeet.vcm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

/**
 * @author Developer
 *
 */
@Entity
@Component
public class StudyMaterial {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studyMaterialId;
	private String ppt;
	private String videoLessons;
	@OneToOne
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getStudyMaterialId() {
		return studyMaterialId;
	}

	public void setStudyMaterialId(int studyMaterialId) {
		this.studyMaterialId = studyMaterialId;
	}

	public String getPpt() {
		return ppt;
	}

	public void setPpt(String ppt) {
		this.ppt = ppt;
	}

	public String getVideoLessons() {
		return videoLessons;
	}

	public void setVideoLessons(String videoLessons) {
		this.videoLessons = videoLessons;
	}

}
