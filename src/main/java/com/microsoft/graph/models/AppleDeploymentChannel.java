package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AppleDeploymentChannel implements ValuedEnum {
    /** Send payload down over Device Channel. */
    DeviceChannel("deviceChannel"),
    /** Send payload down over User Channel. */
    UserChannel("userChannel");
    public final String value;
    AppleDeploymentChannel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppleDeploymentChannel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceChannel": return DeviceChannel;
            case "userChannel": return UserChannel;
            default: return null;
        }
    }
}
