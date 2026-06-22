package adapter;

class FahrenheitSensor {
    public double getTemperatureF() {
        return 86;
    }
}

interface CelsiusSensor {
    double getTemperatureC();
}

class SensorAdapter implements CelsiusSensor {
    private FahrenheitSensor sensor;

    public SensorAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureC() {
        return (sensor.getTemperatureF() - 32) * 5 / 9;
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        CelsiusSensor sensor =
                new SensorAdapter(new FahrenheitSensor());

        System.out.println(
                "Температура: " +
                        sensor.getTemperatureC() + " °C");
    }
}