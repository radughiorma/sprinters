package com.example.database;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userDao;

	@Transactional
	public String getById(int id) {
		String userId;
		try {
			User user = userDao.findOne((long) id);
			userId = user.getName();
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + userId;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
