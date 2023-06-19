package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitutoEducativo;
import paquete5.Persona;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Prestamo> prestamos = new ArrayList<>();
        boolean ingresarDato = true;
        while(ingresarDato){
                System.out.println("BINEVENIDO"+"\n=========="+
                        "\nSELECCIONE LA OPCION CORRECTA PARA REALIZAR EL PRESTAMO:");
                System.out.println("[1] PRESTAMO AUTOMÓVIL");
                System.out.println("[2] PRESTAMO EDUCATIVO");
                System.out.println("[3] SALIDA");
                System.out.println("OPCION: ");
                int opcion = entrada.nextInt();
                entrada.nextLine();
                switch(opcion){
                    case 1:
                        System.out.println("===============================================================");
                        System.out.println("INGRESE LOS DATOS PARA EL PRESTAMO AUTOMÓVIL");
                        System.out.println("NOMBRE DEL BENEFICIARIO: ");
                        String nombreB = entrada.nextLine();
                        System.out.println("APELLIDO DEL BENEFICIARIO: ");
                        String apellidoB = entrada.nextLine();
                        System.out.println("USERNAME DEL BENEFICIARIO: ");
                        String usernameB = entrada.nextLine();
                        System.out.println("TIEMPO DE PRESTAMO EN MESES: ");
                        int tiempoPrestamo = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("CIUDAD DEL PRESTAMO: ");
                        String ciudadPrestamo = entrada.nextLine();
                        System.out.println("TIPO DE AUTOMOVIL: ");
                        String tipoAutomovil= entrada.nextLine();
                        System.out.println("MARCA DEL AUTOMOVIL: ");
                        String marcaAutomovil = entrada.nextLine();
                        System.out.println("NOMBRE DEL GARANTE: ");
                        String nombreG = entrada.nextLine();
                        System.out.println("APELLIDO DEL GARANTE: ");
                        String apellidoG = entrada.nextLine();
                        System.out.println("USERNAME DEL GARANTE: ");
                        String usernameG = entrada.nextLine();
                        System.out.println("VALOR DEL AUTOMOVIL: ");
                        double valorAutomovil = entrada.nextDouble();
                        entrada.nextLine();
                        Persona beneficiario = new Persona(nombreB,apellidoB,usernameB);
                        Persona garante1 = new Persona(nombreG,apellidoG,usernameG);
                        PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiario,tiempoPrestamo,
                                ciudadPrestamo,tipoAutomovil,marcaAutomovil,garante1,valorAutomovil);
                        prestamos.add(prestamoAutomovil);
                        break;
                    case 2:
                        System.out.println("===============================================================");
                        System.out.println("INGRESE LOS DATOS PARA EL PRESTAMO EDUCATIVO: ");
                        System.out.println("NOMBRE DEL BENEFICIARIO: ");
                        String nombreEdu = entrada.nextLine();
                        System.out.println("APELLIDO DEL BEMEFICIARIO: ");
                        String apellidoEdu = entrada.nextLine();
                        System.out.println("USERNAME DEL BENEFICIARIO: ");
                        String usernameEdu = entrada.nextLine();
                        System.out.println("TIEMPO DE PRESTAMO EN MESES: ");
                        int tiempoEdu = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("CIUDAD DEL PRESTAMO: ");
                        String ciudadEdu = entrada.nextLine();
                        System.out.println("NIVEL DE ESTUDIO: ");
                        String nivelEdu = entrada.nextLine();
                        System.out.print("NOMBRE DE LA INSTITUCION EDUCATIVA: ");
                        String nombreIns = entrada.nextLine();
                        System.out.println("SIGLAS DE LA INSTITUCION EDUCATIVA: ");
                        String siglasEdu = entrada.nextLine();
                        System.out.println("VALOR DE LA CARRERA: ");
                        double valorCarreraEdu = entrada.nextDouble();
                        entrada.nextLine();
                        Persona beneficiarioEdu = new Persona(nombreEdu,apellidoEdu,usernameEdu);
                        InstitutoEducativo institutoEdu = new InstitutoEducativo(nombreIns,siglasEdu);
                        PrestamoEducativo prestamoEdu = new PrestamoEducativo(beneficiarioEdu,
                        tiempoEdu,ciudadEdu,nivelEdu,institutoEdu,valorCarreraEdu);
                        prestamos.add(prestamoEdu);
                        break;
                    case 3:
                        ingresarDato = false;
                        break;
                    default:
                        System.out.println("OPCION INVALIDA - ELIJA LA OPCION CORRECTA - INTENTELO NUEVAMENTE");
                    break;
                }
                
        }
        System.out.println("===============================================================");
        System.out.println("\nLISTA DE LOS PRESTAMOS SELECCIONADOS:");
        for (Prestamo prestamoAux : prestamos) {
            System.out.println(prestamoAux.toString());
            System.out.println("---------------------------------------------");            
        }
    }
}
