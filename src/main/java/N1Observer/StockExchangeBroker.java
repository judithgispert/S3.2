package N1Observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public class StockExchangeBroker {
    private List<StockExchangeAgency> agenciesList = new ArrayList<StockExchangeAgency>();
    private int status;

    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
        notifyAllAgencies();
    }
    public void addAgency(StockExchangeAgency agency){
        agenciesList.add(agency);
    }
    public void notifyAllAgencies(){
        agenciesList.forEach(l -> l.update());
    }
}
