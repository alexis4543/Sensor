public class Sensor {

    private String nombre;
    private double lectura;
    private String tipo;
    private String unidad;


    //AÑADIMOS LOS METODOS SET
    public void setNombre(String nombre){
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede ser nulo ni un espacio en blanco");
        }else{
            this.nombre=nombre;
        }
       }

    public void setLectura(double lectura){
        this.lectura=lectura;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setUnidad(String unidad){
        this.unidad=unidad;
    }

    //AÑADIMOS LOS METODOS GET

    public String getNombre(){
        return nombre;
    }

    public double getLectura(){
        return lectura;
    }

    public String getTipo(){
        return tipo;
    }

    public String getUnidad(){
        return unidad;
    }



    public void mostrarInformacion(){
        System.out.println("El nombre del sensor es: "+nombre);
        System.out.println("El unidad del sensor es: "+unidad);
        System.out.println("La lectura del sensor es: "+lectura+" "+unidad);
        System.out.println("El tipo de sensor es: "+tipo);

    }
    public void actualizarLectura(double nuevaLectura){
        this.lectura = nuevaLectura;
        System.out.println("----ACTUALIZANDO NUEVA LECTURA----");
        System.out.println("La lectura actual del sensor es: "+lectura+" "+unidad);
    }
    void mostrarLectura(){
        System.out.println("La lectura del sensor es: "+lectura+" "+unidad);
    }
    void reiniciarLectura(){
        this.lectura = 0.0;
        System.out.println("-----REINICIANDO SENSOR-----");
        System.out.println("El sensor "+nombre+" ha sido reiniciado correctamente ");
    }
}
