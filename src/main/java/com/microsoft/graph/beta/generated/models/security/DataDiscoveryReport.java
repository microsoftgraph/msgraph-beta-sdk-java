package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataDiscoveryReport extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DataDiscoveryReport} and sets the default values.
     */
    public DataDiscoveryReport() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DataDiscoveryReport}
     */
    @jakarta.annotation.Nonnull
    public static DataDiscoveryReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataDiscoveryReport();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("uploadedStreams", (n) -> { this.setUploadedStreams(n.getCollectionOfObjectValues(CloudAppDiscoveryReport::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the uploadedStreams property value. A collection of streams available for generating cloud discovery report.
     * @return a {@link java.util.List<CloudAppDiscoveryReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudAppDiscoveryReport> getUploadedStreams() {
        return this.backingStore.get("uploadedStreams");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("uploadedStreams", this.getUploadedStreams());
    }
    /**
     * Sets the uploadedStreams property value. A collection of streams available for generating cloud discovery report.
     * @param value Value to set for the uploadedStreams property.
     */
    public void setUploadedStreams(@jakarta.annotation.Nullable final java.util.List<CloudAppDiscoveryReport> value) {
        this.backingStore.set("uploadedStreams", value);
    }
}
