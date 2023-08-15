package com.microsoft.graph.networkaccess.forwardingpolicies.item.microsoftgraphnetworkaccessupdatepolicyrules;

import com.microsoft.graph.models.networkaccess.PolicyRuleDelta;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdatePolicyRulesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The rules property
     */
    private java.util.List<PolicyRuleDelta> rules;
    /**
     * Instantiates a new updatePolicyRulesPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UpdatePolicyRulesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updatePolicyRulesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdatePolicyRulesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePolicyRulesPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(PolicyRuleDelta::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rules property value. The rules property
     * @return a policyRuleDelta
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyRuleDelta> getRules() {
        return this.rules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the rules property value. The rules property
     * @param value Value to set for the rules property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRules(@jakarta.annotation.Nullable final java.util.List<PolicyRuleDelta> value) {
        this.rules = value;
    }
}
