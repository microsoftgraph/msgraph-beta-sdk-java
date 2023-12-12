package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtection extends Entity implements Parsable {
    /**
     * Instantiates a new InformationProtection and sets the default values.
     */
    public InformationProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InformationProtection
     */
    @jakarta.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("labelPolicySettings", (n) -> { this.setLabelPolicySettings(n.getObjectValue(InformationProtectionPolicySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { this.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labelPolicySettings property value. Read the Microsoft Purview Information Protection policy settings for the user or organization.
     * @return a InformationProtectionPolicySetting
     */
    @jakarta.annotation.Nullable
    public InformationProtectionPolicySetting getLabelPolicySettings() {
        return this.backingStore.get("labelPolicySettings");
    }
    /**
     * Gets the sensitivityLabels property value. Read the Microsoft Purview Information Protection labels for the user or organization.
     * @return a java.util.List<SensitivityLabel>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this.backingStore.get("sensitivityLabels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("labelPolicySettings", this.getLabelPolicySettings());
        writer.writeCollectionOfObjectValues("sensitivityLabels", this.getSensitivityLabels());
    }
    /**
     * Sets the labelPolicySettings property value. Read the Microsoft Purview Information Protection policy settings for the user or organization.
     * @param value Value to set for the labelPolicySettings property.
     */
    public void setLabelPolicySettings(@jakarta.annotation.Nullable final InformationProtectionPolicySetting value) {
        this.backingStore.set("labelPolicySettings", value);
    }
    /**
     * Sets the sensitivityLabels property value. Read the Microsoft Purview Information Protection labels for the user or organization.
     * @param value Value to set for the sensitivityLabels property.
     */
    public void setSensitivityLabels(@jakarta.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.backingStore.set("sensitivityLabels", value);
    }
}
