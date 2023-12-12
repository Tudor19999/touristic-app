package ro.seleusan.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TouristicLocation {

    private String name;

    private LocationType type;

    private double rating;

    public TouristicLocation(LocationType type) {
        this.type = type;
    }

    public TouristicLocation(double rating) {
        this.rating = rating;
    }

    public TouristicLocation(String name) {
        this.name = name;
    }
        public String getName() {
            return name;
        }

            public LocationType getType() {

                return type;
            }
            public double getRating() {

                return rating;

            }

            @Override
    public String toString() {
                return name + "(" + type + ", Rating:" + rating + ")";

            }




            }





        }


    }
}


