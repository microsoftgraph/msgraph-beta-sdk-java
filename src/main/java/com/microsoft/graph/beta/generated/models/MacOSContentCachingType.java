package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of content allowed to be cached by Apple's content caching service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSContentCachingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "userContentOnly": return UserContentOnly;
            case "sharedContentOnly": return SharedContentOnly;
            default: return null;
        }
    }
}
