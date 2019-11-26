package App.LCB.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import App.LCB.model.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
	
	
	
}
