package example;

import example.paramconverter.MyBeanConverterProvider;
import example.paramconverter.MyConverterProvider;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


/**
 * Created by Olga Pavlova on 2/3/2016.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://localhost:8080/endpoint");
    target.register(MyBeanConverterProvider.class);
    target.register(MyConverterProvider.class);


    System.out.println(target.request().get().readEntity(String.class));

  }
}
