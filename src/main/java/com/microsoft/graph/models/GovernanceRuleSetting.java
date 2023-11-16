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
public class GovernanceRuleSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new GovernanceRuleSetting and sets the default values.
     */
    public GovernanceRuleSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceRuleSetting
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRuleSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRuleSetting();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleIdentifier", (n) -> { this.setRuleIdentifier(n.getStringValue()); });
        deserializerMap.put("setting", (n) -> { this.setSetting(n.getStringValue()); });
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
     * Gets the ruleIdentifier property value. The id of the rule. For example, ExpirationRule and MfaRule.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRuleIdentifier() {
        return this.backingStore.get("ruleIdentifier");
    }
    /**
     * Gets the setting property value. The settings of the rule. The value is a JSON string with a list of pairs in the format of ParameterName:ParameterValue. For example, {'permanentAssignment':false,'maximumGrantPeriodInMinutes':129600}
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSetting() {
        return this.backingStore.get("setting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("ruleIdentifier", this.getRuleIdentifier());
        writer.writeStringValue("setting", this.getSetting());
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
     * Sets the ruleIdentifier property value. The id of the rule. For example, ExpirationRule and MfaRule.
     * @param value Value to set for the ruleIdentifier property.
     */
    public void setRuleIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ruleIdentifier", value);
    }
    /**
     * Sets the setting property value. The settings of the rule. The value is a JSON string with a list of pairs in the format of ParameterName:ParameterValue. For example, {'permanentAssignment':false,'maximumGrantPeriodInMinutes':129600}
     * @param value Value to set for the setting property.
     */
    public void setSetting(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("setting", value);
    }
}
