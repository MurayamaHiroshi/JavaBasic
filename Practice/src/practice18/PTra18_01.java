/*
 * PTra18_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_01 {
	public static void main(String[] args) {

	    // file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
        ArrayList<String> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                array.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう
        for(String date:array) {
        	System.out.println(date);
        }
	}
}
//mport java.util.ArrayList;
//public class Main{
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add( "山田太郎");
//        list.add( "小林次郎");
//        list.add( "佐藤三郎");
//        for(String name : list){
//            System.out.println(name);
//        }
//    }
//}
//
