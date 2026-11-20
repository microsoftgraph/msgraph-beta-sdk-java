package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcUserProfileSnapshot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcUserProfileSnapshot} and sets the default values.
     */
    public CloudPcUserProfileSnapshot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcUserProfileSnapshot}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcUserProfileSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserProfileSnapshot();
    }
    /**
     * Gets the cloudProfileId property value. The cloudProfileId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudProfileId() {
        return this.backingStore.get("cloudProfileId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudProfileId", (n) -> { this.setCloudProfileId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRestoredDateTime", (n) -> { this.setLastRestoredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("snapshotSizeInGB", (n) -> { this.setSnapshotSizeInGB(n.getIntegerValue()); });
        deserializerMap.put("snapshotType", (n) -> { this.setSnapshotType(n.getEnumValue(CloudPcUserSettingsPersistenceSnapshotType::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRestoredDateTime property value. The lastRestoredDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRestoredDateTime() {
        return this.backingStore.get("lastRestoredDateTime");
    }
    /**
     * Gets the snapshotSizeInGB property value. The snapshotSizeInGB property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSnapshotSizeInGB() {
        return this.backingStore.get("snapshotSizeInGB");
    }
    /**
     * Gets the snapshotType property value. The snapshotType property
     * @return a {@link CloudPcUserSettingsPersistenceSnapshotType}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserSettingsPersistenceSnapshotType getSnapshotType() {
        return this.backingStore.get("snapshotType");
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cloudProfileId", this.getCloudProfileId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastRestoredDateTime", this.getLastRestoredDateTime());
        writer.writeIntegerValue("snapshotSizeInGB", this.getSnapshotSizeInGB());
        writer.writeEnumValue("snapshotType", this.getSnapshotType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the cloudProfileId property value. The cloudProfileId property
     * @param value Value to set for the cloudProfileId property.
     */
    public void setCloudProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudProfileId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastRestoredDateTime property value. The lastRestoredDateTime property
     * @param value Value to set for the lastRestoredDateTime property.
     */
    public void setLastRestoredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRestoredDateTime", value);
    }
    /**
     * Sets the snapshotSizeInGB property value. The snapshotSizeInGB property
     * @param value Value to set for the snapshotSizeInGB property.
     */
    public void setSnapshotSizeInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("snapshotSizeInGB", value);
    }
    /**
     * Sets the snapshotType property value. The snapshotType property
     * @param value Value to set for the snapshotType property.
     */
    public void setSnapshotType(@jakarta.annotation.Nullable final CloudPcUserSettingsPersistenceSnapshotType value) {
        this.backingStore.set("snapshotType", value);
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
