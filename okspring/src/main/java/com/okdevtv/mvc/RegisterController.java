package com.okdevtv.mvc;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import okjsp.User;
import okjsp.UserDAO;

@Controller
public class RegisterController {
	
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		return "register";
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String registerFinished(Locale locale, @ModelAttribute("user") User user, Model model) {
//		user.setId(request.getParameter("id"));
//		user.setPassword(request.getParameter("password"));
//		user.setConfirmPassword(request.getParameter("confirmPassword"));
		// check password and confirmPassword
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			model.addAttribute("msg", "password not matched!");
			model.addAttribute("user", user);
//			request.getRequestDispatcher("register.jsp").forward(request, response);
//			return "redirect:register.do";
			return "register";		// 이렇게 했을 때 msg 를 jsp 페이지로 넘겨준다.
		}
		// check id duplication
		// save()
		UserDAO.save(user);
		// to finish page 
//		response.sendRedirect("registerFinished.jsp");
		return "redirect:registerFinished.do";
	}
	
	@RequestMapping(value="/registerFinished.do")
	public String registerFinished(Model model) {
		return "registerFinished";
	}
}
