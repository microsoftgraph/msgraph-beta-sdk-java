package com.microsoft.graph.sites.item.informationprotection.encryptbuffer;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptBufferPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The buffer property
     */
    private Base64url buffer;
    /**
     * The labelId property
     */
    private UUID labelId;
    /**
     * Instantiates a new EncryptBufferPostRequestBody and sets the default values.
     */
    public EncryptBufferPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptBufferPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EncryptBufferPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptBufferPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the buffer property value. The buffer property
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getBuffer() {
        return this.buffer;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("buffer", (n) -> { this.setBuffer(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        deserializerMap.put("labelId", (n) -> { this.setLabelId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labelId property value. The labelId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getLabelId() {
        return this.labelId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buffer", this.getBuffer());
        writer.writeUUIDValue("labelId", this.getLabelId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the buffer property value. The buffer property
     * @param value Value to set for the buffer property.
     */
    public void setBuffer(@jakarta.annotation.Nullable final Base64url value) {
        this.buffer = value;
    }
    /**
     * Sets the labelId property value. The labelId property
     * @param value Value to set for the labelId property.
     */
    public void setLabelId(@jakarta.annotation.Nullable final UUID value) {
        this.labelId = value;
    }
}
