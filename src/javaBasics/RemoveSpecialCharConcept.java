package javaBasics;

public class RemoveSpecialCharConcept {

	public static void main(String[] args) {
		String s = "sasshdhadAADSDH1212@#@##@##@##QWQIQIWaksakdahds";
		String myName = "Manee12233sh!@@@@!#$%Kumar#$$#1233Mish1223#$$ra";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(myName.replaceAll("[^a-zA-Z]", ""));

	}

}
