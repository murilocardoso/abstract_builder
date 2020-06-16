package mcc.com.simpleregistrationproductsystem.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mcc.com.simpleregistrationproductsystem.ProdutoIndustria;
import mcc.com.simpleregistrationproductsystem.ProdutoOperadorLogistico;

@RestController
public class Controller {
	
	@GetMapping(path = "test")
	public ResponseEntity<String> get() {
				
		var produtoCore = ProdutoIndustria.builder()
								      .id("1")
									  .nome("Murilo")									 
									  .build();
		
		var produtoOL = ProdutoOperadorLogistico.builder()
			      								 .id("1")
			      								 .nome("Murilo")	
			      								 .depositante("joaozinho")
			      								 .build();
		
		
		
		return ResponseEntity.accepted().body("Murilo Carlos Cardoso");
	}
	
}
