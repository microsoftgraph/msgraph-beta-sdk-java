package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementApplicabilityRuleOsEdition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name for object. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Applicability rule OS edition type. */
    private java.util.List<Windows10EditionType> _osEditionTypes;
    /** Supported Applicability rule types for Device Configuration */
    private DeviceManagementApplicabilityRuleType _ruleType;
    /**
     * Instantiates a new deviceManagementApplicabilityRuleOsEdition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsEdition() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementApplicabilityRuleOsEdition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementApplicabilityRuleOsEdition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleOsEdition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleOsEdition();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementApplicabilityRuleOsEdition currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("osEditionTypes", (n) -> { currentObject.setOsEditionTypes(n.getCollectionOfEnumValues(Windows10EditionType.class)); });
        deserializerMap.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType.class)); });
        return deserializerMap
    }
    /**
     * Gets the name property value. Name for object.
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
     * Gets the osEditionTypes property value. Applicability rule OS edition type.
     * @return a windows10EditionType
     */
    @javax.annotation.Nullable
    public java.util.List<Windows10EditionType> getOsEditionTypes() {
        return this._osEditionTypes;
    }
    /**
     * Gets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @return a deviceManagementApplicabilityRuleType
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleType getRuleType() {
        return this._ruleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("osEditionTypes", this.getOsEditionTypes());
        writer.writeEnumValue("ruleType", this.getRuleType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the name property value. Name for object.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the osEditionTypes property value. Applicability rule OS edition type.
     * @param value Value to set for the osEditionTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsEditionTypes(@javax.annotation.Nullable final java.util.List<Windows10EditionType> value) {
        this._osEditionTypes = value;
    }
    /**
     * Sets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleType(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this._ruleType = value;
    }
}
