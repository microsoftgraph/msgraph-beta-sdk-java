package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementApplicabilityRuleOsVersion implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Max OS version for Applicability Rule. */
    private String _maxOSVersion;
    /** Min OS version for Applicability Rule. */
    private String _minOSVersion;
    /** Name for object. */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** Supported Applicability rule types for Device Configuration */
    private DeviceManagementApplicabilityRuleType _ruleType;
    /**
     * Instantiates a new deviceManagementApplicabilityRuleOsVersion and sets the default values.
     * @return a void
     */
    public DeviceManagementApplicabilityRuleOsVersion() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementApplicabilityRuleOsVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementApplicabilityRuleOsVersion
     */
    @javax.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleOsVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleOsVersion();
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
        final DeviceManagementApplicabilityRuleOsVersion currentObject = this;
        return new HashMap<>(5) {{
            this.put("maxOSVersion", (n) -> { currentObject.setMaxOSVersion(n.getStringValue()); });
            this.put("minOSVersion", (n) -> { currentObject.setMinOSVersion(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType.class)); });
        }};
    }
    /**
     * Gets the maxOSVersion property value. Max OS version for Applicability Rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaxOSVersion() {
        return this._maxOSVersion;
    }
    /**
     * Gets the minOSVersion property value. Min OS version for Applicability Rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinOSVersion() {
        return this._minOSVersion;
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("maxOSVersion", this.getMaxOSVersion());
        writer.writeStringValue("minOSVersion", this.getMinOSVersion());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("ruleType", this.getRuleType());
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
     * Sets the maxOSVersion property value. Max OS version for Applicability Rule.
     * @param value Value to set for the maxOSVersion property.
     * @return a void
     */
    public void setMaxOSVersion(@javax.annotation.Nullable final String value) {
        this._maxOSVersion = value;
    }
    /**
     * Sets the minOSVersion property value. Min OS version for Applicability Rule.
     * @param value Value to set for the minOSVersion property.
     * @return a void
     */
    public void setMinOSVersion(@javax.annotation.Nullable final String value) {
        this._minOSVersion = value;
    }
    /**
     * Sets the name property value. Name for object.
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
     * Sets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    public void setRuleType(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this._ruleType = value;
    }
}
