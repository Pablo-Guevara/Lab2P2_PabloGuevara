package lab.pkg2p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_PabloGuevara {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<pymes> listaPymes = new ArrayList();
        int opcion = 0;

        String nombre;
        String slogan;
        String rtn;
        int cantidadEmpleados;
        String descripcion;
        int añoFundacion;
        int cantidadSocios;
        String nombreGerenteG;
        String ubicacion;
        int ventasUltimoAño;
        String sectorSocial = "";
        int sectorSocialInt;
        long capitalSemilla;

        while (opcion != 7) {
            System.out.println("-----MENU-----");
            System.out.println("1-Crear pyme");
            System.out.println("2-Listar pymes");
            System.out.println("3-Modificar pyme");
            System.out.println("4-Eliminar pyme");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            if (opcion == 1) {
                System.out.println("Ingrese nombre de la pyme: ");
                nombre = leer.nextLine();
                System.out.println("Ingrese slogan de la pyme: ");
                slogan = leer.nextLine();
                System.out.println("Ingrese rtn de la pyme: ");
                rtn = leer.next();
                System.out.println("Ingrese cantidad de empleados de la pyme: ");
                cantidadEmpleados = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese descripcion de la pyme: ");
                descripcion = leer.nextLine();
                System.out.println("Ingrese año de fundacion de la pyme: ");
                añoFundacion = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese cantidad de socios de la pyme: ");
                cantidadSocios = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese nombre del gerente general de la pyme: ");
                nombreGerenteG = leer.nextLine();
                System.out.println("Ingrese ubicacion de la pyme: ");
                ubicacion = leer.nextLine();
                System.out.println("Ingrese ventas del ultimo año de la pyme: ");
                ventasUltimoAño = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese el sector social de la pyme: ");
                System.out.println("1-Transporte");
                System.out.println("2-Medicina");
                System.out.println("3-Educacion");
                System.out.println("4-Ventas");
                System.out.println("5-Servicios financieros");
                System.out.println("6-Servicios de consultoria");
                System.out.println("7-Ecologia");
                System.out.println("8-Ciencias juridicas");
                sectorSocialInt = leer.nextInt();
                if (sectorSocialInt == 1) {
                    sectorSocial = "Transporte";
                }
                if (sectorSocialInt == 2) {
                    sectorSocial = "Medicina";
                }
                if (sectorSocialInt == 3) {
                    sectorSocial = "Educacion";
                }
                if (sectorSocialInt == 4) {
                    sectorSocial = "Ventas";
                }
                if (sectorSocialInt == 5) {
                    sectorSocial = "Servicios financieros";
                }
                if (sectorSocialInt == 6) {
                    sectorSocial = "Servicios de consultoria";
                }
                if (sectorSocialInt == 7) {
                    sectorSocial = "Ecologia";
                }
                if (sectorSocialInt == 8) {
                    sectorSocial = "Ciencias juridicas";
                }
                System.out.println("Ingrese capital semilla de la pyme: ");
                capitalSemilla = leer.nextLong();

                listaPymes.add(new pymes(nombre, slogan, rtn, cantidadEmpleados, descripcion, añoFundacion, cantidadSocios, nombreGerenteG, ubicacion, ventasUltimoAño, sectorSocial, capitalSemilla));

            }

            if (opcion == 2) {
                int opc, posc;
                System.out.println("1-Listar todas");
                System.out.println("2-Listar una en especifico");
                System.out.println("Escriba su opcion: ");
                opc = leer.nextInt();
                if (opc == 1) {

                    String salida = "";
                    for (Object t : listaPymes) {
                        if (t instanceof pymes) {
                            salida += listaPymes.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    System.out.println(salida);
                }

                if (opc == 2) {
                    System.out.println("Ingrese posicion a mostrar: ");
                    posc = leer.nextInt();
                    String salida = "";
                    for (Object t : listaPymes) {
                        if (t instanceof pymes) {
                            if (posc == listaPymes.indexOf(t)) {
                                salida += listaPymes.indexOf(t) + "- " + t + "\n";
                            }
                        }
                    }
                    System.out.println(salida);
                }

            }

            if (opcion == 3) {
                int pymeModificar, valorModificar;
                System.out.println("Ingrese el numero de la pyme a modificar: ");
                pymeModificar = leer.nextInt();
                
                System.out.println("¿Que valor desea modificar?");
                

            }

            if (opcion == 4) {
                int pymeEliminar;
                System.out.println("Ingrese el numero de la pyme a eliminar: ");
                pymeEliminar = leer.nextInt();
                listaPymes.remove(pymeEliminar);
            }
        }
    }

}
