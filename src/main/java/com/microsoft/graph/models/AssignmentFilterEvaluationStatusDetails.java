package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing information about the payloads on which filter has been applied.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignmentFilterEvaluationStatusDetails extends Entity implements Parsable {
    /**
     * Instantiates a new AssignmentFilterEvaluationStatusDetails and sets the default values.
     */
    public AssignmentFilterEvaluationStatusDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignmentFilterEvaluationStatusDetails
     */
    @jakarta.annotation.Nonnull
    public static AssignmentFilterEvaluationStatusDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterEvaluationStatusDetails();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payloadId property value. PayloadId on which filter has been applied.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.backingStore.get("payloadId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("payloadId", this.getPayloadId());
    }
    /**
     * Sets the payloadId property value. PayloadId on which filter has been applied.
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadId", value);
    }
}
