package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFirewallDestinationMatching implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudFirewallDestinationMatching} and sets the default values.
     */
    public CloudFirewallDestinationMatching() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFirewallDestinationMatching}
     */
    @jakarta.annotation.Nonnull
    public static CloudFirewallDestinationMatching createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFirewallDestinationMatching();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the addresses property value. The destination addresses to match. An empty collection means don&apos;t filter by destination addresses (match all). Required.
     * @return a {@link java.util.List<CloudFirewallDestinationAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudFirewallDestinationAddress> getAddresses() {
        return this.backingStore.get("addresses");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(CloudFirewallDestinationAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("ports", (n) -> { this.setPorts(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocols", (n) -> { this.setProtocols(n.getEnumSetValue(CloudFirewallProtocol::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the ports property value. The destination ports to match, for example, 80, 443, 1024-2048. An empty collection means don&apos;t filter by destination ports (match all). Required.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPorts() {
        return this.backingStore.get("ports");
    }
    /**
     * Gets the protocols property value. The protocols property
     * @return a {@link EnumSet<CloudFirewallProtocol>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudFirewallProtocol> getProtocols() {
        return this.backingStore.get("protocols");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("ports", this.getPorts());
        writer.writeEnumSetValue("protocols", this.getProtocols());
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
     * Sets the addresses property value. The destination addresses to match. An empty collection means don&apos;t filter by destination addresses (match all). Required.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<CloudFirewallDestinationAddress> value) {
        this.backingStore.set("addresses", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the ports property value. The destination ports to match, for example, 80, 443, 1024-2048. An empty collection means don&apos;t filter by destination ports (match all). Required.
     * @param value Value to set for the ports property.
     */
    public void setPorts(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ports", value);
    }
    /**
     * Sets the protocols property value. The protocols property
     * @param value Value to set for the protocols property.
     */
    public void setProtocols(@jakarta.annotation.Nullable final EnumSet<CloudFirewallProtocol> value) {
        this.backingStore.set("protocols", value);
    }
}
