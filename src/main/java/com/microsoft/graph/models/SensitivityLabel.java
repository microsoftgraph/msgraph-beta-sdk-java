package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class SensitivityLabel extends Entity implements Parsable {
    /** The applicableTo property */
    private SensitivityLabelTarget _applicableTo;
    /** The applicationMode property */
    private ApplicationMode _applicationMode;
    /** The assignedPolicies property */
    private java.util.List<LabelPolicy> _assignedPolicies;
    /** The autoLabeling property */
    private AutoLabeling _autoLabeling;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The isDefault property */
    private Boolean _isDefault;
    /** The isEndpointProtectionEnabled property */
    private Boolean _isEndpointProtectionEnabled;
    /** The labelActions property */
    private java.util.List<LabelActionBase> _labelActions;
    /** The name property */
    private String _name;
    /** The priority property */
    private Integer _priority;
    /** The sublabels property */
    private java.util.List<SensitivityLabel> _sublabels;
    /** The toolTip property */
    private String _toolTip;
    /**
     * Instantiates a new sensitivityLabel and sets the default values.
     * @return a void
     */
    public SensitivityLabel() {
        super();
        this.setOdataType("#microsoft.graph.sensitivityLabel");
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
        return this._applicableTo;
    }
    /**
     * Gets the applicationMode property value. The applicationMode property
     * @return a applicationMode
     */
    @javax.annotation.Nullable
    public ApplicationMode getApplicationMode() {
        return this._applicationMode;
    }
    /**
     * Gets the assignedPolicies property value. The assignedPolicies property
     * @return a labelPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<LabelPolicy> getAssignedPolicies() {
        return this._assignedPolicies;
    }
    /**
     * Gets the autoLabeling property value. The autoLabeling property
     * @return a autoLabeling
     */
    @javax.annotation.Nullable
    public AutoLabeling getAutoLabeling() {
        return this._autoLabeling;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SensitivityLabel currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applicableTo", (n) -> { currentObject.setApplicableTo(n.getEnumValue(SensitivityLabelTarget.class)); });
            this.put("applicationMode", (n) -> { currentObject.setApplicationMode(n.getEnumValue(ApplicationMode.class)); });
            this.put("assignedPolicies", (n) -> { currentObject.setAssignedPolicies(n.getCollectionOfObjectValues(LabelPolicy::createFromDiscriminatorValue)); });
            this.put("autoLabeling", (n) -> { currentObject.setAutoLabeling(n.getObjectValue(AutoLabeling::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("isEndpointProtectionEnabled", (n) -> { currentObject.setIsEndpointProtectionEnabled(n.getBooleanValue()); });
            this.put("labelActions", (n) -> { currentObject.setLabelActions(n.getCollectionOfObjectValues(LabelActionBase::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("sublabels", (n) -> { currentObject.setSublabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
            this.put("toolTip", (n) -> { currentObject.setToolTip(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEndpointProtectionEnabled() {
        return this._isEndpointProtectionEnabled;
    }
    /**
     * Gets the labelActions property value. The labelActions property
     * @return a labelActionBase
     */
    @javax.annotation.Nullable
    public java.util.List<LabelActionBase> getLabelActions() {
        return this._labelActions;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the sublabels property value. The sublabels property
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSublabels() {
        return this._sublabels;
    }
    /**
     * Gets the toolTip property value. The toolTip property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getToolTip() {
        return this._toolTip;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setApplicableTo(@javax.annotation.Nullable final SensitivityLabelTarget value) {
        this._applicableTo = value;
    }
    /**
     * Sets the applicationMode property value. The applicationMode property
     * @param value Value to set for the applicationMode property.
     * @return a void
     */
    public void setApplicationMode(@javax.annotation.Nullable final ApplicationMode value) {
        this._applicationMode = value;
    }
    /**
     * Sets the assignedPolicies property value. The assignedPolicies property
     * @param value Value to set for the assignedPolicies property.
     * @return a void
     */
    public void setAssignedPolicies(@javax.annotation.Nullable final java.util.List<LabelPolicy> value) {
        this._assignedPolicies = value;
    }
    /**
     * Sets the autoLabeling property value. The autoLabeling property
     * @param value Value to set for the autoLabeling property.
     * @return a void
     */
    public void setAutoLabeling(@javax.annotation.Nullable final AutoLabeling value) {
        this._autoLabeling = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @param value Value to set for the isEndpointProtectionEnabled property.
     * @return a void
     */
    public void setIsEndpointProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEndpointProtectionEnabled = value;
    }
    /**
     * Sets the labelActions property value. The labelActions property
     * @param value Value to set for the labelActions property.
     * @return a void
     */
    public void setLabelActions(@javax.annotation.Nullable final java.util.List<LabelActionBase> value) {
        this._labelActions = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the sublabels property value. The sublabels property
     * @param value Value to set for the sublabels property.
     * @return a void
     */
    public void setSublabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this._sublabels = value;
    }
    /**
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     * @return a void
     */
    public void setToolTip(@javax.annotation.Nullable final String value) {
        this._toolTip = value;
    }
}
