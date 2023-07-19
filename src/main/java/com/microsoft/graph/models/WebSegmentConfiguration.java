package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebSegmentConfiguration extends SegmentConfiguration implements Parsable {
    /**
     * The applicationSegments property
     */
    private java.util.List<WebApplicationSegment> applicationSegments;
    /**
     * Instantiates a new webSegmentConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebSegmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.webSegmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a webSegmentConfiguration
     */
    @javax.annotation.Nonnull
    public static WebSegmentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebSegmentConfiguration();
    }
    /**
     * Gets the applicationSegments property value. The applicationSegments property
     * @return a webApplicationSegment
     */
    @javax.annotation.Nullable
    public java.util.List<WebApplicationSegment> getApplicationSegments() {
        return this.applicationSegments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationSegments", (n) -> { this.setApplicationSegments(n.getCollectionOfObjectValues(WebApplicationSegment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicationSegments", this.getApplicationSegments());
    }
    /**
     * Sets the applicationSegments property value. The applicationSegments property
     * @param value Value to set for the applicationSegments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationSegments(@javax.annotation.Nullable final java.util.List<WebApplicationSegment> value) {
        this.applicationSegments = value;
    }
}
