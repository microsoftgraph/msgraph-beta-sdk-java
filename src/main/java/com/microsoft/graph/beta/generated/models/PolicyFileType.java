package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyFileType implements ValuedEnum {
    DlpPolicy("dlpPolicy"),
    DlpSensitiveInformationType("dlpSensitiveInformationType"),
    DataCollectionPolicy("dataCollectionPolicy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PolicyFileType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyFileType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dlpPolicy": return DlpPolicy;
            case "dlpSensitiveInformationType": return DlpSensitiveInformationType;
            case "dataCollectionPolicy": return DataCollectionPolicy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
