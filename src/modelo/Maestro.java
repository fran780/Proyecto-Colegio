package modelo;

/**
 * @(#)Maestro.java
 *
 *
 * @author 
 * @version 1.00 2020/3/2
 */


public class Maestro extends Persona 
{
		private String usuarioSace;
		private String telefono;
		private String correoElectronico;
		public Maestro(){
		}
		public Maestro(String u, String t, String c){
		
		usuarioSace=u;
		telefono=t;
		correoElectronico=c;
		}
		
		public String getUsuarioSace(){
		     return usuarioSace;
		}

		public void setUsuarioSace(String u){ usuarioSace=u;}
		 
		public String getTelefono(){
		    return telefono;
		}
		
		public void setTelefono(String t){
		         telefono=t;
		}
		
		public String getCorreoElectronico(){
		    return correoElectronico;
		}
		
		public void setCorreoElectronico(String c){
		       correoElectronico=c;
		}
		
		public String toString(){
	    return "Maestro["+usuarioSace+","+telefono+","+correoElectronico+"]";
		
		}  
    
    
}