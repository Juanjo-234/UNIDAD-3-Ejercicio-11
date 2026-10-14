//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
LibretaCalificaciones libretaCalificaciones = new LibretaCalificaciones("JUAN PEREZ");

System.out.println("Nombre del alumno: " + libretaCalificaciones.getNombre());

libretaCalificaciones.agregarNota(7.5);
libretaCalificaciones.agregarNota(9.0);
libretaCalificaciones.agregarNota(10.0);
libretaCalificaciones.agregarNota(8.76);
libretaCalificaciones.agregarNota(8.0);

System.out.println("Promedio final: " + libretaCalificaciones.obtenerPromedio());
}
