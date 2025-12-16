import Entities.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Vehicle> list = new ArrayList<>();

        Vehicle vehicle = new Vehicle();
        boolean r = true;
        while(r) {
            System.out.printf("CorpFleet Manager %n ---------------------------------- %n");

            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Carros disponíveis");
            System.out.println("3. Carros em manutenção");
            System.out.println("4. Todos carros");
            System.out.println("5. Atualizar quilometragem");
            System.out.println("6. Atualizar veículo para \"Em Manutenção\"");
            System.out.println("7. Atualizar veículo para \"Disponível\"");
            System.out.println("8. Remover Veículo");


            System.out.println("0. Sair");

            System.out.println();
            System.out.println("Escolha uma opção: ");

            int resp = sc.nextInt();
            sc.nextLine();

            System.out.println();


            switch (resp) {
                case 1:

                    System.out.print("Quantos veiculos deseja adicionar ? ");
                    int n = sc.nextInt();
                    System.out.println();

                    for (int i = 0; i <n; i++) {

                    sc.nextLine();
                    System.out.println("Digite a placa:");
                    String placa = sc.nextLine();

                    if (Vehicle.hasID(list,placa) != null){
                        while (Vehicle.hasID(list,placa) != null){
                            System.out.println("Placa ja cadastrada");
                            System.out.print("Digite uma nova placa:");
                            placa = sc.nextLine();

                        }

                    }

                    System.out.println("Digite a quilometragem:");
                    double quilometragem = sc.nextDouble();

                    while (quilometragem <0){
                        System.out.println("A quilometragem não pode ser menor que 0.");
                        System.out.print("Tente novamente: ");
                        quilometragem = sc.nextDouble();
                    }

                    Vehicle.addVehicle(list, placa, quilometragem);

                        System.out.println();
                    }

                    break;


                case 2:
                    System.out.println("Carros Disponíveis: ");
                    System.out.println();
                    vehicle.disponiveis(list);
                    break;

                case 3:
                    System.out.println("Carros em manutenção: ");
                    System.out.println();
                    vehicle.emManutencao(list);
                    break;
                case 4:
                    vehicle.allVehicles(list);
                    break;

                case 5:
                    System.out.println("Digite a placa: ");
                    String placa = sc.nextLine();
                    System.out.println("Digite a quilometragem nova: ");
                    double quilometragem = sc.nextDouble();
                    Vehicle.newKm(quilometragem,placa,list);

                    break;


                case 6:
                    System.out.println("Digite a placa: ");
                    placa = sc.nextLine();
                    vehicle.toEmManutencao(list,placa);
                    break;

                case 7:
                    System.out.println("Digite a placa: ");
                    placa = sc.nextLine();
                    vehicle.toDisponivel(list,placa);
                    break;

                case 8:

                    System.out.println("Digite a placa: ");
                    placa = sc.nextLine();
                    vehicle.removerVeiculo(list,placa);

                    break;

                case 0:
                    r = false;
                    System.out.println("Obrigado por utilizar CorpFleet Manager! ");
                    break;
            }
        }
    }
}
