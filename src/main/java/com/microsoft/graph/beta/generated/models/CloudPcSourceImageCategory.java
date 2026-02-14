package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSourceImageCategory implements ValuedEnum {
    ManagedImage("managedImage"),
    AzureComputeGallery("azureComputeGallery"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSourceImageCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSourceImageCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "managedImage": return ManagedImage;
            case "azureComputeGallery": return AzureComputeGallery;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
