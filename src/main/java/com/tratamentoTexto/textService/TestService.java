package com.tratamentoTexto.textService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	TestRepository testRepository;
	
	public ReverseString reverseString(ReverseString word) {
	
		String word1 = word.toString();
		String rev = "";
		for(int i= word1.length()-1;i>=0;i--) {
			rev = rev + word1.charAt(i);
		} //este for loop tive que ir ver como se fazia, porque não estava a conseguir 
		
		ReverseString wordReverse = new ReverseString(rev);
		
		
		
		return testRepository.save(wordReverse);	
	}
}
