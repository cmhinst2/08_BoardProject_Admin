package edu.kh.admin.main.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.kh.admin.main.model.dto.Member;
import edu.kh.admin.main.model.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("admin")
@RequiredArgsConstructor
@Slf4j
@SessionAttributes({"loginMember"})
public class AdminController {
	
	private final AdminService service;
	
	
	/** 관리자 로그인
	 * @param inputMember
	 * @param model
	 * @return
	 */
	@PostMapping("login")
	public Member login(@RequestBody Member inputMember,
						Model model ) {
		
		Member loginMember = service.login(inputMember);
		
		if(loginMember == null) {
			return null;
		}
		
		model.addAttribute(loginMember);
		return loginMember;
	}
	
	
	
	
	
	
	
	
	
}
