package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReferenceAttachmentPermission implements ValuedEnum {
    Other("other"),
    View("view"),
    Edit("edit"),
    AnonymousView("anonymousView"),
    AnonymousEdit("anonymousEdit"),
    OrganizationView("organizationView"),
    OrganizationEdit("organizationEdit");
    public final String value;
    ReferenceAttachmentPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReferenceAttachmentPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "other": return Other;
            case "view": return View;
            case "edit": return Edit;
            case "anonymousView": return AnonymousView;
            case "anonymousEdit": return AnonymousEdit;
            case "organizationView": return OrganizationView;
            case "organizationEdit": return OrganizationEdit;
            default: return null;
        }
    }
}
