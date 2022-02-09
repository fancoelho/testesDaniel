package com.tratamentoTexto.textService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TestController {
	
	private static final Logger logger = Logger.getLogger(TestController.class);
	@Autowired
	TestService testService;
	

	@RequestMapping(path="/reverseString", method=RequestMethod.POST)
	public ReverseString reverse(@RequestBody ReverseString word) {
		
		logger.debug("user added word to invert");
		return testService.reverseString(word);
		
	}

}
