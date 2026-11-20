package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible status states for a sync infrastructure component or policy during a device sync operation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SyncComponentStatus implements ValuedEnum {
    /** Default. The component has not yet started reporting status. This is a schema default and will not typically appear in responses, as components only appear once they begin executing. */
    None("none"),
    /** Indicates the component is currently executing. For infrastructure components (PNSv1, DCI, SCGW), this means the notification or check-in is in flight. For policies, this means the policy is being applied to the device. */
    InProgress("inProgress"),
    /** Indicates the component completed successfully. The component has finished its work and reported a successful outcome. */
    Success("success"),
    /** Indicates the stage encountered an error. When this value is set, the moreInfo property on the syncComponent will contain additional diagnostic details about the failure. */
    Failure("failure"),
    /** Indicates the stage completed but not all items succeeded. For example, some policies applied successfully while others failed. The moreInfo property may contain details on the partial outcome. */
    PartialSuccess("partialSuccess"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SyncComponentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SyncComponentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "inProgress": return InProgress;
            case "success": return Success;
            case "failure": return Failure;
            case "partialSuccess": return PartialSuccess;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
