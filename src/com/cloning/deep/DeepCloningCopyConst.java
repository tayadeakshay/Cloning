package com.cloning.deep;

public class DeepCloningCopyConst {
	public int ID;
	public String name;
	public Address ad;
	public DeepCloningCopyConst(int iD, String name, Address ad) {
		ID = iD;
		this.name = name;
		Address copy=new Address();
		copy.city=ad.city;
		copy.country=ad.country;
		copy.pin=ad.pin;
		this.ad = copy;
	}
	public Address getAd() {
		Address copy=new Address();
		copy.city=ad.city;
		copy.country=ad.country;
		copy.pin=ad.pin;
		return copy;
	}
	public static void main(String[] args) {
		Address ad=new Address("Pune","India",411051);
		DeepCloningCopyConst d1=new DeepCloningCopyConst(100, "Deep Copy", ad);
		System.out.println("Before change in Address:----------");
		System.err.println("Address object= "+ad);
		System.out.println("DeepCloning Object= "+d1);
		
		ad.setCity("New York");
		ad.setCountry("USA");
		
		System.out.println("After change in Address object:----------");
		System.err.println("Address object= "+ad);
		System.out.println("DeepCloning Object= "+d1);
	}
	@Override
	public String toString() {
		return "DeepCloningCopyConst [ID=" + ID + ", name=" + name + ", ad=" + ad + "]";
	}
	

}
