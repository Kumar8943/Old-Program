package org.samepackage;

public class State {
	public void southIndia() {
	
System.out.println("Tamilnadu");
}
	public void northIndia() {
System.out.println("Maharastra");
}
public static void main(String[] args) {
	State s = new State();
	Language L = new Language();
	s.northIndia();
	s.southIndia();
	L.englishLanguage();
	L.hindiLanguage();
	L.tamilLanguage();
	
}
}

