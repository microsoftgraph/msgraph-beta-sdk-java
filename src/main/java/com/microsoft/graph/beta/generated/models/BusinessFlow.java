package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessFlow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BusinessFlow} and sets the default values.
     */
    public BusinessFlow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessFlow}
     */
    @jakarta.annotation.Nonnull
    public static BusinessFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessFlow();
    }
    /**
     * Gets the customData property value. The customData property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomData() {
        return this.backingStore.get("customData");
    }
    /**
     * Gets the deDuplicationId property value. The deDuplicationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeDuplicationId() {
        return this.backingStore.get("deDuplicationId");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link GovernancePolicy}
     */
    @jakarta.annotation.Nullable
    public GovernancePolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the policyTemplateId property value. The policyTemplateId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyTemplateId() {
        return this.backingStore.get("policyTemplateId");
    }
    /**
     * Gets the recordVersion property value. The recordVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordVersion() {
        return this.backingStore.get("recordVersion");
    }
    /**
     * Gets the schemaId property value. The schemaId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchemaId() {
        return this.backingStore.get("schemaId");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link BusinessFlowSettings}
     */
    @jakarta.annotation.Nullable
    public BusinessFlowSettings getSettings() {
        return this.backingStore.get("settings");
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
        this.backingStore.set("customData", value);
    }
    /**
     * Sets the deDuplicationId property value. The deDuplicationId property
     * @param value Value to set for the deDuplicationId property.
     */
    public void setDeDuplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deDuplicationId", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final GovernancePolicy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the policyTemplateId property value. The policyTemplateId property
     * @param value Value to set for the policyTemplateId property.
     */
    public void setPolicyTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyTemplateId", value);
    }
    /**
     * Sets the recordVersion property value. The recordVersion property
     * @param value Value to set for the recordVersion property.
     */
    public void setRecordVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recordVersion", value);
    }
    /**
     * Sets the schemaId property value. The schemaId property
     * @param value Value to set for the schemaId property.
     */
    public void setSchemaId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schemaId", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final BusinessFlowSettings value) {
        this.backingStore.set("settings", value);
    }
}
