package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcRemoteActionName implements ValuedEnum {
    Unknown("unknown"),
    Restart("restart"),
    Rename("rename"),
    Resize("resize"),
    Restore("restore"),
    Reprovision("reprovision"),
    ChangeUserAccountType("changeUserAccountType"),
    Troubleshoot("troubleshoot"),
    PlaceUnderReview("placeUnderReview"),
    UnknownFutureValue("unknownFutureValue"),
    CreateSnapshot("createSnapshot"),
    PowerOn("powerOn"),
    PowerOff("powerOff"),
    MoveRegion("moveRegion");
    public final String value;
    CloudPcRemoteActionName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcRemoteActionName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "restart": return Restart;
            case "rename": return Rename;
            case "resize": return Resize;
            case "restore": return Restore;
            case "reprovision": return Reprovision;
            case "changeUserAccountType": return ChangeUserAccountType;
            case "troubleshoot": return Troubleshoot;
            case "placeUnderReview": return PlaceUnderReview;
            case "unknownFutureValue": return UnknownFutureValue;
            case "createSnapshot": return CreateSnapshot;
            case "powerOn": return PowerOn;
            case "powerOff": return PowerOff;
            case "moveRegion": return MoveRegion;
            default: return null;
        }
    }
}
