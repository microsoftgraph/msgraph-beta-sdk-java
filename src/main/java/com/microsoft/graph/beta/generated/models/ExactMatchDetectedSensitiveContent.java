package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExactMatchDetectedSensitiveContent extends DetectedSensitiveContentBase implements Parsable {
    /**
     * Instantiates a new {@link ExactMatchDetectedSensitiveContent} and sets the default values.
     */
    public ExactMatchDetectedSensitiveContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExactMatchDetectedSensitiveContent}
     */
    @jakarta.annotation.Nonnull
    public static ExactMatchDetectedSensitiveContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchDetectedSensitiveContent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("matches", (n) -> { this.setMatches(n.getCollectionOfObjectValues(SensitiveContentLocation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the matches property value. The matches property
     * @return a {@link java.util.List<SensitiveContentLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveContentLocation> getMatches() {
        return this.backingStore.get("matches");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     */
    public void setMatches(@jakarta.annotation.Nullable final java.util.List<SensitiveContentLocation> value) {
        this.backingStore.set("matches", value);
    }
}
