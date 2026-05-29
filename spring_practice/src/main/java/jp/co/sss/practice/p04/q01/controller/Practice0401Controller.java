package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {
	@RequestMapping(path = "/bmi/input")
	public String bmiInput() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result")
	public String bmiResult(BmiForm bmiForm, Model model) {
		bmiForm.setBmi(bmiForm.getWeight() / ((bmiForm.getHeight() / 100) * (bmiForm.getHeight() / 100)));
		model.addAttribute("Form", bmiForm);
		return "practice04/01/bmi_result";
	}
}
