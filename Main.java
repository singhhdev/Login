package Project;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		IDClass asuIDS = new IDClass();
		// boot to the login page, ass the hash into the login page
		HashMap<String,String> validIds = asuIDS.getValidIds();
		// pass the valid ids to the login page
		LoginPage login = new LoginPage(validIds);
		
	}
}
 