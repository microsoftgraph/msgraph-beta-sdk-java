package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BackupPolicyActivityLog extends ActivityLogBase implements Parsable {
    /**
     * Instantiates a new {@link BackupPolicyActivityLog} and sets the default values.
     */
    public BackupPolicyActivityLog() {
        super();
        this.setOdataType("#microsoft.graph.backupPolicyActivityLog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BackupPolicyActivityLog}
     */
    @jakarta.annotation.Nonnull
    public static BackupPolicyActivityLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BackupPolicyActivityLog();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("oldPolicyName", (n) -> { this.setOldPolicyName(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("policyStatus", (n) -> { this.setPolicyStatus(n.getEnumValue(ProtectionPolicyStatus::forValue)); });
        deserializerMap.put("protectionUnitDetails", (n) -> { this.setProtectionUnitDetails(n.getObjectValue(ProtectionUnitDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionPeriod", (n) -> { this.setRetentionPeriod(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the oldPolicyName property value. The oldPolicyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldPolicyName() {
        return this.backingStore.get("oldPolicyName");
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
     * Gets the policyName property value. The policyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the policyStatus property value. The policyStatus property
     * @return a {@link ProtectionPolicyStatus}
     */
    @jakarta.annotation.Nullable
    public ProtectionPolicyStatus getPolicyStatus() {
        return this.backingStore.get("policyStatus");
    }
    /**
     * Gets the protectionUnitDetails property value. The protectionUnitDetails property
     * @return a {@link ProtectionUnitDetails}
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitDetails getProtectionUnitDetails() {
        return this.backingStore.get("protectionUnitDetails");
    }
    /**
     * Gets the retentionPeriod property value. The retentionPeriod property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRetentionPeriod() {
        return this.backingStore.get("retentionPeriod");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("oldPolicyName", this.getOldPolicyName());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeEnumValue("policyStatus", this.getPolicyStatus());
        writer.writeObjectValue("protectionUnitDetails", this.getProtectionUnitDetails());
        writer.writeStringValue("retentionPeriod", this.getRetentionPeriod());
    }
    /**
     * Sets the oldPolicyName property value. The oldPolicyName property
     * @param value Value to set for the oldPolicyName property.
     */
    public void setOldPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("oldPolicyName", value);
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the policyStatus property value. The policyStatus property
     * @param value Value to set for the policyStatus property.
     */
    public void setPolicyStatus(@jakarta.annotation.Nullable final ProtectionPolicyStatus value) {
        this.backingStore.set("policyStatus", value);
    }
    /**
     * Sets the protectionUnitDetails property value. The protectionUnitDetails property
     * @param value Value to set for the protectionUnitDetails property.
     */
    public void setProtectionUnitDetails(@jakarta.annotation.Nullable final ProtectionUnitDetails value) {
        this.backingStore.set("protectionUnitDetails", value);
    }
    /**
     * Sets the retentionPeriod property value. The retentionPeriod property
     * @param value Value to set for the retentionPeriod property.
     */
    public void setRetentionPeriod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("retentionPeriod", value);
    }
}
