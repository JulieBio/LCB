package App.LCB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import App.LCB.model.SousSousGroupeIngredient;
import App.LCB.repository.SousSousGroupeIngredientRepository;

@Controller
@RequestMapping("/soussousgroupe")
public class SousSousGroupeIngredientController {

	@Autowired
	private SousSousGroupeIngredientRepository sousSousGroupeIngredientRepository;
	
	@RequestMapping("/all")
	@ResponseBody
	private List<SousSousGroupeIngredient> SearchAll() {
		return (List<SousSousGroupeIngredient>) sousSousGroupeIngredientRepository.findAll();
	}
}
