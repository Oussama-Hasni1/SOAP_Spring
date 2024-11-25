package ma.emsi.soap_project.serveur;

import jakarta.xml.ws.Endpoint;
import ma.emsi.soap_project.service.EtudiantWService;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }

}
