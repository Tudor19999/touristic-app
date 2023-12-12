package ro.seleusan.main;

public class TouristicLocationApp {
    public static void main (String[] args) {
        LocationRecommendationEngine recommendationEngine = new
                LocationRecommendationEngine();

        //Recommend a beach location
        TouristicLocation beachLocation =
                recommendationEngine.recommendLocation(LocationType.BEACH);
        System.out.println("Recommended Beach Location:" + beachLocation);

        //Recommend a historical location
        TouristicLocation historicalLocation
        TouristicLocation historicalLocation =
                recommendationEngine.recommendLocation(LocationType.HISTORICAL);
        System.out.println("Recommended Historical Location:" + historicalLocation);

    }



    }


}
