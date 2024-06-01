public abstract class trabajadores {
    private String Nombre;
    private String nueroidentificación;

    public trabajadores(String Nombre, String numeroidentificación){
        this.Nombre = Nombre;
        this.nueroidentificación = numeroidentificación;
    }
   public String getNombre(){
    return Nombre;
   }
  
   public String getnumeroidentificación(){
    return nueroidentificación;
   }

   public  abstract double calcularsalario();

}
