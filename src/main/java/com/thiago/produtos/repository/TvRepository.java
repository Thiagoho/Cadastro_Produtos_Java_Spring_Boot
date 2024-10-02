package com.thiago.produtos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.produtos.model.Tv;

public interface TvRepository extends JpaRepository<Tv, Long> {
}
