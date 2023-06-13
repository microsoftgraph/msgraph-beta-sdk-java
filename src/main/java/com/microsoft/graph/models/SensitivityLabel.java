package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityLabel extends Entity implements Parsable {
    /** The applicableTo property */
    private SensitivityLabelTarget applicableTo;
    /** The applicationMode property */
    private ApplicationMode applicationMode;
    /** The assignedPolicies property */
    private java.util.List<LabelPolicy> assignedPolicies;
    /** The autoLabeling property */
    private AutoLabeling autoLabeling;
    /** The description property */
    private String description;
    /** The displayName property */
    private String displayName;
    /** The isDefault property */
    private Boolean isDefault;
    /** The isEndpointProtectionEnabled property */
    private Boolean isEndpointProtectionEnabled;
    /** The labelActions property */
    private java.util.List<LabelActionBase> labelActions;
    /** The name property */
    private String name;
    /** The priority property */
    private Integer priority;
    /** The sublabels property */
    private java.util.List<SensitivityLabel> sublabels;
    /** The toolTip property */
    private String toolTip;
    /**
     * Instantiates a new sensitivityLabel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SensitivityLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityLabel
     */
    @javax.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
    }
    /**
     * Gets the applicableTo property value. The applicableTo property
     * @return a sensitivityLabelTarget
     */
    @javax.annotation.Nullable
    public SensitivityLabelTarget getApplicableTo() {
        return this.applicableTo;
    }
    /**
     * Gets the applicationMode property value. The applicationMode property
     * @return a applicationMode
     */
    @javax.annotation.Nullable
    public ApplicationMode getApplicationMode() {
        return this.applicationMode;
    }
    /**
     * Gets the assignedPolicies property value. The assignedPolicies property
     * @return a labelPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<LabelPolicy> getAssignedPolicies() {
        return this.assignedPolicies;
    }
    /**
     * Gets the autoLabeling property value. The autoLabeling property
     * @return a autoLabeling
     */
    @javax.annotation.Nullable
    public AutoLabeling getAutoLabeling() {
        return this.autoLabeling;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableTo", (n) -> { this.setApplicableTo(n.getEnumValue(SensitivityLabelTarget.class)); });
        deserializerMap.put("applicationMode", (n) -> { this.setApplicationMode(n.getEnumValue(ApplicationMode.class)); });
        deserializerMap.put("assignedPolicies", (n) -> { this.setAssignedPolicies(n.getCollectionOfObjectValues(LabelPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("autoLabeling", (n) -> { this.setAutoLabeling(n.getObjectValue(AutoLabeling::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEndpointProtectionEnabled() {
        return this.isEndpointProtectionEnabled;
    }
    /**
     * Gets the labelActions property value. The labelActions property
     * @return a labelActionBase
     */
    @javax.annotation.Nullable
    public java.util.List<LabelActionBase> getLabelActions() {
        return this.labelActions;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the sublabels property value. The sublabels property
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSublabels() {
        return this.sublabels;
    }
    /**
     * Gets the toolTip property value. The toolTip property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToolTip() {
        return this.toolTip;
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
        writer.writeEnumValue("applicableTo", this.getApplicableTo());
        writer.writeEnumValue("applicationMode", this.getApplicationMode());
        writer.writeCollectionOfObjectValues("assignedPolicies", this.getAssignedPolicies());
        writer.writeObjectValue("autoLabeling", this.getAutoLabeling());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableTo(@javax.annotation.Nullable final SensitivityLabelTarget value) {
        this.applicableTo = value;
    }
    /**
     * Sets the applicationMode property value. The applicationMode property
     * @param value Value to set for the applicationMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationMode(@javax.annotation.Nullable final ApplicationMode value) {
        this.applicationMode = value;
    }
    /**
     * Sets the assignedPolicies property value. The assignedPolicies property
     * @param value Value to set for the assignedPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedPolicies(@javax.annotation.Nullable final java.util.List<LabelPolicy> value) {
        this.assignedPolicies = value;
    }
    /**
     * Sets the autoLabeling property value. The autoLabeling property
     * @param value Value to set for the autoLabeling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoLabeling(@javax.annotation.Nullable final AutoLabeling value) {
        this.autoLabeling = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @param value Value to set for the isEndpointProtectionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEndpointProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEndpointProtectionEnabled = value;
    }
    /**
     * Sets the labelActions property value. The labelActions property
     * @param value Value to set for the labelActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabelActions(@javax.annotation.Nullable final java.util.List<LabelActionBase> value) {
        this.labelActions = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the sublabels property value. The sublabels property
     * @param value Value to set for the sublabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSublabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.sublabels = value;
    }
    /**
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToolTip(@javax.annotation.Nullable final String value) {
        this.toolTip = value;
    }
}
