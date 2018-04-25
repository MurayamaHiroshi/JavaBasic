package practice10;

public class User {

	int userId;
	String userNm;
	String mail;
	String password;

	void IDRegistration(){
		System.out.println("ユーザーIDは"+this.userId+"です。");
	};
	void NMRegistration(){
		System.out.println("ユーザーネームは"+this.userNm+"です。");
	};
	void mailRegistration(){
		System.out.println(this.mail+"になります");
	};
	void passwordRegistration(){
		System.out.println("パスワードは"+this.password+"になります");
	};


}
