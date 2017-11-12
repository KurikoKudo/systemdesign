package beans;

public class History {
	// 属性
	private String userID = null;
	private int pageID = 0;
	private int count = 0;

	//コンストラクタ
	public History(String userID, int pageID, int count){

		this.userID = userID;
		this.pageID = pageID;
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//beansに必須の初期値なしコンストラクタ
	public History(){}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getPageID() {
		return pageID;
	}
	public void setPageID(int pageID) {
		this.pageID = pageID;
	}

}
