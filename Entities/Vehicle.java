package Entities;

import Entities.Enums.VehicleStatus;

import java.util.List;

public class Vehicle {
    private String placa;
    private Double quilometragem;
    private VehicleStatus status;

    public Vehicle() {
    }

    public Vehicle(String placa, Double quilometragem, VehicleStatus status) {
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.status = status;
    }

    public String getPlaca() {
        return placa;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public static Integer hasID(List<Vehicle> list, String placa) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPlaca().equals(placa)) {
                return i;
            }
        }
        return null;
    }

    public static void addVehicle(List<Vehicle> list, String placa, Double quilometragem) {
        list.add(new Vehicle(placa, quilometragem, VehicleStatus.DISPONIVEL));
    }


    public static void newKm(Double newquilometragem, String placa, List<Vehicle> list) {

        Integer x = hasID(list, placa);
        if (x != null) {
            if (newquilometragem > list.get(x).quilometragem) {
                list.get(x).quilometragem = newquilometragem;
            } else {
                System.out.println("A nova quilometragem não pode ser menor que a anterior");
            }
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }


    public void disponiveis(List<Vehicle> list) {
        for (Vehicle x : list) {
            if (x.status == VehicleStatus.DISPONIVEL) {
                System.out.println(x);
                System.out.println();
            }
        }
    }

    public void emManutencao(List<Vehicle> list) {
        for (Vehicle x : list) {
            if (x.status == VehicleStatus.MANUTENCAO) {
                System.out.println(x);
                System.out.println();
            }
        }
    }

    public void allVehicles(List<Vehicle> list) {
        System.out.println();
        System.out.println("Disponíveis: ");
        disponiveis(list);
        System.out.println();
        System.out.println("Em manutenção:");
        emManutencao(list);
        System.out.println();
    }

    public void removerVeiculo(List<Vehicle> list, String placa) {

        if (hasID(list, placa) != null) {
            int w = hasID(list, placa);
            list.remove(w);
        } else {
            System.out.println("Veículo não encontrado!");
        }

    }

    public void toEmManutencao(List<Vehicle> list, String placa) {
        Integer i = hasID(list, placa);
        if (i != null) {
            list.get(i).status = VehicleStatus.MANUTENCAO;

        }
    }

    public void toDisponivel(List<Vehicle> list, String placa) {
        Integer i = hasID(list, placa);
        if (i != null) {
            list.get(i).status = VehicleStatus.DISPONIVEL;

        }
    }

    @Override
    public String toString() {
        return "placa: " + placa + "\n" +
                "quilometragem: " + quilometragem + "\n" +
                "status: " + status;
    }
}
