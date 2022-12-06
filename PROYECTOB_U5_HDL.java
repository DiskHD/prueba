import java.util.Scanner;
import java.util.Random;
public class PROYECTOB_U5_HDL{
	public static Scanner sc=new Scanner(System.in);
	public static Random r=new Random();
	//Método para repartir cartas y dar puntaje
	public static int azar(int numCar,int as,int dos,int tres,int cuatro,int cinco,int seis,int siete,int diez,int once,int doce){
		int puntaje=0;
		int n;
        for(int i=0;i<numCar;i++){
			for(int j=0;j<1;j+=0){
				n=r.nextInt(10)+1;
				switch(n){
					case 1:
						if(as>0){
							puntaje+=1;
							System.out.println(as--+" AS "+" puntaje+ "+puntaje);
							//as--;
							j++;
						}
						break;
					case 2:
						if(dos>0){
							puntaje+=1;
							System.out.println(dos--+" DOS"+" puntaje+ "+puntaje);
							//dos--;
							j++;
						}
						break;
					case 3:
						if(tres>0){
							puntaje+=1;
							//tres--;
							System.out.println(tres--+" TRES"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 4:
						if(cuatro>0){
							puntaje+=1;
							System.out.println(cuatro--+" CUATRO"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 5:
						if(cinco>0){
							puntaje+=1;
							System.out.println(cinco--+" CINCO"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 6:
						if(seis>0){
							puntaje+=1;
							System.out.println(seis--+" SEIS"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 7:
						if(siete>0){
							puntaje+=1;
							System.out.println(siete--+" SIETE"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 8:
						if(diez>0){
							puntaje+=1;
							System.out.println(diez--+" DIEZ"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 9:
						if(once>0){
							puntaje+=1;
							System.out.println(once--+" CABALLO"+" puntaje+ "+puntaje);
							j++;
						}
						break;
					case 10:
						if(doce>0){
							puntaje+=1;
							System.out.println(doce--+" REY"+" puntaje+ "+puntaje);
							j++;
						}
						break;
				}
			}
		}
		return puntaje;
	}
	//Método para sacar al ganador
	public static void ganador(int j1,int j2){
		if(j1>j2){
			System.out.println("El jugador 1 es el ganador con "+j1+" puntos");
			System.out.println("El jugador 2 perdió con "+j2+" puntos");
		}else if(j1<j2){
			System.out.println("El jugador 2 es el ganador con "+j2+" puntos");
			System.out.println("El jugador 1 perdió con "+j1+" puntos");
		}else
			System.out.println("Los dos jugadores empatarón con "+j1+" puntos");
	}
	//Método main
	public static void main(String[]args){
		int[]cartas=new int[10];
		for(int i=0;i<10;i++){
			cartas[i]=4;
		}
		int as=4,dos=4,tres=4,cuatro=4,cinco=4,seis=4,siete=4,diez=4,once=4,doce=4;
		System.out.println("1) Jugar con número de cartas predeterminadas (8 cartas)");
		System.out.println("2) Escojer número de cartas");
		int m=sc.nextInt();
		int numCar=0;
		boolean x=true;
		if(m==1)
			numCar=8;
		else{
			while(x==true){
				System.out.println("Cuantas cartas escojera cada jugador? (max 20)");
				numCar=sc.nextInt();
				if(numCar>20||numCar<1)
					System.out.println("sobre pasaste el limite de cartas permitidas");
				else
					x=false;
			}
		}
		int j1=0;
		int j2=0;
		System.out.println("Jugador 1");
		j1=azar(numCar,as,dos,tres,cuatro,cinco,seis,siete,diez,once,doce);
		System.out.println("Jugador 2");
		j2=azar(numCar,as,dos,tres,cuatro,cinco,seis,siete,diez,once,doce);
	}
}
