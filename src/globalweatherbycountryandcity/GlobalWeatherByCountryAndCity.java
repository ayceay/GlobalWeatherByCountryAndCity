/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalweatherbycountryandcity;

/**
 *
 * @author Administrator
 */
public class GlobalWeatherByCountryAndCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getWeather("sivas", "turkey"));
    }

    private static String getWeather(java.lang.String cityName, java.lang.String countryName) {
        tr.gov.ptt.GlobalWeather.clients.GlobalWeather service = new tr.gov.ptt.GlobalWeather.clients.GlobalWeather();
        tr.gov.ptt.GlobalWeather.clients.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getWeather(cityName, countryName);
    }
    
}
