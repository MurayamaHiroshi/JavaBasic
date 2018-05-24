/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		  ArrayList<Player> array = new ArrayList<Player>();
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


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
	        Iterator<Player> i = array.iterator();
	        while(i.hasNext()){
	            Player player = i.next();
	            if(player.getTeam().equals("レアル・マドリード")||player.getTeam().equals("バルセロナ")){
	                i.remove();
	            }
	        }

		// ★ 削除後のArrayListの中身を全件出力してくださ

	        for(Player player : array) {
           	 System.out.println(player);
           }
	}
}
