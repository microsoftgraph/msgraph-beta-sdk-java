package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MacOSContentCachingParentSelectionPolicy implements ValuedEnum {
    /** Defaults to round-robin strategy. */
    NotConfigured("notConfigured"),
    /** Rotate through the parents in order. Use this policy for load balancing. */
    RoundRobin("roundRobin"),
    /** Always use the first available parent in the Parents list. Use this policy to designate permanent primary, secondary, and subsequent parents. */
    FirstAvailable("firstAvailable"),
    /** Hash the path part of the requested URL so that the same parent is always used for the same URL. This is useful for maximizing the size of the combined caches of the parents. */
    UrlPathHash("urlPathHash"),
    /** Choose a parent at random. Use this policy for load balancing. */
    Random("random"),
    /** Use the first available parent that is available in the Parents list until it becomes unavailable, then advance to the next one. Use this policy for designating floating primary, secondary, and subsequent parents. */
    StickyAvailable("stickyAvailable");
    public final String value;
    MacOSContentCachingParentSelectionPolicy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSContentCachingParentSelectionPolicy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "roundRobin": return RoundRobin;
            case "firstAvailable": return FirstAvailable;
            case "urlPathHash": return UrlPathHash;
            case "random": return Random;
            case "stickyAvailable": return StickyAvailable;
            default: return null;
        }
    }
}
