package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MacOSContentCachingType implements ValuedEnum {
    /** Default. Both user iCloud data and non-iCloud data will be cached. */
    NotConfigured("notConfigured"),
    /** Allow Apple's content caching service to cache user iCloud data. */
    UserContentOnly("userContentOnly"),
    /** Allow Apple's content caching service to cache non-iCloud data (e.g. app and software updates). */
    SharedContentOnly("sharedContentOnly");
    public final String value;
    MacOSContentCachingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSContentCachingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "userContentOnly": return UserContentOnly;
            case "sharedContentOnly": return SharedContentOnly;
            default: return null;
        }
    }
}
