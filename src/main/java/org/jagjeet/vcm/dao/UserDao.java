package org.jagjeet.vcm.dao;

import org.jagjeet.vcm.model.User;

/**
 * @author Developer
 *
 */
public interface UserDao {

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public User isUserAuthentic(String userName, String password);

	/**
	 * @param user
	 * @return
	 */
	public int addUser(User user);

	/**
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUser(String userName, String password);

}
