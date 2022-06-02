package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.PlayPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class MyStepdefs {

    PlayPage page = new PlayPage();

    @Given("kullanici {string} uygulamasini kontrol eder ve ids.properties dosyasina ekler")
    public void kullaniciUygulamasiniKontrolEderVeIdsPropertiesDosyasinaEkler(String id) {

        //List<String> list = table.asList(String.class);

        //for(Object s : list){
            Driver.getDriver().get("https://play.google.com/store/apps/details?id="+id+"&hl=en_US&gl=US");

            try{
                if(page.alertText.isDisplayed()){
                    BrowserUtilities.writeDataToIdsFile(id,"false");
                }
            }catch (Exception e){

            }
        //}

    }

}
