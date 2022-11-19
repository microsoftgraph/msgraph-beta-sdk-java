package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtection extends Entity implements Parsable {
    /** Read the Microsoft Purview Information Protection policy settings for the user or organization. */
    private InformationProtectionPolicySetting _labelPolicySettings;
    /** Read the Microsoft Purview Information Protection labels for the user or organization. */
    private java.util.List<SensitivityLabel> _sensitivityLabels;
    /**
     * Instantiates a new informationProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtection() {
        super();
        this.setOdataType("#microsoft.graph.security.informationProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtection
     */
    @javax.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtection currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("labelPolicySettings", (n) -> { currentObject.setLabelPolicySettings(n.getObjectValue(InformationProtectionPolicySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitivityLabels", (n) -> { currentObject.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the labelPolicySettings property value. Read the Microsoft Purview Information Protection policy settings for the user or organization.
     * @return a informationProtectionPolicySetting
     */
    @javax.annotation.Nullable
    public InformationProtectionPolicySetting getLabelPolicySettings() {
        return this._labelPolicySettings;
    }
    /**
     * Gets the sensitivityLabels property value. Read the Microsoft Purview Information Protection labels for the user or organization.
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this._sensitivityLabels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("labelPolicySettings", this.getLabelPolicySettings());
        writer.writeCollectionOfObjectValues("sensitivityLabels", this.getSensitivityLabels());
    }
    /**
     * Sets the labelPolicySettings property value. Read the Microsoft Purview Information Protection policy settings for the user or organization.
     * @param value Value to set for the labelPolicySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabelPolicySettings(@javax.annotation.Nullable final InformationProtectionPolicySetting value) {
        this._labelPolicySettings = value;
    }
    /**
     * Sets the sensitivityLabels property value. Read the Microsoft Purview Information Protection labels for the user or organization.
     * @param value Value to set for the sensitivityLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitivityLabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this._sensitivityLabels = value;
    }
}
