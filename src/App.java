public class App {
    public static void main(String[] args) throws Exception {

     trabajadores[] trab = new trabajadores[2];
     trab[0] = new trabajadorestiempocompleto("Messi", "324", 98659.34);
     trab[1] = new trabajadoremediotiempo("Goku", "824", 35 , 3);

     for (trabajadores traba: trab){
        System.out.println("trabajador" + traba.getNombre() + "salariomensual: $" + traba.calcularsalario());
     }

    }
}
