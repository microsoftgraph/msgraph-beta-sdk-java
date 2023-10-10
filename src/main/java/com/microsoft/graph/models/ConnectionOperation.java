package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectionOperation extends Entity implements Parsable {
    /**
     * The error property
     */
    private PublicError error;
    /**
     * The status property
     */
    private ConnectionOperationStatus status;
    /**
     * Instantiates a new ConnectionOperation and sets the default values.
     */
    public ConnectionOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectionOperation
     */
    @jakarta.annotation.Nonnull
    public static ConnectionOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionOperation();
    }
    /**
     * Gets the error property value. The error property
     * @return a PublicError
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectionOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a ConnectionOperationStatus
     */
    @jakarta.annotation.Nullable
    public ConnectionOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.error = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ConnectionOperationStatus value) {
        this.status = value;
    }
}
