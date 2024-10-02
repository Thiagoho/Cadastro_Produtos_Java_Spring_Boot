package com.thiago.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.produtos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
