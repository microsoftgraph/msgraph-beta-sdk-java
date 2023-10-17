package com.microsoft.graph.devicemanagement.manageddevices.item.initiateondemandproactiveremediation;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InitiateOnDemandProactiveRemediationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The scriptPolicyId property
     */
    private String scriptPolicyId;
    /**
     * Instantiates a new InitiateOnDemandProactiveRemediationPostRequestBody and sets the default values.
     */
    public InitiateOnDemandProactiveRemediationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InitiateOnDemandProactiveRemediationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InitiateOnDemandProactiveRemediationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InitiateOnDemandProactiveRemediationPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        deserializerMap.put("scriptPolicyId", (n) -> { this.setScriptPolicyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scriptPolicyId property value. The scriptPolicyId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptPolicyId() {
        return this.scriptPolicyId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("scriptPolicyId", this.getScriptPolicyId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the scriptPolicyId property value. The scriptPolicyId property
     * @param value Value to set for the scriptPolicyId property.
     */
    public void setScriptPolicyId(@jakarta.annotation.Nullable final String value) {
        this.scriptPolicyId = value;
    }
}
