package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteNetworkConnectivityConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new RemoteNetworkConnectivityConfiguration and sets the default values.
     */
    public RemoteNetworkConnectivityConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteNetworkConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static RemoteNetworkConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteNetworkConnectivityConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(ConnectivityConfigurationLink::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remoteNetworkId", (n) -> { this.setRemoteNetworkId(n.getStringValue()); });
        deserializerMap.put("remoteNetworkName", (n) -> { this.setRemoteNetworkName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. The links property
     * @return a java.util.List<ConnectivityConfigurationLink>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectivityConfigurationLink> getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the remoteNetworkId property value. The remoteNetworkId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteNetworkId() {
        return this.backingStore.get("remoteNetworkId");
    }
    /**
     * Gets the remoteNetworkName property value. The remoteNetworkName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteNetworkName() {
        return this.backingStore.get("remoteNetworkName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remoteNetworkId", this.getRemoteNetworkId());
        writer.writeStringValue("remoteNetworkName", this.getRemoteNetworkName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<ConnectivityConfigurationLink> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remoteNetworkId property value. The remoteNetworkId property
     * @param value Value to set for the remoteNetworkId property.
     */
    public void setRemoteNetworkId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteNetworkId", value);
    }
    /**
     * Sets the remoteNetworkName property value. The remoteNetworkName property
     * @param value Value to set for the remoteNetworkName property.
     */
    public void setRemoteNetworkName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteNetworkName", value);
    }
}
