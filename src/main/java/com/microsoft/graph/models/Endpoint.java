package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Endpoint extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new Endpoint and sets the default values.
     */
    public Endpoint() {
        super();
        this.setOdataType("#microsoft.graph.endpoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Endpoint
     */
    @jakarta.annotation.Nonnull
    public static Endpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Endpoint();
    }
    /**
     * Gets the capability property value. Describes the capability that is associated with this resource. (for example, Messages, Conversations, etc.) Not nullable. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCapability() {
        return this.backingStore.get("capability");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capability", (n) -> { this.setCapability(n.getStringValue()); });
        deserializerMap.put("providerId", (n) -> { this.setProviderId(n.getStringValue()); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("providerResourceId", (n) -> { this.setProviderResourceId(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the providerId property value. Application id of the publishing underlying service. Not nullable. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProviderId() {
        return this.backingStore.get("providerId");
    }
    /**
     * Gets the providerName property value. Name of the publishing underlying service. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.backingStore.get("providerName");
    }
    /**
     * Gets the providerResourceId property value. For Microsoft 365 groups, this is set to a well-known name for the resource (for example, Yammer.FeedURL etc.). Not nullable. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProviderResourceId() {
        return this.backingStore.get("providerResourceId");
    }
    /**
     * Gets the uri property value. URL of the published resource. Not nullable. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.backingStore.get("uri");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("capability", this.getCapability());
        writer.writeStringValue("providerId", this.getProviderId());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeStringValue("providerResourceId", this.getProviderResourceId());
        writer.writeStringValue("uri", this.getUri());
    }
    /**
     * Sets the capability property value. Describes the capability that is associated with this resource. (for example, Messages, Conversations, etc.) Not nullable. Read-only.
     * @param value Value to set for the capability property.
     */
    public void setCapability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("capability", value);
    }
    /**
     * Sets the providerId property value. Application id of the publishing underlying service. Not nullable. Read-only.
     * @param value Value to set for the providerId property.
     */
    public void setProviderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerId", value);
    }
    /**
     * Sets the providerName property value. Name of the publishing underlying service. Read-only.
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerName", value);
    }
    /**
     * Sets the providerResourceId property value. For Microsoft 365 groups, this is set to a well-known name for the resource (for example, Yammer.FeedURL etc.). Not nullable. Read-only.
     * @param value Value to set for the providerResourceId property.
     */
    public void setProviderResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerResourceId", value);
    }
    /**
     * Sets the uri property value. URL of the published resource. Not nullable. Read-only.
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uri", value);
    }
}
