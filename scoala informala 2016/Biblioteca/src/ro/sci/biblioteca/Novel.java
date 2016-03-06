package ro.sci.biblioteca;

public class Novel extends Book {

	public String type;
	
	
	
	public Novel (String type){
		
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
}
