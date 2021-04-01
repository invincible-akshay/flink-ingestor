package producer;

import ingestor.Event;

import java.util.List;

public interface Producer {
    /*
    Interface to emit data over socket in form of Events
    2 implementations - 1. Data from File; 2. Generated data
    Threaded implementation to send data
    In each second, emit events for each object and then pause
    for the second to complete.
    Some interleaved emits should also be done, to test the windowing feature
    on the ingestor.Consumer end.
     */
    public List<Event> loadDataInMemory();
    public void emit(Event e);
}
