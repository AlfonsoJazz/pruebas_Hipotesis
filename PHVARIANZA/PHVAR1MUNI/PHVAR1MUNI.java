
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class PHVAR1MUNI{
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
            		limiteinf=2.7055;
            		limitesup=0.0158;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf=4.6052;
            		limitesup=2.2107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            		
            		
            		case 3:
            		limiteinf= 6.2514;
            		limitesup=0.5844;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 7.7794;
            		limitesup= 1.0636;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");	
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 9.2363;
            		limitesup= 1.6103;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf=10.6446;
            		limitesup= 2.2041;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 12.017;
            		limitesup= 2.8331;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 13.3616;
            		limitesup= 3.4895;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 14.6837;
            		limitesup= 4.1682;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 15.9872;
            		limitesup= 4.8652;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 17.2750;
            		limitesup= 5.5778;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 18.5493;
            		limitesup= 6.3038;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 19.8119;
            		limitesup= 7.0415;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf=21.0641;
            		limitesup= 7.7895;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 22.3071;
            		limitesup= 8.5468;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 23.5418;
            		limitesup= 9.3122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 24.7690;
            		limitesup= 10.0852;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            	
            		
            		case 18:
            		limiteinf= 25.9894;
            		limitesup= 10.8649;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 27.2036;
            		limitesup= 11.6509;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 28.4120;
            		limitesup= 12.4426;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            	}
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 29.6151;
            		limitesup= 13.2396;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 30.8133;
            		limitesup= 14.0415;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 32.0069;
            		limitesup= 14.8480;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 33.1962;
            		limitesup= 15.6587;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 34.3816;
            		limitesup= 16.4734;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 35.5632;
            		limitesup= 17.2919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 36.7412;
            		limitesup= 18.1139;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 37.9159;
            		limitesup= 18.9392;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 39.0875;
            		limitesup= 19.7677;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	}
            	
            }
            if (nsigni==0.05) {	
            nconf=95;
            	switch (gl){
            		
            		case 1:
            		limiteinf= 3.815;
            		limitesup= 0.0039;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 5.9915;
            		limitesup= 0.1026;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 7.8147;
            		limitesup= 0.3518;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 9.4877;
            		limitesup= 0.7107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 11.0705;
            		limitesup= 1.1455;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 12.5916;
            		limitesup= 1.6354;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 14.0671;
            		limitesup= 2.1673;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 15.5073;
            		limitesup= 2.7326;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 16.9190;
            		limitesup= 3.3251;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 18.307;
            		limitesup= 3.9403;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 19.6752;
            		limitesup= 4.5748;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 21.0261;
            		limitesup= 5.226;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 22.362;
            		limitesup= 5.8919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 23.6848;
            		limitesup= 6.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 24.9958;
            		limitesup= 7.2609;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 26.2962;
            		limitesup= 7.9616;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 27.5871;
            		limitesup= 8.6718;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 28.8693;
            		limitesup= 9.3904;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 30.1435;
            		limitesup= 10.1170;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 31.4104;
            		limitesup= 10.8508;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 32.6706;
            		limitesup= 11.5913;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		System.out.println("\n");	 
            		if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 33.9245;
            		limitesup= 12.338;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 35.1725;
            		limitesup= 13.0905;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 36.4150;
            		limitesup= 13.8484;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 37.6525;
            		limitesup= 14.6114;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 38.8851;
            		limitesup= 15.8851;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 40.1133;
            		limitesup= 16.1514;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 41.3372;
            		limitesup= 16.9279;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 42.5569;
            		limitesup= 17.7084;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            }
            	}
            	
            	if (nsigni==0.02) {
            	nconf=98;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 5.4119;
            		limitesup= 0.0006;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 7.8241;
            		limitesup= 0.0404;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 9.8374;
            		limitesup= 0.1848;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 11.6678;
            		limitesup= 0.4294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 13.3882;
            		limitesup= 0.7519;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 15.0332;
            		limitesup= 1.1344;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 16.6224;
            		limitesup= 1.5643;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 18.1682;
            		limitesup= 2.0325;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 19.679;
            		limitesup= 2.5324;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 21.1608;
            		limitesup= 3.0591;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 22.6179;
            		limitesup= 3.6087;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 24.0539;
            		limitesup= 4.1783;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 25.4715;
            		limitesup= 4.7654;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 26.8727;
            		limitesup= 5.3682;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 28.2595;
            		limitesup= 5.9849;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 29.6332;
            		limitesup= 6.6142;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 30.995;
            		limitesup= 7.255;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 32.3462;
            		limitesup= 7.9062;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 33.6874;
            		limitesup= 8.567;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 35.0196;
            		limitesup= 9.2367;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 36.3434;
            		limitesup= 9.9145;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 37.6595;
            		limitesup= 10.6;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 38.9683;
            		limitesup= 11.2926;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 40.2703;
            		limitesup= 11.9918;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 41.566;
            		limitesup= 12.6973;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 42.8558;
            		limitesup= 13.4086;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 44.1399;
            		limitesup= 14.1254;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 45.4188;
            		limitesup= 14.8475;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 46.6926;
            		limitesup= 15.5745;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	}
            }
            	
            	if (nsigni==0.01) {
            	nconf=99;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 6.6349;
            		limitesup= 0.0002;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 9.2104;
            		limitesup= 0.0201;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 11.3449;
            		limitesup= 0.1148;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 13.2767;
            		limitesup= 0.2971;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 15.08636;
            		limitesup= 0.5543;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 16.8119;
            		limitesup= 0.8721;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 18.4753;
            		limitesup= 1.239;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 20.0902;
            		limitesup= 1.6465;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 21.666;
            		limitesup= 2.0879;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 23.2093;
            		limitesup= 2.5582;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 24.725;
            		limitesup= 3.0535;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 26.217;
            		limitesup= 3.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 27.6882;
            		limitesup= 4.1069;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 29.1412;
            		limitesup= 4.6604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 30.578;
            		limitesup= 5.2294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 31.9999;
            		limitesup= 5.8122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 33.4087;
            		limitesup= 6.4077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 34.8052;
            		limitesup= 7.0149;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 36.1908;
            		limitesup= 7.6327;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 37.5663;
            		limitesup= 8.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 38.9322;
            		limitesup= 8.8972;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 40.2894;
            		limitesup= 9.5425;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 41.6383;
            		limitesup= 10.1957;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 42.9798;
            		limitesup= 10.8563;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 44.314;
            		limitesup= 11.524;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 45.6416;
            		limitesup= 12.1982;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 46.9628;
            		limitesup= 12.8785;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 48.2782;
            		limitesup= 13.5647;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 49.5878;
            		limitesup= 14.2564;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
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
            		limiteinf=2.7055;
            		limitesup=0.0158;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf=4.6052;
            		limitesup=2.2107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            		
            		
            		case 3:
            		limiteinf= 6.2514;
            		limitesup=0.5844;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 7.7794;
            		limitesup= 1.0636;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");	
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 9.2363;
            		limitesup= 1.6103;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf=10.6446;
            		limitesup= 2.2041;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 12.017;
            		limitesup= 2.8331;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 13.3616;
            		limitesup= 3.4895;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 14.6837;
            		limitesup= 4.1682;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 15.9872;
            		limitesup= 4.8652;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 17.2750;
            		limitesup= 5.5778;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 18.5493;
            		limitesup= 6.3038;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 19.8119;
            		limitesup= 7.0415;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf=21.0641;
            		limitesup= 7.7895;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 22.3071;
            		limitesup= 8.5468;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 23.5418;
            		limitesup= 9.3122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 24.7690;
            		limitesup= 10.0852;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            	
            		
            		case 18:
            		limiteinf= 25.9894;
            		limitesup= 10.8649;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 27.2036;
            		limitesup= 11.6509;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 28.4120;
            		limitesup= 12.4426;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            	}
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 29.6151;
            		limitesup= 13.2396;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 30.8133;
            		limitesup= 14.0415;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 32.0069;
            		limitesup= 14.8480;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 33.1962;
            		limitesup= 15.6587;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 34.3816;
            		limitesup= 16.4734;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 35.5632;
            		limitesup= 17.2919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 36.7412;
            		limitesup= 18.1139;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 37.9159;
            		limitesup= 18.9392;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 39.0875;
            		limitesup= 19.7677;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	}
            	
            }
            if (nsigni==0.05) {	
            nconf=95;
            	switch (gl){
            		
            		case 1:
            		limiteinf= 3.815;
            		limitesup= 0.0039;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 5.9915;
            		limitesup= 0.1026;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 7.8147;
            		limitesup= 0.3518;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 9.4877;
            		limitesup= 0.7107;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 11.0705;
            		limitesup= 1.1455;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 12.5916;
            		limitesup= 1.6354;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 14.0671;
            		limitesup= 2.1673;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 15.5073;
            		limitesup= 2.7326;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 16.9190;
            		limitesup= 3.3251;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 18.307;
            		limitesup= 3.9403;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 19.6752;
            		limitesup= 4.5748;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            			System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 21.0261;
            		limitesup= 5.226;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 22.362;
            		limitesup= 5.8919;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 23.6848;
            		limitesup= 6.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 24.9958;
            		limitesup= 7.2609;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 26.2962;
            		limitesup= 7.9616;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 27.5871;
            		limitesup= 8.6718;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 28.8693;
            		limitesup= 9.3904;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 30.1435;
            		limitesup= 10.1170;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 31.4104;
            		limitesup= 10.8508;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 32.6706;
            		limitesup= 11.5913;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);
            		System.out.println("\n");	 
            		if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 33.9245;
            		limitesup= 12.338;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 35.1725;
            		limitesup= 13.0905;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 36.4150;
            		limitesup= 13.8484;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 37.6525;
            		limitesup= 14.6114;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 38.8851;
            		limitesup= 15.8851;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 40.1133;
            		limitesup= 16.1514;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 41.3372;
            		limitesup= 16.9279;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 42.5569;
            		limitesup= 17.7084;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	
            }
            	}
            	
            	if (nsigni==0.02) {
            	nconf=98;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 5.4119;
            		limitesup= 0.0006;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 7.8241;
            		limitesup= 0.0404;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 9.8374;
            		limitesup= 0.1848;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 11.6678;
            		limitesup= 0.4294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 13.3882;
            		limitesup= 0.7519;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 15.0332;
            		limitesup= 1.1344;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 16.6224;
            		limitesup= 1.5643;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 18.1682;
            		limitesup= 2.0325;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 19.679;
            		limitesup= 2.5324;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 21.1608;
            		limitesup= 3.0591;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 22.6179;
            		limitesup= 3.6087;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 24.0539;
            		limitesup= 4.1783;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 25.4715;
            		limitesup= 4.7654;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 26.8727;
            		limitesup= 5.3682;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 28.2595;
            		limitesup= 5.9849;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 29.6332;
            		limitesup= 6.6142;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 30.995;
            		limitesup= 7.255;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 32.3462;
            		limitesup= 7.9062;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 33.6874;
            		limitesup= 8.567;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 35.0196;
            		limitesup= 9.2367;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 36.3434;
            		limitesup= 9.9145;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 37.6595;
            		limitesup= 10.6;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 38.9683;
            		limitesup= 11.2926;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 40.2703;
            		limitesup= 11.9918;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 41.566;
            		limitesup= 12.6973;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 42.8558;
            		limitesup= 13.4086;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 44.1399;
            		limitesup= 14.1254;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 45.4188;
            		limitesup= 14.8475;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 46.6926;
            		limitesup= 15.5745;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            	}
            }
            	
            	if (nsigni==0.01) {
            	nconf=99;	
            	switch (gl){
            		
            		case 1:
            		limiteinf= 6.6349;
            		limitesup= 0.0002;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 2:
            		limiteinf= 9.2104;
            		limitesup= 0.0201;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 3:
            		limiteinf= 11.3449;
            		limitesup= 0.1148;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 4:
            		limiteinf= 13.2767;
            		limitesup= 0.2971;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 5:
            		limiteinf= 15.08636;
            		limitesup= 0.5543;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 6:
            		limiteinf= 16.8119;
            		limitesup= 0.8721;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 7:
            		limiteinf= 18.4753;
            		limitesup= 1.239;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 8:
            		limiteinf= 20.0902;
            		limitesup= 1.6465;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 9:
            		limiteinf= 21.666;
            		limitesup= 2.0879;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 10:
            		limiteinf= 23.2093;
            		limitesup= 2.5582;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 11:
            		limiteinf= 24.725;
            		limitesup= 3.0535;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 12:
            		limiteinf= 26.217;
            		limitesup= 3.5706;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 13:
            		limiteinf= 27.6882;
            		limitesup= 4.1069;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 14:
            		limiteinf= 29.1412;
            		limitesup= 4.6604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 15:
            		limiteinf= 30.578;
            		limitesup= 5.2294;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 16:
            		limiteinf= 31.9999;
            		limitesup= 5.8122;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 17:
            		limiteinf= 33.4087;
            		limitesup= 6.4077;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 18:
            		limiteinf= 34.8052;
            		limitesup= 7.0149;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 19:
            		limiteinf= 36.1908;
            		limitesup= 7.6327;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 20:
            		limiteinf= 37.5663;
            		limitesup= 8.2604;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 21:
            		limiteinf= 38.9322;
            		limitesup= 8.8972;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 22:
            		limiteinf= 40.2894;
            		limitesup= 9.5425;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 23:
            		limiteinf= 41.6383;
            		limitesup= 10.1957;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 24:
            		limiteinf= 42.9798;
            		limitesup= 10.8563;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 25:
            		limiteinf= 44.314;
            		limitesup= 11.524;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 26:
            		limiteinf= 45.6416;
            		limitesup= 12.1982;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 27:
            		limiteinf= 46.9628;
            		limitesup= 12.8785;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 28:
            		limiteinf= 48.2782;
            		limitesup= 13.5647;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            		System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
            	}
            	
            		break;
            		
            		case 29:
            		limiteinf= 49.5878;
            		limitesup= 14.2564;
            		System.out.print("		JI = "+ji+"	JIC1 = "+limitesup+" JIC2 = "+limiteinf);	 
            	System.out.println("\n");
            	
            	if (ji>limiteinf){	
       				System.out.print("           PARA VARIANZA > H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA > H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            	}
            	
            	if (ji<limitesup){	
       				System.out.print("          PARA VARIANZA < H0: SE RECHAZA H0 ");
       				System.out.println("\n");
            		}else{
            		System.out.print("          PARA VARIANZA < H0: SE ACEPTA H0 ");
            		System.out.println("\n");
            		System.out.println("\n");
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