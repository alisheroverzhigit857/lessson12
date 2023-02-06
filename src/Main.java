public class Main {
    public static void main(String[] args) {
        Country1 country1 = new Country1();
        country1.setCountry1("Kyrgyzstan ");
        country1.setCountry2("Qatar ");
        country1.setCountry3("Saudi Arabia ");
        country1.setCountry4("Turkey ");

        City1 city1 = new City1();
        city1.setCityName1("Bishkek ");
        city1.setCityName2("Doha ");
        city1.setCityName3("Er-Riyad ");
        city1.setCityName4("Stambul ");

        Adress1 adress1 = new Adress1();
        adress1.setRegion("Archa-Beshik ");
        adress1.setVillage("Archa-Beshik ");
        adress1.setStreet("Archa-Beshik ");
        adress1.setHomeNumber(26.102);

        Person1 person1 = new Person1();
        person1.setFirstName("Malik: ");
        person1.setLastName("Turatbekov: ");
        person1.setAge(19);
        person1.setGender("Man");

        Country1 [] country1s = {country1};
        for (Country1 d : country1s ) {
            System.out.println("Country: "+d.getCountry1());
        }

        City1 [] city1s = {city1};
        for (City1 c : city1s ) {
            System.out.println("City: "+c.getCityName1() );
        }

        Adress1 [] adress1s = {adress1};
        for (Adress1 a : adress1s ) {
            System.out.println("Region: "+a.getRegion()+"\nSelo: "+a.getVillage()+"\nKocho : "+a.getStreet()+"\nHome number: "+a.getHomeNumber());
        }

        Person1 [] person1s = {person1} ;
        for (Person1 p : person1s ) {
            System.out.println( "First name: "+p.getFirstName()+"\nLast name: "+p.getLastName()+"\nAge: "+p.getAge()+"\nGender: "+p.getGender());
        }


    }
}