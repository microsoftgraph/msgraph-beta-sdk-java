package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebSegmentConfiguration extends SegmentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WebSegmentConfiguration} and sets the default values.
     */
    public WebSegmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.webSegmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebSegmentConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static WebSegmentConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebSegmentConfiguration();
    }
    /**
     * Gets the applicationSegments property value. The applicationSegments property
     * @return a {@link java.util.List<WebApplicationSegment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebApplicationSegment> getApplicationSegments() {
        return this.backingStore.get("applicationSegments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationSegments", (n) -> { this.setApplicationSegments(n.getCollectionOfObjectValues(WebApplicationSegment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicationSegments", this.getApplicationSegments());
    }
    /**
     * Sets the applicationSegments property value. The applicationSegments property
     * @param value Value to set for the applicationSegments property.
     */
    public void setApplicationSegments(@jakarta.annotation.Nullable final java.util.List<WebApplicationSegment> value) {
        this.backingStore.set("applicationSegments", value);
    }
}
