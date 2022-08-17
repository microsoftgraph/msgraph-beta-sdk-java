package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum FolderProtectionType implements ValuedEnum {
    /** Device default value, no intent. */
    UserDefined("userDefined"),
    /** Block functionality. */
    Enable("enable"),
    /** Allow functionality but generate logs. */
    AuditMode("auditMode"),
    /** Block untrusted apps from writing to disk sectors. */
    BlockDiskModification("blockDiskModification"),
    /** Generate logs when untrusted apps write to disk sectors. */
    AuditDiskModification("auditDiskModification");
    public final String value;
    FolderProtectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FolderProtectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "enable": return Enable;
            case "auditMode": return AuditMode;
            case "blockDiskModification": return BlockDiskModification;
            case "auditDiskModification": return AuditDiskModification;
            default: return null;
        }
    }
}
