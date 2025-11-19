package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FullServiceBackupBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FullServiceBackupBase} and sets the default values.
     */
    public FullServiceBackupBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FullServiceBackupBase}
     */
    @jakarta.annotation.Nonnull
    public static FullServiceBackupBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.allDrivesBackup": return new AllDrivesBackup();
                case "#microsoft.graph.allMailboxesBackup": return new AllMailboxesBackup();
                case "#microsoft.graph.allSitesBackup": return new AllSitesBackup();
            }
        }
        return new FullServiceBackupBase();
    }
    /**
     * Gets the actionOnExistingPolicy property value. The actionOnExistingPolicy property
     * @return a {@link FullServiceBackupDisableMode}
     */
    @jakarta.annotation.Nullable
    public FullServiceBackupDisableMode getActionOnExistingPolicy() {
        return this.backingStore.get("actionOnExistingPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionOnExistingPolicy", (n) -> { this.setActionOnExistingPolicy(n.getEnumValue(FullServiceBackupDisableMode::forValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRunDateTime", (n) -> { this.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FullServiceBackupStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.backingStore.get("lastRunDateTime");
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link FullServiceBackupStatus}
     */
    @jakarta.annotation.Nullable
    public FullServiceBackupStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionOnExistingPolicy", this.getActionOnExistingPolicy());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the actionOnExistingPolicy property value. The actionOnExistingPolicy property
     * @param value Value to set for the actionOnExistingPolicy property.
     */
    public void setActionOnExistingPolicy(@jakarta.annotation.Nullable final FullServiceBackupDisableMode value) {
        this.backingStore.set("actionOnExistingPolicy", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     */
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRunDateTime", value);
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FullServiceBackupStatus value) {
        this.backingStore.set("status", value);
    }
}
