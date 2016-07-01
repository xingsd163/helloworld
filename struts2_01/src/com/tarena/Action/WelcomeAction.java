package com.tarena.Action;

public class WelcomeAction {
	
	private String name;
	
	public String execute(){
		System.out.println("WelcomeAction's execute() ....");
		System.out.println("name" + name);
		
		if("monster".equalsIgnoreCase(name)){
			return "fail";
		}
		return "success";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
