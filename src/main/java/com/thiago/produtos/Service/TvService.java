package com.thiago.produtos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.produtos.model.Tv;
import com.thiago.produtos.repository.TvRepository;
// No terminal ocorreu o erro!!!!
@Service
public class TvService {
	
	@Autowired
	private TvRepository tvRepository;
	
	public List<Tv> listarTodas() {
		return tvRepository.findAll();
	}
	public Tv salvarTv(Tv tv) {
		return tvRepository.save(tv);
		
	}
	public void deletarTv(Long id) {
		tvRepository.deleteById(id);
	}
	public Tv buscarTv(Long id) {
		return tvRepository.findById(id).orElse(null);
	}
	public Tv findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
