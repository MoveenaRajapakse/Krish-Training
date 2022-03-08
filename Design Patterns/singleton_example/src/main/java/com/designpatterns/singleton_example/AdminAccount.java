package com.designpatterns.singleton_example;

public class AdminAccount {
	
	private static volatile AdminAccount adminaccount;
	
	private AdminAccount() {
		
		if(adminaccount != null) {
			
			System.out.println("Please use getAdminAccount() to create an object");
			
		}
		
	}

	public static AdminAccount getAdminaccount() {
		
		if (adminaccount == null) {
			synchronized (AdminAccount.class) {
				if (adminaccount == null) {
					adminaccount = new AdminAccount();
				}
			}
		}
		
		return adminaccount;
	}
	
	

}
