package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum AdminConsentState implements ValuedEnum {
    NotConfigured("notConfigured"),
    Granted("granted"),
    NotGranted("notGranted");
    public final String value;
    AdminConsentState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AdminConsentState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "granted": return Granted;
            case "notGranted": return NotGranted;
            default: return null;
        }
    }
}
