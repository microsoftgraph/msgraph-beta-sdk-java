package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the identityGovernance singleton. */
public enum AccessPackageCustomExtensionHandlerStatus implements ValuedEnum {
    RequestSent("requestSent"),
    RequestReceived("requestReceived"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessPackageCustomExtensionHandlerStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AccessPackageCustomExtensionHandlerStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "requestSent": return RequestSent;
            case "requestReceived": return RequestReceived;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
