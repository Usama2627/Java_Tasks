package com.xworkz.repository.app.Army;

public class ArmyRepositoryImpl implements ArmyRepository {

	private String[] names = new String[TOTAL_NAMES];
	private int index = 0;


	@Override
	public void save(String name) {
		System.out.println("Invoking save in ArmyRepositoryImpl");

		if (index<TOTAL_NAMES) {
			this.names[index] = name;
			System.out.println("At the index = "+ index +" the name is : "+ name);
			index = index + 1;
			System.out.println("The next updated index is = "+ index);
		}
		else {
			System.err.println("Index is full, cannot add names");
		}
	}

	@Override
	public void display() {

		System.out.println("\nInvoking display in ArmyRepositoryImpl");

		for (int start = 0; start < names.length; start++) {
			System.out.println("The name at index "+start+" is : "+names[start]);
		}
	}

}
