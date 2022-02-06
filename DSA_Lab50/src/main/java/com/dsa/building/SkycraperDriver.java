package com.dsa.building;
/* Java Program About : The skyscraper needs to be constructed in N days with the following conditions:
a) Every day a floor is constructed in a separate factory of distinct size.
b) The floor with the larger size must be placed at the bottom of the building.
c) The floor with the smaller size must be placed at the top of the building.
*/

public class SkycraperDriver {

	public static int totalFloors;
	public static int[] totalFloorSize;

	public static void main(String[] args) {
		ChiefArchitect objDriver = new ChiefArchitect();
		objDriver.userInputs();
		objDriver.orderOfConstruction(objDriver.totalFloorSize);
	}
}
