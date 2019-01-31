package org.jagjeet.vcm.service;

import org.jagjeet.vcm.dao.UserDao;
import org.jagjeet.vcm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	@Autowired
	UserDao userDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.UserService#isUserAuthentic(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public boolean isUserAuthentic(String userName, String password) {
		if (userDao.isUserAuthentic(userName, password) != null) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.UserService#getUser(int)
	 */
	@Override
	@Transactional
	public User getUser(int userId) {
		return userDao.getUser(userId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.UserService#addUser(org.jagjeet.vcm.model.User)
	 */
	@Override
	@Transactional
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.vcm.service.UserService#getUser(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public User getUser(String userName, String password) {
		return userDao.getUser(userName, password);
	}

}
