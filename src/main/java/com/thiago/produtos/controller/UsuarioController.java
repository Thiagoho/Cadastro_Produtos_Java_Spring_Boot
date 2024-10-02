package com.thiago.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thiago.produtos.Service.UsuarioService;
import com.thiago.produtos.model.Usuario;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/cadastro")
	public String exibirFormulario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario-form";
	}
	@PostMapping("/salvar")
	public String salvarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "usuario-form";
		}
				
		usuarioService.salvarUsuario(usuario);
		return "redirect:/tv/listar";
	}
	@GetMapping("/listar")
	public String listarUsuario(Model model) {
		model.addAttribute("usuarios", usuarioService.listTodos());
		return "usuario-list";
	}
}
