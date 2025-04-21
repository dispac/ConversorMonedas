/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversormoneda;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 *
 * @author Alex Francys
 */
public class ConversorApp {

public static void main(String[] args) throws NumberFormatException, InterruptedException
{
 int opcion;
 Scanner eleccion = new Scanner(System.in);
 
 do{
 
     opcion= menuPrincipal();

 
  switch (opcion){
    
     case 1: {
     
             
         System.out.print("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/COP/USD/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado Peso Colombiano a Dolar: "+resultado);
             
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
         break;
        }
     case 2: {
            System.out.print("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/USD/COP/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado de Dólar a peso colombiano: "+resultado);
             
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
       break;
       }
 
     case 3:{
         
         System.out.print("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/COP/EUR/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado de Pesos Colombianos a Euros: "+resultado);
             
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
         
        break;
        } 
     case 4:{
        System.out.println("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/EUR/COP/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado de Euros a Pesos Colombianos: "+resultado);
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
       break;  
        }  
     case 5:{
          System.out.println("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/COP/PEN/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado de Pesos Colombianos a Soles: "+resultado);
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
         
         
         
        break;
        }
     
     case 6: {
         System.out.println("Digite el monto a convertir:");
         
         double monto=eleccion.nextDouble();
         
         try{
             String direccion ="https://v6.exchangerate-api.com/v6/92d7b426499dfc23087ee9f2/pair/PEN/COP/"+Double.toString(monto);
             HttpClient cliente = HttpClient.newHttpClient();
             HttpRequest solicitud = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
             
             HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
             
             String json = respuesta.body();
             //System.out.println(json);
             JsonElement jsonElement = JsonParser.parseString(json);
             JsonObject jsonObject = jsonElement.getAsJsonObject();
             String resultado = jsonObject.get("conversion_result").getAsString();
             String monedaOrigen = jsonObject.get("base_code").getAsString();
             String monedaDestino= jsonObject.get("target_code").getAsString();
             System.out.println("Moneda base:" + monedaOrigen);
             System.out.println("Moneda destino: "+ monedaDestino);
             System.out.println("Resultado de Soles a Pesos Colombianos : "+resultado);
             
         } catch (NumberFormatException | IOException | InterruptedException e)
         {
          e.printStackTrace();
         } 
         
        break;
     }
     
 }
 
 
 
 }while(opcion!=7);
  
} 


public static int menuPrincipal()
{
 int opcion;

 Scanner eleccion = new Scanner(System.in);
 
 System.out.print("""
                    ***Bienvenidos al Sistemas Conversor de Monedas***
                    1. Peso Colombiano (COP) a Dolar (USD).
                    2. Dolar (USD) a Peso Colombiano (COP).
                    3. Peso Colombiano (COP) a Euros (EUR).
                    4. Euros (EUR) a Pesos Colombianos (COP).
                    5. Pesos Colombianos (COP) a Soles(PEN). 
                    6. De Soles (PEN) a Pesos Colombianos (COP).
                    7. Salir
                    Digite su opción:
                    """);
 opcion = Integer.parseInt(eleccion.next());
 
return opcion;

    
}

}

