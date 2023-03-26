package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class Api {
    //solicitar conexión con la api
    //Map son estructuras que almacenan parejas clave, valor

    Map<String, Double> monedas = new HashMap<>();

    private JSONObject infoJson() throws Exception {
        URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=c15e083396274ee38a6808cbdc4b2f06");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.connect();

        //comprobar que la conexión es correcta
        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            System.out.println("Error de conexión " + responseCode);
        } else {
            //obtener la informacion de la api
            StringBuilder informationString = new StringBuilder();
            Scanner entrada = new Scanner(url.openStream());//abrir el flujo de datos a la url
            while (entrada.hasNext()) {
                informationString.append(entrada.next());
            }
            //System.out.println(informationString);
            entrada.close();
        }

        //Leer archivo json del la api
        // BufferedReader permite leer texto de un imputStream de forma sencilla(caracteres, arrays y lineas)
        BufferedReader jn = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String objReader;
        StringBuilder Cadatexto = new StringBuilder();

        while ((objReader = jn.readLine()) != null) {
            //el ciclo lee el archivo hasta que llegue al final del archivo
            Cadatexto.append(objReader);
        }
        jn.close();

        JSONObject json = new JSONObject(Cadatexto.toString());

        return json;
    }

    public Map<String, Double> map() {
        try {
            JSONObject json = infoJson();

            JSONObject rates = json.getJSONObject("rates");
            Iterator<String> keys = rates.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Double value = rates.getDouble(key);
                monedas.put(key, value);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return monedas;
    }
}
