package producer;

import ingestor.Event;

import java.util.ArrayList;

public class PseudoProducer implements Producer {
    @Override
    public ArrayList<Event> loadDataInMemory() {
        /*
        Generate fake Event POJOs and store in-memory
         */
        return null;
    }

    @Override
    public void emit(Event e) {
        /*
        Send the event over socket to Producer
         */
    }
}
