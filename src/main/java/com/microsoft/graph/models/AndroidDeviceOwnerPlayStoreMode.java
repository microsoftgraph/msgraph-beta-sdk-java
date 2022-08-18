package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AndroidDeviceOwnerPlayStoreMode implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Only apps that are in the policy are available and any app not in the policy will be automatically uninstalled from the device. */
    AllowList("allowList"),
    /** All apps are available and any app that should not be on the device should be explicitly marked as 'BLOCKED' in the applications policy. */
    BlockList("blockList");
    public final String value;
    AndroidDeviceOwnerPlayStoreMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerPlayStoreMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "allowList": return AllowList;
            case "blockList": return BlockList;
            default: return null;
        }
    }
}
