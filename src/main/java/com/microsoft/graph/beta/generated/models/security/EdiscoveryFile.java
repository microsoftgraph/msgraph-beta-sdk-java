package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryFile extends File implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryFile} and sets the default values.
     */
    public EdiscoveryFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryFile}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryFile();
    }
    /**
     * Gets the custodian property value. Custodians associated with the file.
     * @return a {@link EdiscoveryCustodian}
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian getCustodian() {
        return this.backingStore.get("custodian");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("custodian", (n) -> { this.setCustodian(n.getObjectValue(EdiscoveryCustodian::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tags property value. Tags associated with the file.
     * @return a {@link java.util.List<EdiscoveryReviewTag>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("custodian", this.getCustodian());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the custodian property value. Custodians associated with the file.
     * @param value Value to set for the custodian property.
     */
    public void setCustodian(@jakarta.annotation.Nullable final EdiscoveryCustodian value) {
        this.backingStore.set("custodian", value);
    }
    /**
     * Sets the tags property value. Tags associated with the file.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this.backingStore.set("tags", value);
    }
}
