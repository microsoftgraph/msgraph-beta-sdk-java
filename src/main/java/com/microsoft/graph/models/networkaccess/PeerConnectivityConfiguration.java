package com.microsoft.graph.models.networkaccess;

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
public class PeerConnectivityConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PeerConnectivityConfiguration and sets the default values.
     */
    public PeerConnectivityConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PeerConnectivityConfiguration
     */
    @jakarta.annotation.Nonnull
    public static PeerConnectivityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PeerConnectivityConfiguration();
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
     * Gets the asn property value. Specifies ASN of one end of IPSec tunnel (local or peer).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAsn() {
        return this.backingStore.get("asn");
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
     * Gets the bgpAddress property value. Specifies BGP IPv4 address of one end of IPSec tunnel (local or peer).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBgpAddress() {
        return this.backingStore.get("bgpAddress");
    }
    /**
     * Gets the endpoint property value. Specifies public IPv4 address of one end of IPSec tunnel (local or peer).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndpoint() {
        return this.backingStore.get("endpoint");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("asn", (n) -> { this.setAsn(n.getIntegerValue()); });
        deserializerMap.put("bgpAddress", (n) -> { this.setBgpAddress(n.getStringValue()); });
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeIntegerValue("asn", this.getAsn());
        writer.writeStringValue("bgpAddress", this.getBgpAddress());
        writer.writeStringValue("endpoint", this.getEndpoint());
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
     * Sets the asn property value. Specifies ASN of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the asn property.
     */
    public void setAsn(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("asn", value);
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
     * Sets the bgpAddress property value. Specifies BGP IPv4 address of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the bgpAddress property.
     */
    public void setBgpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bgpAddress", value);
    }
    /**
     * Sets the endpoint property value. Specifies public IPv4 address of one end of IPSec tunnel (local or peer).
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("endpoint", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
