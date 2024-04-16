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
public class TunnelConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TunnelConfiguration} and sets the default values.
     */
    public TunnelConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TunnelConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TunnelConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.networkaccess.tunnelConfigurationIKEv2Custom": return new TunnelConfigurationIKEv2Custom();
                case "#microsoft.graph.networkaccess.tunnelConfigurationIKEv2Default": return new TunnelConfigurationIKEv2Default();
            }
        }
        return new TunnelConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("preSharedKey", (n) -> { this.setPreSharedKey(n.getStringValue()); });
        deserializerMap.put("zoneRedundancyPreSharedKey", (n) -> { this.setZoneRedundancyPreSharedKey(n.getStringValue()); });
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
     * Gets the preSharedKey property value. A key to establish secure connection between the link and VPN tunnel on the edge.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreSharedKey() {
        return this.backingStore.get("preSharedKey");
    }
    /**
     * Gets the zoneRedundancyPreSharedKey property value. Another key for zone redundant tunnel. Required only when you select zoneRedundancy redindancyTier when creating a deviceLink.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZoneRedundancyPreSharedKey() {
        return this.backingStore.get("zoneRedundancyPreSharedKey");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("preSharedKey", this.getPreSharedKey());
        writer.writeStringValue("zoneRedundancyPreSharedKey", this.getZoneRedundancyPreSharedKey());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the preSharedKey property value. A key to establish secure connection between the link and VPN tunnel on the edge.
     * @param value Value to set for the preSharedKey property.
     */
    public void setPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preSharedKey", value);
    }
    /**
     * Sets the zoneRedundancyPreSharedKey property value. Another key for zone redundant tunnel. Required only when you select zoneRedundancy redindancyTier when creating a deviceLink.
     * @param value Value to set for the zoneRedundancyPreSharedKey property.
     */
    public void setZoneRedundancyPreSharedKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("zoneRedundancyPreSharedKey", value);
    }
}
