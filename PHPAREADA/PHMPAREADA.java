
//IMPLEMENTACION DE LA SOLUCION EN JAVA (CODIGO FUENTE)

import java.io.*;

public class PHMPAREADA{
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
   	   	    
   	   	    	
   	   	  System.out.print("La cantidad de datos de cada muestra es de: ");  
   	   	 	 
   	   	    int n = Integer.parseInt(ent.readLine()); 
   	   	   
   	   	  int nconf=0;
   	   	    if(nsigni==0.01){
   	   	    	nconf=99;
   	   	}
   	   	
   	   	 if(nsigni==0.02){
   	   	    	nconf=98;
   	   	}
   	   	
   	   	 
   	   	
   	   	 if(nsigni==0.05){
   	   	    	nconf=95;
   	   	}
   	   	
   	   	
   	   	
   	   	 if(nsigni==0.1){
   	   	    	nconf=90;
   	   	}  
   	   	    
   	   	    	  
   	int num = n+1;
   	int gl1= n-1;
   int gl2= n-1;
   int gl3= n-1;
   int gl4= n-1;
      double datoa[] = new double[num];
      double datob[] = new double[num]; 
      double diferenciac[]= new double[num];
      double diferencia[]= new double[num];
      
      double suma =0;
     
      double sumad=0;
      System.out.println("\n");
     
         for(int i=1; i < num; i++){
      
     System.out.print("Registra de la MUESTRA A el DATO["+i+"]=");
     datoa[i] = Double.parseDouble(ent.readLine());
     
     System.out.print("Registra de la MUESTRA B el DATO["+i+"]=");
     datob[i] = Double.parseDouble(ent.readLine());
     
     
     
            	     diferencia[i] = datob[i] - datoa[i];
            	     diferenciac[i] = Math.pow(diferencia[i], 2);
            	     sumad= sumad+diferenciac[i];
            	     suma= suma + diferencia[i];
            	     
      }
      System.out.println("\n");
      
	
			    double var=(n*sumad - Math.pow(suma, 2))/(n*(n-1));
			    
			    double desv = (Math.sqrt(var));
            	 double media=suma/n;    
      
      System.out.println("\n");
  	   
               	
            	
            	System.out.print("LA DESVIACION ES DE "+desv);
            	System.out.println("\n"); 
            	System.out.print("LA MEDIA ES DE "+media); 
            	
            	double radical=desv/Math.sqrt(n);
            	
            	double t;
            	
            	t=media/radical;
            	
            	double tc;
            		double tr;
            	
            	if (nconf==90) {
            		
            		
            	switch (gl1){
            		
            		case 1:
            		tc=6.314;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            	
            	
            		
            		
            		case 2:
            		tc=2.92;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 3:
            		tc=2.353;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		
            		case 4:
            		tc=2.132;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 5:
            		tc=2.015;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		
            		
            		
            		case 6:
            		tc=1.943;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 7:
            		tc=1.895;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 8:
            		tc=1.86;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 9:
            		tc=1.833;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 10:
            		tc=1.812;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 11:
            		tc=1.796;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 12:
            		tc=1.782;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 13:
            			tc=1.771;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 14:
            		tc=1.761;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 15:
            		tc=1.753;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 16:
            		tc=1.746;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 17:
            		tc=1.74;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 18:
            		tc=1.734;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 19:
            		tc=1.729;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 20:
            		tc=1.725;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 21:
            		tc=1.721;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 22:
            		tc=1.717;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 23:
            		tc=1.714;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 24:
            		tc=1.711;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 25:
            		tc=1.708;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 26:
            		tc=1.706;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 27:
            		tc=1.703;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 28:
            		tc=1.701;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 29:
            		tc=1.699;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            	}
            	
            }
            if (nconf==95) {	
            	switch (gl2){
            		
            		case 1:
            		tc=12.706;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 2:
            	tc=4.303;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 3:
            		tc=3.182;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 4:
            		tc=2.776;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 5:
            		tc=2.571;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 6:
            		tc=2.447;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 7:
            		tc=2.365;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 8:
            			tc=2.306;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 9:
            			tc=2.262;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 10:
            			tc=2.228;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 11:
            			tc=2.201;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 12:
            			tc=2.179;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 13:
            			tc=2.16;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 14:
            			tc=2.145;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 15:
            			tc=2.131;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 16:
            			tc=2.12;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 17:
            			tc=2.11;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 18:
            			tc=2.093;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 19:
            			tc=2.093;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 20:
            			tc=2.086;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 21:
            			tc=2.080;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 22:
            			tc=2.074;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 23:
            			tc=2.069;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 24:
            			tc=2.064;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 25:
            			tc=2.06;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 26:
            			tc=2.056;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 27:
            			tc=2.052;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 28:
            			tc=2.058;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 29:
            			tc=2.045;																																																																																																																																															
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            	
            }
            	}
            	
