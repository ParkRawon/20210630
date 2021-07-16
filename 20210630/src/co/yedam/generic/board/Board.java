package co.yedam.generic.board;

public class Board {
	private String title; //제목
	private String content; //내용
	
	//생성자
	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
    //메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [제목= " + title + ", 내용= " + content + "]";
	}
	
	
	
	

}