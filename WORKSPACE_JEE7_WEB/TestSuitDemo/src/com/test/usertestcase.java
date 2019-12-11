package com.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.DAO.UserDAO;
import com.pojo.User;

public class usertestcase {

	@Test
	public void testSave() {
		UserDAO dao=new UserDAO();
		User u=new User(1, "rahul","pimplagaon", "9888999");
		u=dao.save(u);
		assertNotNull(u);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
