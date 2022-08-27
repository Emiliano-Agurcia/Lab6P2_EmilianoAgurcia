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
    String Size;
    String Calidad;

    public Objeto(Persona Usuario, Color Color, String Descripcion, String Marca, String Size, String Calidad) {
        this.Usuario = Usuario;
        this.Color = Color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Size = Size;
        this.Calidad = Calidad;
        
    }

    public Persona getUsuario() {
        return Usuario;
    }

    public void setUsuario(Persona Usuario) {
        this.Usuario = Usuario;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }
    
    
}
