package lab3p2_joselagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_JoseLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean res = false;
        int resp = 1;
        ArrayList franquicia = new ArrayList();
        ArrayList productos = new ArrayList();
        ArrayList clientes = new ArrayList();
        ArrayList supervisor = new ArrayList();
        ArrayList asesor = new ArrayList();
        ArrayList cajeros = new ArrayList();

        while (res == false) {

            System.out.print("LOGIN\n"
                    + "Seleccione su rango: \n"
                    + "1. Crear usuario\n"
                    + "2. Asesor Financiero\n"
                    + "3. Cajero\n"
                    + "4. Supervisor\n"
                    + "5. Cliente\n"
                    + "6. Administrador\n"
                    + "7. Cerrar\n"
                    + "Ingrese su eleccion: ");
            int login = leer.nextInt();

            switch (login) {
                case 6: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String usuario = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    if (!"admin".equals(usuario) || !"1234".equals(contraseña)) {
                        System.out.print("Invalido");
                        break;
                    } else {
                        while (resp == 1) {
                            System.out.print("Menu Admin\n"
                                    + "1. Agregar\n"
                                    + "2. Modificar\n"
                                    + "3. Eliminar\n"
                                    + "4. Listar\n"
                                    + "Ingrese su opcion: ");
                            int opcion = leer.nextInt();

                            switch (opcion) {
                                case 1: {
                                    System.out.print("AGREGAR\n"
                                            + "1. Agregar tienda\n"
                                            + "2. Agregar Articulo\n"
                                            + "Ingrese su opcion: ");
                                    int op = leer.nextInt();
                                    switch (op) {
                                        case 1: {
                                            System.out.print("Ingrese el identificador: ");
                                            String identificador = leer.next();
                                            System.out.print("Ingrese la ubicacion de la tienda: ");
                                            String ubicacion = leer.next();
                                            System.out.print("Ingrese el maximo de empleados de la tienda: ");
                                            int maxe = leer.nextInt();
                                            System.out.print("Ingrese el numero de cajas: ");
                                            int cajas = leer.nextInt();
                                            System.out.print("Ingrese el nombre del articulo mas vendido: ");
                                            String vendido = leer.next();
                                            System.out.print("Ingrese la cantidad maxima de articulos que puede haber en la tienda: ");
                                            int maxp = leer.nextInt();

                                            franquicia.add(new Tiendas(identificador, ubicacion, maxe, cajas, vendido, maxp));
                                            break;
                                        }
                                        case 2: {

                                            System.out.print("Que articulo desea ingresar?\n"
                                                    + "1. Televisor\n"
                                                    + "2. Consola\n"
                                                    + "3. Equipo de sonido\n"
                                                    + "4. Teatros en casa\n"
                                                    + "Ingrese su eleccion: ");
                                            int option = leer.nextInt();

                                            switch (option) {
                                                case 1: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int i = 0; i <= productos.size(); i++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese el tamaño: ");
                                                    int tamaño = leer.nextInt();
                                                    System.out.print("Es smart? [s/n]: ");
                                                    char ans = leer.next().charAt(0);
                                                    boolean smart = false;
                                                    if (ans == 's') {
                                                        smart = true;
                                                    }
                                                    System.out.print("Ingrese la marca: ");
                                                    String marca = leer.next();
                                                    System.out.print("Ingrese el numero de conexiones: ");
                                                    int conexiones = leer.nextInt();
                                                    System.out.println("Ingrese el grosor: ");
                                                    double grosor = leer.nextDouble();

                                                    productos.add(new Televisores(tamaño, smart, marca, conexiones, grosor, serie, precio, color, info));
                                                    break;
                                                }
                                                case 2: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int i = 0; i <= productos.size(); i++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la marca: ");
                                                    String marca = leer.next();
                                                    System.out.print("Ingrese la cantidad de almacenamiento: ");
                                                    int almacenamiento = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de controles que trae: ");
                                                    int controles = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de accesorios que contiene: ");
                                                    int accesorios = leer.nextInt();
                                                    System.out.print("Ingrese la informacion de la tarjeta de video: ");
                                                    String tarjeta = leer.next();

                                                    productos.add(new Consolas(marca, almacenamiento, controles, accesorios, tarjeta, serie, precio, color, info));
                                                    break;
                                                }
                                                case 3: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int i = 0; i <= productos.size(); i++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la cantidad de altavoces que tiene: ");
                                                    int altavoces = leer.nextInt();
                                                    System.out.print("Ingrese la potencia maxima (kHz): ");
                                                    int potencia = leer.nextInt();
                                                    System.out.print("Ingrese el numero de puertos auxiliares: ");
                                                    int aux = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de discos que soporta: ");
                                                    int discos = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de puertos USB que tiene: ");
                                                    int USB = leer.nextInt();

                                                    productos.add(new Sonido(altavoces, potencia, aux, discos, USB, serie, precio, color, info));
                                                    break;
                                                }
                                                case 4: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int i = 0; i <= productos.size(); i++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }

                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la cantidad de altavoces que tiene: ");
                                                    int altavoces = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de discos Blu-Ray que soporta: ");
                                                    int bluray = leer.nextInt();
                                                    System.out.print("Ingrese los metodos de limpieza del producto: ");
                                                    String limpieza = leer.next();
                                                    System.out.print("Ingrese la informacion del lector de discos: ");
                                                    String lector = leer.next();

                                                    productos.add(new Teatros(altavoces, bluray, limpieza, lector, serie, precio, color, info));
                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Opcion Invalida");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion Invalida");
                                            break;
                                        }

                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("MODIFICAR");
                                    System.out.print("1. Modificar Productos\n"
                                            + "2. Modificar Tienda\n"
                                            + "Ingrese su opcion: ");
                                    int option = leer.nextInt();

                                    switch (option) {
                                        case 1: {
                                            System.out.print("Ingrese la categoria del producto que desea modificar\n"
                                                    + "1. Televisores\n"
                                                    + "2. Consolas\n"
                                                    + "3. Equipos de sonido\n"
                                                    + "4. Teatros en casa\n"
                                                    + "Ingrese su opcion: ");
                                            int opt = leer.nextInt();
                                            switch (opt) {
                                                case 1: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Televisores) {
                                                        System.out.print("1. Modificar tamaño\n"
                                                                + "2. Modificar marca\n"
                                                                + "3. Modificar numero de conexiones\n"
                                                                + "4. Modificar grosor\n"
                                                                + "5. Modificar precio\n"
                                                                + "6. Modificar Color\n"
                                                                + "7. Modificar info\n"
                                                                + "Ingrese su opcion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese el nuevo tamaño");
                                                                int auxiliar = leer.nextInt();
                                                                ((Televisores) productos.get(position)).setTamaño(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva marca");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setMarca(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese el nuevo numero de conexiones: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Televisores) productos.get(position)).setConexiones(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese el nuevo grosor: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Televisores) productos.get(position)).setGrosor(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Televisores) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Consolas) {
                                                        System.out.print("1. Modificar marca\n"
                                                                + "2. Modificar almacenamiento\n"
                                                                + "3. Modificar numero de controles\n"
                                                                + "4. Modificar numero de accesorios\n"
                                                                + "5. Modificar informacion de la tarjeta\n"
                                                                + "6. Modificar precio\n"
                                                                + "7. Modificar Color\n"
                                                                + "8. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese nueva marca: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setMarca(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva capacidad de almacenamiento: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setAlmacenamiento(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese el nuevo numero de controles: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setControles(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese el nuevo numero de accesorios: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setAccesorios(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese la nueva informacion de la tarjeta de video: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setTarjetaInfo(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Consolas) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 8: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Sonido) {
                                                        System.out.print("1. Modificar Altavpces\n"
                                                                + "2. Modificar potencia\n"
                                                                + "3. Modificar numero de puertos auxiliares\n"
                                                                + "4. Modificar capacidad de discos\n"
                                                                + "5. Modificar numero de puertos USB\n"
                                                                + "6. Modificar precio\n"
                                                                + "7. Modificar Color\n"
                                                                + "8. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese la nueva cantidad de altavoces: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setAltavoces(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva potencia: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setPotencia(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese la nueva cantidad de puertos auxiliares: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setAuxiliares(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese la nueva cantidad soportada de discos: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setDiscos(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese la nueva cantidad de puertos USB: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setUSB(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Consolas) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 8: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Teatros) {
                                                        System.out.print("1. Modificar Altavoces\n"
                                                                + "2. Modificar Blu-Ray\n"
                                                                + "3. Modificar Limpieza\n"
                                                                + "4. Modificar Informacion del lector\n"
                                                                + "5. Modificar precio\n"
                                                                + "6. Modificar Color\n"
                                                                + "7. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese el nuevo numeor de altavoces");
                                                                int auxiliar = leer.nextInt();
                                                                ((Teatros) productos.get(position)).setAltavoces(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese el nuevo numero de discos Blu-ray soportado");
                                                                int auxiliar = leer.nextInt();
                                                                ((Teatros) productos.get(position)).setBluray(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese la nueva informacion: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setLimpieza(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese la nueva informacion: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setLector(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Teatros) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }

                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Opcion invalida");
                                                    break;
                                                }
                                            }

                                            break;
                                        }

                                        case 2: {
                                            System.out.print("Ingrese la posicion de la tienda: ");
                                            int position = leer.nextInt();

                                            if (franquicia.get(position) instanceof Tiendas) {
                                                System.out.print("1. Modificar identificador\n"
                                                        + "2. Modificar Ubicacion\n"
                                                        + "3. Modificar Cantidad maxima de empleados\n"
                                                        + "4. Modificar Producto mas vendido\n"
                                                        + "5. Cantidad maxima de articulos por tienda\n"
                                                        + "6. Modificar numero de cajas\n"
                                                        + "Ingrese su opcion: ");
                                                int opt = leer.nextInt();

                                                switch (opt) {
                                                    case 1: {
                                                        System.out.println("Ingrese el nuevo identificador: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setIdentificador(id);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese la nueva ubicacion: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setUbicacion(id);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el nuevo maximo de empleados: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setMaxEmp(id);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.println("Ingrese el producto mas vendido: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setmVendido(id);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.println("Ingrese el nuevo maximo de articulos por tienda: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setMaxProd(id);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.println("Ingrese el nuevo numero de cajas: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setCajas(id);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion invaliuda");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion Invalida");
                                            break;
                                        }

                                    }
                                    break;
                                }

                                case 3: {
                                    System.out.println("ELIMINAR");
                                    System.out.print("1. Eliminar Producto\n"
                                            + "2. Eliminar Cliente\n"
                                            + "3. Eliminar Supervisor\n"
                                            + "4. Eliminar Asesor\n"
                                            + "5. Eliminar Tienda\n"
                                            + "6. Eliminar Cajero\n"
                                            + "Ingrese su opcion: ");
                                    int option = leer.nextInt();

                                    switch (option) {
                                        case 1: {
                                            System.out.print("Ingrese la posicion del producto que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (productos.get(position) instanceof Articulos) {
                                                productos.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("Ingrese la posicion del cliente que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (clientes.get(position) instanceof Personas) {
                                                clientes.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 3: {
                                            System.out.print("Ingrese la posicion del supervisor que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (supervisor.get(position) instanceof Personas) {
                                                supervisor.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 4: {
                                            System.out.print("Ingrese la posicion del asesor que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (asesor.get(position) instanceof Personas) {
                                                asesor.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 5: {
                                            System.out.print("Ingrese la posicion de la tienda que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (franquicia.get(position) instanceof Tiendas) {
                                                franquicia.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 6: {
                                            System.out.print("Ingrese la posicion del cajero que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (cajeros.get(position) instanceof Personas) {
                                                cajeros.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion invalida");
                                            break;
                                        }
                                    }

                                    break;
                                }
                                case 4: {
                                    System.out.println("\nTiendas");
                                    for (int i = 0; i < franquicia.size(); i++) {
                                        System.out.println(i + " - " + franquicia.get(i));
                                    }
                                    System.out.println("\nProductos");
                                    for (int i = 0; i < productos.size(); i++) {
                                        System.out.println(i + " - " + productos.get(i));
                                    }
                                    System.out.println("\nAsesores");
                                    for (int i = 0; i < asesor.size(); i++) {
                                        System.out.println(i + " - " + asesor.get(i));
                                    }
                                    System.out.println("\nCajeros");
                                    for (int i = 0; i < cajeros.size(); i++) {
                                        System.out.println(i + " - " + cajeros.get(i));
                                    }
                                    System.out.println("\nSupervisores");
                                    for (int i = 0; i < supervisor.size(); i++) {
                                        System.out.println(i + " - " + supervisor.get(i));
                                    }
                                    System.out.println("\nClientes");
                                    for (int i = 0; i < clientes.size(); i++) {
                                        System.out.println(i + " - " + clientes.get(i));
                                    }
                                    break;
                                }
                                default: {

                                    break;
                                }
                            }
                        }

                    }
                    break;
                }

                case 2: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    for (int i = 0; i < asesor.size(); i++) {
                        if (((Personas) asesor.get(i)).getUser().equals(user) && ((Personas) asesor.get(i)).getClave().equals(contraseña)) {
                            System.out.print("1. Ver informacion propia y modificar\n"
                                    + "2. Listar\n"
                                    + "3. Ingrese opcion: ");
                            int option = leer.nextInt();

                            switch (option) {
                                case 1: {
                                    System.out.println(asesor.get(i));
                                    System.out.print("\n1. Modificar numero de personas atendidas\n"
                                            + "2. Modificar numero de productos comprados\n"
                                            + "3. Modificar numero de creditos otorgados\n"
                                            + "4. Modificar nombre\n"
                                            + "5. Modificar apellido\n"
                                            + "6. Modificar salario\n"
                                            + "7. Modificar macionalidad\n"
                                            + "Ingrese eleccion: ");
                                    int opt = leer.nextInt();
                                    
                                    switch(opt){
                                        case 1:{
                                            System.out.print("Ingrese el nuevo numero de personas atendidas: ");
                                            int aux = leer.nextInt();
                                            ((Asesor) asesor.get(i)).setAtendidos(aux);
                                            break;
                                        }
                                        case 2:{
                                            System.out.print("Ingrese el nuevo numero de productos comprados: ");
                                            int aux = leer.nextInt();
                                            ((Asesor) asesor.get(i)).setProductosC(aux);
                                            break;
                                        }
                                        case 3:{
                                            System.out.print("Ingrese el nuevo numero de creditos otorgados: ");
                                            int aux = leer.nextInt();
                                            ((Asesor) asesor.get(i)).setCreditos(aux);
                                            break;
                                        }
                                        case 4:{
                                            System.out.println("Ingrese el nuevo nombre: ");
                                            String aux = leer.next();
                                            ((Asesor) asesor.get(i)).setNombre(aux);
                                            break;
                                        }
                                        case 5:{
                                            System.out.println("Ingrese el nuevo apellido: ");
                                            String aux = leer.next();
                                            ((Asesor) asesor.get(i)).setApellido(aux);
                                            break;
                                        }
                                        case 6:{
                                            System.out.println("Ingrese el nuevo salario: ");
                                            double aux = leer.nextDouble();
                                            ((Asesor) asesor.get(i)).setSalario(aux);
                                            break;
                                        }
                                        case 7:{
                                            System.out.println("Ingrese la nueva nacionalidad: ");
                                            String aux = leer.next();
                                            ((Asesor) asesor.get(i)).setNacionalidad(aux);
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("Cajeros");
                                    for (int j = 0; j < cajeros.size(); j++) {
                                        System.out.println(j + " - " + cajeros.get(j));
                                    }
                                    System.out.println("\nSupervisores");
                                    for (int j = 0; j < supervisor.size(); j++) {
                                        System.out.println(j + " - " + supervisor.get(j));
                                    }
                                    break;
                                }
                                case 3: {

                                    break;
                                }
                                default: {
                                    System.out.println("Opcion Invalida");
                                    break;
                                }

                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    for (int i = 0; i < cajeros.size(); i++) {
                        if (((Personas) cajeros.get(i)).getUser().equals(user) && ((Personas) cajeros.get(i)).getClave().equals(contraseña)) {
                            System.out.println("Informacion personal");
                            System.out.println(cajeros.get(i));
                            System.out.println("\nProductos");
                            for (int j = 0; j < productos.size(); j++) {
                                System.out.println(j + " - " + productos.get(j));
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    for (int i = 0; i < asesor.size(); i++) {
                        if (((Personas) supervisor.get(i)).getUser().equals(user) && ((Personas) supervisor.get(i)).getClave().equals(contraseña)) {
                            System.out.println("1. Crear\n"
                                    + "2. Modificar\n"
                                    + "3. Eliminar\n"
                                    + "4. Listar\n"
                                    + "Ingrese su opcion: ");
                            int option = leer.nextInt();
                            switch (option) {
                                case 1: {

                                    System.out.print("AGREGAR\n"
                                            + "1. Agregar tienda\n"
                                            + "2. Agregar Articulo\n"
                                            + "Ingrese su opcion: ");
                                    int op = leer.nextInt();
                                    switch (op) {
                                        case 1: {
                                            System.out.print("Ingrese el identificador: ");
                                            String identificador = leer.next();
                                            System.out.print("Ingrese la ubicacion de la tienda: ");
                                            String ubicacion = leer.next();
                                            System.out.print("Ingrese el maximo de empleados de la tienda: ");
                                            int maxe = leer.nextInt();
                                            System.out.print("Ingrese el numero de cajas: ");
                                            int cajas = leer.nextInt();
                                            System.out.print("Ingrese el nombre del articulo mas vendido: ");
                                            String vendido = leer.next();
                                            System.out.print("Ingrese la cantidad maxima de articulos que puede haber en la tienda: ");
                                            int maxp = leer.nextInt();

                                            franquicia.add(new Tiendas(identificador, ubicacion, maxe, cajas, vendido, maxp));
                                            break;
                                        }
                                        case 2: {

                                            System.out.print("Que articulo desea ingresar?\n"
                                                    + "1. Televisor\n"
                                                    + "2. Consola\n"
                                                    + "3. Equipo de sonido\n"
                                                    + "4. Teatros en casa\n"
                                                    + "Ingrese su eleccion: ");
                                            int opt = leer.nextInt();

                                            switch (opt) {
                                                case 1: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int j = 0; j < productos.size(); j++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese el tamaño: ");
                                                    int tamaño = leer.nextInt();
                                                    System.out.print("Es smart? [s/n]: ");
                                                    char ans = leer.next().charAt(0);
                                                    boolean smart = false;
                                                    if (ans == 's') {
                                                        smart = true;
                                                    }
                                                    System.out.print("Ingrese la marca: ");
                                                    String marca = leer.next();
                                                    System.out.print("Ingrese el numero de conexiones: ");
                                                    int conexiones = leer.nextInt();
                                                    System.out.println("Ingrese el grosor: ");
                                                    double grosor = leer.nextDouble();

                                                    productos.add(new Televisores(tamaño, smart, marca, conexiones, grosor, serie, precio, color, info));
                                                    break;
                                                }
                                                case 2: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int j = 0; j < productos.size(); j++) {
                                                            if (serie == ((Articulos) productos.get(i)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la marca: ");
                                                    String marca = leer.next();
                                                    System.out.print("Ingrese la cantidad de almacenamiento: ");
                                                    int almacenamiento = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de controles que trae: ");
                                                    int controles = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de accesorios que contiene: ");
                                                    int accesorios = leer.nextInt();
                                                    System.out.print("Ingrese la informacion de la tarjeta de video: ");
                                                    String tarjeta = leer.next();

                                                    productos.add(new Consolas(marca, almacenamiento, controles, accesorios, tarjeta, serie, precio, color, info));
                                                    break;
                                                }
                                                case 3: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int j = 0; j <= productos.size(); j++) {
                                                            if (serie == ((Articulos) productos.get(j)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }
                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la cantidad de altavoces que tiene: ");
                                                    int altavoces = leer.nextInt();
                                                    System.out.print("Ingrese la potencia maxima (kHz): ");
                                                    int potencia = leer.nextInt();
                                                    System.out.print("Ingrese el numero de puertos auxiliares: ");
                                                    int aux = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de discos que soporta: ");
                                                    int discos = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de puertos USB que tiene: ");
                                                    int USB = leer.nextInt();

                                                    productos.add(new Sonido(altavoces, potencia, aux, discos, USB, serie, precio, color, info));
                                                    break;
                                                }
                                                case 4: {
                                                    int serie = 0;
                                                    boolean nserie = false;
                                                    while (nserie == false) {
                                                        System.out.print("Ingrese el numero de serie: ");
                                                        serie = leer.nextInt();
                                                        for (int j = 0; j <= productos.size(); j++) {
                                                            if (serie == ((Articulos) productos.get(j)).getSerie()) {
                                                                System.out.println("El numero de serie ya existe, favor ingresar otro");
                                                            } else {
                                                                nserie = true;
                                                            }
                                                        }
                                                    }

                                                    System.out.print("Ingrese el precio: ");
                                                    double precio = leer.nextDouble();
                                                    System.out.print("Ingrese el color: ");
                                                    String color = leer.next();
                                                    System.out.print("Ingrese la informacion de la garantia: ");
                                                    String info = leer.next();

                                                    System.out.print("Ingrese la cantidad de altavoces que tiene: ");
                                                    int altavoces = leer.nextInt();
                                                    System.out.print("Ingrese la cantidad de discos Blu-Ray que soporta: ");
                                                    int bluray = leer.nextInt();
                                                    System.out.print("Ingrese los metodos de limpieza del producto: ");
                                                    String limpieza = leer.next();
                                                    System.out.print("Ingrese la informacion del lector de discos: ");
                                                    String lector = leer.next();

                                                    productos.add(new Teatros(altavoces, bluray, limpieza, lector, serie, precio, color, info));
                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Opcion Invalida");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion Invalida");
                                            break;
                                        }

                                    }
                                    break;
                                }
                                case 2: {

                                    System.out.println("MODIFICAR");
                                    System.out.print("1. Modificar Productos\n"
                                            + "2. Modificar Tienda\n"
                                            + "Ingrese su opcion: ");
                                    int opti = leer.nextInt();

                                    switch (opti) {
                                        case 1: {
                                            System.out.print("Ingrese la categoria del producto que desea modificar\n"
                                                    + "1. Televisores\n"
                                                    + "2. Consolas\n"
                                                    + "3. Equipos de sonido\n"
                                                    + "4. Teatros en casa\n"
                                                    + "Ingrese su opcion: ");
                                            int opt = leer.nextInt();
                                            switch (opt) {
                                                case 1: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Televisores) {
                                                        System.out.print("1. Modificar tamaño\n"
                                                                + "2. Modificar marca\n"
                                                                + "3. Modificar numero de conexiones\n"
                                                                + "4. Modificar grosor\n"
                                                                + "5. Modificar precio\n"
                                                                + "6. Modificar Color\n"
                                                                + "7. Modificar info\n"
                                                                + "Ingrese su opcion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese el nuevo tamaño");
                                                                int auxiliar = leer.nextInt();
                                                                ((Televisores) productos.get(position)).setTamaño(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva marca");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setMarca(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese el nuevo numero de conexiones: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Televisores) productos.get(position)).setConexiones(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese el nuevo grosor: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Televisores) productos.get(position)).setGrosor(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Televisores) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Televisores) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Consolas) {
                                                        System.out.print("1. Modificar marca\n"
                                                                + "2. Modificar almacenamiento\n"
                                                                + "3. Modificar numero de controles\n"
                                                                + "4. Modificar numero de accesorios\n"
                                                                + "5. Modificar informacion de la tarjeta\n"
                                                                + "6. Modificar precio\n"
                                                                + "7. Modificar Color\n"
                                                                + "8. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese nueva marca: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setMarca(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva capacidad de almacenamiento: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setAlmacenamiento(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese el nuevo numero de controles: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setControles(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese el nuevo numero de accesorios: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Consolas) productos.get(position)).setAccesorios(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese la nueva informacion de la tarjeta de video: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setTarjetaInfo(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Consolas) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 8: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 3: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Sonido) {
                                                        System.out.print("1. Modificar Altavpces\n"
                                                                + "2. Modificar potencia\n"
                                                                + "3. Modificar numero de puertos auxiliares\n"
                                                                + "4. Modificar capacidad de discos\n"
                                                                + "5. Modificar numero de puertos USB\n"
                                                                + "6. Modificar precio\n"
                                                                + "7. Modificar Color\n"
                                                                + "8. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese la nueva cantidad de altavoces: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setAltavoces(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese la nueva potencia: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setPotencia(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese la nueva cantidad de puertos auxiliares: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setAuxiliares(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese la nueva cantidad soportada de discos: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setDiscos(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese la nueva cantidad de puertos USB: ");
                                                                int auxiliar = leer.nextInt();
                                                                ((Sonido) productos.get(position)).setUSB(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Consolas) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 8: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Consolas) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.print("Ingrese la posicion del producto: ");
                                                    int position = leer.nextInt();

                                                    if (productos.get(position) instanceof Teatros) {
                                                        System.out.print("1. Modificar Altavoces\n"
                                                                + "2. Modificar Blu-Ray\n"
                                                                + "3. Modificar Limpieza\n"
                                                                + "4. Modificar Informacion del lector\n"
                                                                + "5. Modificar precio\n"
                                                                + "6. Modificar Color\n"
                                                                + "7. Modificar informacion garantia\n"
                                                                + "Ingrese ocpion: ");
                                                        int mod = leer.nextInt();
                                                        switch (mod) {
                                                            case 1: {
                                                                System.out.print("Ingrese el nuevo numeor de altavoces");
                                                                int auxiliar = leer.nextInt();
                                                                ((Teatros) productos.get(position)).setAltavoces(auxiliar);
                                                                break;
                                                            }
                                                            case 2: {
                                                                System.out.print("Ingrese el nuevo numero de discos Blu-ray soportado");
                                                                int auxiliar = leer.nextInt();
                                                                ((Teatros) productos.get(position)).setBluray(auxiliar);
                                                                break;
                                                            }
                                                            case 3: {
                                                                System.out.print("Ingrese la nueva informacion: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setLimpieza(auxiliar);
                                                                break;
                                                            }
                                                            case 4: {
                                                                System.out.print("Ingrese la nueva informacion: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setLector(auxiliar);
                                                                break;
                                                            }
                                                            case 5: {
                                                                System.out.print("Ingrese el nuevo precio: ");
                                                                double auxiliar = leer.nextDouble();
                                                                ((Teatros) productos.get(position)).setPrecio(auxiliar);
                                                                break;
                                                            }
                                                            case 6: {
                                                                System.out.print("Ingrese el nuevo Color: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setColor(auxiliar);
                                                                break;
                                                            }
                                                            case 7: {
                                                                System.out.print("Ingrese la nueva informacion de garantia: ");
                                                                String auxiliar = leer.next();
                                                                ((Teatros) productos.get(position)).setInfo(auxiliar);
                                                                break;
                                                            }
                                                            default: {
                                                                System.out.println("Opcion invalida");
                                                                break;
                                                            }
                                                        }

                                                    } else {
                                                        System.out.println("La posicion seleccionada no es valida");
                                                    }

                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Opcion invalida");
                                                    break;
                                                }
                                            }

                                            break;
                                        }

                                        case 2: {
                                            System.out.print("Ingrese la posicion de la tienda: ");
                                            int position = leer.nextInt();

                                            if (franquicia.get(position) instanceof Tiendas) {
                                                System.out.print("1. Modificar identificador\n"
                                                        + "2. Modificar Ubicacion\n"
                                                        + "3. Modificar Cantidad maxima de empleados\n"
                                                        + "4. Modificar Producto mas vendido\n"
                                                        + "5. Cantidad maxima de articulos por tienda\n"
                                                        + "6. Modificar numero de cajas\n"
                                                        + "Ingrese su opcion: ");
                                                int opt = leer.nextInt();

                                                switch (opt) {
                                                    case 1: {
                                                        System.out.println("Ingrese el nuevo identificador: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setIdentificador(id);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese la nueva ubicacion: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setUbicacion(id);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el nuevo maximo de empleados: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setMaxEmp(id);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.println("Ingrese el producto mas vendido: ");
                                                        String id = leer.next();
                                                        ((Tiendas) productos.get(position)).setmVendido(id);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.println("Ingrese el nuevo maximo de articulos por tienda: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setMaxProd(id);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.println("Ingrese el nuevo numero de cajas: ");
                                                        int id = leer.nextInt();
                                                        ((Tiendas) productos.get(position)).setCajas(id);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion invaliuda");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion Invalida");
                                            break;
                                        }

                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("ELIMINAR");
                                    System.out.print("1. Eliminar Producto\n"
                                            + "2. Eliminar Cliente\n"
                                            + "3. Eliminar Supervisor\n"
                                            + "4. Eliminar Asesor\n"
                                            + "5. Eliminar Tienda\n"
                                            + "6. Eliminar Cajero\n"
                                            + "Ingrese su opcion: ");
                                    int opt = leer.nextInt();

                                    switch (opt) {
                                        case 1: {
                                            System.out.print("Ingrese la posicion del producto que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (productos.get(position) instanceof Articulos) {
                                                productos.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("Ingrese la posicion del cliente que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (clientes.get(position) instanceof Personas) {
                                                clientes.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 3: {
                                            System.out.print("Ingrese la posicion del supervisor que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (supervisor.get(position) instanceof Personas) {
                                                supervisor.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 4: {
                                            System.out.print("Ingrese la posicion del asesor que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (asesor.get(position) instanceof Personas) {
                                                asesor.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 5: {
                                            System.out.print("Ingrese la posicion de la tienda que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (franquicia.get(position) instanceof Tiendas) {
                                                franquicia.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        case 6: {
                                            System.out.print("Ingrese la posicion del cajero que desea eliminar: ");
                                            int position = leer.nextInt();
                                            if (cajeros.get(position) instanceof Personas) {
                                                cajeros.remove(position);

                                            } else {
                                                System.out.println("La posicion seleccionada no es valida");
                                            }
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion invalida");
                                            break;
                                        }
                                    }

                                    break;
                                }
                                case 4: {
                                    System.out.println("\nCajeros");
                                    for (int j = 0; j < cajeros.size(); j++) {
                                        System.out.println(j + " - " + cajeros.get(j));
                                    }
                                    System.out.println("\nAsesores");
                                    for (int j = 0; j < asesor.size(); j++) {
                                        System.out.println(j + " - " + asesor.get(j));
                                    }
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion Invalida");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    for (int i = 0; i < asesor.size(); i++) {
                        if (((Personas) clientes.get(i)).getUser().equals(user) && ((Personas) clientes.get(i)).getClave().equals(contraseña)) {

                        }
                    }
                    break;
                }
                case 1: {
                    System.out.print("Crear Usuario\n"
                            + "Ingrese su Nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();
                    System.out.print("Seleccione su cargo:\n"
                            + "a. Cliente\n"
                            + "b. Cajero\n"
                            + "c. Supervisor\n"
                            + "d. Asesor Financiero\n"
                            + "Ingrese su opcion: ");
                    char cargo = leer.next().charAt(0);

                    switch (cargo) {
                        case 'a': {
                            System.out.print("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            double salario = leer.nextDouble();
                            System.out.print("Ingrese su nacionalidad: ");
                            String nacionalidad = leer.next();
                            System.out.print("Ingrese la cantidad de credito que tiene accesible: ");
                            double credito = leer.nextDouble();
                            System.out.println("Cuantos articulos ha comprado ultimamente? : ");
                            int art = leer.nextInt();

                            ArrayList<String> articulos = new ArrayList();
                            for (int i = 0; i < art; i++) {
                                System.out.print("Ingrese el nombre del articiulo: ");
                                String article = leer.next();
                                articulos.add(article);
                            }
                            System.out.print("Cuantas veces ha comprado en este local?: ");
                            int veces = leer.nextInt();
                            System.out.print("Ingrese la direccion de su domicilio: ");
                            String domicilio = leer.next();

                            clientes.add(new Clientes(credito, veces, domicilio, user, contraseña, nombre, apellido, salario, nacionalidad, articulos));
                            break;
                        }
                        case 'b': {
                            System.out.print("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            double salario = leer.nextDouble();
                            System.out.print("Ingrese su nacionalidad: ");
                            String nacionalidad = leer.next();
                            System.out.print("Ingrese la cantidad de años que lleva trabajando en Diunsa: ");
                            int años = leer.nextInt();
                            System.out.print("Ingrese su horario de trabajo: ");
                            String horario = leer.next();
                            System.out.print("Ingrese su horario de almuerzo: ");
                            String lunch = leer.next();
                            System.out.print("Ingrese su meta de numero de ventas: ");
                            double meta = leer.nextDouble();
                            System.out.print("Ingrese el numero de clientes atendidos: ");
                            int atendidos = leer.nextInt();

                            cajeros.add(new Cajero(años, horario, lunch, meta, atendidos, user, contraseña, nombre, apellido, salario, nacionalidad));
                            break;
                        }
                        case 'c': {
                            System.out.print("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            double salario = leer.nextDouble();
                            System.out.print("Ingrese su nacionalidad: ");
                            String nacionalidad = leer.next();
                            System.out.print("Ingrese el numero de cajeros que supervisa: ");
                            int cajero = leer.nextInt();
                            System.out.print("Ingrese el salario promedio de los cajeros supervisados: ");
                            double salarioP = leer.nextDouble();
                            System.out.print("Ingrese la meta de ventas promedio de los cajeros supervisados: ");
                            double metaP = leer.nextDouble();

                            supervisor.add(new Supervisor(cajero, salarioP, metaP, user, contraseña, nombre, apellido, salario, nacionalidad));
                            break;
                        }
                        case 'd': {
                            System.out.print("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.print("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            double salario = leer.nextDouble();
                            System.out.print("Ingrese su nacionalidad: ");
                            String nacionalidad = leer.next();
                            System.out.print("Ingrese el numero de clientes atendidos: ");
                            int atendidos = leer.nextInt();
                            System.out.print("Ingrese el numero de productos comprados: ");
                            int products = leer.nextInt();
                            System.out.print("Ingrese el numero de creditos otorgados: ");
                            int creditos = leer.nextInt();

                            asesor.add(new Asesor(atendidos, products, creditos, user, contraseña, nombre, apellido, salario, nacionalidad));
                            break;
                        }
                        default: {
                            System.out.println("Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    res = true;
                    resp = 2;
                    System.out.print("Ha cerrado el sistema");
                    break;
                }
                default: {
                    System.out.println("Opcion Invalida");
                    break;
                }
            }
        }

        while (resp == 1) {
            System.out.println("");
        }
    }

}
