package serveur;

import service.BanqueService;
import service.TransactionService;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8585/serveur/";

//        Endpoint.publish(url, new BanqueService());
        Endpoint.publish(url, new TransactionService());
        System.out.println("Serveur running at " +url);
    }
}
