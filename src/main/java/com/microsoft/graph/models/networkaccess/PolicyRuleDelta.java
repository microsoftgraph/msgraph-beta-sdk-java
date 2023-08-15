package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicyRuleDelta implements AdditionalDataHolder, Parsable {
    /**
     * The action property
     */
    private ForwardingRuleAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The identifier of the policy rule to update.
     */
    private String ruleId;
    /**
     * Instantiates a new policyRuleDelta and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PolicyRuleDelta() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a policyRuleDelta
     */
    @jakarta.annotation.Nonnull
    public static PolicyRuleDelta createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRuleDelta();
    }
    /**
     * Gets the action property value. The action property
     * @return a forwardingRuleAction
     */
    @jakarta.annotation.Nullable
    public ForwardingRuleAction getAction() {
        return this.action;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(ForwardingRuleAction.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ruleId", (n) -> { this.setRuleId(n.getStringValue()); });
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
     * Gets the ruleId property value. The identifier of the policy rule to update.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRuleId() {
        return this.ruleId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("ruleId", this.getRuleId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAction(@jakarta.annotation.Nullable final ForwardingRuleAction value) {
        this.action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the ruleId property value. The identifier of the policy rule to update.
     * @param value Value to set for the ruleId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRuleId(@jakarta.annotation.Nullable final String value) {
        this.ruleId = value;
    }
}
