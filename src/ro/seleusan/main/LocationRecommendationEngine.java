package ro.seleusan.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LocationRecommendationEngine {

    private List<TouristicLocation> locations;

    public LocationRecommendationEngine() {

        locations = new ArrayList<>();

        initialiseLocations();

    }

    private void initialiseLocations() {

        locations.add(new TouristicLocation("Hawaii Beach", LocationType.BEACH, 4.8));
        locations.add(new TouristicLocation("Swiss Alps", LocationType.MOUNTAIN, 4.6));
        locations.add(new TouristicLocation ("Paris", LocationType.CITY, 4.9));
        locations.add (new TouristicLocation ("Machu Picchu", LocationType.HISTORICAL, 4.7));

        //add different locations as needed

        (LocationType preferredType) {
            List <TouristicLocation> filteredLocations =new ArrayList<>;
            for (TouristicLocation location:locations){
                if (location.getType()==preferredType) {
                    filteredLocations.add(location);
                }

                if(filteredLocation.isEmpty()) {
                    return null; //No matching location found
                }

                //Select randomly a location from the filtered list
                Random random= new Random;
                return filteredLocations.get(random.nextInt(filteredLocations.size()));


                }
                }
            }

        }



}
