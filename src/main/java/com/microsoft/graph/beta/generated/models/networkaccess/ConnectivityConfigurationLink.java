package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectivityConfigurationLink extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConnectivityConfigurationLink} and sets the default values.
     */
    public ConnectivityConfigurationLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConnectivityConfigurationLink}
     */
    @jakarta.annotation.Nonnull
    public static ConnectivityConfigurationLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectivityConfigurationLink();
    }
    /**
     * Gets the displayName property value. Specifies the name of the link.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("localConfigurations", (n) -> { this.setLocalConfigurations(n.getCollectionOfObjectValues(LocalConnectivityConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("peerConfiguration", (n) -> { this.setPeerConfiguration(n.getObjectValue(PeerConnectivityConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localConfigurations property value. Specifies Microsoft's end of the tunnel configuration for a device link.
     * @return a {@link java.util.List<LocalConnectivityConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocalConnectivityConfiguration> getLocalConfigurations() {
        return this.backingStore.get("localConfigurations");
    }
    /**
     * Gets the peerConfiguration property value. The peerConfiguration property
     * @return a {@link PeerConnectivityConfiguration}
     */
    @jakarta.annotation.Nullable
    public PeerConnectivityConfiguration getPeerConfiguration() {
        return this.backingStore.get("peerConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("localConfigurations", this.getLocalConfigurations());
        writer.writeObjectValue("peerConfiguration", this.getPeerConfiguration());
    }
    /**
     * Sets the displayName property value. Specifies the name of the link.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the localConfigurations property value. Specifies Microsoft's end of the tunnel configuration for a device link.
     * @param value Value to set for the localConfigurations property.
     */
    public void setLocalConfigurations(@jakarta.annotation.Nullable final java.util.List<LocalConnectivityConfiguration> value) {
        this.backingStore.set("localConfigurations", value);
    }
    /**
     * Sets the peerConfiguration property value. The peerConfiguration property
     * @param value Value to set for the peerConfiguration property.
     */
    public void setPeerConfiguration(@jakarta.annotation.Nullable final PeerConnectivityConfiguration value) {
        this.backingStore.set("peerConfiguration", value);
    }
}
