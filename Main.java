package Jeu_De;





public class Main {

	public static void main(String[] args) {
		
		 De d = new De();
	    
	 Joueur jo[] = new Joueur[4];
		
		
			
		
		
		
		for (int tour = 1; tour <= 10; tour++) {
			
			
			System.out.println("tour n°:"+tour);
		
			if(tour==1)
			
			for (int count = 0; count <= 3; count++) {
				
		             jo[count]= new Joueur();			
					jo[count].cluScor(d.lancerDe());
				 System.out.println("joueur"+(count+1)+" a   "+jo[count].getScore());
				  }
			else
				for (int count = 0; count <= 3; count++) {
					
		             jo[count]= new Joueur();			
					jo[count].cluScor(d.lancerDe());
				 System.out.println("joueur"+(count+1)+" a   "+jo[count].getScore());
				  }
			
	    System.out.println("================");
	}


	    int max = Math.max(Math.max(jo[0].getScore(),jo[1].getScore()),Math.max(jo[2].getScore(),jo[3].getScore()));
	if(max == jo[0].getScore())
		System.out.println("le gangant est "+1+" avec le score"+jo[0].getScore()+"point");
	else
		if(max == jo[1].getScore())
			System.out.println("le gangant est "+2+"avec le score"+jo[1].getScore()+"point");
		else
			if(max == jo[2].getScore())
				System.out.println("le gangant est "+3+" avec le score"+jo[2].getScore()+"point");
			else
				System.out.println("le gangant est "+4+" avec le score"+jo[3].getScore()+"point");
				
}
	
}