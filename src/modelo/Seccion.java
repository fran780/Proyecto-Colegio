package modelo;

/**
 * @(#)Seccion.java
 *
 *
 * @author 
 * @version 1.00 2020/2/21
 */


public class Seccion 
{
	          private String grado;
			  public String modalidad;
			  private String jornada;
			  public String anio;
			  public Seccion (){
			  } 
			  public Seccion(String j, String g, String m, String a){
			  
				  jornada=j;
				  grado=g;
				  modalidad=m;
				  anio=a;
				  }   
		 		
		 		public String getGrado(){
	     			return grado;
			} 
			    public void setGrado(String g){                     
	           			 grado=g;
		    }	  	    
		        public String getJornada(){
		              return jornada; 
		    }
		        public void setJornada(String j){
		                  jornada=j;
		    }       
	        
	        public String toString(){
	        return "Seccion["+grado+","+modalidad+","+jornada+","+anio+"]";
	        
	        }
}
	    
	   	    	 