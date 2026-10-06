package com.tka;

public class Hotel {

	static String owner = "rahul";
	static String Manager;
	static long contact_No = 9834250640l;
	static int hotelRooms = 50;
	static String location = "Ravet";
	static String hotelName = "Royal Hotel";
	static int hotelId = 2;
	static String roomType = "Delux";
	static double price = 3500.00;
	static double tax;
	static char category;
	static boolean is_Open;
	static String Food_Type ;
	static String City = "Pune";
	
	
	public static void main(String[] args) {
		System.out.println("owner = " + owner);
		System.out.println("Manager = " + Manager);
		System.out.println("mobile number = " + contact_No);
		System.out.println("Rooms = " + hotelRooms);
		System.out.println("location = " + location);
		System.out.println("hotel name = " + hotelName);
		System.out.println("hotel Id = " + hotelId);
		System.out.println("room type = " + roomType);
		System.out.println("price = " + price);
		System.out.println("tax = " + tax);
		System.out.println("category = " + category);
		System.out.println("is_Open = " + is_Open);
		System.out.println("food type = " + Food_Type);
		System.out.println("city = " + City);

	}
}