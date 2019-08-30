package br.com.caelum.ichat.model;

public class Message {
	private String text;
	private Integer id;
	
	public Message() {}
	
	public Message(String text, Integer id) {
		this.text = text;
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public Integer getId() {
		return id;
	}

}
