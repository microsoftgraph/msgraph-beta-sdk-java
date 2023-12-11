package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of Group Policy uploaded definition file status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GroupPolicyUploadedDefinitionFileStatus implements ValuedEnum {
    /** Group Policy uploaded definition file invalid upload status. */
    None("none"),
    /** Group Policy uploaded definition file upload in progress. */
    UploadInProgress("uploadInProgress"),
    /** Group Policy uploaded definition file available. */
    Available("available"),
    /** Group Policy uploaded definition file assigned to policy. */
    Assigned("assigned"),
    /** Group Policy uploaded definition file removal in progress. */
    RemovalInProgress("removalInProgress"),
    /** Group Policy uploaded definition file upload failed. */
    UploadFailed("uploadFailed"),
    /** Group Policy uploaded definition file removal failed. */
    RemovalFailed("removalFailed");
    public final String value;
    GroupPolicyUploadedDefinitionFileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyUploadedDefinitionFileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "uploadInProgress": return UploadInProgress;
            case "available": return Available;
            case "assigned": return Assigned;
            case "removalInProgress": return RemovalInProgress;
            case "uploadFailed": return UploadFailed;
            case "removalFailed": return RemovalFailed;
            default: return null;
        }
    }
}
