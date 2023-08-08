package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MatchingLabel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The applicationMode property
     */
    private ApplicationMode applicationMode;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The id property
     */
    private String id;
    /**
     * The isEndpointProtectionEnabled property
     */
    private Boolean isEndpointProtectionEnabled;
    /**
     * The labelActions property
     */
    private java.util.List<LabelActionBase> labelActions;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The policyTip property
     */
    private String policyTip;
    /**
     * The priority property
     */
    private Integer priority;
    /**
     * The toolTip property
     */
    private String toolTip;
    /**
     * Instantiates a new matchingLabel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MatchingLabel() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("applicationMode", (n) -> { this.setApplicationMode(n.getEnumValue(ApplicationMode.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isEndpointProtectionEnabled", (n) -> { this.setIsEndpointProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("labelActions", (n) -> { this.setLabelActions(n.getCollectionOfObjectValues(LabelActionBase::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyTip", (n) -> { this.setPolicyTip(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("toolTip", (n) -> { this.setToolTip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyTip property value. The policyTip property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyTip() {
        return this.policyTip;
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
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyTip property value. The policyTip property
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyTip(@javax.annotation.Nullable final String value) {
        this.policyTip = value;
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
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setToolTip(@javax.annotation.Nullable final String value) {
        this.toolTip = value;
    }
}
