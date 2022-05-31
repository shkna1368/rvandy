package pattern_matching;

public sealed interface Service permits Car, Truck {

    int getMaxServiceIntervalInMonths();


}