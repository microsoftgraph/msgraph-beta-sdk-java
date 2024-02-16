package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EvaluateLabelJobResponse extends JobResponseBase implements Parsable {
    /**
     * Instantiates a new {@link EvaluateLabelJobResponse} and sets the default values.
     */
    public EvaluateLabelJobResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EvaluateLabelJobResponse}
     */
    @jakarta.annotation.Nonnull
    public static EvaluateLabelJobResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateLabelJobResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("result", (n) -> { this.setResult(n.getObjectValue(EvaluateLabelJobResultGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the result property value. The result property
     * @return a {@link EvaluateLabelJobResultGroup}
     */
    @jakarta.annotation.Nullable
    public EvaluateLabelJobResultGroup getResult() {
        return this.backingStore.get("result");
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
    public void setResult(@jakarta.annotation.Nullable final EvaluateLabelJobResultGroup value) {
        this.backingStore.set("result", value);
    }
}
