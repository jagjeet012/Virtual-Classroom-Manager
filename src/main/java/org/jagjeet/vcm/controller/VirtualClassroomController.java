package org.jagjeet.vcm.controller;

import java.util.Map;

import javax.validation.Valid;

import org.jagjeet.vcm.model.Questionnaire;
import org.jagjeet.vcm.model.StudyMaterial;
import org.jagjeet.vcm.model.User;
import org.jagjeet.vcm.service.QuestionnaireService;
import org.jagjeet.vcm.service.StudyMaterialService;
import org.jagjeet.vcm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Developer
 *
 */
@Controller
public class VirtualClassroomController {

	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * 
	 */
	@Autowired
	private QuestionnaireService questionnaireService;

	/**
	 * 
	 */
	@Autowired
	private StudyMaterialService studyMaterialService;

	/**
	 * 
	 */
	@Autowired
	private StudyMaterial studyMaterial;

	/**
	 * 
	 */
	@Autowired
	private Questionnaire questionnaire;

	/**
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm(@ModelAttribute("user") User user) {
		return "login";
	}

	/**
	 * @param user
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLoginForm(@ModelAttribute("user") @Valid User user, BindingResult result, Map model) {

		if (result.hasErrors() || !userService.isUserAuthentic(user.getUserName(), user.getPassword())) {
			model.put("errorMessage", "Please enter correct information !!");
			return "login";
		}

		user = userService.getUser(user.getUserName(), user.getPassword());
		if (user.getRole() == 0) {
			return "student";
		}
		model.put("userId", user.getUserId());
		return "faculty";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterForm(@ModelAttribute("user") User user) {
		return "registration";
	}

	/**
	 * @param user
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String validateRegistrationForm(@ModelAttribute("user") @Valid User user, BindingResult result, Map model) {
		if (result.hasErrors()) {
			model.put("errorMessage", "Please enter correct information !!");
			return "registration";
		}
		int userId = userService.addUser(user);
		model.put("userId", userId);
		return "login";
	}

	/**
	 * @param userId
	 * @param question
	 * @return
	 */
	@RequestMapping(value = "/createQuestion", method = RequestMethod.POST)
	public String createQuestion(@RequestParam(value = "userId", required = true) Integer userId,
			@RequestParam(value = "question", required = true) String question) {

		User user = userService.getUser(userId);

		questionnaire.setUser(user);
		questionnaire.setQuestion(question);
		int questionnaireId = questionnaireService.createQuestion(questionnaire);

		return "student";
	}

//	@RequestMapping(value = "/createAnswer", method = RequestMethod.POST)
//	public String createAnswer(@RequestParam(value = "userId", required = true) Integer userId,
//			@RequestParam(value = "answer", required = true) String answer) {
//
//		User user = userService.getUser(userId);
//
//		questionnaire.setUser(user);
//		questionnaire.setAnswer(answer);
//		int questionnaireId = questionnaireService.createAnswer(questionnaire);
//
//		return "faculty";
//	}

	/**
	 * @param userId
	 * @param questionnaireId
	 * @param answer
	 * @return
	 */
	@RequestMapping(value = "/createAnswer", method = RequestMethod.POST)
	public String createAnswer(@RequestParam(value = "userId", required = true) Integer userId,
			@RequestParam(value = "questionnaireId", required = true) Integer questionnaireId,
			@RequestParam(value = "answer", required = true) String answer) {

		User user = userService.getUser(userId);
		Questionnaire questionnaire = questionnaireService.getQuestion(questionnaireId);

		questionnaire.setUser(user);
		questionnaire.setAnswer(answer);
		questionnaireService.createAnswer(questionnaire);

		return "faculty";

	}

	@RequestMapping(value = "/addStudyMaterial", method = RequestMethod.POST)
	public String addStudyMaterial(@RequestParam(value = "userId", required = true) Integer userId,
			@RequestParam(value = "ppt", required = true) String ppt,
			@RequestParam(value = "videoLessons", required = true) String videoLessons) {

		User user = userService.getUser(userId);

		studyMaterial.setUser(user);
		studyMaterial.setPpt(ppt);
		studyMaterial.setVideoLessons(videoLessons);
		studyMaterialService.addStudyMaterial(studyMaterial);

		return "faculty";

	}

	/**
	 * @param userId
	 * @return
	 */
	public String getStudyMaterial(@RequestParam(value = "userId", required = true) Integer userId) {

		User user = userService.getUser(userId);

		studyMaterial = studyMaterialService.getStudyMaterial(userId);
		return null;

	}

}
