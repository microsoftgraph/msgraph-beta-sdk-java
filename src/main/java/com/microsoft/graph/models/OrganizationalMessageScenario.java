package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum OrganizationalMessageScenario implements ValuedEnum {
    /** Indicates onboarding scenario */
    Onboarding("onboarding"),
    /** Indicates lifecycle scenario */
    Lifecycle("lifecycle");
    public final String value;
    OrganizationalMessageScenario(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessageScenario forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "onboarding": return Onboarding;
            case "lifecycle": return Lifecycle;
            default: return null;
        }
    }
}
