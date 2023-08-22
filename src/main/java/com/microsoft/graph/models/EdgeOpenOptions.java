package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for the EdgeOpensWith setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeOpenOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
