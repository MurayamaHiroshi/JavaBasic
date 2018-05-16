package practice14.common;

public class JavaCourse implements Course{

	public String getCourseName() {
	return  "【Eラーニング】Java";
	}

	String[]course= {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};

	public String[]getCourseUnit() {
	return  course;
	}
}
//* コース名称
//* 		「【Eラーニング】Java」
//* 単元
//* 		式と演算
//* 		制御構文
//* 		メソッド
//* 		配列
//* 		オブジェクト指向
//* 		継承
//* 		高度な継承
//*/
