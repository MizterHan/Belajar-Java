package programmer.zaman.now.application;

import programmer.zaman.now.data.Application;
import programmer.zaman.now.data.Constant;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);
        
        System.out.println(MathUtil.sum(1,1,1,1,1));
        
        // // mengakses country
        // Country country = new Country();
        // country.setName("Indonesia");
        // System.out.println(country.getName());
        
        // // mengakses city
        // Country.City city = new Country.City();
        // city.setName("Jakarta");
        // System.out.println(city.getName());
        
        
        
        Country.City city = new Country.City();
        city.setName("Subang");
        
        System.out.println(city.getName());
        
        System.out.println(Application.PROCESSORS);
        
        
        // System.out.println(Application.PROCESSORS);
    }
    
}
