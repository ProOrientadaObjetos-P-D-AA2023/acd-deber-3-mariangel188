/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado[] empleados = new Empleado[200];
        int cantEmpleados = 0;
        int opcion;
        String nombre;
        double salario;
        int edad;

        do {
            System.out.println("Gestion de Empleados");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar la información de los empleados");
            System.out.println("3. Calcular el aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombre = entrada.nextLine();
                    System.out.print("Ingrese el salario del empleado: ");
                    salario = entrada.nextDouble();
                    System.out.print("Ingrese la edad del empleado: ");
                    edad = entrada.nextInt();

                    Empleado empleado = new Empleado(nombre, salario, edad);
                    empleados[cantEmpleados] = empleado;
                    cantEmpleados++;
                    System.out.println("Se agrego el empleado");
                    break;

                case 2:
                    if (cantEmpleados == 0) {
                        System.out.println("No se registro el empleado");
                    } else {
                        for (int i = 0; i < cantEmpleados; i++) {
                            System.out.println(empleados[i].mostrarInformacion());
                        }
                    }
                    break;

                case 3:
                    if (cantEmpleados == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.print("Ingrese porcentaje para el aumento del salario: ");
                        double poAumento = entrada.nextDouble();
                        double saPromedio = calcularSalarioProm(empleados, cantEmpleados);

                        for (int i = 0; i < cantEmpleados; i++) {
                            if (empleados[i].getSalario() < saPromedio) {
                                double aumento = empleados[i].getSalario() * poAumento / 100;
                                double Nusalario = empleados[i].getSalario() + aumento;
                                empleados[i].setSalario(Nusalario);
                                System.out.println("Nuevo salario para " + empleados[i].getNombre() + ": $" + Nusalario);
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Se termina el programa.");
                    break;
                default:
                    System.out.println("Opción erronea. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    public static double calcularSalarioProm(Empleado[] empleados, int cantidadEmpleados) {
        double sumaSalarios = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            sumaSalarios += empleados[i].getSalario();
        }

        return sumaSalarios / cantidadEmpleados;

    }
}
