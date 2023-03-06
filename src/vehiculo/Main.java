
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoCalatayudCastilloFranciscaDeAsis2223 miVehiculo;
        int stockActual;
        
        miVehiculo = new VehiculoCalatayudCastilloFranciscaDeAsis2223("Seat",18000,100);
        operativaVehiculosCalatayudCastilloFranciscaDeAsis2223(miVehiculo, 50); 
    }

    private static void operativaVehiculosCalatayudCastilloFranciscaDeAsis2223(VehiculoCalatayudCastilloFranciscaDeAsis2223 miVehiculo, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
