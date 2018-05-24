package practice18.entity;

public class Player {

	private String position;
	private String name;
	private String country;
	private String team;

	public String getPosition() {
	return position;
	}
	public void setPosition(String position) {
	this.position=position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String toString() {
	 String a =position+","+name+","+country+","+team;
	return a;

	}

}
//フィールド
//* 		position	：	String
//* 		name		：	String
//* 		country		：	String
//* 		team		：	String
//* メソッド
//* 		各アクセサ
//*
//* 		toString()	：	Objectクラスのオーバーライド
//* 		各フィールドの値を、カンマ区切りの文字列で取得する
