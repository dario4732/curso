package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
@RequestMapping("/")
public class HomeControllerr {
	
	@Value("${valor.sucursal.qen}")
	private String sever;
	
	@GetMapping("/")
	public String home() {
		
		return "home/home";
	}
	
	@GetMapping("/nosotros")
	@ResponseBody
	public String nosotros() {
		
		return "desde la vista nosotros";
	}

	@GetMapping("/parametros/{id}/{slub}")
	@ResponseBody
	public String parametros(@PathVariable("id") Long id,@PathVariable("slub") String slub  ) {
		
		return " desde parametros ==>"+ id +"--  rubro  "+ slub;
	}
	
	@GetMapping("/query-string")
	@ResponseBody
	public String query_string(@RequestParam("id") Long id, @RequestParam("slub") String slub ) {
		
		return " desde parametros ==>"+ id +"--  rubro  "+ slub+ " frl ser   vidor "+ this.sever;
	}
	
	
}
