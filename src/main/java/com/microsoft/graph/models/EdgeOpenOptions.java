package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EdgeOpenOptions implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** StartPage. */
    StartPage("startPage"),
    /** NewTabPage. */
    NewTabPage("newTabPage"),
    /** PreviousPages. */
    PreviousPages("previousPages"),
    /** SpecificPages. */
    SpecificPages("specificPages");
    public final String value;
    EdgeOpenOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EdgeOpenOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "startPage": return StartPage;
            case "newTabPage": return NewTabPage;
            case "previousPages": return PreviousPages;
            case "specificPages": return SpecificPages;
            default: return null;
        }
    }
}
