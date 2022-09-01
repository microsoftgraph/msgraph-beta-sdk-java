package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchingLabel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The applicationMode property */
    private ApplicationMode _applicationMode;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The id property */
    private String _id;
    /** The isEndpointProtectionEnabled property */
    private Boolean _isEndpointProtectionEnabled;
    /** The labelActions property */
    private java.util.List<LabelActionBase> _labelActions;
    /** The name property */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The policyTip property */
    private String _policyTip;
    /** The priority property */
    private Integer _priority;
    /** The toolTip property */
    private String _toolTip;
    /**
     * Instantiates a new matchingLabel and sets the default values.
     * @return a void
     */
    public MatchingLabel() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.matchingLabel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a matchingLabel
     */
    @javax.annotation.Nonnull
    public static MatchingLabel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MatchingLabel();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
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
        final MatchingLabel currentObject = this;
        return new HashMap<>(11) {{
            this.put("applicationMode", (n) -> { currentObject.setApplicationMode(n.getEnumValue(ApplicationMode.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("isEndpointProtectionEnabled", (n) -> { currentObject.setIsEndpointProtectionEnabled(n.getBooleanValue()); });
            this.put("labelActions", (n) -> { currentObject.setLabelActions(n.getCollectionOfObjectValues(LabelActionBase::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("policyTip", (n) -> { currentObject.setPolicyTip(n.getStringValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("toolTip", (n) -> { currentObject.setToolTip(n.getStringValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
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
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the policyTip property value. The policyTip property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyTip() {
        return this._policyTip;
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
        writer.writeEnumValue("applicationMode", this.getApplicationMode());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isEndpointProtectionEnabled", this.getIsEndpointProtectionEnabled());
        writer.writeCollectionOfObjectValues("labelActions", this.getLabelActions());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyTip", this.getPolicyTip());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("toolTip", this.getToolTip());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the policyTip property value. The policyTip property
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    public void setPolicyTip(@javax.annotation.Nullable final String value) {
        this._policyTip = value;
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
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     * @return a void
     */
    public void setToolTip(@javax.annotation.Nullable final String value) {
        this._toolTip = value;
    }
}
