package com.designpatterns.singleton_example;

/**
 * Singleton Design Pattern
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AdminAccount adminAccount1 = AdminAccount.getAdminaccount();
		System.out.println(adminAccount1);
		
		AdminAccount adminAccount2 = AdminAccount.getAdminaccount();
		System.out.println(adminAccount2);
    }
}
