package producer;

import ingestor.Event;

import java.util.ArrayList;

public class FileBasedProducer implements Producer {
    @Override
    public ArrayList<Event> loadDataInMemory() {
        /*
        Read the binary files generated by simulators
        and create event POJOs and store in-memory.
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
