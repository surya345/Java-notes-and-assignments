import java.util.Arrays;
import java.util.Scanner;
class Challenge23{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of route details to be entered...");
        int numberRoute = input.nextInt();
       String[] routeDetails = getRouteData(numberRoute);
       printRouteDetails(routeDetails);
        DirectFlights(routeDetails);
       Connections(routeDetails);
       System.out.println("----------------------------------------------");
    }
    private static void Connections(String[] routeDetails) {
        String curTCity="";
        System.out.println("Please enter Source route");
        String fromCity=input.nextLine();
        System.out.println("Please enter Destination route");
        String toCity=input.nextLine();
        System.out.println();
        System.out.println("Sl.No    tFrom    To    Distance(Kms)    Time    tCost");
        for(int i=0;i<routeDetails.length;i++)
        {
            if(routeDetails[i].contains(toCity) || routeDetails[i].contains(fromCity))
            {
                String[] splitArray = routeDetails[i].split(", ");
                if(splitArray[0].equalsIgnoreCase(fromCity) && splitArray[1].equalsIgnoreCase(toCity))
                {
                    for (String a : splitArray) {
                        System.out.print("   "+a+"   ");
                     }
                     System.out.println();
                }
                else
                {
                 int frtIndex = i;
                curTCity = splitArray[1];
                IteratesplitArray(curTCity,routeDetails,toCity,fromCity,frtIndex);
                }
            }           
    }
}
    private static void IteratesplitArray(String curTCity, String[] routeDetails,String toCity,String fromCity,int frtIndex) {
        int secIndex = 0;
        for(int i=0;i<routeDetails.length;i++)
        {
            if(routeDetails[i].contains(toCity) || routeDetails[i].contains(fromCity))
            {
                String[] splitArray = routeDetails[i].split(", ");
                if(curTCity.equalsIgnoreCase(splitArray[0]) && splitArray[1].equalsIgnoreCase(toCity))
                {
                    secIndex= i;
                    printConnectedRoute(routeDetails,frtIndex,secIndex);
                }
            }
                }  
            }
            private static void printConnectedRoute(String[] routeDetails, int frtIndex, int secIndex) {
               float totCost = 0f;
               float costOfFrst=0;
               float costOfSecond = 0 ;
               String StrcostOfFirst="";
               String StrcostOfSecond="";
               int frstDistance =0;
               int secDistance =0;
              String[] frstSpltConnected = routeDetails[frtIndex].split(", ");
              String[] secSpltConnected = routeDetails[secIndex].split(", ");
              for (String frst : frstSpltConnected) {
                System.out.print("   "+frst+"   ");
                StrcostOfFirst = frstSpltConnected[4];
                frstDistance = Integer.parseInt(frstSpltConnected[2]);
              }
              System.out.println();
              for (String secd : secSpltConnected) {
                System.out.print("   "+secd+"   ");
                StrcostOfSecond = secSpltConnected[4];
                secDistance =Integer.parseInt(secSpltConnected[2]);
              }
              if(StrcostOfFirst.contains("EUR") && (StrcostOfSecond.contains("INR")))
              {
                costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*0.011f;
                    totCost = (costOfFrst+costOfSecond);
                    System.out.println("\n\tTotal----> "+totCost+" EUR"+"  Distance---> "+(frstDistance+secDistance));
              }
             else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("EUR")))
              {
                    costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                    costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*90.49f;
                    totCost = (costOfFrst+costOfSecond);
                    System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
              }
              else if(StrcostOfFirst.contains("USD") && (StrcostOfSecond.contains("INR")))
              {
                    costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                    costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*0.014f;
                    totCost = (costOfFrst+costOfSecond);
                    System.out.println("\n\tTotal----> "+totCost+" USD"+"  Distance---> "+(frstDistance+secDistance));
              }
              else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("USD")))
              {
                    costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                    costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*73.66f;
                    totCost = (costOfFrst+costOfSecond);
                    System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
              }
              else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("INR")))
              {
                    costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                    costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3));
                    totCost = (costOfFrst+costOfSecond);
                    System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
              }
              System.out.println();
            }
private static void DirectFlights(String[] routeDetails) {
        System.out.println("Enter the name of the city on Board");
        String fromCity = input.nextLine();
        Arrays.sort(routeDetails);
        System.out.println("Sl.No    tFrom    To    Distance(Kms)    Time    tCost");
        for(int i=0;i<routeDetails.length;i++)
        {
            String[] splitArray = routeDetails[i].split(",");
            if(fromCity.equalsIgnoreCase(splitArray[0]))
            {
                System.out.print((i+1));
                for (String a : splitArray) {
                    System.out.print("   "+a+"   ");
                }
                System.out.println();
            }
        }
        System.out.println("-------------------------------------------------------");
    }
    private static String[] getRouteData(int numberRoute) {
        String routes[] = new String[numberRoute];
        input.nextLine();
        System.out.println("Please enter Source City, Destination City, Distance in kms, Typical flight time, Typical ticket cost");
        for(int i=0;i<numberRoute;i++)
        {
        String routeInfo = input.nextLine();
        routes[i]=routeInfo;
        }
        return routes;
    }
    private static void printRouteDetails(String[] routeDetails) {
        System.out.println("Sl.No    tFrom    To    Distance(Kms)    Time    tCost");
        for(int i=0;i<routeDetails.length;i++)
        {
            String[] splitArray = routeDetails[i].split(",");
            System.out.print((i+1));
            for (String a : splitArray) {
                System.out.print("   "+a+"   ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
    }
}