import java.util.ArrayList;
import java.util.List;

public class Contract {
    private final List<Payment> paymentList = List.of();
    private final List<ContractPayEvent> payEvents = new ArrayList<>();
    private final List<ContractPayEvent2> payEvents2 = new ArrayList<>();

    public void addPayment(Payment payment,List<ContractPayEvent> events){
        for(ContractPayEvent event: events){
            event.fire(new PayEvent());
        }
    }

    public void addEvent(ContractPayEvent event,List<ContractPayEvent> events){
        events.add(event);
    }

    public void removeEvent(ContractPayEvent event,List<ContractPayEvent> events){
        events.remove(event);
    }
}
