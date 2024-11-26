package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentSharingSession extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ContentSharingSession} and sets the default values.
     */
    public ContentSharingSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentSharingSession}
     */
    @jakarta.annotation.Nonnull
    public static ContentSharingSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentSharingSession();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("pngOfCurrentSlide", (n) -> { this.setPngOfCurrentSlide(n.getByteArrayValue()); });
        deserializerMap.put("presenterParticipantId", (n) -> { this.setPresenterParticipantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pngOfCurrentSlide property value. The pngOfCurrentSlide property
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPngOfCurrentSlide() {
        return this.backingStore.get("pngOfCurrentSlide");
    }
    /**
     * Gets the presenterParticipantId property value. The presenterParticipantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPresenterParticipantId() {
        return this.backingStore.get("presenterParticipantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("pngOfCurrentSlide", this.getPngOfCurrentSlide());
        writer.writeStringValue("presenterParticipantId", this.getPresenterParticipantId());
    }
    /**
     * Sets the pngOfCurrentSlide property value. The pngOfCurrentSlide property
     * @param value Value to set for the pngOfCurrentSlide property.
     */
    public void setPngOfCurrentSlide(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("pngOfCurrentSlide", value);
    }
    /**
     * Sets the presenterParticipantId property value. The presenterParticipantId property
     * @param value Value to set for the presenterParticipantId property.
     */
    public void setPresenterParticipantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("presenterParticipantId", value);
    }
}
