package IoTSensorReadings;

import java.util.*;

public class SensorReadings {
 public static void main(String[] args) {

     List<Sensor> sensors = Arrays.asList(
             new Sensor("S1",84.6),
             new Sensor("S2",38.2),
             new Sensor("S3",10.4),
             new Sensor("S4",49.1),
             new Sensor("S5",95.0)
     );

     double threshold=50.0;
     // Stream with filter() and forEach()
     sensors.stream()
             .filter(s -> s.getReading() > threshold)
             .forEach(s ->System.out.println("ALERT: "+s)
             );
 }
}
