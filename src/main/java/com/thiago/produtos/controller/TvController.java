package com.thiago.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.Valid;
import com.thiago.produtos.Service.TvService;
import com.thiago.produtos.model.Tv;

@Controller
@RequestMapping("/tv")
public class TvController {
	
	@Autowired
	private TvService tvService;
	
	@GetMapping("/cadastro")
	public String exibirFormulario(Model model) {
		model.addAttribute("tv", new Tv(null, null, null, null, null, null, 0, null, 0, null, null, false, null));
		return "tv-form";
	
	}
	/*Alteraçao no salvar*/
	@PostMapping("/salvar")
	public String salvarTv(@Valid @ModelAttribute("tv") Tv tv, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "tv-form";
		}
		tvService.salvarTv(tv);
		return "redirect:/tv/listar";
	}
	@GetMapping("/listar")
	public String listarTvs(Model model) {
		model.addAttribute("tvs", tvService.listarTodas());
		return "tv-list";
	}
}
