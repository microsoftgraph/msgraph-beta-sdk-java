package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BasicFilter extends Filter implements Parsable {
    /**
     * Instantiates a new {@link BasicFilter} and sets the default values.
     */
    public BasicFilter() {
        super();
        this.setOdataType("#microsoft.graph.industryData.basicFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BasicFilter}
     */
    @jakarta.annotation.Nonnull
    public static BasicFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BasicFilter();
    }
    /**
     * Gets the attribute property value. The attribute property
     * @return a {@link FilterOptions}
     */
    @jakarta.annotation.Nullable
    public FilterOptions getAttribute() {
        return this.backingStore.get("attribute");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attribute", (n) -> { this.setAttribute(n.getEnumValue(FilterOptions::forValue)); });
        deserializerMap.put("in", (n) -> { this.setIn(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the in property value. The condition to filter with.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIn() {
        return this.backingStore.get("in");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("attribute", this.getAttribute());
        writer.writeCollectionOfPrimitiveValues("in", this.getIn());
    }
    /**
     * Sets the attribute property value. The attribute property
     * @param value Value to set for the attribute property.
     */
    public void setAttribute(@jakarta.annotation.Nullable final FilterOptions value) {
        this.backingStore.set("attribute", value);
    }
    /**
     * Sets the in property value. The condition to filter with.
     * @param value Value to set for the in property.
     */
    public void setIn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("in", value);
    }
}
