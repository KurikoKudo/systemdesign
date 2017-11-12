package beans;

public class Question {

	// 属性
	private int pageID = 0;
	private String body = null;
	private int answer = 0;

	//コンストラクタ
	public Question(int pageID, String body, int answer){

		this.pageID = pageID;
		this.body = body;
		this.answer = answer;
	}

	//beansに必須の初期値なしコンストラクタ
	public Question(){}

	//set
	public void setPageID(int pageID){ this.pageID = pageID; }
	public void setBody(String body){ this.body = body; }
	public void setAnswer(int answer){ this.answer = answer; }

	//get
	public int getPageID(){ return this.pageID; }
	public String getBody(){ return this.body; }
	public int getAnswer(){ return this.answer; }

}
