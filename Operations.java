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
	
}