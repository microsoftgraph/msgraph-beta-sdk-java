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
public class PayloadCompatibleAssignmentFilter extends DeviceAndAppManagementAssignmentFilter implements Parsable {
    /**
     * Represents the payload type AssignmentFilter is being assigned to.
     */
    private AssignmentFilterPayloadType payloadType;
    /**
     * Instantiates a new payloadCompatibleAssignmentFilter and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PayloadCompatibleAssignmentFilter() {
        super();
        this.setOdataType("#microsoft.graph.payloadCompatibleAssignmentFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a payloadCompatibleAssignmentFilter
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
        deserializerMap.put("payloadType", (n) -> { this.setPayloadType(n.getEnumValue(AssignmentFilterPayloadType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @return a assignmentFilterPayloadType
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterPayloadType getPayloadType() {
        return this.payloadType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("payloadType", this.getPayloadType());
    }
    /**
     * Sets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @param value Value to set for the payloadType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPayloadType(@jakarta.annotation.Nullable final AssignmentFilterPayloadType value) {
        this.payloadType = value;
    }
}
