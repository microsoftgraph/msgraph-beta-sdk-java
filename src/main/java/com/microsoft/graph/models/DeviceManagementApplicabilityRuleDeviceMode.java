package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementApplicabilityRuleDeviceMode implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Windows 10 Device Mode type. */
    private Windows10DeviceModeType deviceMode;
    /** Name for object. */
    private String name;
    /** The OdataType property */
    private String odataType;
    /** Supported Applicability rule types for Device Configuration */
    private DeviceManagementApplicabilityRuleType ruleType;
    /**
     * Instantiates a new deviceManagementApplicabilityRuleDeviceMode and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleDeviceMode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementApplicabilityRuleDeviceMode
     */
    @javax.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleDeviceMode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleDeviceMode();
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
     * Gets the deviceMode property value. Windows 10 Device Mode type.
     * @return a windows10DeviceModeType
     */
    @javax.annotation.Nullable
    public Windows10DeviceModeType getDeviceMode() {
        return this.deviceMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deviceMode", (n) -> { this.setDeviceMode(n.getEnumValue(Windows10DeviceModeType.class)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleType", (n) -> { this.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name for object.
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
     * Gets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @return a deviceManagementApplicabilityRuleType
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleType getRuleType() {
        return this.ruleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceMode", this.getDeviceMode());
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceMode property value. Windows 10 Device Mode type.
     * @param value Value to set for the deviceMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMode(@javax.annotation.Nullable final Windows10DeviceModeType value) {
        this.deviceMode = value;
    }
    /**
     * Sets the name property value. Name for object.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the ruleType property value. Supported Applicability rule types for Device Configuration
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleType(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this.ruleType = value;
    }
}
