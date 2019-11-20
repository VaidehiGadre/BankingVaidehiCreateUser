package org.cap.controller;

import org.cap.entities.Login_Details;
import org.cap.service.LoginDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
	@Autowired
	private LoginDetailsService service;

	public LoginDetailsService getService() {
		return service;
	}

	public void setService(LoginDetailsService service) {
		this.service = service;
	}

	// private int i = 0;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", new HashMap<>());
	}

	/*
	 * @RequestMapping("/hello") public ModelAndView sayHello() { i++; ModelAndView
	 * mv = new ModelAndView("hellopage", "message", "Hello request count=" + i);
	 * return mv; }
	 * 
	 * @RequestMapping(value = "/userdetails",method = RequestMethod.GET) public
	 * ModelAndView userDetails(@RequestParam("id")int id) { User user =
	 * service.findUserById(id); if (user == null) { ModelAndView mv=new
	 * ModelAndView("usernotfound","id",id); return mv; } Map<String, Object>
	 * modelMap = new HashMap<>(); modelMap.put("id", id); modelMap.put("name",
	 * user.getName()); ModelAndView mv = new ModelAndView("userdetails", modelMap);
	 * return mv; }
	 */

	@RequestMapping("/getdetails")
	public ModelAndView detailsForm() {
		return new ModelAndView("createuser", new HashMap<>());
	}

	/*
	 * @RequestMapping("/createuser") public ModelAndView createUserForm(){
	 * ModelAndView mv=new ModelAndView("createuser"); return mv; }
	 * 
	 * @RequestMapping("/deleteuser") public ModelAndView deleteUserForm(){
	 * ModelAndView mv=new ModelAndView("delete"); return mv; }
	 * 
	 * @RequestMapping("/update") public ModelAndView updateUserForm(){ ModelAndView
	 * mv=new ModelAndView("updateuser"); return mv; }
	 */

	@RequestMapping("/createprocess")
	public ModelAndView createProcess(@RequestParam String acc_no_fk, @RequestParam String user_id,
			@RequestParam String password, @RequestParam String trans_pass) {
		Login_Details reg = service.createUser(acc_no_fk, user_id, password, trans_pass);
		Map<String, Object> map = new HashMap<>();
		map.put("acc_no_fk", reg.getAcc_no_fk());
		map.put("user_id", reg.getUser_id());
		map.put("password", reg.getPassword());
		map.put("trans_pass", reg.getTrans_pass());

		ModelAndView mv = new ModelAndView("usercreated", map);
		return mv;
	}

	/*
	 * @RequestMapping("/createprocess") public ModelAndView
	 * createProcess(@RequestParam String name){ User user=service.createUser(name);
	 * Map<String,Object>map=new HashMap<>(); map.put("id",user.getId());
	 * map.put("name",user.getName()); ModelAndView mv=new
	 * ModelAndView("usercreated",map); return mv; }
	 */

	/*
	 * @RequestMapping("/updateprocess") public ModelAndView
	 * createProcess(@RequestParam Integer id,@RequestParam String name){ User
	 * user=service.updateUser(id,name); Map<String,Object>map=new HashMap<>();
	 * map.put("id",user.getId()); map.put("name",user.getName()); ModelAndView
	 * mv=new ModelAndView("userupdated",map); return mv; }
	 * 
	 * @RequestMapping("/deleteprocess") public ModelAndView
	 * deleteProcess(@RequestParam Integer id){ service.deleteUser(id); ModelAndView
	 * mv=new ModelAndView("deleted"); return mv; }
	 */

	// deleteprocess
}
