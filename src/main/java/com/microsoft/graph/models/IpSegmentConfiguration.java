package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpSegmentConfiguration extends SegmentConfiguration implements Parsable {
    /**
     * The applicationSegments property
     */
    private java.util.List<IpApplicationSegment> applicationSegments;
    /**
     * Instantiates a new ipSegmentConfiguration and sets the default values.
     */
    public IpSegmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.ipSegmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipSegmentConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IpSegmentConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpSegmentConfiguration();
    }
    /**
     * Gets the applicationSegments property value. The applicationSegments property
     * @return a ipApplicationSegment
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpApplicationSegment> getApplicationSegments() {
        return this.applicationSegments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationSegments", (n) -> { this.setApplicationSegments(n.getCollectionOfObjectValues(IpApplicationSegment::createFromDiscriminatorValue)); });
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
    public void setApplicationSegments(@jakarta.annotation.Nullable final java.util.List<IpApplicationSegment> value) {
        this.applicationSegments = value;
    }
}
