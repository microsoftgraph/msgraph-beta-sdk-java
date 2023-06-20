package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Error code for rule validation. */
    private Code code;
    /** Error code for rule validation. */
    private DeviceComplianceScriptRulesValidationError deviceComplianceScriptRulesValidationError;
    /** Error message. */
    private String message;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new deviceComplianceScriptError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptError
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceComplianceScriptRuleError": return new DeviceComplianceScriptRuleError();
            }
        }
        return new DeviceComplianceScriptError();
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
     * Gets the code property value. Error code for rule validation.
     * @return a Code
     */
    @javax.annotation.Nullable
    public Code getCode() {
        return this.code;
    }
    /**
     * Gets the deviceComplianceScriptRulesValidationError property value. Error code for rule validation.
     * @return a DeviceComplianceScriptRulesValidationError
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRulesValidationError getDeviceComplianceScriptRulesValidationError() {
        return this.deviceComplianceScriptRulesValidationError;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("code", (n) -> { this.setCode(n.getEnumValue(Code.class)); });
        deserializerMap.put("deviceComplianceScriptRulesValidationError", (n) -> { this.setDeviceComplianceScriptRulesValidationError(n.getEnumValue(DeviceComplianceScriptRulesValidationError.class)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Error message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("code", this.getCode());
        writer.writeEnumValue("deviceComplianceScriptRulesValidationError", this.getDeviceComplianceScriptRulesValidationError());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the code property value. Error code for rule validation.
     * @param value Value to set for the code property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCode(@javax.annotation.Nullable final Code value) {
        this.code = value;
    }
    /**
     * Sets the deviceComplianceScriptRulesValidationError property value. Error code for rule validation.
     * @param value Value to set for the deviceComplianceScriptRulesValidationError property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceComplianceScriptRulesValidationError(@javax.annotation.Nullable final DeviceComplianceScriptRulesValidationError value) {
        this.deviceComplianceScriptRulesValidationError = value;
    }
    /**
     * Sets the message property value. Error message.
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
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
}
