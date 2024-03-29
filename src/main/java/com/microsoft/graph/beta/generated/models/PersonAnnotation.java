package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PersonAnnotation extends ItemFacet implements Parsable {
    /**
     * Instantiates a new {@link PersonAnnotation} and sets the default values.
     */
    public PersonAnnotation() {
        super();
        this.setOdataType("#microsoft.graph.personAnnotation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PersonAnnotation}
     */
    @jakarta.annotation.Nonnull
    public static PersonAnnotation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAnnotation();
    }
    /**
     * Gets the detail property value. Contains the detail of the note itself.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getDetail() {
        return this.backingStore.get("detail");
    }
    /**
     * Gets the displayName property value. Contains a friendly name for the note.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
    }
    /**
     * Sets the detail property value. Contains the detail of the note itself.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("detail", value);
    }
    /**
     * Sets the displayName property value. Contains a friendly name for the note.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
}
