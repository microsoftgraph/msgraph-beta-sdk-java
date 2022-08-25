package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeliveryOptimizationRestrictPeerSelectionByOptions implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Subnet mask. */
    SubnetMask("subnetMask");
    public final String value;
    DeliveryOptimizationRestrictPeerSelectionByOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeliveryOptimizationRestrictPeerSelectionByOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "subnetMask": return SubnetMask;
            default: return null;
        }
    }
}
