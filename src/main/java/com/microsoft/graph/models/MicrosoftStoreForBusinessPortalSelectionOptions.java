package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Portal to which admin syncs available Microsoft Store for Business apps. This is available in the Intune Admin Console.
 */
public enum MicrosoftStoreForBusinessPortalSelectionOptions implements ValuedEnum {
    /** This option is not available for the account */
    None("none"),
    /** Intune Company Portal only. */
    CompanyPortal("companyPortal"),
    /** MSFB Private store only. */
    PrivateStore("privateStore");
    public final String value;
    MicrosoftStoreForBusinessPortalSelectionOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftStoreForBusinessPortalSelectionOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "companyPortal": return CompanyPortal;
            case "privateStore": return PrivateStore;
            default: return null;
        }
    }
}
