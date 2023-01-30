package org.langs;

public class LanguageInfo extends StateDetails {
	
	public void tamilLanguages() {
		
		System.out.println("Tamil Language : Ancient Language");
		

	}
	
	public void englishLangugae() {
		System.out.println("English Language : Western Language");

	}
	
	public void hindiLanguage() {
		System.out.println("Hindi Language : Northern Language ");
		

	}

	public static void main(String[] args) {
		
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguages();
		l.englishLangugae();
		l.hindiLanguage();
		l.southIndia();
		l.northIndia();
	}
}
