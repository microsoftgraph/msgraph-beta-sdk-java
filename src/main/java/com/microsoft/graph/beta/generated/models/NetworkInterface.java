package com.microsoft.graph.beta.models;

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
public class NetworkInterface implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new NetworkInterface and sets the default values.
     */
    public NetworkInterface() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkInterface
     */
    @jakarta.annotation.Nonnull
    public static NetworkInterface createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkInterface();
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
     * Gets the description property value. Description of the NIC (for example, Ethernet adapter, Wireless LAN adapter Local Area Connection, and so on).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("ipV4Address", (n) -> { this.setIpV4Address(n.getStringValue()); });
        deserializerMap.put("ipV6Address", (n) -> { this.setIpV6Address(n.getStringValue()); });
        deserializerMap.put("localIpV6Address", (n) -> { this.setLocalIpV6Address(n.getStringValue()); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ipV4Address property value. Last IPv4 address associated with this NIC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpV4Address() {
        return this.backingStore.get("ipV4Address");
    }
    /**
     * Gets the ipV6Address property value. Last Public (also known as global) IPv6 address associated with this NIC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpV6Address() {
        return this.backingStore.get("ipV6Address");
    }
    /**
     * Gets the localIpV6Address property value. Last local (link-local or site-local) IPv6 address associated with this NIC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalIpV6Address() {
        return this.backingStore.get("localIpV6Address");
    }
    /**
     * Gets the macAddress property value. MAC address of the NIC on this host.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.backingStore.get("macAddress");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("ipV4Address", this.getIpV4Address());
        writer.writeStringValue("ipV6Address", this.getIpV6Address());
        writer.writeStringValue("localIpV6Address", this.getLocalIpV6Address());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the description property value. Description of the NIC (for example, Ethernet adapter, Wireless LAN adapter Local Area Connection, and so on).
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the ipV4Address property value. Last IPv4 address associated with this NIC.
     * @param value Value to set for the ipV4Address property.
     */
    public void setIpV4Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipV4Address", value);
    }
    /**
     * Sets the ipV6Address property value. Last Public (also known as global) IPv6 address associated with this NIC.
     * @param value Value to set for the ipV6Address property.
     */
    public void setIpV6Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipV6Address", value);
    }
    /**
     * Sets the localIpV6Address property value. Last local (link-local or site-local) IPv6 address associated with this NIC.
     * @param value Value to set for the localIpV6Address property.
     */
    public void setLocalIpV6Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localIpV6Address", value);
    }
    /**
     * Sets the macAddress property value. MAC address of the NIC on this host.
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("macAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
