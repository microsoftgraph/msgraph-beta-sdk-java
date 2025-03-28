package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnenoteResource extends OnenoteEntityBaseModel implements Parsable {
    /**
     * Instantiates a new {@link OnenoteResource} and sets the default values.
     */
    public OnenoteResource() {
        super();
        this.setOdataType("#microsoft.graph.onenoteResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnenoteResource}
     */
    @jakarta.annotation.Nonnull
    public static OnenoteResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteResource();
    }
    /**
     * Gets the content property value. The content of the resource.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the contentUrl property value. The URL for the content stream.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.backingStore.get("contentUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("contentUrl", this.getContentUrl());
    }
    /**
     * Sets the content property value. The content of the resource.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the contentUrl property value. The URL for the content stream.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentUrl", value);
    }
}
