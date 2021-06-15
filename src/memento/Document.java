package memento;

public class Document {
	private String title;
	private String content;
	private String author;
	
	
	public Document(String content, String author, String title) {
		this.content = content;
		this.author = author;
		this.title= title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void info(){
        System.out.println("****");
        System.out.println("INFO > Autor: "+author);
        System.out.println("INFO > Titulo: "+title);
        System.out.println("INFO > Contenido: "+content);
        System.out.println("****");
    }
	

}
