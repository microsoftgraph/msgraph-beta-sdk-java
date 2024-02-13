package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedSignupStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedSignupStatus} and sets the default values.
     */
    public PrivilegedSignupStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedSignupStatus}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedSignupStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedSignupStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRegistered", (n) -> { this.setIsRegistered(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SetupStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isRegistered property value. The isRegistered property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRegistered() {
        return this.backingStore.get("isRegistered");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link SetupStatus}
     */
    @jakarta.annotation.Nullable
    public SetupStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isRegistered", this.getIsRegistered());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the isRegistered property value. The isRegistered property
     * @param value Value to set for the isRegistered property.
     */
    public void setIsRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRegistered", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SetupStatus value) {
        this.backingStore.set("status", value);
    }
}
