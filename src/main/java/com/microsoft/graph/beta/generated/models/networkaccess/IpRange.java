package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpRange extends RuleDestination implements Parsable {
    /**
     * Instantiates a new {@link IpRange} and sets the default values.
     */
    public IpRange() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.ipRange");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IpRange}
     */
    @jakarta.annotation.Nonnull
    public static IpRange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpRange();
    }
    /**
     * Gets the beginAddress property value. Specifies the starting IP address of the IP range.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBeginAddress() {
        return this.backingStore.get("beginAddress");
    }
    /**
     * Gets the endAddress property value. Specifies the ending IP address of the IP range.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEndAddress() {
        return this.backingStore.get("endAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("beginAddress", (n) -> { this.setBeginAddress(n.getStringValue()); });
        deserializerMap.put("endAddress", (n) -> { this.setEndAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("beginAddress", this.getBeginAddress());
        writer.writeStringValue("endAddress", this.getEndAddress());
    }
    /**
     * Sets the beginAddress property value. Specifies the starting IP address of the IP range.
     * @param value Value to set for the beginAddress property.
     */
    public void setBeginAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("beginAddress", value);
    }
    /**
     * Sets the endAddress property value. Specifies the ending IP address of the IP range.
     * @param value Value to set for the endAddress property.
     */
    public void setEndAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("endAddress", value);
    }
}
