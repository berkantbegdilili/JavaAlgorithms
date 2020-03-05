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
        if(select.equalsIgnoreCase("1")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=29";
        } else if(select.equalsIgnoreCase("2")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=8";
        } else if(select.equalsIgnoreCase("3")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=9";
        } else if(select.equalsIgnoreCase("4")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=32";
        } else if(select.equalsIgnoreCase("5")){
            return "http://www.kutahya.bel.tr/ulasim2mobil.asp?islem=saat&id=35";
        } else{
            return "";
        }
    }
    
    /**
     * 
     * @return Bugunu Dondurur
     */
    public String getToday() {
        if(today.contains(SATURDAY[0]) || today.contains(SATURDAY[1])){
            return "saturday";
        } else if(today.contains(SUNDAY[0]) || today.contains(SUNDAY[1])){
            return "pazar";
        } else{
            return "weekday";
        }
    }
}