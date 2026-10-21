package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPCUserSettingsPersistenceDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPCUserSettingsPersistenceDetail} and sets the default values.
     */
    public CloudPCUserSettingsPersistenceDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPCUserSettingsPersistenceDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPCUserSettingsPersistenceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPCUserSettingsPersistenceDetail();
    }
    /**
     * Gets the autoCleanupDetail property value. The autoCleanupDetail property
     * @return a {@link CloudPCUserSettingsPersistenceAutoCleanupDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceAutoCleanupDetail getAutoCleanupDetail() {
        return this.backingStore.get("autoCleanupDetail");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoCleanupDetail", (n) -> { this.setAutoCleanupDetail(n.getObjectValue(CloudPCUserSettingsPersistenceAutoCleanupDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("gracePeriodEndDateTime", (n) -> { this.setGracePeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("snapshotConfiguration", (n) -> { this.setSnapshotConfiguration(n.getObjectValue(CloudPcUserSettingsPersistenceSnapshotConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("storageConfiguration", (n) -> { this.setStorageConfiguration(n.getObjectValue(CloudPcStorageConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("userProfileSnapshots", (n) -> { this.setUserProfileSnapshots(n.getCollectionOfObjectValues(CloudPcUserProfileSnapshot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodEndDateTime property value. Indicates the grace period end time when user settings persistence exceeds the available quota. If usage exceeds the available quota when the grace period expires, the system automatically deletes the profile with the oldest last attached timestamp. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this.backingStore.get("gracePeriodEndDateTime");
    }
    /**
     * Gets the snapshotConfiguration property value. The snapshotConfiguration property
     * @return a {@link CloudPcUserSettingsPersistenceSnapshotConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserSettingsPersistenceSnapshotConfiguration getSnapshotConfiguration() {
        return this.backingStore.get("snapshotConfiguration");
    }
    /**
     * Gets the storageConfiguration property value. The storageConfiguration property
     * @return a {@link CloudPcStorageConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcStorageConfiguration getStorageConfiguration() {
        return this.backingStore.get("storageConfiguration");
    }
    /**
     * Gets the userProfileSnapshots property value. The userProfileSnapshots property
     * @return a {@link java.util.List<CloudPcUserProfileSnapshot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserProfileSnapshot> getUserProfileSnapshots() {
        return this.backingStore.get("userProfileSnapshots");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("autoCleanupDetail", this.getAutoCleanupDetail());
        writer.writeOffsetDateTimeValue("gracePeriodEndDateTime", this.getGracePeriodEndDateTime());
        writer.writeObjectValue("snapshotConfiguration", this.getSnapshotConfiguration());
        writer.writeObjectValue("storageConfiguration", this.getStorageConfiguration());
        writer.writeCollectionOfObjectValues("userProfileSnapshots", this.getUserProfileSnapshots());
    }
    /**
     * Sets the autoCleanupDetail property value. The autoCleanupDetail property
     * @param value Value to set for the autoCleanupDetail property.
     */
    public void setAutoCleanupDetail(@jakarta.annotation.Nullable final CloudPCUserSettingsPersistenceAutoCleanupDetail value) {
        this.backingStore.set("autoCleanupDetail", value);
    }
    /**
     * Sets the gracePeriodEndDateTime property value. Indicates the grace period end time when user settings persistence exceeds the available quota. If usage exceeds the available quota when the grace period expires, the system automatically deletes the profile with the oldest last attached timestamp. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the gracePeriodEndDateTime property.
     */
    public void setGracePeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("gracePeriodEndDateTime", value);
    }
    /**
     * Sets the snapshotConfiguration property value. The snapshotConfiguration property
     * @param value Value to set for the snapshotConfiguration property.
     */
    public void setSnapshotConfiguration(@jakarta.annotation.Nullable final CloudPcUserSettingsPersistenceSnapshotConfiguration value) {
        this.backingStore.set("snapshotConfiguration", value);
    }
    /**
     * Sets the storageConfiguration property value. The storageConfiguration property
     * @param value Value to set for the storageConfiguration property.
     */
    public void setStorageConfiguration(@jakarta.annotation.Nullable final CloudPcStorageConfiguration value) {
        this.backingStore.set("storageConfiguration", value);
    }
    /**
     * Sets the userProfileSnapshots property value. The userProfileSnapshots property
     * @param value Value to set for the userProfileSnapshots property.
     */
    public void setUserProfileSnapshots(@jakarta.annotation.Nullable final java.util.List<CloudPcUserProfileSnapshot> value) {
        this.backingStore.set("userProfileSnapshots", value);
    }
}
