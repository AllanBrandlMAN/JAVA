
 class Carro {
    public void acelerar(){
        System.out.println("O carro esta acelerando");
    }
    
}


//Sub classe Fusca

class Fusca extends Carro {
    @Override
    public void acelerar(){
        System.out.println("O Fusca acelara lentamente, Vrummm! ");
    }
}

//Subclasse

class Gol extends Carro{
    @Override
    public void acelerar(){
        System.out.println("O Gol acelara com potencia, Vrummm! ");

    }
}

class Jetta extends Carro{
    @Override
    public void acelerar(){
        System.out.println("O Jetta  acelara rapidamente, Vrummm! ");
    }
}


//Classe principal para testa o poliformismo

public class Main2 {
    public static void main(String[] args) {
// Criando um array de carros
    Carro[] carros = new Carro[3];
    carros[0] = new Fusca();
    carros[1] = new Gol();
    carros[2] = new Jetta();

//chamando o metodo acelerar() para cada carro

        for(Carro carro : carros ){
        carro.acelerar(); //polimorfismo em acao
        }
    }
}

