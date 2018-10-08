
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class PHMNORMALBI{
		public double inversion;
  
   	int num;		
    
	public static void main(String []args){	 
	
		 BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
   	   	  try{
   	   	  	System.out.println("\n");	
   	   	  	  
   	   	  	    
   	   	  	   	System.out.println("\n");	   	   	  	   	
   	   	  	   		
   	   	  System.out.println("\n");	 	    
   	   	  
   	   	  
   	     System.out.print("El NIVEL DE SIGNIFICANCIA es de: ");
   	     
   	   	    double nsigni = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de datos de la muestra a es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	    System.out.print("La media poblacional es de: ");  
   	   	 	 
   	   	    int mediap = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	 int nconf=0;
   	   	    if(nsigni==0.01){
   	   	    	nconf=99;
   	   	}
   	   	
   	   	 if(nsigni==0.02){
   	   	    	nconf=98;
   	   	}
   	   	
   	   	 if(nsigni==0.03){
   	   	    	nconf=97;
   	   	}
   	   	
   	   	 if(nsigni==0.04){
   	   	    	nconf=96;
   	   	}
   	   	
   	   	 if(nsigni==0.05){
   	   	    	nconf=95;
   	   	}
   	   	
   	   	 if(nsigni==0.06){
   	   	    	nconf=94;
   	   	}
   	   	
   	   	 if(nsigni==0.07){
   	   	    	nconf=93;
   	   	}
   	   	
   	   	 if(nsigni==0.08){
   	   	    	nconf=92;
   	   	}
   	   	
   	   	 if(nsigni==0.09){
   	   	    	nconf=91;
   	   	}
   	   	
   	   	 if(nsigni==0.1){
   	   	    	nconf=90;
   	   	}
   	   	
   	   	    System.out.print("Registra la MEDIA de la MUESTRA= ");
     double media = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     System.out.print("Registra la DESVIACION de la MUESTRA= ");
     double desv = Double.parseDouble(ent.readLine());
   	 
         
      System.out.println("\n");
   
   	   	  	
   	   	  double radical=desv/Math.sqrt(n);
   	   	  
   	   	  double z;
   	   	  double zr;
         double zc;
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            			
            		
            		case 90:
            		zc=1.6696;
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            	
            	
            		case 91:
            		zc=1.6954;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            		
            		
            		
            	case 92:
            		zc=1.7507;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;	
            		
            		
            		
            		
            		
            		
            		case 93:
            		zc=1.8119;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            		
            		
            		case 94:
            		zc=1.8808;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            		
            		
            		
            		case 95:
            		zc=1.96;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            	
            	case 96:
            		zc=2.0537;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            	
            	
            	
            			
            		case 97:
            		zc=2.1701;
            		
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            		
            		case 98:
            		zc=2.3263;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
            		
            		
            		
            		
            		case 99:
            		zc=2.5758;
            			
            		z=(media-mediap)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: "+mediap);
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: "+mediap);
            	}
            	
            	}
            	break;
   	   	  	   
   	   	  	   }	 
   	   	  
   	   	  		}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}