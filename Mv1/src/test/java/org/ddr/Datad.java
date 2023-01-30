package org.ddr;

import java.io.IOException;

import org.smes.Base;

public class Datad extends Base {
	
	public static void main(String[] args) throws IOException {
	
createExcel(0, 0, "JUnit");

createCellOnly(0, 1, "Java");
createCellOnly(0, 2, "Maven");


createRowOnly(1,0, "Python");


createRowOnly(2, 1, "POM");

createCellOnly(2,2, "Jenkins");




updateTheExcel(1, 0, "XML");





		

	}
	
	

}
