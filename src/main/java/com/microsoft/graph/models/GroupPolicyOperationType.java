package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicyOperationType implements ValuedEnum {
    None("none"),
    Upload("upload"),
    UploadNewVersion("uploadNewVersion"),
    AddLanguageFiles("addLanguageFiles"),
    RemoveLanguageFiles("removeLanguageFiles"),
    UpdateLanguageFiles("updateLanguageFiles"),
    Remove("remove");
    public final String value;
    GroupPolicyOperationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyOperationType forValue(@javax.annotation.Nonnull final String searchValue) {
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
