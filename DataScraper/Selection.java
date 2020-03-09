package bb_projects.DataScraper;

/**
 * Secim Sinifi
 * 
 * @author berkant.begdilili@ogr.dpu.edu.tr
 */
public class Selection {
    private String select;
    private String today;
    private final String[] SATURDAY = {"cumartesi","saturday"};
    private final String[] SUNDAY = {"pazar","sunday"};

    public Selection(Byte select,String today) {
        this.select = select.toString().trim();
        this.today = today;
    }

    /**
     * 
     * @return Secilen Rotadan Cekilecek Verilerin Oldugu Adresi Dondurur
     */
    public String getSelect() {
        if(select.equals("1")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=29";
        } else if(select.equals("2")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=8";
        } else if(select.equals("3")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=9";
        } else if(select.equals("4")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=32";
        } else if(select.equals("5")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=5";
        } else{
            return "";
        }
    }
    
    /**
     * 
     * @return Bugunu Dondurur
     */
    public String getToday() {
        if(today.equals(SATURDAY[0]) || today.equals(SATURDAY[1])){
            return "saturday";
        } else if(today.equals(SUNDAY[0]) || today.equals(SUNDAY[1])){
            return "sunday";
        } else{
            return "weekday";
        }
    }
}