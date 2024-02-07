package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of Group Policy operation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GroupPolicyOperationType implements ValuedEnum {
    /** Group Policy invalid operation type. */
    None("none"),
    /** Group Policy upload operation type. */
    Upload("upload"),
    /** Group Policy upload new version operation type. */
    UploadNewVersion("uploadNewVersion"),
    /** Group Policy add new language(ADML) files operation type. */
    AddLanguageFiles("addLanguageFiles"),
    /** Group Policy remove language(ADML) files operation type. */
    RemoveLanguageFiles("removeLanguageFiles"),
    /** Group Policy update language(ADML) files operation type. */
    UpdateLanguageFiles("updateLanguageFiles"),
    /** Group Policy remove uploaded file operation type. */
    Remove("remove");
    public final String value;
    GroupPolicyOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "upload": return Upload;
            case "uploadNewVersion": return UploadNewVersion;
            case "addLanguageFiles": return AddLanguageFiles;
            case "removeLanguageFiles": return RemoveLanguageFiles;
            case "updateLanguageFiles": return UpdateLanguageFiles;
            case "remove": return Remove;
            default: return null;
        }
    }
}
