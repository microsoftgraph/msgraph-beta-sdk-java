package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceComplianceScriptValidationResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new DeviceComplianceScriptValidationResult and sets the default values.
     */
    public DeviceComplianceScriptValidationResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceComplianceScriptValidationResult
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptValidationResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptValidationResult();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the ruleErrors property value. Errors in json for the script for rules.
     * @return a java.util.List<DeviceComplianceScriptRuleError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRuleError> getRuleErrors() {
        return this.backingStore.get("ruleErrors");
    }
    /**
     * Gets the rules property value. Parsed rules from json.
     * @return a java.util.List<DeviceComplianceScriptRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptRule> getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the scriptErrors property value. Errors in json for the script.
     * @return a java.util.List<DeviceComplianceScriptError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScriptError> getScriptErrors() {
        return this.backingStore.get("scriptErrors");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the ruleErrors property value. Errors in json for the script for rules.
     * @param value Value to set for the ruleErrors property.
     */
    public void setRuleErrors(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptRuleError> value) {
        this.backingStore.set("ruleErrors", value);
    }
    /**
     * Sets the rules property value. Parsed rules from json.
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptRule> value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the scriptErrors property value. Errors in json for the script.
     * @param value Value to set for the scriptErrors property.
     */
    public void setScriptErrors(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScriptError> value) {
        this.backingStore.set("scriptErrors", value);
    }
}
