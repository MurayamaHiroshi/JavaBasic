/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください

                // Playerのインスタンスを作成
                Player player = new Player();
                // lineをsplitして配列にする
                String[]account =line.split(",", 0);
                // Playerのインスタンスに配列の値をセット
                player.setPosition(account[0]);
                player.setName(account[1]);
                player.setCountry(account[2]);
                player.setTeam(account[3]);
                // arrayにPlayerインスタンスをadd
                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Iterator<Player> i = array.iterator();
        Collections.shuffle(array);
		//       ↑↑ Collections.shuffle(シャフルしたい変数); ＊自分で付け足した＊
        int gkcount = 0;
        int dfcount = 0;
        int mfcount = 0;
        int fwcount = 0;

	        for(Player player:array) {
		        switch(player.getPosition()){
		        case "GK":
		        	if(gkcount<1) {
		        	gkcount++;
		        	System.out.println(player);
		        	}break;

		        	case "DF":
		        	if(dfcount<4) {
		        	dfcount++;
		        	System.out.println(player);
		        	}break;

		        	case "MF":
		        	if(mfcount<4) {
		        	mfcount++;
		        	System.out.println(player);
		        	}break;

		        	case"FW":
		        	if(fwcount<2) {
		        	fwcount++;
		        	System.out.println(player);
		        	}break;
		        }
	        }
	}
}
////★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
//Iterator<Player> i = array.iterator();
//while(i.hasNext()){
//    Player player = i.next();
//    if(player.getTeam().equals("レアル・マドリード")||player.getTeam().equals("バルセロナ")){
//        i.remove();
//    }
//}
//
//// ★ 削除後のArrayListの中身を全件出力してくださ
//
//for(Player player : array) {
//	 System.out.println(player);
//}