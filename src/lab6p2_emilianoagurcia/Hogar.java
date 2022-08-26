/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_emilianoagurcia;

/**
 *
 * @author emili
 */
public class Hogar extends Objeto{
    String DescripcionHogar;//A que lugar de la casa pertenece: Sala, Comedor, Baño, Cocina, etc.
    String Instrucciones;//Instrucciones de funcionamiento
    int Garantia;//Tiempo de garantia

    public Hogar(String DescripcionHogar, String Instrucciones, int Garantia, Persona Usuario, java.awt.Color Color, String Descripcion, String Marca, int Size, String Calidad) {
        super(Usuario, Color, Descripcion, Marca, Size, Calidad);
        this.DescripcionHogar = DescripcionHogar;
        this.Instrucciones = Instrucciones;
        this.Garantia = Garantia;
    }

    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getInstrucciones() {
        return Instrucciones;
    }

    public void setInstrucciones(String Instrucciones) {
        this.Instrucciones = Instrucciones;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    public Persona getUsuario() {
        return Usuario;
    }

    public void setUsuario(Persona Usuario) {
        this.Usuario = Usuario;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color Color) {
        this.Color = Color;
    }

    public String getDescripcionHogar() {
        return DescripcionHogar;
    }

    public void setDescripcionHogar(String DescripcionHogar) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }
    
    
}
