package Testrun;

import common.WebAPI;
import coverage.HomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class southWTestRun extends WebAPI {

    static HomePag SouthWest ;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        SouthWest= PageFactory.initElements(driver, HomePag.class);
    }
    @Test(priority = 0)
    public void vacationm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
    }
    /*
     @Test(priority = 1)
    public void bookflightm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.bookflightm();
    }
     @Test(priority = 2)
    public void routemapm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.routemapm();
    }
    @Test(priority = 3)
    public void flightschedulem()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.flightschedulem();
    }
     @Test(priority = 4)
    public void internationalTravelm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.internationalTravelm();
    }
    @Test(priority = 5)
    public void flightoffersm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.internationalTravelm();
    }
     @Test(priority = 6)
    public void  lowfarem()  throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.lowfarem() ;
    }
     @Test(priority = 7)
    public void upgradem()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.upgradem() ;
    }
    @Test(priority = 8)
    public void bookhotelm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.bookhotelm() ;
    }
    @Test(priority = 9)
    public void morethanHotelm()throws InterruptedException {

        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.morethanHotelm() ;
    }
     @Test(priority = 10)
    public void managerreservationm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.managerreservationm() ;
    }
    @Test(priority = 11)
    public void hotelOfferm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.hotelOfferm() ;
    }
     @Test(priority = 12)
    public void baseratem() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.baseratem() ;
    }
    @Test(priority = 13)
    public void rapidrewards() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.rapidrewards() ;
    }
     @Test(priority = 14)
    public void whybookm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.whybookm() ;
    }
    @Test(priority = 15)
    public void scarentalm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.scarentalm() ;
    }
    @Test(priority = 16)
    public void managereservationm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.managereservationm() ;
    }
    @Test(priority = 17)
    public void caroffersm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.caroffersm() ;
    }
    @Test(priority = 18)
    public void bookvacationm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.bookvacationm()  ;
    }
    @Test(priority = 19)
    public void managervacationm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.managervacationm()  ;
    }
    @Test(priority = 20)
    public void vacationpackgem() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        SouthWest.vacationm();
        SouthWest.vacationpackgem()  ;
    }
*/
}
