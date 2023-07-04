package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TunnelConfigurationIKEv2Custom extends TunnelConfiguration implements Parsable {
    /**
     * The dhGroup property
     */
    private DhGroup dhGroup;
    /**
     * The ikeEncryption property
     */
    private IkeEncryption ikeEncryption;
    /**
     * The ikeIntegrity property
     */
    private IkeIntegrity ikeIntegrity;
    /**
     * The ipSecEncryption property
     */
    private IpSecEncryption ipSecEncryption;
    /**
     * The ipSecIntegrity property
     */
    private IpSecIntegrity ipSecIntegrity;
    /**
     * The pfsGroup property
     */
    private PfsGroup pfsGroup;
    /**
     * The saLifeTimeSeconds property
     */
    private Long saLifeTimeSeconds;
    /**
     * Instantiates a new TunnelConfigurationIKEv2Custom and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TunnelConfigurationIKEv2Custom() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.tunnelConfigurationIKEv2Custom");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TunnelConfigurationIKEv2Custom
     */
    @javax.annotation.Nonnull
    public static TunnelConfigurationIKEv2Custom createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TunnelConfigurationIKEv2Custom();
    }
    /**
     * Gets the dhGroup property value. The dhGroup property
     * @return a DhGroup
     */
    @javax.annotation.Nullable
    public DhGroup getDhGroup() {
        return this.dhGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dhGroup", (n) -> { this.setDhGroup(n.getEnumValue(DhGroup.class)); });
        deserializerMap.put("ikeEncryption", (n) -> { this.setIkeEncryption(n.getEnumValue(IkeEncryption.class)); });
        deserializerMap.put("ikeIntegrity", (n) -> { this.setIkeIntegrity(n.getEnumValue(IkeIntegrity.class)); });
        deserializerMap.put("ipSecEncryption", (n) -> { this.setIpSecEncryption(n.getEnumValue(IpSecEncryption.class)); });
        deserializerMap.put("ipSecIntegrity", (n) -> { this.setIpSecIntegrity(n.getEnumValue(IpSecIntegrity.class)); });
        deserializerMap.put("pfsGroup", (n) -> { this.setPfsGroup(n.getEnumValue(PfsGroup.class)); });
        deserializerMap.put("saLifeTimeSeconds", (n) -> { this.setSaLifeTimeSeconds(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ikeEncryption property value. The ikeEncryption property
     * @return a IkeEncryption
     */
    @javax.annotation.Nullable
    public IkeEncryption getIkeEncryption() {
        return this.ikeEncryption;
    }
    /**
     * Gets the ikeIntegrity property value. The ikeIntegrity property
     * @return a IkeIntegrity
     */
    @javax.annotation.Nullable
    public IkeIntegrity getIkeIntegrity() {
        return this.ikeIntegrity;
    }
    /**
     * Gets the ipSecEncryption property value. The ipSecEncryption property
     * @return a IpSecEncryption
     */
    @javax.annotation.Nullable
    public IpSecEncryption getIpSecEncryption() {
        return this.ipSecEncryption;
    }
    /**
     * Gets the ipSecIntegrity property value. The ipSecIntegrity property
     * @return a IpSecIntegrity
     */
    @javax.annotation.Nullable
    public IpSecIntegrity getIpSecIntegrity() {
        return this.ipSecIntegrity;
    }
    /**
     * Gets the pfsGroup property value. The pfsGroup property
     * @return a PfsGroup
     */
    @javax.annotation.Nullable
    public PfsGroup getPfsGroup() {
        return this.pfsGroup;
    }
    /**
     * Gets the saLifeTimeSeconds property value. The saLifeTimeSeconds property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSaLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDhGroup(@javax.annotation.Nullable final DhGroup value) {
        this.dhGroup = value;
    }
    /**
     * Sets the ikeEncryption property value. The ikeEncryption property
     * @param value Value to set for the ikeEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIkeEncryption(@javax.annotation.Nullable final IkeEncryption value) {
        this.ikeEncryption = value;
    }
    /**
     * Sets the ikeIntegrity property value. The ikeIntegrity property
     * @param value Value to set for the ikeIntegrity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIkeIntegrity(@javax.annotation.Nullable final IkeIntegrity value) {
        this.ikeIntegrity = value;
    }
    /**
     * Sets the ipSecEncryption property value. The ipSecEncryption property
     * @param value Value to set for the ipSecEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpSecEncryption(@javax.annotation.Nullable final IpSecEncryption value) {
        this.ipSecEncryption = value;
    }
    /**
     * Sets the ipSecIntegrity property value. The ipSecIntegrity property
     * @param value Value to set for the ipSecIntegrity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpSecIntegrity(@javax.annotation.Nullable final IpSecIntegrity value) {
        this.ipSecIntegrity = value;
    }
    /**
     * Sets the pfsGroup property value. The pfsGroup property
     * @param value Value to set for the pfsGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPfsGroup(@javax.annotation.Nullable final PfsGroup value) {
        this.pfsGroup = value;
    }
    /**
     * Sets the saLifeTimeSeconds property value. The saLifeTimeSeconds property
     * @param value Value to set for the saLifeTimeSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSaLifeTimeSeconds(@javax.annotation.Nullable final Long value) {
        this.saLifeTimeSeconds = value;
    }
}
