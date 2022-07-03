package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SigninController {
	
	/** ユーザー登録画面を表示 */
	@GetMapping("/signin")
	public String getSignin() {
		
		//ユーザー登録画面に遷移
		return "user/signin";
	}
	
}
