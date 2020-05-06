/**
 * @(#)PruebaObjetos.java
 *
 *
 * @author 
 * @version 1.00 2020/2/25
 */
import modelo.*;

import java.util.List;
import java.util.ArrayList;
public class PruebaObjetos {
        
    
    public static void main(String[] args) {
   
    
 
      Seccion objeto1=new Seccion();
      objeto1.setGrado("12");
      objeto1.setJornada("Vespertina");
      objeto1.modalidad="BTPI";
      objeto1.anio="2020";
      System.out.println(objeto1);
      
      Asignatura objeto2=new Asignatura();
      objeto2.setNombre("Matematicas");
      objeto2.setAlias("Mat");
      objeto2.setCodigo(356);
      System.out.println(objeto2);
      
      Aula objeto3=new Aula();
      objeto3.setAncho(29.2);
      objeto3.setAlto(24.6);
      objeto3.setLargo(30.8);
      objeto3.setColor("Azul");
      objeto3.setUbicacion("Al lado de consejeria");
      System.out.println(objeto3);
      
      Seccion objeto4=new Seccion("Vespertina", "11" ,"BTPI", "2020");
      System.out.println(objeto4);
      
      Asignatura objeto5=new Asignatura("Espa�ol","Esp", 777 );
      System.out.println(objeto5);
      
      Aula objeto6=new Aula(29.2, 24.6, 30.8, "Rojo" , "Al lado de consejeria");  
      System.out.println(objeto6);
      
      Alumno objeto7=new Alumno();
      objeto7.setNombre("Jorge");
      objeto7.setApellidos("Guzman Sosa");
      objeto7.setEdad(18);
      objeto7.setDireccion("Barrio San Juan Bautista");
      objeto7.setGenero("Masculino");
      objeto7.setEncargado("Padre");
      objeto7.setSeccion(objeto1);
      objeto7.setTelefono("94502780");
      System.out.println(objeto7);
      
      Maestro objeto8=new Maestro();
      objeto8.setNombre("Antonio");
      objeto8.setApellidos("Gomez Nu�ez");
      objeto8.setEdad(29);
      objeto8.setDireccion("Barrio Suyapa");
      objeto8.setGenero("Masculino");
      objeto8.setUsuarioSace("0105200400334");
      objeto8.setTelefono("94980769");
      objeto8.setCorreoElectronico("francisco45@yahoo.com");
      System.out.println(objeto8);
      
      Alumno objeto9=new Alumno();
      objeto9.setNombre("Sandra");
      objeto9.setApellidos("Orellana Gaitan");
      objeto9.setEdad(24);
      objeto9.setDireccion("Barrio El Birrinche");
      objeto9.setGenero("Femenino");
      objeto9.setEncargado("Madre");
      objeto9.setSeccion(objeto1);
      objeto9.setTelefono("97502780");
      System.out.println(objeto9);
      
      Alumno objeto10=new Alumno();
      objeto10.setNombre("Sergio");
      objeto10.setApellidos("Ramos Garcia");
      objeto10.setEdad(35);
      objeto10.setDireccion("Barrio El Carmen");
      objeto10.setGenero("Masculino");
      objeto10.setEncargado("Tio");
      objeto10.setSeccion(objeto1);
      objeto10.setTelefono("92089078");
      System.out.println(objeto10);
      
      Alumno objeto11=new Alumno();
      objeto11.setNombre("Francisco");
      objeto11.setApellidos("Roman Alarcon");
      objeto11.setEdad(22);
      objeto11.setDireccion("Barrio San Antonio");
      objeto11.setGenero("Masculino");
      objeto11.setEncargado("Abuelo");
      objeto11.setSeccion(objeto1);
      objeto11.setTelefono("88254038");
      System.out.println(objeto11);
      
      List<Alumno>misAlumnos=new ArrayList<Alumno>();
      
      misAlumnos.add(objeto7);
      
      misAlumnos.add(objeto9);
      
      misAlumnos.add(objeto10);
      
      misAlumnos.add(objeto11);
      
      misAlumnos.get(0).getNombre();
     
      misAlumnos.get(0).setApellidos("Perez");  
      }	
}

           
 
 