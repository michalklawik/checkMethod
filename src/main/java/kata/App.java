package kata;

import javax.ws.rs.HEAD;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import java.net.URI;
import java.net.URISyntaxException;


public class App 
{
    public static void main( String[] args ) throws URISyntaxException {
        URI address;
        final Client client = ClientBuilder.newClient();

//        Scanner scr = new Scanner(System.in);
//        System.out.print("Podaj adres strony: ");
//        address = new URI(scr.next());
        final WebTarget webTarget = client.target("https://restcountries.eu/#api-endpoints");

        System.out.println();
    }
}
