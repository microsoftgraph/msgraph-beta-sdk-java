package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SynchronizationMetadata implements ValuedEnum {
    GalleryApplicationIdentifier("galleryApplicationIdentifier"),
    GalleryApplicationKey("galleryApplicationKey"),
    IsOAuthEnabled("isOAuthEnabled"),
    IsSynchronizationAgentAssignmentRequired("IsSynchronizationAgentAssignmentRequired"),
    IsSynchronizationAgentRequired("isSynchronizationAgentRequired"),
    IsSynchronizationInPreview("isSynchronizationInPreview"),
    OAuthSettings("oAuthSettings"),
    SynchronizationLearnMoreIbizaFwLink("synchronizationLearnMoreIbizaFwLink"),
    ConfigurationFields("configurationFields");
    public final String value;
    SynchronizationMetadata(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationMetadata forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "galleryApplicationIdentifier": return GalleryApplicationIdentifier;
            case "galleryApplicationKey": return GalleryApplicationKey;
            case "isOAuthEnabled": return IsOAuthEnabled;
            case "IsSynchronizationAgentAssignmentRequired": return IsSynchronizationAgentAssignmentRequired;
            case "isSynchronizationAgentRequired": return IsSynchronizationAgentRequired;
            case "isSynchronizationInPreview": return IsSynchronizationInPreview;
            case "oAuthSettings": return OAuthSettings;
            case "synchronizationLearnMoreIbizaFwLink": return SynchronizationLearnMoreIbizaFwLink;
            case "configurationFields": return ConfigurationFields;
            default: return null;
        }
    }
}
