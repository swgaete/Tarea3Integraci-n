//trabajo final

package integra10paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

/**
 *
 * @author Wladimir
 */
@WebService(serviceName = "paises")
public class paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obtenerCiudades")
    public String[] obtenerCiudades(@WebParam(name = "pais") String pais) {
        // se crea cliente para servicio global weather
        GlobalWeather gw = new GlobalWeather();
        Airport a = new Airport();
        AirportSoap as = a.getAirportSoap();
        
        // se obtiene cliente soap
        GlobalWeatherSoap gwSoap= gw.getGlobalWeatherSoap();
        String[] resultado = {gwSoap.getCitiesByCountry(pais),as.getAirportInformationByCountry(pais)};
        // se llama al servicio
        // llamada se produce de manera sincrona, por lo que el retorno
        // queda en variable cities
              
        return resultado;
    }
}
