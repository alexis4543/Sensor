//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Sensor stemperatura= new Sensor();
Sensor spresion= new Sensor();
Sensor shumedad= new Sensor();


    stemperatura.nombre="Sensor 1";
    stemperatura.tipo="Temperatura";
    stemperatura.lectura=25.0;
    stemperatura.unidad="ºC";

    spresion.nombre="Sensor 2";
    spresion.tipo="Presión";
    spresion.lectura=2.5;
    spresion.unidad="Bares";


    shumedad.nombre="Sensor 3";
    shumedad.tipo="Humedad";
    shumedad.lectura=35.0;
    shumedad.unidad="%";

    System.out.println("----INFORMACIÓN SENSOR TEMPERATURA----");
    stemperatura.mostrarInformacion();
    stemperatura.reiniciarLectura();
    stemperatura.mostrarLectura();
    System.out.println();

    System.out.println("----INFORMACIÓN SENSOR PRESION----");
    spresion.mostrarInformacion();
    System.out.println();


    System.out.println("----INFORMACIÓN SENSOR HUMEDAD----");
    shumedad.mostrarInformacion();
    shumedad.actualizarLectura(60);

    System.out.println();
}
