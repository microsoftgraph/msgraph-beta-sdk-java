package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSnapshotImportSourceType implements ValuedEnum {
    AzureStorageAccount("azureStorageAccount"),
    SasUrl("sasUrl"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSnapshotImportSourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSnapshotImportSourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureStorageAccount": return AzureStorageAccount;
            case "sasUrl": return SasUrl;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
