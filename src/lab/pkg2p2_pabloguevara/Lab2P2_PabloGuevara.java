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
            System.out.println("5-Evaluar tipo de prestamo");
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
                System.out.println("1-Nombre\n"
                        + "2-Slogan\n"
                        + "3-rtn\n"
                        + "4-Cantidad de empleados\n"
                        + "5-Descripcion\n"
                        + "6-Año de fundacion\n"
                        + "7-Cantidad de socios\n"
                        + "8-Nombre del gerente general\n"
                        + "9-Ubicacion\n"
                        + "10-Ventas del ultimo año\n"
                        + "11-Sector social \n"
                        + "12-Capital semilla\n"
                        + "Escriba su opcion: ");
                valorModificar = leer.nextInt();
                leer.nextLine();
                if (valorModificar == 1) {
                    String nombreN;
                    System.out.println("Ingrese el nuevo nombre de la pyme: ");
                    nombreN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setNombre(nombreN);
                }

                if (valorModificar == 2) {
                    String sloganN;
                    System.out.println("Ingrese el nuevo slogan de la pyme: ");
                    sloganN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setSlogan(sloganN);
                }

                if (valorModificar == 3) {
                    String rtnN;
                    System.out.println("Ingrese el nuevo rtn de la pyme: ");
                    rtnN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setRtn(rtnN);
                }

                if (valorModificar == 4) {
                    int cantidadEmpleadosN;
                    System.out.println("Ingrese la nueva cantidad de empleados de la pyme: ");
                    cantidadEmpleadosN = leer.nextInt();
                    ((pymes) listaPymes.get(pymeModificar)).setCantidadEmpleados(cantidadEmpleadosN);
                }

                if (valorModificar == 5) {
                    String descripcionN;
                    System.out.println("Ingrese la nueva descripcion de la pyme: ");
                    descripcionN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setDescripcion(descripcionN);
                }

                if (valorModificar == 6) {
                    int añoN;
                    System.out.println("Ingrese el nuevo año de fundacion de la pyme: ");
                    añoN = leer.nextInt();
                    ((pymes) listaPymes.get(pymeModificar)).setAñoFundacion(añoN);
                }

                if (valorModificar == 7) {
                    int cantSocios;
                    System.out.println("Ingrese la nueva cantidad de socios de la pyme: ");
                    cantSocios = leer.nextInt();
                    ((pymes) listaPymes.get(pymeModificar)).setCantidadSocios(cantSocios);
                }

                if (valorModificar == 8) {
                    String nombreGerenteN;
                    System.out.println("Ingrese el nuevo nombre del gerente general de la pyme: ");
                    nombreGerenteN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setNombreGerenteG(nombreGerenteN);
                }

                if (valorModificar == 9) {
                    String ubicacionN;
                    System.out.println("Ingrese la nueva ubicacion de la pyme: ");
                    ubicacionN = leer.nextLine();
                    ((pymes) listaPymes.get(pymeModificar)).setUbicacion(ubicacionN);
                }
                if (valorModificar == 10) {
                    int ventasUltAñoN;
                    System.out.println("Ingrese la nueva cantidad de ventas en el ultiumo año de la pyme: ");
                    ventasUltAñoN = leer.nextInt();
                    ((pymes) listaPymes.get(pymeModificar)).setVentasUltimoAño(ventasUltAñoN);
                }

                if (valorModificar == 11) {
                    String sectorSocialN = "";
                    int sectorSocialNint;
                    System.out.println("Ingrese el sector social de la pyme: ");
                    System.out.println("1-Transporte");
                    System.out.println("2-Medicina");
                    System.out.println("3-Educacion");
                    System.out.println("4-Ventas");
                    System.out.println("5-Servicios financieros");
                    System.out.println("6-Servicios de consultoria");
                    System.out.println("7-Ecologia");
                    System.out.println("8-Ciencias juridicas");
                    sectorSocialNint = leer.nextInt();

                    if (sectorSocialNint == 1) {
                        sectorSocialN = "Transporte";
                    }
                    if (sectorSocialNint == 2) {
                        sectorSocialN = "Medicina";
                    }
                    if (sectorSocialNint == 3) {
                        sectorSocialN = "Educacion";
                    }
                    if (sectorSocialNint == 4) {
                        sectorSocialN = "Ventas";
                    }
                    if (sectorSocialNint == 5) {
                        sectorSocialN = "Servicios financieros";
                    }
                    if (sectorSocialNint == 6) {
                        sectorSocialN = "Servicios de consultoria";
                    }
                    if (sectorSocialNint == 7) {
                        sectorSocialN = "Ecologia";
                    }
                    if (sectorSocialNint == 8) {
                        sectorSocialN = "Ciencias juridicas";
                    }
                    ((pymes) listaPymes.get(pymeModificar)).setSectorSocial(sectorSocialN);
                }

                if (valorModificar == 12) {
                    int capitalSemillaN;
                    System.out.println("Ingrese el nuevo capital semilla de la pyme: ");
                    capitalSemillaN = leer.nextInt();
                    ((pymes) listaPymes.get(pymeModificar)).setCapitalSemilla(capitalSemillaN);
                }
            }

            if (opcion == 4) {
                int pymeEliminar;
                System.out.println("Ingrese el numero de la pyme a eliminar: ");
                pymeEliminar = leer.nextInt();
                listaPymes.remove(pymeEliminar);
            }

            if (opcion == 5) {
                boolean prestamo = false;
                int pymeEvaluar, cantSociosE, cantEmpleadosE, añoFundacionE;
                long capitalSemillaE;
                String sectorSocialE;

                System.out.println("Ingrese el numero de la pyme a evaluar: ");
                pymeEvaluar = leer.nextInt();

                sectorSocialE = listaPymes.get(pymeEvaluar).getSectorSocial();
                capitalSemillaE = listaPymes.get(pymeEvaluar).getCapitalSemilla();
                cantSociosE = listaPymes.get(pymeEvaluar).getCantidadSocios();
                cantEmpleadosE = listaPymes.get(pymeEvaluar).getCantidadEmpleados();

                añoFundacionE = listaPymes.get(pymeEvaluar).getAñoFundacion();

                if (sectorSocialE == "Transporte" || sectorSocialE == "Educacion") {
                    if (capitalSemillaE < 10000 && cantSociosE <= 3 && cantEmpleadosE < 10) {
                        System.out.println("La mypime " + listaPymes.get(pymeEvaluar).getNombre() + " puede acceder al prestamo de ayuda primaria");
                        prestamo = true;
                    }
                }

                if (sectorSocialE == "Ventas" || sectorSocialE == "Servicios financieros" || sectorSocialE == "Servicios de consultoria") {
                    if (capitalSemillaE > 20000 && cantSociosE > 3 && cantEmpleadosE >= 10 && añoFundacionE > 2005) {
                        System.out.println("La mypime " + listaPymes.get(pymeEvaluar).getNombre() + " puede acceder al prestamo de ayuda secundaria");
                        prestamo = true;
                    }
                }

                if (sectorSocialE == "Medicina" || sectorSocialE == "Ecologia") {
                    if (capitalSemillaE < 5000 && cantEmpleadosE < 5 && añoFundacionE > 2018) {
                        System.out.println("La mypime " + listaPymes.get(pymeEvaluar).getNombre() + " puede acceder al prestamo de ayuda terciaria");
                        prestamo = true;
                    }
                }

                if (prestamo == false) {
                    System.out.println("La mypime " + listaPymes.get(pymeEvaluar).getNombre() + " no puede acceder a un prestamo");
                }
            }
        }
    }

}
