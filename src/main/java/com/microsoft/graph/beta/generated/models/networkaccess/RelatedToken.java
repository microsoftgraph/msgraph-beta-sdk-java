package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedToken extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedToken} and sets the default values.
     */
    public RelatedToken() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedToken");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedToken}
     */
    @jakarta.annotation.Nonnull
    public static RelatedToken createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedToken();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uniqueTokenIdentifier", (n) -> { this.setUniqueTokenIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the uniqueTokenIdentifier property value. The uniqueTokenIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueTokenIdentifier() {
        return this.backingStore.get("uniqueTokenIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("uniqueTokenIdentifier", this.getUniqueTokenIdentifier());
    }
    /**
     * Sets the uniqueTokenIdentifier property value. The uniqueTokenIdentifier property
     * @param value Value to set for the uniqueTokenIdentifier property.
     */
    public void setUniqueTokenIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueTokenIdentifier", value);
    }
}
