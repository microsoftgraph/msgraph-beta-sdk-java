package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotDeviceType implements ValuedEnum {
    /** Default. Indicates that the device type  is a Windows PC. */
    WindowsPc("windowsPc"),
    /** Indicates that the device type is a HoloLens. */
    HoloLens("holoLens"),
    /** Surface Hub 2 */
    SurfaceHub2("surfaceHub2"),
    /** SurfaceHub2S */
    SurfaceHub2S("surfaceHub2S"),
    /** VirtualMachine */
    VirtualMachine("virtualMachine"),
    /** Evolvable enumeration sentinel value. Do not use. */
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
            case "holoLens": return HoloLens;
            case "surfaceHub2": return SurfaceHub2;
            case "surfaceHub2S": return SurfaceHub2S;
            case "virtualMachine": return VirtualMachine;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
