//Classe abstrata Veiculo

abstract class Veiculo{
    protected double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }
//Metodo Abstrato
    public abstract void transportar();

//Metodo para obter a carga maxima
    public double getcargaMaxima(){
        return cargaMaxima;
    }
}


// subclasse caminhao
class Caminhao extends Veiculo{
    public Caminhao(double cargaMaxima){
        super(cargaMaxima);
    }

    @Override    
    public void transportar(){
        System.out.println("Transportando carga com caminhao. Carga maxima: "+cargaMaxima + "kg.");
    }
}

//Subclasse Van
class Van extends Veiculo{
    public Van(double cargaMaxima){
        super(cargaMaxima);
    }
    @Override
    public void transportar(){
        System.out.println("Transportando carga com caminhao. Carga maxima: "+cargaMaxima + "kg.");
    }           

}

//Classe Principal

public class Main3 {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao(10000);
        Veiculo van = new Van(2000);

        caminhao.transportar();
        van.transportar();
}


}




