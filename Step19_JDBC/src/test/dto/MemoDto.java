package test.dto;

public class MemoDto {
	//회원 한명의 정보를 담을 필드 선언
	private int num;
	private String content;
	private String regdate;
	//default 생성자 만들기
	public MemoDto(int num, String content, String regdate) {
		super();
		this.num = num;
		this.content = content;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
