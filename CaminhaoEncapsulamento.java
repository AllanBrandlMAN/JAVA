public class CaminhaoEncapsulamento {

    private String modelo;
    private double capacidadeCarga;

    // Construtor
    public CaminhaoEncapsulamento(String modelo, Double capacidadeCarga) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    // Metodos publicos para acessar os dados

    public String getModelo() {

        return modelo;
    }

    public double getcapacidadeCarga() {

        return capacidadeCarga;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {

        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga nao pode ser negativa");
        }
        this.capacidadeCarga = capacidadeCarga;
    }



// Metodo principal

public static void main(String[] args) {
// criando um objeto caminhao
CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("Volvo FH ", 25.5);

//Exibindo dados caminhoes
System.out.println("Modelo: " + caminhao.getModelo());
System.out.println("Capacidade de Carga: " + caminhao.getcapacidadeCarga() + " toneladas");


//Atualizando os dados do caminhao

caminhao.setModelo("Scania R450");
caminhao.setCapacidadeCarga( 30.0);

//Exibindo os dados atualizados

System.out.println("Modelo atualizado: " + caminhao.getModelo());
System.out.println("Capacidade de Carga atualizada: " + caminhao.getcapacidadeCarga() + " toneladas");


    }
}