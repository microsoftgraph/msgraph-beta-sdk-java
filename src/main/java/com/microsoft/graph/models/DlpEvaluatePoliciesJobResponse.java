package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DlpEvaluatePoliciesJobResponse extends JobResponseBase implements Parsable {
    /**
     * The result property
     */
    private DlpPoliciesJobResult result;
    /**
     * Instantiates a new DlpEvaluatePoliciesJobResponse and sets the default values.
     */
    public DlpEvaluatePoliciesJobResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DlpEvaluatePoliciesJobResponse
     */
    @jakarta.annotation.Nonnull
    public static DlpEvaluatePoliciesJobResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpEvaluatePoliciesJobResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("result", (n) -> { this.setResult(n.getObjectValue(DlpPoliciesJobResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the result property value. The result property
     * @return a DlpPoliciesJobResult
     */
    @jakarta.annotation.Nullable
    public DlpPoliciesJobResult getResult() {
        return this.result;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("result", this.getResult());
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final DlpPoliciesJobResult value) {
        this.result = value;
    }
}
