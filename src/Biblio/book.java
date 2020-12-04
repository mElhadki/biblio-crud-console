package Biblio;

public class book {
	
	  private int id;
	  private String label;
	  private String name;
	  private String writer;
	  
	  
	public String getLabel() {
		return label;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", label=" + label + ", name=" + name + ", writer=" + writer + "]";
	}

}
