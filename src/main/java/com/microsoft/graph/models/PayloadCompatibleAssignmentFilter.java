package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for Payload Compatible Assignment Filter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayloadCompatibleAssignmentFilter extends DeviceAndAppManagementAssignmentFilter implements Parsable {
    /**
     * Instantiates a new PayloadCompatibleAssignmentFilter and sets the default values.
     */
    public PayloadCompatibleAssignmentFilter() {
        super();
        this.setOdataType("#microsoft.graph.payloadCompatibleAssignmentFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PayloadCompatibleAssignmentFilter
     */
    @jakarta.annotation.Nonnull
    public static PayloadCompatibleAssignmentFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadCompatibleAssignmentFilter();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payloadType", (n) -> { this.setPayloadType(n.getEnumValue(AssignmentFilterPayloadType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @return a AssignmentFilterPayloadType
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterPayloadType getPayloadType() {
        return this.backingStore.get("payloadType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("payloadType", this.getPayloadType());
    }
    /**
     * Sets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @param value Value to set for the payloadType property.
     */
    public void setPayloadType(@jakarta.annotation.Nullable final AssignmentFilterPayloadType value) {
        this.backingStore.set("payloadType", value);
    }
}
