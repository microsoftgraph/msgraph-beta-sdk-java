package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an iOS Web Content Filter setting type, which enables iOS automatic filter feature and allows for additional URL access control. When constructed with no property values, the iOS device will enable the automatic filter regardless.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosWebContentFilterAutoFilter extends IosWebContentFilterBase implements Parsable {
    /**
     * Instantiates a new IosWebContentFilterAutoFilter and sets the default values.
     */
    public IosWebContentFilterAutoFilter() {
        super();
        this.setOdataType("#microsoft.graph.iosWebContentFilterAutoFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosWebContentFilterAutoFilter
     */
    @jakarta.annotation.Nonnull
    public static IosWebContentFilterAutoFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosWebContentFilterAutoFilter();
    }
    /**
     * Gets the allowedUrls property value. Additional URLs allowed for access
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedUrls() {
        return this.BackingStore.get("allowedUrls");
    }
    /**
     * Gets the blockedUrls property value. Additional URLs blocked for access
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBlockedUrls() {
        return this.BackingStore.get("blockedUrls");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedUrls", (n) -> { this.setAllowedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("blockedUrls", (n) -> { this.setBlockedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedUrls", this.getAllowedUrls());
        writer.writeCollectionOfPrimitiveValues("blockedUrls", this.getBlockedUrls());
    }
    /**
     * Sets the allowedUrls property value. Additional URLs allowed for access
     * @param value Value to set for the allowedUrls property.
     */
    public void setAllowedUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("allowedUrls", value);
    }
    /**
     * Sets the blockedUrls property value. Additional URLs blocked for access
     * @param value Value to set for the blockedUrls property.
     */
    public void setBlockedUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("blockedUrls", value);
    }
}
