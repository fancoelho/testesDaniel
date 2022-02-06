package com.tratamentoTexto.textService.services;

import org.springframework.stereotype.Service;

@Service
public class InvertedWordService {

	
	public void invert(String word) {
		
		StringBuilder sb = new StringBuilder(word);
		
		System.out.println(sb.reverse()); 
	}
}
