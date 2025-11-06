package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSnapshotImportFileType implements ValuedEnum {
    DataFile("dataFile"),
    VirtualMachineGuestState("virtualMachineGuestState"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSnapshotImportFileType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSnapshotImportFileType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dataFile": return DataFile;
            case "virtualMachineGuestState": return VirtualMachineGuestState;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
