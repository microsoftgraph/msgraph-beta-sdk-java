package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum WindowsManagedAppClipboardSharingLevel implements ValuedEnum {
    /** Org users can paste data from and cut/copy data to any account, document, location or application. */
    AnyDestinationAnySource("anyDestinationAnySource"),
    /** Org users cannot cut, copy or paste data to or from external accounts, documents, locations or applications from or into the org context. */
    None("none");
    public final String value;
    WindowsManagedAppClipboardSharingLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsManagedAppClipboardSharingLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anyDestinationAnySource": return AnyDestinationAnySource;
            case "none": return None;
            default: return null;
        }
    }
}
