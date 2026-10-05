public class Sensor {

    public String nombre;
    public double lectura;
    String tipo;
    String unidad;

    public void mostrarInformacion(){
        System.out.println("El nombre del sensor es: "+nombre);
        System.out.println("El unidad del sensor es: "+unidad);
        System.out.println("La lectura del sensor es: "+lectura+" "+unidad);
        System.out.println("El tipo de sensor es: "+tipo);

    }
    public void actualizarLectura(double nuevaLectura){
        lectura = nuevaLectura;
        System.out.println("----ACTUALIZANDO NUEVA LECTURA----");
        System.out.println("La lectura actual del sensor es: "+lectura+" "+unidad);
    }
    void mostrarLectura(){
        System.out.println("La lectura del sensor es: "+lectura+" "+unidad);
    }
    void reiniciarLectura(){
        lectura = 0.0;
        System.out.println("-----REINICIANDO SENSOR-----");
        System.out.println("El sensor "+nombre+" ha sido reiniciado correctamente ");
    }
}
