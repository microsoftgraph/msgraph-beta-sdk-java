package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PrintPresentationDirection implements ValuedEnum {
    ClockwiseFromTopLeft("clockwiseFromTopLeft"),
    CounterClockwiseFromTopLeft("counterClockwiseFromTopLeft"),
    CounterClockwiseFromTopRight("counterClockwiseFromTopRight"),
    ClockwiseFromTopRight("clockwiseFromTopRight"),
    CounterClockwiseFromBottomLeft("counterClockwiseFromBottomLeft"),
    ClockwiseFromBottomLeft("clockwiseFromBottomLeft"),
    CounterClockwiseFromBottomRight("counterClockwiseFromBottomRight"),
    ClockwiseFromBottomRight("clockwiseFromBottomRight");
    public final String value;
    PrintPresentationDirection(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintPresentationDirection forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clockwiseFromTopLeft": return ClockwiseFromTopLeft;
            case "counterClockwiseFromTopLeft": return CounterClockwiseFromTopLeft;
            case "counterClockwiseFromTopRight": return CounterClockwiseFromTopRight;
            case "clockwiseFromTopRight": return ClockwiseFromTopRight;
            case "counterClockwiseFromBottomLeft": return CounterClockwiseFromBottomLeft;
            case "clockwiseFromBottomLeft": return ClockwiseFromBottomLeft;
            case "counterClockwiseFromBottomRight": return CounterClockwiseFromBottomRight;
            case "clockwiseFromBottomRight": return ClockwiseFromBottomRight;
            default: return null;
        }
    }
}
