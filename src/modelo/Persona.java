package modelo;

/**
 * @(#)Persona.java
 *
 *
 * @author 
 * @version 1.00 2020/3/2
 */


public class Persona 
{
		protected String nombre;
		protected String apellidos;
		protected Integer edad;
		protected String direccion;
		protected String genero;
		public Persona(){
		}
		public Persona(String n, String a, Integer e, String d, String g){
		
		nombre=n;
		apellidos=a;
		edad=e;
		direccion=d;
		genero=g;
		}   
			
	      public String getNombre(){
	          return nombre;
	      }
	      
	      public void setNombre(String n){
	               nombre=n;           
	      }
	      
	      public String getApellidos(){
	            return apellidos;
	      }
	      
	      public void setApellidos(String a){
	            apellidos=a;
	      }
	      
	      public Integer getEdad(){
	          return edad;
	      }
	      
	      public void setEdad(Integer e){
	               edad=e;
	      }
	      
	      public String getDireccion(){
	           return direccion;
	      }
	      
	      public void setDireccion(String d){
	               direccion=d;
	      }
	      
	      public String getGenero(){
	           return genero;
	      }
	      
	      public void setGenero(String g){
	                genero=g; 
	      }
	      
	      public String toString(){
	      return "Persona["+nombre+","+apellidos+","+edad+","+direccion+","+genero+"]";
	     
	      }
	      	         
}