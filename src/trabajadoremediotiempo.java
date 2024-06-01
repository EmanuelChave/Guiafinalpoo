public class trabajadoremediotiempo extends trabajadores {
    private double salarioPorhora;
    private int horasTrabajadasPorSemana;

    public trabajadoremediotiempo(String Nombre, String nueroidentificación, double salarioPorhora, int horasTrabajadasPorSemana){
        super(Nombre, nueroidentificación);
        this.salarioPorhora = salarioPorhora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularsalario(){
        return salarioPorhora * horasTrabajadasPorSemana * 4; // salario mensual
    }

}