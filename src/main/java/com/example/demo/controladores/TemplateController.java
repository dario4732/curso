package com.example.demo.controladores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
@RequestMapping("/templates")
public class TemplateController {
	
	@GetMapping("")
	public String home(Model model) {
		 String valor ="dario";
		 model.addAttribute("valor", valor);
		
		return "templates/home";
	}
	
	@GetMapping("/atributo")
	public String atributos(Model model) {
		 Integer num1=14;
		 Integer num2=22;
		 Date fecha=new Date();
		 
		 Integer cifra=12345;
		 List<String> paises=new ArrayList();
		 paises.add("arg");
		 paises.add("chi");
		 paises.add("mex");
		 
		 model.addAttribute("xpaises",paises);
		 model.addAttribute("xnum1", num1);
		 model.addAttribute("xnum2",num2);	
		 model.addAttribute("xcifra",cifra);
		 model.addAttribute("xfecha",fecha);
		 
		return "templates/atributo";
	}
	
	@GetMapping("/estatico")
	public String estatico(Model model) {
		
		
		return "templates/estatico";
	}
}
