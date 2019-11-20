package org.cap.dao;

import org.cap.entities.Login_Details;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class LoginDetailsDaoImpl implements LoginDetailsDao {
	@PersistenceContext
	private EntityManager em;

	public LoginDetailsDaoImpl() {
	}

	/*
	 * @Override public Login_Details createUser(Login_Details user) {
	 * user=em.merge(user);
	 * 
	 * return user; }
	 */

	@Override
	public Login_Details createUser(String acc_no_fk, String user_id, String password, String trans_pass) {
		Login_Details user = new Login_Details();
		user.setAcc_no_fk(acc_no_fk);
		user.setUser_id(user_id);
		user.setPassword(password);
		user.setTrans_pass(trans_pass);
		user = em.merge(user);
		return user;
	}

	/*
	 * @Override public User createUser(String name) { User user=new User();
	 * user.setName(name); user=em.merge(user); return user; }
	 */

	/*
	 * @Override public Login_Details updateUser(Integer id, String name) {
	 * Login_Details user = em.find(User.class, id); user.setName(name); user =
	 * em.merge(user); return user; }
	 */
}
