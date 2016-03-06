package ro.sci.biblioteca;

public class Album extends Book {

	public String paperQuality;
	
	private Album (String paperQuality){
		
		this.paperQuality = paperQuality;
		}
	
	public String getPaperQuality(){
		return paperQuality;
	}
}
