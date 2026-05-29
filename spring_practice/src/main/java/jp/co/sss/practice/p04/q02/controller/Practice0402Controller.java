package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {
	@RequestMapping(path = "/numguess/start", method = RequestMethod.GET)
	public String start(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNumber", hitNumber);
		System.out.println("hitNumber=" + hitNumber);
		return "practice04/02/numguess_start";
	}

	@RequestMapping(path = "/numguess/input", method = RequestMethod.GET)
	public String input() {
		return "practice04/02/numguess_input";
	}

	@RequestMapping(path = "/numguess/judge", method = RequestMethod.GET)
	public String judge(HttpSession session, Integer inputNum) {
		if (session.getAttribute("hitNumber") == inputNum) {
			return "redirect:/numguess/hit";
		} else {
			return "practice04/02/numguess_judge";
		}
	}

	@RequestMapping(path = "/numguess/hit", method = RequestMethod.GET)
	public String hit(Model model, HttpSession session) {
		session.setAttribute("messege", "当たりです！正解は" + session.getAttribute("hitNumber") + "でした。");
		session.removeAttribute("hitNumber");
		return "practice04/02/numguess_end";
	}
}
