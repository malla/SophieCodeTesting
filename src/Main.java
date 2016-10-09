
public class Main {
	public Book mallasBok;

	public static void main(String[] args){
		System.out.print("Det första som skrivs ut. Programmet startar ALLTID i main metoden.");
		/*Den här metoden är static. Det gör det lite klurigare att använda andra funktioner
		 * eller variabler (du får säga till om du vill veta mer, annars acceptera bara att det är så just nu.)
		 * Däremot finns det inget som hindrar att skapa nya object (att anropa konstruktorer) så det gör vi!
		 * */
		Main m= new Main();
	}
	
	public  Main(){
		//Förra veckan:
		mallasBok= new Book("malla", "mitt liv suger ", 10);
		mallasBok.setRefNumber("45BF:A239:F73C");
		
		
		//Här kan du göra nästa vecka
	}
}
