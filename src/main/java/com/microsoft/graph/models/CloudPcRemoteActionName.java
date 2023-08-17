package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    UnknownFutureValue("unknownFutureValue");
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
            default: return null;
        }
    }
}
