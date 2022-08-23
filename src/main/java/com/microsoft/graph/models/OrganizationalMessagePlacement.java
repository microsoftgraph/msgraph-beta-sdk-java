package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OrganizationalMessagePlacement implements ValuedEnum {
    /** Indicates the default area for text to be displayed. This is the only valid placement value for the actionCenter and softLanding surfaces */
    Default_escaped("default_escaped"),
    /** Indicates the area where the first card is displayed. Only applies to the getStarted surface */
    Card0("card0"),
    /** Indicates the area where the second card is displayed. Only applies to the getStarted surface */
    Card1("card1"),
    /** Indicates the area where the third card is displayed. Only applies to the getStarted surface */
    Card2("card2"),
    /** Indicates the area where the fourth card is displayed. Only applies to the getStarted surface */
    Card3("card3");
    public final String value;
    OrganizationalMessagePlacement(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OrganizationalMessagePlacement forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "card0": return Card0;
            case "card1": return Card1;
            case "card2": return Card2;
            case "card3": return Card3;
            default: return null;
        }
    }
}
