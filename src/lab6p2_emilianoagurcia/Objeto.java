/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_emilianoagurcia;

import java.awt.Color;

/**
 *
 * @author emili
 */
public class Objeto {
    Persona Usuario;//Quien ingreso al sistema
    Color Color;
    String Descripcion;
    String Marca;
    int Size;
    String Calidad;

    public Objeto(Persona Usuario, Color Color, String Descripcion, String Marca, int Size, String Calidad) {
        this.Usuario = Usuario;
        this.Color = Color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Size = Size;
        this.Calidad = Calidad;
        
    }
    
    
}
