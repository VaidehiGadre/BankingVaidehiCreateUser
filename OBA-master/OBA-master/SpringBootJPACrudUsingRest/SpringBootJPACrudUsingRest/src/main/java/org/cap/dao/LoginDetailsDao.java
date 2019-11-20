package org.cap.dao;

import org.cap.entities.Login_Details;

public interface LoginDetailsDao {

	Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass);

	// Login_Details createUser(String username);

	// User updateUser(Integer id, String name);

}
