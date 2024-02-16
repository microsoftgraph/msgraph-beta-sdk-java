package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TunnelConfigurationIKEv2Custom extends TunnelConfiguration implements Parsable {
    /**
     * Instantiates a new {@link TunnelConfigurationIKEv2Custom} and sets the default values.
     */
    public TunnelConfigurationIKEv2Custom() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.tunnelConfigurationIKEv2Custom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TunnelConfigurationIKEv2Custom}
     */
    @jakarta.annotation.Nonnull
    public static TunnelConfigurationIKEv2Custom createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TunnelConfigurationIKEv2Custom();
    }
    /**
     * Gets the dhGroup property value. The dhGroup property
     * @return a {@link DhGroup}
     */
    @jakarta.annotation.Nullable
    public DhGroup getDhGroup() {
        return this.backingStore.get("dhGroup");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dhGroup", (n) -> { this.setDhGroup(n.getEnumValue(DhGroup::forValue)); });
        deserializerMap.put("ikeEncryption", (n) -> { this.setIkeEncryption(n.getEnumValue(IkeEncryption::forValue)); });
        deserializerMap.put("ikeIntegrity", (n) -> { this.setIkeIntegrity(n.getEnumValue(IkeIntegrity::forValue)); });
        deserializerMap.put("ipSecEncryption", (n) -> { this.setIpSecEncryption(n.getEnumValue(IpSecEncryption::forValue)); });
        deserializerMap.put("ipSecIntegrity", (n) -> { this.setIpSecIntegrity(n.getEnumValue(IpSecIntegrity::forValue)); });
        deserializerMap.put("pfsGroup", (n) -> { this.setPfsGroup(n.getEnumValue(PfsGroup::forValue)); });
        deserializerMap.put("saLifeTimeSeconds", (n) -> { this.setSaLifeTimeSeconds(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ikeEncryption property value. The ikeEncryption property
     * @return a {@link IkeEncryption}
     */
    @jakarta.annotation.Nullable
    public IkeEncryption getIkeEncryption() {
        return this.backingStore.get("ikeEncryption");
    }
    /**
     * Gets the ikeIntegrity property value. The ikeIntegrity property
     * @return a {@link IkeIntegrity}
     */
    @jakarta.annotation.Nullable
    public IkeIntegrity getIkeIntegrity() {
        return this.backingStore.get("ikeIntegrity");
    }
    /**
     * Gets the ipSecEncryption property value. The ipSecEncryption property
     * @return a {@link IpSecEncryption}
     */
    @jakarta.annotation.Nullable
    public IpSecEncryption getIpSecEncryption() {
        return this.backingStore.get("ipSecEncryption");
    }
    /**
     * Gets the ipSecIntegrity property value. The ipSecIntegrity property
     * @return a {@link IpSecIntegrity}
     */
    @jakarta.annotation.Nullable
    public IpSecIntegrity getIpSecIntegrity() {
        return this.backingStore.get("ipSecIntegrity");
    }
    /**
     * Gets the pfsGroup property value. The pfsGroup property
     * @return a {@link PfsGroup}
     */
    @jakarta.annotation.Nullable
    public PfsGroup getPfsGroup() {
        return this.backingStore.get("pfsGroup");
    }
    /**
     * Gets the saLifeTimeSeconds property value. a standard specifiying Security Association lifetime with recommended values from an RFC standard.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSaLifeTimeSeconds() {
        return this.backingStore.get("saLifeTimeSeconds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("dhGroup", this.getDhGroup());
        writer.writeEnumValue("ikeEncryption", this.getIkeEncryption());
        writer.writeEnumValue("ikeIntegrity", this.getIkeIntegrity());
        writer.writeEnumValue("ipSecEncryption", this.getIpSecEncryption());
        writer.writeEnumValue("ipSecIntegrity", this.getIpSecIntegrity());
        writer.writeEnumValue("pfsGroup", this.getPfsGroup());
        writer.writeLongValue("saLifeTimeSeconds", this.getSaLifeTimeSeconds());
    }
    /**
     * Sets the dhGroup property value. The dhGroup property
     * @param value Value to set for the dhGroup property.
     */
    public void setDhGroup(@jakarta.annotation.Nullable final DhGroup value) {
        this.backingStore.set("dhGroup", value);
    }
    /**
     * Sets the ikeEncryption property value. The ikeEncryption property
     * @param value Value to set for the ikeEncryption property.
     */
    public void setIkeEncryption(@jakarta.annotation.Nullable final IkeEncryption value) {
        this.backingStore.set("ikeEncryption", value);
    }
    /**
     * Sets the ikeIntegrity property value. The ikeIntegrity property
     * @param value Value to set for the ikeIntegrity property.
     */
    public void setIkeIntegrity(@jakarta.annotation.Nullable final IkeIntegrity value) {
        this.backingStore.set("ikeIntegrity", value);
    }
    /**
     * Sets the ipSecEncryption property value. The ipSecEncryption property
     * @param value Value to set for the ipSecEncryption property.
     */
    public void setIpSecEncryption(@jakarta.annotation.Nullable final IpSecEncryption value) {
        this.backingStore.set("ipSecEncryption", value);
    }
    /**
     * Sets the ipSecIntegrity property value. The ipSecIntegrity property
     * @param value Value to set for the ipSecIntegrity property.
     */
    public void setIpSecIntegrity(@jakarta.annotation.Nullable final IpSecIntegrity value) {
        this.backingStore.set("ipSecIntegrity", value);
    }
    /**
     * Sets the pfsGroup property value. The pfsGroup property
     * @param value Value to set for the pfsGroup property.
     */
    public void setPfsGroup(@jakarta.annotation.Nullable final PfsGroup value) {
        this.backingStore.set("pfsGroup", value);
    }
    /**
     * Sets the saLifeTimeSeconds property value. a standard specifiying Security Association lifetime with recommended values from an RFC standard.
     * @param value Value to set for the saLifeTimeSeconds property.
     */
    public void setSaLifeTimeSeconds(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("saLifeTimeSeconds", value);
    }
}
