package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum PowerActionType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** No action */
    NoAction("noAction"),
    /** Put device in sleep state */
    Sleep("sleep"),
    /** Put device in hibernate state */
    Hibernate("hibernate"),
    /** Shutdown device */
    Shutdown("shutdown");
    public final String value;
    PowerActionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PowerActionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "noAction": return NoAction;
            case "sleep": return Sleep;
            case "hibernate": return Hibernate;
            case "shutdown": return Shutdown;
            default: return null;
        }
    }
}
