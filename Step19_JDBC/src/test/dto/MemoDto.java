package test.dto;

public class MemoDto {
	private int num;
	private String content;
	private String regdate;
	public MemoDto() {}  //new MemoDto()를 하기 위해서 필요 ()안에 넣어서 사용 할수도 있지만
						 //dto 에서 여러 변수를 변하게 분리하기 위해 사용해주는 것이 좋다.
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
