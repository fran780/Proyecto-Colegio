package modelo;

/**
 * @(#)Aula.java
 *
 *
 * @author 
 * @version 1.00 2020/2/24
 */


public class Aula 
{

			 private Double ancho;
			 private Double alto;
			 private Double largo;
			 private String color;
			 private String ubicacion; 
			 public Aula(){
			 }
			
			 public Aula(Double a, Double d , Double l, String c, String u){
			 
			 ancho=a;
			 alto=d;
			 largo=l;
			 color=c;
			 ubicacion=u;
			 } 
               
               public Double getAncho(){
                    return ancho;
              }
             
               public void setAncho(Double a){
                        ancho=a;
              }    
              
               public Double getAlto(){
                    return alto;
              }
              
              public void setAlto(Double a){
                       alto=a;
              }
              
              public Double getLargo(){
                   return largo;      
              }
              
              public void setLargo(Double l){
                       largo=l;
              }
              
              public String getColor(){
                   return color;
              }
              
              public void setColor(String c){
                       color=c;
              }
              public String getUbicacion(){
                   return ubicacion;
              }
              
              public void setUbicacion(String u){
                       ubicacion=u;
              } 
              
              public String toString(){
              return "Aula["+ancho+","+alto+","+largo+","+color+","+ubicacion+"]"; 
              
              }              
}              
   
   
   
    
          