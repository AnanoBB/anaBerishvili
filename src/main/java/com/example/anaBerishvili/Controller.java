package com.example.anaBerishvili;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class Controller {



    public List<Model> getWeather() {
        List<Model> weather=new ArrayList<>();
        weather.add(new Model("Tbilisi",65,"EAST",13,21,31));
        weather.add(new Model("Batumi",15,"WEST",45,30,12));
        return weather;
    }

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Model> getWeathers() {
        return getWeather();
    }

    @GET
    @Path("/city/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Model getStudent(@PathParam("city") String cityName) {
        Model weatherForReturn = null;
        for(Model city: getWeathers()) {
            if(city.getCityName().equals(cityName)) {
                weatherForReturn = city;
            }else {
                weatherForReturn =  new Model("404",0,"404",0,0,0);
            }
        }
        return weatherForReturn;
    }
    


}

