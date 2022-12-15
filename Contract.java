import java.util.ArrayList;
import java.util.List;

public class Contract {
    private final List<Payment> paymentList = List.of();
    private final List<ContractPayEvent> payEvents = new ArrayList<>();

    public void addPayment(Payment payment){
        for(ContractPayEvent event: payEvents){
            event.fire(new PayEvent());
        }
    }

    public void addEvent(ContractPayEvent event){
        payEvents.add(event);
    }

    public void removeEvent(ContractPayEvent event){
        payEvents.remove(event);
    }
}
