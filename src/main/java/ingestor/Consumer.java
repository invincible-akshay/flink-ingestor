package ingestor;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class Consumer {
    /*
    Receive traces over socket, sent by Producers
    Each received event is of form <obj_id, timestamp, lat, lon>
    Collect all events of ith timestamp in a 10 sec window and reduce
    Pass on the collected events as argument to Cpp program using JNI
    */

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //Parallelism Factor
        System.out.println("Parallelism: " + env.getParallelism());

        env.execute();
    }
}
