package beans;

public class User {

	// 属性
	private String userID = null;
	private String userName = null;
	private String userPass = null;
	private int userRole = 0;

	//コンストラクタ
	public User(String userID, String userName, String userPass, int userRole){

		this.userID = userID;
		this.userName = userName;
		this.userPass = userPass;
		this.userRole = userRole;

	}

	//beansに必須の初期値なしコンストラクタ
	public User(){}

	//set
	public void setUserID(String userID){ this.userID = userID; }
	public void setUserName(String userName){ this.userName = userName; }
	public void setUserPass(String userPass){ this.userPass = userPass; }
	public void setUserRole(int userRole){ this.userRole = userRole; }

	//get
	public String getUserID(){ return this.userID; }
	public String getUserName(){ return this.userName; }
	public String getUserPass(){ return this.userPass; }
	public int getUserRole(){ return this.userRole;}

}
