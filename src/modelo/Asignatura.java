package modelo;

/**
 * @(#)Asignatura.java
 *
 *
 * @author 
 * @version 1.00 2020/2/21
 */


public class Asignatura 
{			
			private String nombre;
			private String alias;
			private Integer codigo;
    		public Asignatura(){
            }
            
            public Asignatura(String n, String a, Integer c){
            
            nombre=n;
            alias=a;
            codigo=c;
            }
            
            public void setNombre (String n){
                      nombre=n;
            }
   		    
   		    public String getNombre(){
   		         return nombre;
   		    }    
            
            public void setAlias(String a){
                     alias=a;
            } 
            
            public String getAlias(){
                 return alias;
            } 
            	
           	public void setCodigo(Integer c){
           	          codigo=c;
           	}
            	
            public Integer getCodigo(){
                   return codigo;
            }	
            
            public String toString(){
            return "Asignatura["+codigo+","+nombre+","+alias+"]";
           
            }	          
}           	
            	