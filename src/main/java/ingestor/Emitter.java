package ingestor;

import producer.Producer;
import producer.PseudoProducer;

import java.util.List;

public class Emitter {

    Producer producer;
    List<Event> events;

    public static void main(String[] args) {
        Emitter emitter = new Emitter();
        emitter.producer = new PseudoProducer();
        emitter.events = emitter.producer.loadDataInMemory();
        emitter.emitLogic();
    }

    public void emitLogic() {
        for (Event event: events)
            producer.emit(event);
    }
}
