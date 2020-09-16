package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	
	public static int lengthArray(){
		int cont = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa la cantidad de productos que pondras: ");
		cont = in.nextInt();
		
		return cont;
	}
	
	
	public static void data(String[] nameMaterial, double[] amount,int[] utilization){
		
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < nameMaterial.length; i++){
			
			System.out.print("Ingresa el nombre del " + (i + 1) + " material: ");
			nameMaterial[i] = in.nextLine();
			
			System.out.print("Ingresar la cantidad del producto " + (i + 1) + ": ");
			amount[i] = in.nextDouble();
			in.nextLine();
			
			System.out.println("Si el producto corresponde para obra negra pon el numero (1), si es para obra blanca ingresa el numero (2)" + 
			", y si corresponde a pintura el numero (3)");
			utilization[i] = in.nextInt();
			in.nextLine();
			
			if(utilization[i] < 1 || utilization[i] > 3){
				System.out.println("Error, el numero es invalido, vuelve a intentarlo de nuevo ");
				i--;
			}
			
		}
	}
	
	public static void price(String[] nameMaterial, double[] homeCenter, double[] ferreteriaCentro, double[] ferreteriaBarrio){
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < nameMaterial.length ; i++){
			System.out.print("Por favor digita el precio de " + nameMaterial[i] + " que tiene en HomeCenter: ");
			homeCenter[i] = in.nextDouble();
			System.out.println("");
			
			System.out.print("Ingresar por favor el precio de " + nameMaterial[i] + " que tiene en la ferreteria del centro: ");
			ferreteriaCentro[i] = in.nextDouble();
			System.out.println("");
			
			System.out.print("Ingresar por favor el precio de " + nameMaterial[i] + " que tiene en la ferreteria del barrio: ");
			ferreteriaBarrio[i] = in.nextDouble();
			System.out.println("");
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		int cont = lengthArray();
		
		double[] homeCenter = new double[cont];
		double[] ferreteriaCentro = new double[cont];
		double[] ferreteriaBarrio = new double[cont];
		
		
		String[] nameMaterial = new String[cont];
		double[] amount = new double[cont];
		int[] utilization = new int[cont];
		
		data(nameMaterial, amount, utilization);
		System.out.print("");
		price( nameMaterial, homeCenter, ferreteriaCentro, ferreteriaBarrio);
		
		double[] costHomecenter = new double[cont];
		double[] costFerreteriaCentro = new double[cont];
		double[] costFerreteriaBarrio = new double[cont];
			
		Operations.costMaterials(costHomecenter, costFerreteriaCentro, costFerreteriaBarrio, ferreteriaCentro, homeCenter, ferreteriaBarrio, amount);
		
		for(int i = 0; i < costHomecenter.length; i++){
			System.out.println("El producto en homeCenter tiene un costo de " + nameMaterial[i] + " es de: " + costHomecenter[i]);
		}
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			System.out.println("El costo en ferreteriaCentro para el producto " + nameMaterial[i] + " es de: " + costFerreteriaCentro[i]);
		}
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			System.out.println("El costo en ferreteriaBarrio para el producto " + nameMaterial[i] + " es de: " + costFerreteriaBarrio[i]);
		}
		
	}
}