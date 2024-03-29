package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotDeviceType implements ValuedEnum {
    /** Windows PC */
    WindowsPc("windowsPc"),
    /** Surface Hub 2 */
    SurfaceHub2("surfaceHub2"),
    /** HoloLens */
    HoloLens("holoLens"),
    /** SurfaceHub2S */
    SurfaceHub2S("surfaceHub2S"),
    /** VirtualMachine */
    VirtualMachine("virtualMachine"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary.          */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutopilotDeviceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotDeviceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windowsPc": return WindowsPc;
            case "surfaceHub2": return SurfaceHub2;
            case "holoLens": return HoloLens;
            case "surfaceHub2S": return SurfaceHub2S;
            case "virtualMachine": return VirtualMachine;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
