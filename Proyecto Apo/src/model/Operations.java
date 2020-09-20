package model;
import ui.*;

public class Operations{

	public static void costMaterials(double[] costHomecenter, double[] costFerreteriaCentro, double[] costFerreteriaBarrio, double[] ferreteriaCentro,
	double[] homeCenter, double[] ferreteriaBarrio, double[] amount){
		
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			costFerreteriaCentro[i] = ferreteriaCentro[i] * amount[i];
		}	
		
		for(int i = 0; i < costHomecenter.length; i++){
			costHomecenter[i] = homeCenter[i] * amount[i];
		}
		
		for(int i = 0; i < costFerreteriaBarrio.length; i++){
			costFerreteriaBarrio[i] = ferreteriaBarrio[i] * amount [i];
		}
		
	}


	
	public static void costDomicilie(int totalHC, int totalFB, int totalFC, int costDomicilieHC, int costDomicilieFB, int costDomicilieFC){
		
		if(totalHC < 80000){	
			costDomicilieHC = 120000;
			
		} else if(totalHC < 300000){
			costDomicilieHC = 28000;
			
		} 
		
		if(totalFB < 80000){	
			costDomicilieFB = 120000;
			
		} else if(totalFB < 300000){
			costDomicilieFB = 28000;
			
		}
		
		if(totalFC < 80000){	
			costDomicilieFC = 120000;
			
		} else if(totalHC < 300000){
			costDomicilieFC = 28000;
			
		}

	}
	
}






