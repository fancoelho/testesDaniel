package com.tratamentoTexto.textService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "reverse_string")
public class ReverseString {
	@Id
	@SequenceGenerator(name = "word_sequence", sequenceName = "word_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "word_sequence")
	@Column
	private Long id;
	@Column
	String word;

	public ReverseString() {

	}
	
	
	@Override
	public String toString() {
		return "]" + word + "[";
	}


	public ReverseString(String word) {
		this.word = word;
	}

	public ReverseString(String word, long id) {

		this.word = word;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
