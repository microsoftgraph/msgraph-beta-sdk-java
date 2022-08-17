package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WiFiProxySetting implements ValuedEnum {
    /** No Proxy. */
    None("none"),
    /** Manual Proxy Settings via Address and Port. */
    Manual("manual"),
    /** Automatic Proxy Settings via URL. */
    Automatic("automatic");
    public final String value;
    WiFiProxySetting(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WiFiProxySetting forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "manual": return Manual;
            case "automatic": return Automatic;
            default: return null;
        }
    }
}
