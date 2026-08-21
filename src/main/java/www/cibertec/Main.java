package www.cibertec;

public class Main {

    //Metodo para calcular el precio de la entrada según la zona
    public static double calcularPrecioEntrada(int zona) {
        double precio = 0.0;

        if (zona == 1) {
            precio = 15.0;
        } else if (zona == 2) {
            precio = 25.0;
        } else {
            precio = 35.0;
        }

        return precio;
    }
    //Metodo Main
    public static void main(String[] args) {

        //Declaración de variables
        String pelicula = "Spider-Man", nombreZona = "";
        int cantidadEntradas = 1, opcionZona = 2;
        double precioCanchita = 12.50; //deje los double separados para que se pueda entener mejor
        double costoEntrada;
        double totalEntradas = 0;
        boolean incluyeBebida = true;

        //Validamos el nombre de la zona con un switch case para asignar el nombre correspondiente
        switch (opcionZona) {
            case 1:
                nombreZona = "General";
                break;
            case 2:
                nombreZona = "VIP";
                break;
            case 3:
                nombreZona = "Platino";
                break;
        }

        //Llamamos al metodo para obtener el costo de la entrada
        costoEntrada = calcularPrecioEntrada(opcionZona);

        //Bucle que imprime cada entrada generada y acumula el total
        for (int contador = 1; contador <= cantidadEntradas; contador++) {
            totalEntradas = totalEntradas + costoEntrada; //calculamos el precio total de las entradas
            System.out.println("Entrada generada N° " + contador + " - Costo: S/. " + costoEntrada);
        }

        double totalPagar = totalEntradas + precioCanchita;

        //Salida de resultados
        System.out.println("==========================================");
        System.out.println("            BOLETA DE CINE                ");
        System.out.println("==========================================");
        System.out.println(" Película:           " + pelicula);
        System.out.println(" Incluye bebida:     " + incluyeBebida);
        System.out.println(" Zona elegida:       " + nombreZona);
        System.out.println(" Entradas compradas: " + cantidadEntradas);
        System.out.println("------------------------------------------");
        System.out.println(" Subtotal entradas:  S/. " + totalEntradas);
        System.out.println(" Precio canchita:    S/. " + precioCanchita);
        System.out.println(" TOTAL A PAGAR:      S/. " + totalPagar);
        System.out.println("==========================================");
    }
}