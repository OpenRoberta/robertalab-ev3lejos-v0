package de.fhg.iais.roberta.mode.sensor.ev3;

import de.fhg.iais.roberta.inter.mode.sensor.IUltrasonicSensorMode;

public enum CompassSensorMode implements IUltrasonicSensorMode {
    DISTANCE( "Distance" ), PRESENCE( "Listen" );

    private final String[] values;

    private CompassSensorMode(String... values) {
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