            	if (nconf==98) {
            	switch (gl3){
            		
            		case 1:
            			tc=31.821;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 2:
            			tc=6.965;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 3:
            		tc=4.541;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 4:
            		tc=3.747;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		case 5:
            		tc=3.365;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 6:
            		tc=3.143;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 7:
            		tc=2.998;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 8:
            		tc=2.869;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 9:
            		tc=2.821;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 10:
            	tc=2.764;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 11:
            		tc=2.718;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 12:
            		tc=2.681;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 13:
            		tc=2.65;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 14:
            		tc=2.624;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 15:
            		tc=2.602;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 16:
            	tc=2.583;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 17:
            		tc=2.567;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 18:
            		tc=2.552;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 19:
            		tc=2.539;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 20:
            		tc=2.528;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 21:
            		tc=2.518;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 22:
            		tc=2.508;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 23:
            		tc=2.5;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 24:
            		tc=2.492;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 25:
            		tc=2.485;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 26:
            		tc=2.479;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 27:
            		tc=2.473;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 28:
            		tc=2.467;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 29:
            		tc=2.462;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            	}
            }
            	
            	if (nconf==99) {
            	switch (gl4){
            		
            		case 1:
            		tc=63.656;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 2:
            		tc=9.925;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 3:
            		tc=5.841;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 4:
            		tc=4.604;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 5:
            		tc=4.032;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 6:
            	tc=3.707;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 7:
            		tc=3.499;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 8:
            		tc=3.355;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 9:
            		tc=3.25;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 10:
            		tc=3.169;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 11:
            		tc=3.106;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 12:
            		tc=3.055;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 13:
            		tc=3.012;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 14:
            		tc=3.977;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 15:
            		tc=2.947;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 16:
            		tc=2.921;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 17:
            		tc=2.898;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 18:
            		tc=2.878;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 19:
            		tc=2.861;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 20:
            		tc=2.845;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 21:
            		tc=2.831;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 22:
            		tc=2.819;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 23:
            		tc=2.807;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 24:
            		tc=2.797;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 25:
            		tc=2.787;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 26:
            		tc=2.779;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 27:
            		tc=2.771;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 28:
            		tc=2.763;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            		
            		case 29:
            		tc=2.756;
       
            		System.out.println("\n");	 
            		System.out.print("EL VALOR DE t: "+t+"   "+"EL VALOR DE tc: "+tc);
            		
            			if (t<0){
            		tr=-tc;
            	
            	if (t<tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	
            	if (t>0){
            	tr=tc;	
            	if (t>tr){
            		System.out.println("\n");		 
            		System.out.print("SE RECHAZA Ho:");
            		
            	}else{
            		System.out.println("\n");
            		System.out.print("SE ACEPTA Ho:");
            	}
            	
            	}
            	break;
            	}	
   	   	  	   		
   	   	  	   	}	
   	   	  	   
   	   	  	   	
   	   	  			}catch(Exception e) {
   	   	 		
   	                   System.out.println(e.getMessage());
   	                
   	                }
   	          System.out.println("\n");	      
   	          
   	          System.out.println("\n");	
   	          
		}
		}