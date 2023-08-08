package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScriptValidationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptValidationResult
     */
    @javax.annotation.Nonnull
    public static DeviceComplianceScriptValidationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptValidationResult();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the ruleErrors property value. Errors in json for the script for rules.
     * @return a deviceComplianceScriptRuleError
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRuleError> getRuleErrors() {
        return this.ruleErrors;
    }
    /**
     * Gets the rules property value. Parsed rules from json.
     * @return a deviceComplianceScriptRule
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRule> getRules() {
        return this.rules;
    }
    /**
     * Gets the scriptErrors property value. Errors in json for the script.
     * @return a deviceComplianceScriptError
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceComplianceScriptError> getScriptErrors() {
        return this.scriptErrors;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the ruleErrors property value. Errors in json for the script for rules.
     * @param value Value to set for the ruleErrors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRuleErrors(@javax.annotation.Nullable final java.util.List<DeviceComplianceScriptRuleError> value) {
        this.ruleErrors = value;
    }
    /**
     * Sets the rules property value. Parsed rules from json.
     * @param value Value to set for the rules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRules(@javax.annotation.Nullable final java.util.List<DeviceComplianceScriptRule> value) {
        this.rules = value;
    }
    /**
     * Sets the scriptErrors property value. Errors in json for the script.
     * @param value Value to set for the scriptErrors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScriptErrors(@javax.annotation.Nullable final java.util.List<DeviceComplianceScriptError> value) {
        this.scriptErrors = value;
    }
}
