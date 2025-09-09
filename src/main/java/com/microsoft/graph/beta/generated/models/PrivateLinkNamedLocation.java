package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateLinkNamedLocation extends NamedLocation implements Parsable {
    /**
     * Instantiates a new {@link PrivateLinkNamedLocation} and sets the default values.
     */
    public PrivateLinkNamedLocation() {
        super();
        this.setOdataType("#microsoft.graph.privateLinkNamedLocation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivateLinkNamedLocation}
     */
    @jakarta.annotation.Nonnull
    public static PrivateLinkNamedLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateLinkNamedLocation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isTrusted", (n) -> { this.setIsTrusted(n.getBooleanValue()); });
        deserializerMap.put("privateLinkResourcePolicyIds", (n) -> { this.setPrivateLinkResourcePolicyIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isTrusted property value. The isTrusted property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTrusted() {
        return this.backingStore.get("isTrusted");
    }
    /**
     * Gets the privateLinkResourcePolicyIds property value. The privateLinkResourcePolicyIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPrivateLinkResourcePolicyIds() {
        return this.backingStore.get("privateLinkResourcePolicyIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isTrusted", this.getIsTrusted());
        writer.writeCollectionOfPrimitiveValues("privateLinkResourcePolicyIds", this.getPrivateLinkResourcePolicyIds());
    }
    /**
     * Sets the isTrusted property value. The isTrusted property
     * @param value Value to set for the isTrusted property.
     */
    public void setIsTrusted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTrusted", value);
    }
    /**
     * Sets the privateLinkResourcePolicyIds property value. The privateLinkResourcePolicyIds property
     * @param value Value to set for the privateLinkResourcePolicyIds property.
     */
    public void setPrivateLinkResourcePolicyIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("privateLinkResourcePolicyIds", value);
    }
}
