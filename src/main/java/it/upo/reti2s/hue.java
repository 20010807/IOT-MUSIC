package it.upo.reti2s;

import java.util.Map;

public class hue {

    // the URL of the Philips Hue bridge
    String baseURL = "http://172.30.1.138";

    // example username, generated by following https://www.developers.meethue.com/documentation/getting-started
    //String username = "1jlyVie2nvwtNwl0hv8KdZOO0okdvNcIIdPXWsdX";
    String username = "iI5Cp8sDO0rRhBzDshhAa8JBd20XGduxMnSBkR7W";

    // base URL for lights
    String lightsURL = baseURL + "/api/" + username + "/lights/";
    String callURL = lightsURL + "3/state";
    String body = "{ \"on\" : true, \"effect\" : \"colorloop\" }";
    // get the Hue lamps

    Map<String, ?> allLights = rest.get(lightsURL);


    int var = rest.put(callURL, body, "application/json");



}


    // iterate over the Hue lamps and turn them off
     /*   for (String light : allLights.keySet()) {
        String callURL = lightsURL + light + "/state";
        String body = "{ \"on\" : true }";
        rest.put(callURL, body, "application/json");
    }*/


