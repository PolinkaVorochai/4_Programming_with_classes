package part_4.Task_15.bean;

import java.util.ArrayList;
import java.util.Comparator;

public class TourAggregator {
    private ArrayList<Tour> tourArrayList;


    public TourAggregator(ArrayList<Tour> tourArrayList) {
        this.tourArrayList = tourArrayList;
    }

    public ArrayList<Tour> getTourArrayList() {
        return tourArrayList;
    }

    public void setTourArrayList(ArrayList<Tour> tourArrayList) {
        this.tourArrayList = tourArrayList;
    }

    /*
    метод: набор предложений по экскурсиям
     */
    public void printOfTheExcursions(String theExcursion) {
        for (Tour x : tourArrayList) {
            if (x.getExcursions().equals(theExcursion)) {
                System.out.println(x);
            }
        }
    }


    /*
    метод: набор предложений по лечению
     */
    public void printOfTheTreatment(Treatment theTreatment) {
        for (Tour x : tourArrayList) {
            if (x.getTreatment().equals(theTreatment)) {
                System.out.println(x);
            }
        }
    }

    /*
  метод: набор предложений по шопингу
   */
    public void printOfTheShop(Shop theShop) {
        for (Tour x : tourArrayList) {
            if (x.getShop().equals(theShop)) {
                System.out.println(x);
            }
        }
    }

    /*
метод: набор предложений по круизу
 */
    public void printOfTheCruise(Cruise theCruise) {
        for (Tour x : tourArrayList) {
            if (x.getCruise().equals(theCruise)) {
                System.out.println(x);
            }
        }
    }

    /*
метод: набор предложений по количествам дней
*/
    public void printOfTheDays(Days theDays) {
        for (Tour x : tourArrayList) {
            if (x.getDays().equals(theDays)) {
                System.out.println(x);
            }
        }
    }

    /*
метод: набор предложений по транспорту, питанию, числам дней
*/
    public void printOfTheOffer(Transport transport, Eat eat, Days days) {
        for (Tour x : tourArrayList) {
            if (x.getTransport().equals(transport) && x.getEat().equals(eat) && x.getDays().equals(days)) {
                System.out.println(x);
            }
        }
    }

    /*
метод: сортировка по отелю
*/
    public void sortOfTheHotel() {
        tourArrayList.sort(new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {

                return o1.getHotel().compareTo(o2.getHotel());
            }
        });
        for (Tour x : tourArrayList) {
            System.out.println(x);
        }
    }
}
