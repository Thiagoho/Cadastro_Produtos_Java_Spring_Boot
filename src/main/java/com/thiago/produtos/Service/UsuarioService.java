package com.thiago.produtos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.produtos.model.Usuario;
import com.thiago.produtos.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listTodos() {
		return usuarioRepository.findAll();
	}
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	public void deletarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	public Usuario buscarPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
}
