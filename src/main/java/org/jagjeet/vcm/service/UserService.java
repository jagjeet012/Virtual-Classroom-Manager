package org.jagjeet.vcm.service;

import org.jagjeet.vcm.model.User;

/**
 * @author Developer
 *
 */
public interface UserService {

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	boolean isUserAuthentic(String userName, String password);

	/**
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);

	/**
	 * @param user
	 * @return
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	User getUser(String userName, String password);

}
