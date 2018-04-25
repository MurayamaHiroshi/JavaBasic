package practice10;

public class Car {



	int serialNo;
 	String color;
 	int gasoline	;

 	int run(){
 		this.gasoline--;
		int num = new java.util.Random().nextInt(15);
		num+=1;

		if(0>this.gasoline) {
			return -1;
		}

		return num;

 	};
}
