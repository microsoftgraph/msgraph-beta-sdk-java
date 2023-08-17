package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcResizeValidationCode implements ValuedEnum {
    Success("success"),
    CloudPcNotFound("cloudPcNotFound"),
    OperationConflict("operationConflict"),
    OperationNotSupported("operationNotSupported"),
    TargetLicenseHasAssigned("targetLicenseHasAssigned"),
    InternalServerError("internalServerError"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcResizeValidationCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcResizeValidationCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "cloudPcNotFound": return CloudPcNotFound;
            case "operationConflict": return OperationConflict;
            case "operationNotSupported": return OperationNotSupported;
            case "targetLicenseHasAssigned": return TargetLicenseHasAssigned;
            case "internalServerError": return InternalServerError;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
