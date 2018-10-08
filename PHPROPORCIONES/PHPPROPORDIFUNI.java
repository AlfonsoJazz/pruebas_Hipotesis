
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class PHPPROPORDIFUNI{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de intentos1 es de: ");  
   	   	 	 
   	   	    double n1 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La cantidad de EXITOS1 es = ");
     double x1 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
     
   	  System.out.print("La cantidad de intentos2 es de: ");  
   	   	 	 
   	   	    double n2 = Integer.parseInt(ent.readLine()); 
   	   	    
   	   	  
   	   	    
   	   	    
   	   	    System.out.print("La cantidad de EXITOS2 es = ");
     double x2 = Double.parseDouble(ent.readLine()); 
   	   	    
   	   	   
         
      System.out.println("\n");
   
			   
			    double p1=x1/n1;	   
   	   	  	   
   	   	  	double p2=x2/n2;
   	   	  	double pt=(x1+x2)/(n1+n2);
   	   	  	double qt=1-pt;
   	   	  
   	   	  double radical=Math.sqrt((pt)*(qt)*((1/n1)+(1/n2)));
   	   	  
   	   	  
         
      System.out.println("\n");
   	   	
           		
            	 System.out.println("\n");
   	   	
            		
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
   	   	
   	   	     
      System.out.println("\n");
   
   	   	
   	   	  double z;
   	   	  double zr;
         double zc;
      System.out.println("\n");
   	   	
            		
            	switch (nconf){
            			
            		
            		case 90:
            		zc=1.2816;
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            	
            	
            		case 91:
            		zc=1.3408;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            		
            		
            		
            	case 92:
            		zc=1.4051;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;	
            		
            		
            		
            		
            		
            		
            		case 93:
            		zc=1.4758;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            		
            		
            		case 94:
            		zc=1.5548;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            		
            		
            		
            		case 95:
            		zc=1.6449;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            	
            	case 96:
            		zc=1.7507;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            	
            	
            	
            			
            		case 97:
            		zc=1.8808;
            		
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            		
            		case 98:
            		zc=2.0537;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	break;
            		
            		
            		
            		
            		case 99:
            		zc=2.3263;
            			
            		z=(p1-p2)/radical;
            		System.out.print("EL VALOR DE Z: "+z+"   "+"EL VALOR DE Zc: "+zc);
            		if (z<0){
            		zr=-zc;
            	
            	if (z<zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
            	}
            	
            	}
            	
            	
            	
            	if (z>0){
            	zr=zc;	
            	if (z>zr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho: ");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho: ");
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