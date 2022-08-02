package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum CloudPcProvisioningPolicyImageType implements ValuedEnum {
    Gallery("gallery"),
    Custom("custom");
    public final String value;
    CloudPcProvisioningPolicyImageType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcProvisioningPolicyImageType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gallery": return Gallery;
            case "custom": return Custom;
            default: return null;
        }
    }
}
