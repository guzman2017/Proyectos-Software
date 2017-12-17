/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresG
 */
public class VideoMedia  extends Media{

    @Override
    void printInfo() {
        System.out.println("Esto es un Video, y su nombre es: "+ getNombre()+ " Y la duracion es: " + getDuracion());
        
    }
    
}
