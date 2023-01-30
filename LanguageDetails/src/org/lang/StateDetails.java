package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.println("South India : Tamilnadu,Kerala,AndhraPradesh,Karnataka and Telangana");

	}
	 private void northIndia() {
		System.out.println("North India : North India is a Northern part of india");
}
	 
public static void main(String[] args) {
	StateDetails l = new StateDetails();			
	
	l.southIndia();
	l.northIndia();
	
	LanguageInfo s = new LanguageInfo();
	s.tamilLanguage();
	s.englishLanguage();
	s.hindiLanguage();
	
}
	 
}
