void main() {

    String inicio = """
            
         --------------
       =               =  
       =  balança IMC  =
       =               =
        ----------------

            """;

    IO.println(inicio);
    String nome = IO.readln("Digite seu nome: ");
    char genero = IO.readln(
        "Digite seu genero (M) MASCULINO (F) FEMININO (N) PREFIRO NÃO INFORMAR: "
    ).charAt(0);
    String pesoStr = IO.readln("Digite seu peso: ");
    double peso = Double.valueOf(pesoStr.replace(",", "."));
    String alturaStr = IO.readln("Digite sua altura: ");
    double altura = Double.valueOf(alturaStr.replace(",", "."));
    double imc = peso / (altura * altura);
    String classificacao = "";
    switch (genero) {

        case 'm':
        case 'M':
            IO.println("Gênero selecionado: Masculino");
            break;

        case 'f':
        case 'F':
            IO.println("Gênero selecionado: Feminino");
            break;

        case 'n':
        case 'N':
            IO.println("Gênero não informado");
            break;

        default:
            IO.println("Gênero inválido.");
            return;
    }
    if (imc < 20) {

        classificacao = "Abaixo do Normal";

    } else if (imc >= 20 && imc < 25) {

        classificacao = "Normal";

    } else if (imc >= 25 && imc < 30) {

        classificacao = "Obesidade Leve";

    } else if (imc >= 30 && imc < 40) {

        classificacao = "Obesidade Moderada";

    } else {

        classificacao = "Obesidade Mórbida";
    }
    IO.println();
    IO.println("--------------------------------");
    IO.println("Nome: " + nome);
    IO.println("Peso: " + peso + " kg");
    IO.println("Altura: " + altura + " m");
    IO.println("Seu IMC é: " + imc);
    IO.println("Classificação: " + classificacao);
    IO.println("--------------------------------");
}