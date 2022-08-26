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
public class Zapato extends Objeto{
    String Talla;//XS, S, M, L, XL
    String DescripcionSuela;
    int Comodidad;//1-10

    public Zapato(String Talla, String DescripcionSuela, int Comodidad) {
        this.Talla = Talla;
        this.DescripcionSuela = DescripcionSuela;
        this.Comodidad = Comodidad;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getDescripcionSuela() {
        return DescripcionSuela;
    }

    public void setDescripcionSuela(String DescripcionSuela) {
        this.DescripcionSuela = DescripcionSuela;
    }

    public int getComodidad() {
        return Comodidad;
    }

    public void setComodidad(int Comodidad) {
        this.Comodidad = Comodidad;
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

    @Override
    public String toString() {
        return "Zapato{" + "Talla=" + Talla + ", DescripcionSuela=" + DescripcionSuela + ", Comodidad=" + Comodidad + '}';
    }
    
    
}
