package AV1.Q6;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca,
                 String modelo,
                 int ano,
                 int numeroPortas) {

        super(marca, modelo, ano);

        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                "Marca: " + getMarca() +
                        "\nModelo: " + getModelo() +
                        "\nAno: " + getAno() +
                        "\nPortas: " + numeroPortas
        );

    }
}
