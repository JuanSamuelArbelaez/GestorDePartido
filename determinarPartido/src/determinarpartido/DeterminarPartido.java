package determinarpartido;

import javax.swing.JOptionPane;

public class DeterminarPartido
{
    public static int leerInt(String mensaje)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static String leerString(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static void imprimirMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void determinarPartido(int g1, int g2, String eq1, String eq2)
    {
        if(g1>g2)
        {
            imprimirMensaje(eq1+" ganó el partido");
        }
        else if(g1<g2)
        {
            imprimirMensaje(eq2+" ganó el partido");
        }
        else
        {
            imprimirMensaje(eq1+" y "+eq2+" empataron");
        }
    }
    
    public static void main(String[] args)
    {
        int g1, g2;
        String eq1, eq2;
        
        eq1=leerString("Ingrese el nombre del equipo 1: ");
        g1=leerInt("Ingrese los goles anotados por "+eq1+": ");
        eq2=leerString("Ingrese el nombre del equipo 2: ");
        g2=leerInt("Ingrese los goles anotados por "+eq2+": ");
        
        determinarPartido(g1, g2, eq1, eq2);
    }
}