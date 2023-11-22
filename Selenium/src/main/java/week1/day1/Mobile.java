package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float osVersion = 11.2f;
		String mblNname = "OnePlus";
		boolean isAndroid = true;
		int price = 1998;
		char logo = 'B';

		System.out.println(osVersion);
		System.out.println(mblNname);
		System.out.println(isAndroid);
		System.out.println(price);
		System.out.println(logo);
		OnePlus mbl = new OnePlus();
		mbl.batterStatus();
	}
}
