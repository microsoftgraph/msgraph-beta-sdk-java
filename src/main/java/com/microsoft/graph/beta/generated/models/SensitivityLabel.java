package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityLabel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensitivityLabel} and sets the default values.
     */
    public SensitivityLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitivityLabel}
     */
    @jakarta.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
    }
    /**
     * Gets the applicableTo property value. The applicableTo property
     * @return a {@link EnumSet<SensitivityLabelTarget>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SensitivityLabelTarget> getApplicableTo() {
        return this.backingStore.get("applicableTo");
    }
    /**
     * Gets the applicationMode property value. The applicationMode property
     * @return a {@link ApplicationMode}
     */
    @jakarta.annotation.Nullable
    public ApplicationMode getApplicationMode() {
        return this.backingStore.get("applicationMode");
    }
    /**
     * Gets the assignedPolicies property value. The assignedPolicies property
     * @return a {@link java.util.List<LabelPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LabelPolicy> getAssignedPolicies() {
        return this.backingStore.get("assignedPolicies");
    }
    /**
     * Gets the autoLabeling property value. The autoLabeling property
     * @return a {@link AutoLabeling}
     */
    @jakarta.annotation.Nullable
    public AutoLabeling getAutoLabeling() {
        return this.backingStore.get("autoLabeling");
    }
    /**
     * Gets the color property value. The color property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.backingStore.get("color");
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
        deserializerMap.put("applicableTo", (n) -> { this.setApplicableTo(n.getEnumSetValue(SensitivityLabelTarget::forValue)); });
        deserializerMap.put("applicationMode", (n) -> { this.setApplicationMode(n.getEnumValue(ApplicationMode::forValue)); });
        deserializerMap.put("assignedPolicies", (n) -> { this.setAssignedPolicies(n.getCollectionOfObjectValues(LabelPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("autoLabeling", (n) -> { this.setAutoLabeling(n.getObjectValue(AutoLabeling::createFromDiscriminatorValue)); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isEndpointProtectionEnabled", (n) -> { this.setIsEndpointProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("labelActions", (n) -> { this.setLabelActions(n.getCollectionOfObjectValues(LabelActionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("sublabels", (n) -> { this.setSublabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("toolTip", (n) -> { this.setToolTip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEndpointProtectionEnabled() {
        return this.backingStore.get("isEndpointProtectionEnabled");
    }
    /**
     * Gets the labelActions property value. The labelActions property
     * @return a {@link java.util.List<LabelActionBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LabelActionBase> getLabelActions() {
        return this.backingStore.get("labelActions");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the sublabels property value. The sublabels property
     * @return a {@link java.util.List<SensitivityLabel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitivityLabel> getSublabels() {
        return this.backingStore.get("sublabels");
    }
    /**
     * Gets the toolTip property value. The toolTip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToolTip() {
        return this.backingStore.get("toolTip");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableTo", this.getApplicableTo());
        writer.writeEnumValue("applicationMode", this.getApplicationMode());
        writer.writeCollectionOfObjectValues("assignedPolicies", this.getAssignedPolicies());
        writer.writeObjectValue("autoLabeling", this.getAutoLabeling());
        writer.writeStringValue("color", this.getColor());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isEndpointProtectionEnabled", this.getIsEndpointProtectionEnabled());
        writer.writeCollectionOfObjectValues("labelActions", this.getLabelActions());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfObjectValues("sublabels", this.getSublabels());
        writer.writeStringValue("toolTip", this.getToolTip());
    }
    /**
     * Sets the applicableTo property value. The applicableTo property
     * @param value Value to set for the applicableTo property.
     */
    public void setApplicableTo(@jakarta.annotation.Nullable final EnumSet<SensitivityLabelTarget> value) {
        this.backingStore.set("applicableTo", value);
    }
    /**
     * Sets the applicationMode property value. The applicationMode property
     * @param value Value to set for the applicationMode property.
     */
    public void setApplicationMode(@jakarta.annotation.Nullable final ApplicationMode value) {
        this.backingStore.set("applicationMode", value);
    }
    /**
     * Sets the assignedPolicies property value. The assignedPolicies property
     * @param value Value to set for the assignedPolicies property.
     */
    public void setAssignedPolicies(@jakarta.annotation.Nullable final java.util.List<LabelPolicy> value) {
        this.backingStore.set("assignedPolicies", value);
    }
    /**
     * Sets the autoLabeling property value. The autoLabeling property
     * @param value Value to set for the autoLabeling property.
     */
    public void setAutoLabeling(@jakarta.annotation.Nullable final AutoLabeling value) {
        this.backingStore.set("autoLabeling", value);
    }
    /**
     * Sets the color property value. The color property
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("color", value);
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
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @param value Value to set for the isEndpointProtectionEnabled property.
     */
    public void setIsEndpointProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEndpointProtectionEnabled", value);
    }
    /**
     * Sets the labelActions property value. The labelActions property
     * @param value Value to set for the labelActions property.
     */
    public void setLabelActions(@jakarta.annotation.Nullable final java.util.List<LabelActionBase> value) {
        this.backingStore.set("labelActions", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the sublabels property value. The sublabels property
     * @param value Value to set for the sublabels property.
     */
    public void setSublabels(@jakarta.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.backingStore.set("sublabels", value);
    }
    /**
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     */
    public void setToolTip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("toolTip", value);
    }
}
