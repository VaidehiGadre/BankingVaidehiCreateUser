package org.cap.service;

import org.cap.entities.Login_Details;

public interface LoginDetailsService {

	Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass);
	
}
