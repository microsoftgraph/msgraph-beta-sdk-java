package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum CloudPcDeviceImageStatusDetails implements ValuedEnum {
    InternalServerError("internalServerError"),
    SourceImageNotFound("sourceImageNotFound"),
    OsVersionNotSupported("osVersionNotSupported"),
    SourceImageInvalid("sourceImageInvalid"),
    SourceImageNotGeneralized("sourceImageNotGeneralized"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDeviceImageStatusDetails(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcDeviceImageStatusDetails forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internalServerError": return InternalServerError;
            case "sourceImageNotFound": return SourceImageNotFound;
            case "osVersionNotSupported": return OsVersionNotSupported;
            case "sourceImageInvalid": return SourceImageInvalid;
            case "sourceImageNotGeneralized": return SourceImageNotGeneralized;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
