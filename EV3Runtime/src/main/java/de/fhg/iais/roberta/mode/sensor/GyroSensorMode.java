package de.fhg.iais.roberta.mode.sensor;

import de.fhg.iais.roberta.inter.mode.sensor.IGyroSensorMode;

public enum GyroSensorMode implements IGyroSensorMode {
    RATE( "Rate" ), ANGLE( "Angle" ), RESET();

    private final String[] values;

    private GyroSensorMode(String... values) {
        this.values = values;
    }

    /**
     * @return name that Lejos is using for this mode
     */
    public String getLejosModeName() {
        return this.values[0];
    }

    @Override
    public String[] getValues() {
        return this.values;
    }

}