package modelo;

/**
 * @(#)Alumno.java
 *
 *
 * @author 
 * @version 1.00 2020/3/2
 */


public class Alumno extends Persona 
{
		private Seccion seccion;
		private String encargado;
		private String telefonoEncargado;
		public Alumno(){
		}
		public Alumno(Seccion s, String e, String t){
		
		seccion=s;
		encargado=e;
		telefonoEncargado=t;
		}  	
	
          public Seccion getSeccion(){
              return seccion;
          }
          
          public void setSeccion(Seccion s){
                   seccion=s;
          }
          
          public String getTelefono(){
           return telefonoEncargado;
          
          }
          
          public void setTelefono(String t){
                telefonoEncargado=t;
          }
         
          public String getEncargado(){
               return encargado;     
          }
          
          public void setEncargado(String e){
                   encargado=e;
          }
     
          public String toString(){
	      return "Alumno["+seccion+","+encargado+","+telefonoEncargado+"]";
	      
	      }    
    
    
}