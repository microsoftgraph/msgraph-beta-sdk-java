package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new UserConfiguration and sets the default values.
     */
    public UserConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserConfiguration
     */
    @jakarta.annotation.Nonnull
    public static UserConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConfiguration();
    }
    /**
     * Gets the binaryData property value. The binaryData property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getBinaryData() {
        return this.backingStore.get("binaryData");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("binaryData", (n) -> { this.setBinaryData(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("binaryData", this.getBinaryData());
    }
    /**
     * Sets the binaryData property value. The binaryData property
     * @param value Value to set for the binaryData property.
     */
    public void setBinaryData(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("binaryData", value);
    }
}
