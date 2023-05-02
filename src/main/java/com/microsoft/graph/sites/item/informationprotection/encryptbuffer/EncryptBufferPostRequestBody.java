package com.microsoft.graph.sites.item.informationprotection.encryptbuffer;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class EncryptBufferPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The buffer property */
    private byte[] buffer;
    /** The labelId property */
    private UUID labelId;
    /**
     * Instantiates a new encryptBufferPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EncryptBufferPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptBufferPostRequestBody
     */
    @javax.annotation.Nonnull
    public static EncryptBufferPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptBufferPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the buffer property value. The buffer property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getBuffer() {
        return this.buffer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("buffer", (n) -> { this.setBuffer(n.getByteArrayValue()); });
        deserializerMap.put("labelId", (n) -> { this.setLabelId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labelId property value. The labelId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getLabelId() {
        return this.labelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("buffer", this.getBuffer());
        writer.writeUUIDValue("labelId", this.getLabelId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the buffer property value. The buffer property
     * @param value Value to set for the buffer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuffer(@javax.annotation.Nullable final byte[] value) {
        this.buffer = value;
    }
    /**
     * Sets the labelId property value. The labelId property
     * @param value Value to set for the labelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabelId(@javax.annotation.Nullable final UUID value) {
        this.labelId = value;
    }
}
