package com.tratamentoTexto.textService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tratamentoTexto.textService.services.InvertedWordService;

@RestController
@RequestMapping(path="/home")
public class TestController {
	//
	
	private final InvertedWordService invertedWordService;
	
	@Autowired
	public TestController(InvertedWordService invertedWordService) {
		this.invertedWordService=invertedWordService;
		
	}
	
	@PostMapping
	public void intertedWord(@RequestBody String word) {
		invertedWordService.invert(word);
	}
}
