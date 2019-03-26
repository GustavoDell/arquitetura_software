package br.usjt.previsaotempo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import br.usjt.previsaotempo.repository.PrevisaoRepository;
import br.usjt.previsaotempo.model.Previsao;

@Service
public class PrevisaoService {
	
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	public List <Previsao> ListarTodos(){
		return previsaoRepo.findAll();
	}
}
