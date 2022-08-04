package org.zerock.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
//@WebServlet("/")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HomeController() {
       
    }
    
    @GetMapping({"/"})
    public List<String> main() {
		
    	
    	return Arrays.asList("안녕하세요", "/");
    }
    
    
    @GetMapping({"/login"})
    public String login() {
		
    	
    	return "login";
    }
    
    @GetMapping({"/sign"})
    public String sign() {
		
    	
    	return "sign";
    }
    
    
    
   

}
