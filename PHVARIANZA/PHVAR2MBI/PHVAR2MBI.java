
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class PHVAR2MBI{
		public double inversion;
  
   	int num;		
    
	public static void main(String []args){	 
	
		 BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
   	   	  try{
   	   	  		  
   	   	  	   System.out.println("\n");	   	   	  	   	
   	   	  	   		
   	   	  System.out.println("\n");	 	    
   	   	  
   	   	  
   	      System.out.print("	El NIVEL DE SIGNIFICANCIA(0.01, 0.02, 0.05, 0.1) es de: ");
   	     
   	   	    double nsigni = Double.parseDouble(ent.readLine());  
   	   	    
   	   	    System.out.println("\n");
   	   	    
   	   	   System.out.print("CONOCE LOS VALORES DE LAS MEDIAS Y SUS DESVIACIONES? (SI MARQUE 1, NO 2): ");
   	     
   	   	    int refe = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    switch (refe){
   	   	     
   	   	   case 1: 
   	   	    	
   	   	  System.out.print("La cantidad de DATOS es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	   	    System.out.print("El valor de la varianza de la muestra es de: ");  
   	   	 	 
   	   	    double var = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	    System.out.print("El valor de la varianza pob. es de: ");  
   	   	 	 
   	   	    double var0 = Double.parseDouble(ent.readLine()); 
   	   	    	  
   	   	    double ji=((n-1)*var)/var0;	  
   	int num = n+1;
   int gl= n-1;
   	
      
      System.out.println("\n");
     
         
			    double limiteinf;
			    double limitesup;	   
               	
    
               	int nconf=0;
            	if (nsigni==0.1) {
            	nconf=90;	
            		
            	switch (gl){
            		
            		case 1:
            		limiteinf=3.8415;
            		limitesup=0.0039;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
        }
            		break;
            		
            		case 2:
            		limiteinf=5.9915;
            		limitesup=0.1026;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
            }		break;
            		
            		case 3:
            		limiteinf= 7.8147;
            		limitesup=0.3518;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
            }	
            		break;
            		
            		case 4:
            		limiteinf= 9.4877;
            		limitesup= 0.7107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");	
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 11.0705;
            		limitesup= 1.1455;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf=12.5916;
            		limitesup= 1.6354;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            	
            		break;
            		
            		case 7:
            		limiteinf= 14.0671;
            		limitesup= 2.1673;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 15.5073;
            		limitesup= 2.7326;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 16.919;
            		limitesup= 3.3251;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 18.307;
            		limitesup= 3.9403;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 19.6752;
            		limitesup= 4.5748;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 21.0261;
            		limitesup= 5.2260;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 22.3620;
            		limitesup= 5.8919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf=23.6848;
            		limitesup= 6.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 24.9958;
            		limitesup= 7.2609;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 26.2962;
            		limitesup= 7.9616;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 27.5871;
            		limitesup= 8.6718;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 28.8693;
            		limitesup= 9.3904;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 30.1435;
            		limitesup= 10.1170;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 31.4104;
            		limitesup= 10.8508;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 32.6706;
            		limitesup= 11.5913;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 33.9245;
            		limitesup= 12.3380;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 35.1725;
            		limitesup= 13.0905;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 36.4150;
            		limitesup= 13.8484;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 37.6225;
            		limitesup= 14.6114;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 38.8851;
            		limitesup= 15.3792;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 40.1133;
            		limitesup= 16.1514;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 41.3372;
            		limitesup= 16.9279;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 42.5569;
            		limitesup= 17.7084;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	}
            	
            }
            if (nsigni==0.05) {	
            nconf=95;
            	switch (gl){
            		
            		case 1:
            		limiteinf= 5.0239;
            		limitesup= 0.0010;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 7.3778;
            		limitesup= 0.0506;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 9.3484;
            		limitesup= 0.2158;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 11.1433;
            		limitesup= 0.4844;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 12.8325;
            		limitesup= 0.8312;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 14.4494;
            		limitesup= 1.2373;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 16.0128;
            		limitesup= 1.6899;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 17.5345;
            		limitesup= 2.1797;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 19.0228;
            		limitesup= 2.7004;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 20.4832;
            		limitesup= 3.2470;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 21.9200;
            		limitesup= 3.8157;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 23.3367;
            		limitesup= 4.4038;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 24.7356;
            		limitesup= 5.0087;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 26.1189;
            		limitesup= 5.6287;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 27.4884;
            		limitesup= 6.2621;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 28.8453;
            		limitesup= 6.9077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 30.1910;
            		limitesup= 7.5642;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 31.5264;
            		limitesup= 8.2307;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 32.8523;
            		limitesup= 8.9065;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 34.1696;
            		limitesup= 9.5908;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 35.4789;
            		limitesup= 10.2829;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 36.7807;
            		limitesup= 10.9823;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 38.0756;
            		limitesup= 11.6885;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 39.3641;
            		limitesup= 12.4011;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 40.6465;
            		limitesup= 13.1197;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 41.9231;
            		limitesup= 13.8439;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 43.1945;
            		limitesup= 14.5734;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 44.4608;
            		limitesup= 15.3079;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 45.7223;
            		limitesup= 16.0471;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	
            }
            	}
            	
            	if (nsigni==0.02) {
            	nconf=98;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 6.6349;
            		limitesup= 0.0002;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 9.2104;
            		limitesup= 0.0201;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 11.3449;
            		limitesup= 0.1148;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 13.2767;
            		limitesup= 0.2971;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 15.0863;
            		limitesup= 0.5543;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 16.8119;
            		limitesup= 0.8721;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 18.4753;
            		limitesup= 1.2390;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 20.0902;
            		limitesup= 1.6465;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 21.6660;
            		limitesup= 2.0879;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 23.2093;
            		limitesup= 2.5582;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 24.7250;
            		limitesup= 3.0535;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 26.2170;
            		limitesup= 3.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 27.6882;
            		limitesup= 4.1069;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 29.1412;
            		limitesup= 4.6604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 30.5780;
            		limitesup= 5.2294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 31.9999;
            		limitesup= 5.8122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 33.4087;
            		limitesup= 6.4077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 34.8052;
            		limitesup= 7.0149;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 36.1908;
            		limitesup= 7.6327;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 37.5663;
            		limitesup= 8.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 38.9322;
            		limitesup= 8.8972;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 40.2894;
            		limitesup= 9.5425;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 41.6383;
            		limitesup= 10.1957;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 42.9798;
            		limitesup= 10.8563;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 44.3140;
            		limitesup= 11.5240;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 45.6416;
            		limitesup= 12.1982;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 46.9628;
            		limitesup= 12.8785;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 48.2782;
            		limitesup= 13.5647;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 49.5878;
            		limitesup= 14.2564;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	}
            }
            	
            	if (nsigni==0.01) {
            	nconf=99;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 7.8794;
            		limitesup= 0.0000;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 10.5965;
            		limitesup= 0.0100;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 12.8381;
            		limitesup= 0.0717;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 14.8602;
            		limitesup= 0.2070;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 16.7496;
            		limitesup= 0.4118;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 18.5475;
            		limitesup= 0.6757;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 20.2777;
            		limitesup= 0.9893;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 21.9549;
            		limitesup= 1.3444;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 23.5893;
            		limitesup= 1.7349;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 25.1881;
            		limitesup= 2.1558;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 26.7569;
            		limitesup= 2.6032;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 28.2997;
            		limitesup= 3.0738;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 29.8193;
            		limitesup= 3.5650;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 31.3194;
            		limitesup= 4.0747;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 32.8015;
            		limitesup= 4.6009;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 34.2671;
            		limitesup= 5.1422;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 35.7184;
            		limitesup= 5.6973;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 37.1564;
            		limitesup= 6.2648;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 38.5821;
            		limitesup= 6.8439;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 39.9969;
            		limitesup= 7.4338;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 41.4009;
            		limitesup= 8.0336;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 42.7957;
            		limitesup= 8.6427;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 44.1814;
            		limitesup= 9.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 45.5584;
            		limitesup= 9.8862;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 46.9280;
            		limitesup= 10.5196;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 48.2898;
            		limitesup= 11.1602;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 49.6450;
            		limitesup= 11.8077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 50.9936;
            		limitesup= 12.4613;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 52.3355;
            		limitesup= 13.1211;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            
            		break;
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	 break;
   	  
   	   	 
   	   	 case 2:
   	   	 
   	   	 System.out.print("La cantidad de DATOS es de: ");  
   	   	 	 
   	   	    n = Integer.parseInt(ent.readLine()); 
   	   	    	  
   	num = n+1;
   gl= n-1;
   	
      double dato[] = new double[num];
      double datoc[] = new double[num]; 
     double sumad=0;
     double suma=0;
      System.out.println("\n");
     
         for(int i=1; i < num; i++){
      
     System.out.print("Registra el valor del DATO["+i+"]=");
     
            	     dato[i] = Double.parseDouble(ent.readLine());
            	     datoc[i] = Math.pow(dato[i], 2);
            	     sumad= sumad+datoc[i];
            	     suma= suma + dato[i];
            	     
      }
      System.out.println("\n");
      
	
			     var = (n*sumad - Math.pow(suma, 2))/(n*(n-1));
			    
			    double desv = (Math.sqrt(var));
			   	System.out.print("El valor de la varianza pob. de la muestra es de: ");  
   	   	 	 
   	   	    var0 = Double.parseDouble(ent.readLine());    
               	ji=((n-1)*var)/var0;
               	   
            	System.out.print("LA DESVIACION ES DE "+desv); 
            	System.out.println("\n");
            	 nconf=0;
            	if (nsigni==0.1) {
            	nconf=90;	
            		
            	switch (gl){
            		
            		case 1:
            		limiteinf=3.8415;
            		limitesup=0.0039;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
        }
            		break;
            		
            		case 2:
            		limiteinf=5.9915;
            		limitesup=0.1026;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
            }		break;
            		
            		case 3:
            		limiteinf= 7.8147;
            		limitesup=0.3518;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            }
            }	
            		break;
            		
            		case 4:
            		limiteinf= 9.4877;
            		limitesup= 0.7107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");	
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 11.0705;
            		limitesup= 1.1455;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf=12.5916;
            		limitesup= 1.6354;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            	
            		break;
            		
            		case 7:
            		limiteinf= 14.0671;
            		limitesup= 2.1673;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 15.5073;
            		limitesup= 2.7326;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 16.919;
            		limitesup= 3.3251;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 18.307;
            		limitesup= 3.9403;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 19.6752;
            		limitesup= 4.5748;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 21.0261;
            		limitesup= 5.2260;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 22.3620;
            		limitesup= 5.8919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf=23.6848;
            		limitesup= 6.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 24.9958;
            		limitesup= 7.2609;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 26.2962;
            		limitesup= 7.9616;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 27.5871;
            		limitesup= 8.6718;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 28.8693;
            		limitesup= 9.3904;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 30.1435;
            		limitesup= 10.1170;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 31.4104;
            		limitesup= 10.8508;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 32.6706;
            		limitesup= 11.5913;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 33.9245;
            		limitesup= 12.3380;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 35.1725;
            		limitesup= 13.0905;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 36.4150;
            		limitesup= 13.8484;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 37.6225;
            		limitesup= 14.6114;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 38.8851;
            		limitesup= 15.3792;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 40.1133;
            		limitesup= 16.1514;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 41.3372;
            		limitesup= 16.9279;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 42.5569;
            		limitesup= 17.7084;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	}
            	
            }
            if (nsigni==0.05) {	
            nconf=95;
            	switch (gl){
            		
            		case 1:
            		limiteinf= 5.0239;
            		limitesup= 0.0010;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 7.3778;
            		limitesup= 0.0506;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 9.3484;
            		limitesup= 0.2158;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 11.1433;
            		limitesup= 0.4844;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 12.8325;
            		limitesup= 0.8312;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 14.4494;
            		limitesup= 1.2373;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 16.0128;
            		limitesup= 1.6899;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 17.5345;
            		limitesup= 2.1797;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 19.0228;
            		limitesup= 2.7004;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 20.4832;
            		limitesup= 3.2470;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 21.9200;
            		limitesup= 3.8157;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 23.3367;
            		limitesup= 4.4038;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 24.7356;
            		limitesup= 5.0087;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 26.1189;
            		limitesup= 5.6287;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 27.4884;
            		limitesup= 6.2621;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 28.8453;
            		limitesup= 6.9077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 30.1910;
            		limitesup= 7.5642;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 31.5264;
            		limitesup= 8.2307;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 32.8523;
            		limitesup= 8.9065;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 34.1696;
            		limitesup= 9.5908;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 35.4789;
            		limitesup= 10.2829;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		if (ji>limiteinf){	 
            		System.out.print("PARA desv>H0: SE RECHAZA H0 ");
            	}
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 36.7807;
            		limitesup= 10.9823;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 38.0756;
            		limitesup= 11.6885;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 39.3641;
            		limitesup= 12.4011;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 40.6465;
            		limitesup= 13.1197;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 41.9231;
            		limitesup= 13.8439;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 43.1945;
            		limitesup= 14.5734;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 44.4608;
            		limitesup= 15.3079;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 45.7223;
            		limitesup= 16.0471;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	
            }
            	}
            	
            	if (nsigni==0.02) {
            	nconf=98;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 6.6349;
            		limitesup= 0.0002;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 9.2104;
            		limitesup= 0.0201;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 11.3449;
            		limitesup= 0.1148;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 13.2767;
            		limitesup= 0.2971;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 15.0863;
            		limitesup= 0.5543;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 16.8119;
            		limitesup= 0.8721;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 18.4753;
            		limitesup= 1.2390;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 20.0902;
            		limitesup= 1.6465;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 21.6660;
            		limitesup= 2.0879;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 23.2093;
            		limitesup= 2.5582;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 24.7250;
            		limitesup= 3.0535;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 26.2170;
            		limitesup= 3.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 27.6882;
            		limitesup= 4.1069;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 29.1412;
            		limitesup= 4.6604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 30.5780;
            		limitesup= 5.2294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 31.9999;
            		limitesup= 5.8122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 33.4087;
            		limitesup= 6.4077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 34.8052;
            		limitesup= 7.0149;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 36.1908;
            		limitesup= 7.6327;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 37.5663;
            		limitesup= 8.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 38.9322;
            		limitesup= 8.8972;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 40.2894;
            		limitesup= 9.5425;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 41.6383;
            		limitesup= 10.1957;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 42.9798;
            		limitesup= 10.8563;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 44.3140;
            		limitesup= 11.5240;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 45.6416;
            		limitesup= 12.1982;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 46.9628;
            		limitesup= 12.8785;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 48.2782;
            		limitesup= 13.5647;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 49.5878;
            		limitesup= 14.2564;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            	}
            }
            	
            	if (nsigni==0.01) {
            	nconf=99;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 7.8794;
            		limitesup= 0.0000;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 2:
            		limiteinf= 10.5965;
            		limitesup= 0.0100;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 3:
            		limiteinf= 12.8381;
            		limitesup= 0.0717;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 4:
            		limiteinf= 14.8602;
            		limitesup= 0.2070;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 5:
            		limiteinf= 16.7496;
            		limitesup= 0.4118;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 6:
            		limiteinf= 18.5475;
            		limitesup= 0.6757;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 7:
            		limiteinf= 20.2777;
            		limitesup= 0.9893;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 8:
            		limiteinf= 21.9549;
            		limitesup= 1.3444;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 9:
            		limiteinf= 23.5893;
            		limitesup= 1.7349;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 10:
            		limiteinf= 25.1881;
            		limitesup= 2.1558;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 11:
            		limiteinf= 26.7569;
            		limitesup= 2.6032;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 12:
            		limiteinf= 28.2997;
            		limitesup= 3.0738;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 13:
            		limiteinf= 29.8193;
            		limitesup= 3.5650;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 14:
            		limiteinf= 31.3194;
            		limitesup= 4.0747;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 15:
            		limiteinf= 32.8015;
            		limitesup= 4.6009;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 16:
            		limiteinf= 34.2671;
            		limitesup= 5.1422;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 17:
            		limiteinf= 35.7184;
            		limitesup= 5.6973;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 18:
            		limiteinf= 37.1564;
            		limitesup= 6.2648;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 19:
            		limiteinf= 38.5821;
            		limitesup= 6.8439;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 20:
            		limiteinf= 39.9969;
            		limitesup= 7.4338;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 21:
            		limiteinf= 41.4009;
            		limitesup= 8.0336;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 22:
            		limiteinf= 42.7957;
            		limitesup= 8.6427;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 23:
            		limiteinf= 44.1814;
            		limitesup= 9.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 24:
            		limiteinf= 45.5584;
            		limitesup= 9.8862;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 25:
            		limiteinf= 46.9280;
            		limitesup= 10.5196;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 26:
            		limiteinf= 48.2898;
            		limitesup= 11.1602;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 27:
            		limiteinf= 49.6450;
            		limitesup= 11.8077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 28:
            		limiteinf= 50.9936;
            		limitesup= 12.4613;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            		break;
            		
            		case 29:
            		limiteinf= 52.3355;
            		limitesup= 13.1211;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji<limiteinf){	
            	if (ji>limitesup){
            		 
            		System.out.print("PARA VARIANZA DIFERENTE DE H0: SE ACEPTA H0 ");
            	}else{
            	System.out.print("PARA VARIANZA DIFERENTE DE H0: SE RECHAZA H0 ");
            	}
            }
            
            		break;
            
            	}
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	  	
   	   

   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
	}
		}