/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaniz_tp8;


public class Alaniz_tp8 {

    
    public static void main(String[] args) {
      
        Materia ingles = new Materia(01 ,"Ingles", 1);
        Materia matematica = new Materia(02,"Matematica",1);
        Materia laboratorio = new Materia(03, "Laboratorio", 1);
    
        Alumno numero1 = new Alumno(1001, "Lopez", "Martin");
        Alumno numero2 = new Alumno(1002, "Martinez", "Brenda");
        
        numero1.agregarMaterias(ingles);
        numero1.agregarMaterias(matematica);
        numero1.agregarMaterias(laboratorio);
        
        numero2.agregarMaterias(ingles);
        numero2.agregarMaterias(matematica);
        numero2.agregarMaterias(laboratorio);
        numero2.agregarMaterias(laboratorio);
        
        numero1.cantidadMaterias();
        numero2.cantidadMaterias();
        
        System.out.println("Martin tiene esta cantidad de materias: "+numero1.cantidadMaterias()+"\n"+"Brenda tiene esta cantidad de materias: "+numero2.cantidadMaterias());
    
        //a: Porque el metodo agregarMaterias por dentro se maneja con una lista Set, que no deja agregar a los elementos repetidos a su lista.
        //b: Se creo una lista Hashset para poder agregar materias desordenadamente (pero) NO repetidas. El ID y el año ayuda a no repetir la materia tambien.
    
    
    }
    
}
