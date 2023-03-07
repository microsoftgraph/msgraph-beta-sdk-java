package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserConfiguration extends Entity implements Parsable {
    /** The binaryData property */
    private byte[] binaryData;
    /**
     * Instantiates a new userConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userConfiguration
     */
    @javax.annotation.Nonnull
    public static UserConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConfiguration();
    }
    /**
     * Gets the binaryData property value. The binaryData property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBinaryData() {
        return this.binaryData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("binaryData", (n) -> { this.setBinaryData(n.getByteArrayValue()); });
        return deserializerMap;
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
        writer.writeByteArrayValue("binaryData", this.getBinaryData());
    }
    /**
     * Sets the binaryData property value. The binaryData property
     * @param value Value to set for the binaryData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBinaryData(@javax.annotation.Nullable final byte[] value) {
        this.binaryData = value;
    }
}
