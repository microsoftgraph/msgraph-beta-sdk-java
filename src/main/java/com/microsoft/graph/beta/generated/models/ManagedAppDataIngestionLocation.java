package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Locations which can be used to bring data into organization documents
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppDataIngestionLocation implements ValuedEnum {
    /** OneDrive for business */
    OneDriveForBusiness("oneDriveForBusiness"),
    /** SharePoint Online */
    SharePoint("sharePoint"),
    /** The device&apos;s camera */
    Camera("camera"),
    /** The device&apos;s photo library */
    PhotoLibrary("photoLibrary");
    public final String value;
    ManagedAppDataIngestionLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppDataIngestionLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneDriveForBusiness": return OneDriveForBusiness;
            case "sharePoint": return SharePoint;
            case "camera": return Camera;
            case "photoLibrary": return PhotoLibrary;
            default: return null;
        }
    }
}
