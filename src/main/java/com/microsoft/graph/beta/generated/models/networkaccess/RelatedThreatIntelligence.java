package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedThreatIntelligence extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedThreatIntelligence} and sets the default values.
     */
    public RelatedThreatIntelligence() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedThreatIntelligence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedThreatIntelligence}
     */
    @jakarta.annotation.Nonnull
    public static RelatedThreatIntelligence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedThreatIntelligence();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("threatCount", (n) -> { this.setThreatCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the threatCount property value. The threatCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getThreatCount() {
        return this.backingStore.get("threatCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("threatCount", this.getThreatCount());
    }
    /**
     * Sets the threatCount property value. The threatCount property
     * @param value Value to set for the threatCount property.
     */
    public void setThreatCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("threatCount", value);
    }
}
