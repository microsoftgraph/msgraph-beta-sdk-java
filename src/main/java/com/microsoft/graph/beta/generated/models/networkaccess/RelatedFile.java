package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedFile extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedFile} and sets the default values.
     */
    public RelatedFile() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedFile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedFile}
     */
    @jakarta.annotation.Nonnull
    public static RelatedFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedFile();
    }
    /**
     * Gets the directory property value. The directory property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirectory() {
        return this.backingStore.get("directory");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("directory", (n) -> { this.setDirectory(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("sizeInBytes", (n) -> { this.setSizeInBytes(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the sizeInBytes property value. The sizeInBytes property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSizeInBytes() {
        return this.backingStore.get("sizeInBytes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("directory", this.getDirectory());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("sizeInBytes", this.getSizeInBytes());
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     */
    public void setDirectory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("directory", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the sizeInBytes property value. The sizeInBytes property
     * @param value Value to set for the sizeInBytes property.
     */
    public void setSizeInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sizeInBytes", value);
    }
}
