package jp.co.sss.practice.p03.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0301Controller {

	@RequestMapping(path = "/input")
	public String input() {
		return "practice03/01/input_form";
	}

	@RequestMapping(path = "/send/get_method")
	public String get(String color) {
		System.out.println("##GETメソッドで受け取りました");
		System.out.println("##パラメータの値:" + color);
		return "practice03/01/get_result";
	}

	@RequestMapping(path = "/send/post_method")
	public String post(String color) {
		System.out.println("==POSTメソッドで受け取りました");
		System.out.println("==パラメータの値:" + color);
		return "practice03/01/post_result";
	}

}
