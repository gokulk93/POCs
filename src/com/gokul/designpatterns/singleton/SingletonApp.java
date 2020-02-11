package com.gokul.designpatterns.singleton;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SingletonApp {

	public static void main(String[] args) {

		try {
			
			MysqlConnect dao = MysqlConnect.getDbCon();
			MysqlConnect dao1 = MysqlConnect.getDbCon();
			MysqlConnect dao2= MysqlConnect.getDbCon();
			MysqlConnect dao3 = MysqlConnect.getDbCon();
			MysqlConnect dao4 = MysqlConnect.getDbCon();
			
			System.out.println("Hash Code : "+dao.hashCode());
			System.out.println("Hash Code : "+dao1.hashCode());
			
			ResultSet rs = dao.getBracnhId();
			
			while (rs.next()) {
				System.out.println(rs.getString(1) );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		/*List<Person> personsList = new ArrayList<Person>();

		personsList.add(new Person(102, "Sandy"));
		personsList.add(new Person(103, "Murali"));
		personsList.add(new Person(104, "Simma"));
		personsList.add(new Person(105, "Dinu"));
		personsList.add(new Person(106, "Mahi"));
		personsList.add(new Person(107, "Kumar"));

		System.out.println(personsList.toString());*/
		
		
		/*List<SingletonPerson> singletonPersonList = new ArrayList<SingletonPerson>();

		singletonPersonList.add(SingletonPerson.getInstance(103, "Sandy"));
		singletonPersonList.add(SingletonPerson.getInstance(103, "Murali"));
		singletonPersonList.add(SingletonPerson.getInstance(104, "Simma"));
		singletonPersonList.add(SingletonPerson.getInstance(105, "Dinu"));
		singletonPersonList.add(SingletonPerson.getInstance(106, "Mahi"));
		singletonPersonList.add(SingletonPerson.getInstance(107, "Kumar"));

		System.out.println(singletonPersonList.toString());
		*/

	}

}
