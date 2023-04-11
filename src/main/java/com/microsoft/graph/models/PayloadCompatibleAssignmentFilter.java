package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PayloadCompatibleAssignmentFilter extends DeviceAndAppManagementAssignmentFilter implements Parsable {
    /** Represents the payload type AssignmentFilter is being assigned to. */
    private AssignmentFilterPayloadType payloadType;
    /**
     * Instantiates a new PayloadCompatibleAssignmentFilter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PayloadCompatibleAssignmentFilter() {
        super();
        this.setOdataType("#microsoft.graph.payloadCompatibleAssignmentFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PayloadCompatibleAssignmentFilter
     */
    @javax.annotation.Nonnull
    public static PayloadCompatibleAssignmentFilter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadCompatibleAssignmentFilter();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payloadType", (n) -> { this.setPayloadType(n.getEnumValue(AssignmentFilterPayloadType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @return a assignmentFilterPayloadType
     */
    @javax.annotation.Nullable
    public AssignmentFilterPayloadType getPayloadType() {
        return this.payloadType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("payloadType", this.getPayloadType());
    }
    /**
     * Sets the payloadType property value. Represents the payload type AssignmentFilter is being assigned to.
     * @param value Value to set for the payloadType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadType(@javax.annotation.Nullable final AssignmentFilterPayloadType value) {
        this.payloadType = value;
    }
}
