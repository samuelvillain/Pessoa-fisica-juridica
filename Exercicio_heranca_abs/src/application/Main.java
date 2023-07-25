package application;

import entities.DadosPessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<DadosPessoa> cadastro = new ArrayList<>();

        int escolha;

        do {
            System.out.println("1 - Cadastro produto ");
            System.out.println("2 - Listar produtos ");
            System.out.println("3 - Fim cadastro ");
            System.out.print("Qual a opção desejada? ");
            escolha = sc.nextInt();

            if (escolha == 1){
                System.out.print("Qual sua empresa Pessoa (F)isíca ou (J)uridica: ");
                char tipo = sc.next().charAt(0);
                System.out.print("Nome da empresa ou pessoa: ");
                String nomePessoaEmpresa = sc.next();
                System.out.print("Renda Anual: ");
                double rendaAnual = sc.nextDouble();
                if (tipo == 'f'){
                    System.out.print("Qual seu gasto com Saúde: ");
                    double gastoSaude = sc.nextDouble();
                    cadastro.add(new PessoaFisica(nomePessoaEmpresa, rendaAnual, gastoSaude));
                } else {
                    System.out.print("Quantas pessoas trabalha na empresa: ");
                    int numeroPessoas = sc.nextInt();
                    cadastro.add(new PessoaJuridica(nomePessoaEmpresa, rendaAnual, numeroPessoas));
                }
            } else if (escolha == 2) {
                System.out.println();
                System.out.println("IMPOSTOS PAGOS:");
                for (DadosPessoa dadosPessoa : cadastro){
                    System.out.println(dadosPessoa.toString());
                }
                double soma = 0.0;
                for (DadosPessoa dadosPessoa : cadastro){
                    soma += dadosPessoa.imposto();
                }
                System.out.println("Imposto Total: $ " + String.format("%.2f", soma));
            }



        } while (escolha != 3);

        sc.close();

    }
}