package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScriptValidationResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Errors in json for the script for rules.
     */
    private java.util.List<DeviceComplianceScriptRuleError> ruleErrors;
    /**
     * Parsed rules from json.
     */
    private java.util.List<DeviceComplianceScriptRule> rules;
    /**
     * Errors in json for the script.
     */
    private java.util.List<DeviceComplianceScriptError> scriptErrors;
    /**
     * Instantiates a new deviceComplianceScriptValidationResult and sets the default values.
     */
    public DeviceComplianceScriptValidationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptValidationResult
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptValidationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptValidationResult();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleErrors", (n) -> { this.setRuleErrors(n.getCollectionOfObjectValues(DeviceComplianceScriptRuleError::createFromDiscriminatorValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(DeviceComplianceScriptRule::createFromDiscriminatorValue)); });
        deserializerMap.put("scriptErrors", (n) -> { this.setScriptErrors(n.getCollectionOfObjectValues(DeviceComplianceScriptError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the ruleErrors property value. Errors in json for the script for rules.
     * @return a deviceComplianceScriptRuleError
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRuleError> getRuleErrors() {
        return this.ruleErrors;
    }
    /**
     * Gets the rules property value. Parsed rules from json.
     * @return a deviceComplianceScriptRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRule> getRules() {
        return this.rules;
    }
    /**
     * Gets the scriptErrors property value. Errors in json for the script.
     * @return a deviceComplianceScriptError
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptError> getScriptErrors() {
        return this.scriptErrors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("ruleErrors", this.getRuleErrors());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeCollectionOfObjectValues("scriptErrors", this.getScriptErrors());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the ruleErrors property value. Errors in json for the script for rules.
     * @param value Value to set for the ruleErrors property.
     */
    public void setRuleErrors(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptRuleError> value) {
        this.ruleErrors = value;
    }
    /**
     * Sets the rules property value. Parsed rules from json.
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptRule> value) {
        this.rules = value;
    }
    /**
     * Sets the scriptErrors property value. Errors in json for the script.
     * @param value Value to set for the scriptErrors property.
     */
    public void setScriptErrors(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptError> value) {
        this.scriptErrors = value;
    }
}
