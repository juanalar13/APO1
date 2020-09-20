package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	/**
	*get the number of the Arrays
	<b>Pre: </b> Scanner must be initialized <br>
	The number has to be greater than (1) <br>
	<b>Post: </b> get the number for the length of the arrays 
	*/
	public static int lengthArray(){
		int cont = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digita la cantidad de productos que pondras: ");
		cont = in.nextInt();
		
		return cont;
	}
	
	/**
	* <b>Pre:</b> Arrays must be initialized <br>
	* The user must enter a valid name != "" <br>
	* The user must enter an amount greater than zero <br>
	* The user must type utilization < 4 and utilization > 0 <br>
	* <b>Post: </b> save the name of the material, quantity and use <br>
	*/
	public static void data(String[] nameMaterial, double[] amount,int[] utilization){
		
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < nameMaterial.length; i++){
			
			System.out.print("Ingresa el nombre del " + (i + 1) + " material: ");
			nameMaterial[i] = in.nextLine();
			
			System.out.print("Ingresa por favor la cantidad del producto" + (i + 1) + ": ");
			amount[i] = in.nextDouble();
			in.nextLine();
			
			System.out.println("Ingresa un numero segun la utilizacion que le asignaras a este material:");
			System.out.println("Obra negra (1)");
			System.out.println("Obra blanca (2)");
			System.out.println("pintura (3)");
			utilization[i] = in.nextInt();
			in.nextLine();
			
			if(utilization[i] < 1 || utilization[i] > 3){
				System.out.println("Invalido, este numero no es correcto, vuelve a intentarlo");
				i--;
			}
			
		}
	}
	
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* <b>Post: </b> show the places of the materials <br>
	* @param nameMaterial != ""
	*/
	public static void bestStore(double[] costHomecenter, double[] costFerreteriaCentro, double[] costFerreteriaBarrio, String[] nameMaterial){
		
		for(int i = 0; i < nameMaterial.length; i++){
			
			if((costHomecenter[i] < costFerreteriaBarrio[i]) && (costHomecenter[i] < costFerreteriaCentro[i])){
				System.out.println("Este material " + nameMaterial[i] + " sale mejor comprarlo en Homecenter por un precio total de " + costHomecenter[i] + " por los productos");
				
			} else if((costFerreteriaBarrio[i] < costHomecenter[i]) && (costFerreteriaBarrio[i] < costFerreteriaCentro[i])){
				System.out.println("Este material " + nameMaterial[i] + " sale mejor comprarlo en la ferreteria del barrio por un precio total de " +
				costFerreteriaBarrio[i] + " por los productos");
				
			} else if((costFerreteriaCentro[i] < costHomecenter[i]) && (costFerreteriaCentro[i] < costFerreteriaBarrio[i])){
				System.out.println("Este material " + nameMaterial[i] + " sale mejor comprarlo en la ferreteria del centro por un total de " +
				costFerreteriaCentro[i] + " por los productos");
				
			} else if(costHomecenter[i] == costFerreteriaBarrio[i]){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en Homecenter y en la ferreteria del barrio");
				
			} else if(costHomecenter[i] == costFerreteriaCentro[i]){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en Homecenter y en la ferrtereia del centro ");
				
			} else if(costFerreteriaBarrio[i] == costFerreteriaCentro[i]){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en la ferreteria del barrio y en la ferreteria del centro");
				
			} else if((costHomecenter[i] == costFerreteriaBarrio[i]) && (costHomecenter[i] == costFerreteriaCentro[i])){
				System.out.println("El material " + nameMaterial[i] + " el precio es el mismo en los tres establecimientos");
			}
			
		}
		
	}
	
	public static void price(String[] nameMaterial, double[] homeCenter, double[] ferreteriaCentro, double[] ferreteriaBarrio){
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < nameMaterial.length ; i++){
			System.out.print("Ingresa por favor el precio de " + nameMaterial[i] + " que tiene en HomeCenter: ");
			homeCenter[i] = in.nextDouble();

			System.out.print("Ingresa por favor el precio de " + nameMaterial[i] + " que tiene en la ferreteria del centro: ");
			ferreteriaCentro[i] = in.nextDouble();

			System.out.print("Ingresa por favor el precio de " + nameMaterial[i] + " que tiene en la ferreteria del barrio: ");
			ferreteriaBarrio[i] = in.nextDouble();
			System.out.println("");

		}
		
	}
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* The user must enter a number > 0 <br>
	* <b>Post: </b> Save the prices of homecenter and others <br>
	* @param nameMaterial != ""
	*/
	public static void showUsage(int[] utilization, String[] nameMaterial){
		
		Scanner in = new Scanner(System.in);
		int type = 0;
		
		do{
			System.out.println("Ingresa que productos deseas ver por tipo de utilidad segun lo indicado o si quieres finalizar de ver: ");
			System.out.println("Obra negra (1)");
			System.out.println("Obra blanca (2)");
			System.out.println("Pintura (3)");
			System.out.println("Para finalizar (4)");
			type = in.nextInt();
			System.out.println("");
		
			for(int i = 0; i < utilization.length; i++){
				
				if(utilization[i] == type){
					System.out.println(nameMaterial[i]);
				}
		
			}
		
		} while(type != 4);
	
		
	}
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* The user must type a number < 5 and  > 0 <br>
	* <b>Post: </b> Put the materials in categories as indicated by the user <br>
	* @param nameMaterial != ""
	*/
	public static void toPrint(int totalHC, int totalFB, int totalFC, int roughConstruction, int finalConstruction, int paiting , int costDomicilieHC,
	int costDomicilieFB, int costDomicilieFC , double[] costHomecenter, double[] costFerreteriaBarrio, double[] costFerreteriaCentro){
		
		for(int i = 0; i < costHomecenter.length; i++){
			totalHC += costHomecenter[i];
		}
		
		for(int i = 0; i < costFerreteriaBarrio.length; i++){
			totalFB += costFerreteriaBarrio[i];
		}
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			totalFC += costFerreteriaCentro[i];
		}
		
		System.out.println("Comprando todos los materiales en Homecenter el total a pagar por todo sería: " +
		(int)(totalHC + roughConstruction + finalConstruction + paiting + costDomicilieHC));
		
		System.out.println("Si compras todos los materiales en la ferreteria del barrio el total a pagar por todo sería: " +
		(int)(totalFB + roughConstruction + finalConstruction + paiting + costDomicilieFB));
		
		System.out.println("Si compras todos los materiales en la ferreteria del centro el total a pagar por todo sería: " +
		(int)(totalFC + roughConstruction + finalConstruction + paiting + costDomicilieFC));
		
		
	}
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* int must be initialized <br> 
	* <b>Post: </b> Say to de user the total to pay
	*/
	
	public static void main(String[] args){
		
		int roughConstruction = 1300000, finalConstruction = 2600000, paiting = 980000, totalHC = 0, totalFB = 0, totalFC = 0;
		int costDomicilieHC = 0, costDomicilieFB = 0, costDomicilieFC = 0;
	
		int cont = lengthArray(); //Para saber la longitud de los arreglos
		
		double[] homeCenter = new double[cont]; //Guarda el precio de los articulos en homeCenter
		double[] ferreteriaCentro = new double[cont];//Guarda el precio de los articulos en ferreteria del centro
		double[] ferreteriaBarrio = new double[cont];//Guarda el precio de los productos en la ferreteria del centro 
		
		String[] nameMaterial = new String[cont]; //Guarda el nombre del material
		double[] amount = new double[cont]; //Guarda la cantidad de materiales 
		int[] utilization = new int[cont];//Guarda si se para que se utiliza cada material
		
		data(nameMaterial, amount, utilization);
		System.out.print("");
		price( nameMaterial, homeCenter, ferreteriaCentro, ferreteriaBarrio);
		
		double[] costHomecenter = new double[cont];//El coste total entre el precio y la cantidad
		double[] costFerreteriaCentro = new double[cont];//El coste total entre el precio y la cantidad
		double[] costFerreteriaBarrio = new double[cont];//El coste total entre el precio y la cantidad
		
		Operations.costMaterials(costHomecenter, costFerreteriaCentro, costFerreteriaBarrio, ferreteriaCentro, homeCenter, ferreteriaBarrio, amount);
		Operations.costDomicilie( totalHC, totalFB, totalFC, costDomicilieHC, costDomicilieFB, costDomicilieFC);
		toPrint(totalHC, totalFB, totalFC, roughConstruction, finalConstruction, paiting , costDomicilieHC, costDomicilieFB, costDomicilieFC, costHomecenter, costFerreteriaBarrio, costFerreteriaCentro);
		System.out.println("");
		
	
		bestStore(costHomecenter, costFerreteriaCentro, costFerreteriaBarrio, nameMaterial);
		System.out.println("");
		showUsage(utilization, nameMaterial);
	}
}