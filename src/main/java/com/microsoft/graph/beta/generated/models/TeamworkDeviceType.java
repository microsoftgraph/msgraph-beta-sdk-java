package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkDeviceType implements ValuedEnum {
    Unknown("unknown"),
    IpPhone("ipPhone"),
    TeamsRoom("teamsRoom"),
    SurfaceHub("surfaceHub"),
    CollaborationBar("collaborationBar"),
    TeamsDisplay("teamsDisplay"),
    TouchConsole("touchConsole"),
    LowCostPhone("lowCostPhone"),
    TeamsPanel("teamsPanel"),
    Sip("sip"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkDeviceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkDeviceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "ipPhone": return IpPhone;
            case "teamsRoom": return TeamsRoom;
            case "surfaceHub": return SurfaceHub;
            case "collaborationBar": return CollaborationBar;
            case "teamsDisplay": return TeamsDisplay;
            case "touchConsole": return TouchConsole;
            case "lowCostPhone": return LowCostPhone;
            case "teamsPanel": return TeamsPanel;
            case "sip": return Sip;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
