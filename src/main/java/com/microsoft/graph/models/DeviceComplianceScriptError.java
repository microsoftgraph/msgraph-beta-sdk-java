package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceComplianceScriptRuleError;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptError implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Error code for rule validation. */
    private Code _code;
    /** Error code for rule validation. */
    private DeviceComplianceScriptRulesValidationError _deviceComplianceScriptRulesValidationError;
    /** Error message. */
    private String _message;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceComplianceScriptError and sets the default values.
     * @return a void
     */
    public DeviceComplianceScriptError() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceComplianceScriptError");
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
        return this._additionalData;
    }
    /**
     * Gets the code property value. Error code for rule validation.
     * @return a code
     */
    @javax.annotation.Nullable
    public Code getCode() {
        return this._code;
    }
    /**
     * Gets the deviceComplianceScriptRulesValidationError property value. Error code for rule validation.
     * @return a deviceComplianceScriptRulesValidationError
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptRulesValidationError getDeviceComplianceScriptRulesValidationError() {
        return this._deviceComplianceScriptRulesValidationError;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceComplianceScriptError currentObject = this;
        return new HashMap<>(4) {{
            this.put("code", (n) -> { currentObject.setCode(n.getEnumValue(Code.class)); });
            this.put("deviceComplianceScriptRulesValidationError", (n) -> { currentObject.setDeviceComplianceScriptRulesValidationError(n.getEnumValue(DeviceComplianceScriptRulesValidationError.class)); });
            this.put("message", (n) -> { currentObject.setMessage(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the message property value. Error message.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this._message;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the code property value. Error code for rule validation.
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final Code value) {
        this._code = value;
    }
    /**
     * Sets the deviceComplianceScriptRulesValidationError property value. Error code for rule validation.
     * @param value Value to set for the deviceComplianceScriptRulesValidationError property.
     * @return a void
     */
    public void setDeviceComplianceScriptRulesValidationError(@javax.annotation.Nullable final DeviceComplianceScriptRulesValidationError value) {
        this._deviceComplianceScriptRulesValidationError = value;
    }
    /**
     * Sets the message property value. Error message.
     * @param value Value to set for the message property.
     * @return a void
     */
    public void setMessage(@javax.annotation.Nullable final String value) {
        this._message = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
