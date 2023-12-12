package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileClassificationRequest extends Entity implements Parsable {
    /**
     * Instantiates a new FileClassificationRequest and sets the default values.
     */
    public FileClassificationRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileClassificationRequest
     */
    @jakarta.annotation.Nonnull
    public static FileClassificationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileClassificationRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("file", (n) -> { this.setFile(n.getByteArrayValue()); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { this.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. The file property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getFile() {
        return this.backingStore.get("file");
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this.backingStore.get("sensitiveTypeIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("file", this.getFile());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
    }
    /**
     * Sets the file property value. The file property
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("file", value);
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     */
    public void setSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensitiveTypeIds", value);
    }
}
