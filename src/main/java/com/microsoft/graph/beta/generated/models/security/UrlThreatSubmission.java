package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UrlThreatSubmission extends ThreatSubmission implements Parsable {
    /**
     * Instantiates a new {@link UrlThreatSubmission} and sets the default values.
     */
    public UrlThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.urlThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UrlThreatSubmission}
     */
    @jakarta.annotation.Nonnull
    public static UrlThreatSubmission createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UrlThreatSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webUrl property value. Denotes the webUrl that needs to be submitted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the webUrl property value. Denotes the webUrl that needs to be submitted.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
