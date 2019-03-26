package br.usjt.previsaotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaotempo.model.Previsao;
import br.usjt.previsaotempo.repository.PrevisaoRepository;
import br.usjt.previsaotempo.sevice.PrevisaoService;

@Controller
public class PrevisaoController {	
	//Injeção de dependência 
	//@Autowired
	//private PrevisaoRepository previsaoRepo;
	
	@Autowired
	private PrevisaoService previsaoService;
		
		@GetMapping ("/previsao")
		public ModelAndView listarPrevisao () {
			
			ModelAndView mv = new ModelAndView ("lista_previsao");
			
			List <Previsao> previsaotemp = previsaoService.ListarTodos();
			
			mv.addObject("previsaotemp", previsaotemp);
			
			return mv;		

		}

}
