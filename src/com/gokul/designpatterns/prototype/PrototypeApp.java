package com.gokul.designpatterns.prototype;

public class PrototypeApp {
	public static void main(String[] args) {
		try
        {
			Movie movieObj = (Movie) PrototypeFactory.getInstance("movie");
			movieObj.setName("abc");
			System.out.println("Hash Code : "+movieObj.hashCode() +"|| Name :  "+movieObj.toString());
			
			Movie movieObj1 = (Movie) PrototypeFactory.getInstance("movie");
			movieObj1.setName("dark");
			System.out.println("Hash Code : "+movieObj1.hashCode() +"|| Name :  "+movieObj1.toString());
			
            Album albumObj = (Album) PrototypeFactory.getInstance("album");
            albumObj.setName("Jylo");
			System.out.println("Hash Code : "+albumObj.hashCode() +"|| Name :  "+albumObj.toString());
			
			Album albumObj1 = (Album) PrototypeFactory.getInstance("album");
            albumObj1.setName("Jylo");
			System.out.println("Hash Code : "+albumObj1.hashCode() +"|| Name :  "+albumObj1.toString());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
	}

}
