package com.MAC.Martial.Arts.WebApplication.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MAC.Martial.Arts.WebApplication.Model.Contact;
import com.MAC.Martial.Arts.WebApplication.Model.Login;




@Controller
public class MAWController {
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("/loginpage")
	public String loginroot() {
		return "login";
	}
	
	@RequestMapping("/uvalidLogin")
	public String uvalidLogin(Login login, Model model) {
		Session session = sf.openSession();
		Login dbLogin = session.get(Login.class, login.getPassword());
		String page = "gopal";
		String msg = null;
		if (dbLogin != null) {
			if (login.getUsername().equals(dbLogin.getUsername())) {
				page = "home";
			} else {
				msg = "Invalid Username";
			}
		} else {
			msg = "Invalid Password";
		}
		model.addAttribute("msg", msg);
		return page;
	}
	@RequestMapping("uvalidlogin")
	public String uvalidlogin(Login login) {
		// if (login.username=="gopal" && login.password=="1111") {}
		if (login.username.equals("gopal") && login.password.equals("1111")) {
			return "home";
		} else {
			return "login";
		}
	}

	@RequestMapping("/loginDB")
	public String loginDB(Login login, Model model) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Login dblogin = s.get(Login.class, login.getPassword());
		String page = "login";
		String msg = null;
		if (dblogin != null) {
			if (login.getUsername().equals(dblogin.getUsername())) {
				msg = "Already Registered Password";
			}
		} else {
			page = "login";
			s.save(login);
			t.commit();
		}
		model.addAttribute("msg", msg);
		return page;
	}
	@RequestMapping("/homePage")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/aboutPage")
	public String aboutPage() {
		return "about";
	}
	@RequestMapping("/contactPage")
	public String contactPage() {
		return "contact";
	}

	@RequestMapping("/contactPageDB")
	public String contactPageDB(Contact contact, Model model) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Contact dbContact = s.get(Contact.class, contact.getEmail());
		String page = "contact";
		String msg = null;
		page = "contact";
		s.save(contact);
		t.commit();
		return page;
	}


	@RequestMapping("/backToLogin")
	public String backToLogin() {
		return "login";
	}

	@RequestMapping("/createaccountPage")
	public String createaccountPage() {
		return "createaccount";
	}
	@RequestMapping("/loginDB")
	public String createaccountDB(Login login, Model model) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Login dblogin = s.get(Login.class, login.getPassword());
		String page = "login";
		String msg = null;
		if (dblogin != null) {
			if (login.getUsername().equals(dblogin.getUsername())) {
				msg = "Already Registered Password";
			}
		} else {
			page = "login";
			s.save(login);
			t.commit();
		}
		model.addAttribute("msg", msg);
		return page;
	}

}
