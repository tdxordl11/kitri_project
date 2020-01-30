package board.spring.mybatis;

public class BoardVO {
	
	int seq;
	String title;
	String contents;
	String writer;
	int password;
	String time;
	int viewcount;
	//기본 생성자
	public BoardVO() {}
	
	// 생성자 추가
	public BoardVO(int seq, String title, String contents, String writer, int password, String time, int viewcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.password = password;
		this.time = time;
		this.viewcount = viewcount;
	}
	
	// tostring
	@Override
	public String toString() {
		return seq + title  + contents   + writer
				 + password +  time +  viewcount;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
	
	
}
