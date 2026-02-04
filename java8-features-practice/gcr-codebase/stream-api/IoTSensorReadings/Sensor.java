package IoTSensorReadings;

class Sensor {
 private String id;
 private double reading;
 public Sensor(String id, double reading) {
     this.id=id;
     this.reading=reading;
 }
 public String getId() {
     return id;
 }
 public double getReading() {
     return reading;
 }
 @Override
 public String toString() {
     return "Sensor "+id+" -> Reading: "+ reading;
 }
}
