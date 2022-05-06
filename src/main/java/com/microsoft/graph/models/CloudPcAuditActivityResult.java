package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum CloudPcAuditActivityResult implements ValuedEnum {
    Success("success"),
    ClientError("clientError"),
    Failure("failure"),
    Timeout("timeout"),
    Other("other");
    public final String value;
    CloudPcAuditActivityResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcAuditActivityResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "clientError": return ClientError;
            case "failure": return Failure;
            case "timeout": return Timeout;
            case "other": return Other;
            default: return null;
        }
    }
}
