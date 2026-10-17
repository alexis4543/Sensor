//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Sensor stemperatura= new Sensor();
Sensor spresion= new Sensor();
Sensor shumedad= new Sensor();


    stemperatura.setNombre("Sensor 1");
    stemperatura.setTipo("Temperatura");
    stemperatura.setLectura(25.0);
    stemperatura.setUnidad("ºC");

    spresion.setNombre("Sensor 2");
    spresion.setTipo("Presión");
    spresion.setLectura(2.5);
    spresion.setUnidad("Bares");


    shumedad.setNombre("Sensor 3");
    shumedad.setTipo("Humedad");
    shumedad.setLectura(35);
    shumedad.setUnidad("%");

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
