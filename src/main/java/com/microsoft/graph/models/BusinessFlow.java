package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessFlow extends Entity implements Parsable {
    /**
     * Instantiates a new BusinessFlow and sets the default values.
     */
    public BusinessFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BusinessFlow
     */
    @jakarta.annotation.Nonnull
    public static BusinessFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessFlow();
    }
    /**
     * Gets the customData property value. The customData property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomData() {
        return this.BackingStore.get("customData");
    }
    /**
     * Gets the deDuplicationId property value. The deDuplicationId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeDuplicationId() {
        return this.BackingStore.get("deDuplicationId");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getStringValue()); });
        deserializerMap.put("deDuplicationId", (n) -> { this.setDeDuplicationId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(GovernancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("policyTemplateId", (n) -> { this.setPolicyTemplateId(n.getStringValue()); });
        deserializerMap.put("recordVersion", (n) -> { this.setRecordVersion(n.getStringValue()); });
        deserializerMap.put("schemaId", (n) -> { this.setSchemaId(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(BusinessFlowSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a GovernancePolicy
     */
    @jakarta.annotation.Nullable
    public GovernancePolicy getPolicy() {
        return this.BackingStore.get("policy");
    }
    /**
     * Gets the policyTemplateId property value. The policyTemplateId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyTemplateId() {
        return this.BackingStore.get("policyTemplateId");
    }
    /**
     * Gets the recordVersion property value. The recordVersion property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecordVersion() {
        return this.BackingStore.get("recordVersion");
    }
    /**
     * Gets the schemaId property value. The schemaId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSchemaId() {
        return this.BackingStore.get("schemaId");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a BusinessFlowSettings
     */
    @jakarta.annotation.Nullable
    public BusinessFlowSettings getSettings() {
        return this.BackingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customData", this.getCustomData());
        writer.writeStringValue("deDuplicationId", this.getDeDuplicationId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeStringValue("policyTemplateId", this.getPolicyTemplateId());
        writer.writeStringValue("recordVersion", this.getRecordVersion());
        writer.writeStringValue("schemaId", this.getSchemaId());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the customData property value. The customData property
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("customData", value);
    }
    /**
     * Sets the deDuplicationId property value. The deDuplicationId property
     * @param value Value to set for the deDuplicationId property.
     */
    public void setDeDuplicationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deDuplicationId", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final GovernancePolicy value) {
        this.BackingStore.set("policy", value);
    }
    /**
     * Sets the policyTemplateId property value. The policyTemplateId property
     * @param value Value to set for the policyTemplateId property.
     */
    public void setPolicyTemplateId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("policyTemplateId", value);
    }
    /**
     * Sets the recordVersion property value. The recordVersion property
     * @param value Value to set for the recordVersion property.
     */
    public void setRecordVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("recordVersion", value);
    }
    /**
     * Sets the schemaId property value. The schemaId property
     * @param value Value to set for the schemaId property.
     */
    public void setSchemaId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("schemaId", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final BusinessFlowSettings value) {
        this.BackingStore.set("settings", value);
    }
}
