package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DynamicRuleActivityLog extends ActivityLogBase implements Parsable {
    /**
     * Instantiates a new {@link DynamicRuleActivityLog} and sets the default values.
     */
    public DynamicRuleActivityLog() {
        super();
        this.setOdataType("#microsoft.graph.dynamicRuleActivityLog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DynamicRuleActivityLog}
     */
    @jakarta.annotation.Nonnull
    public static DynamicRuleActivityLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DynamicRuleActivityLog();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("protectionUnitDetails", (n) -> { this.setProtectionUnitDetails(n.getObjectValue(ProtectionUnitDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the protectionUnitDetails property value. The protectionUnitDetails property
     * @return a {@link ProtectionUnitDetails}
     */
    @jakarta.annotation.Nullable
    public ProtectionUnitDetails getProtectionUnitDetails() {
        return this.backingStore.get("protectionUnitDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeObjectValue("protectionUnitDetails", this.getProtectionUnitDetails());
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
     * Sets the protectionUnitDetails property value. The protectionUnitDetails property
     * @param value Value to set for the protectionUnitDetails property.
     */
    public void setProtectionUnitDetails(@jakarta.annotation.Nullable final ProtectionUnitDetails value) {
        this.backingStore.set("protectionUnitDetails", value);
    }
}
