package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenoteResource extends OnenoteEntityBaseModel implements Parsable {
    /**
     * The content property
     */
    private byte[] content;
    /**
     * The contentUrl property
     */
    private String contentUrl;
    /**
     * Instantiates a new onenoteResource and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OnenoteResource() {
        super();
        this.setOdataType("#microsoft.graph.onenoteResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenoteResource
     */
    @jakarta.annotation.Nonnull
    public static OnenoteResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenoteResource();
    }
    /**
     * Gets the content property value. The content property
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the contentUrl property value. The contentUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("contentUrl", this.getContentUrl());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the contentUrl property value. The contentUrl property
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.contentUrl = value;
    }
}
