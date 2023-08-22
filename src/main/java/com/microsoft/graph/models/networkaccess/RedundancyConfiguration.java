package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedundancyConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The redundancyTier property
     */
    private RedundancyTier redundancyTier;
    /**
     * Indicate the specific IP address used for establishing the Border Gateway Protocol (BGP) connection with Microsoft's network.
     */
    private String zoneLocalIpAddress;
    /**
     * Instantiates a new redundancyConfiguration and sets the default values.
     */
    public RedundancyConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redundancyConfiguration
     */
    @jakarta.annotation.Nonnull
    public static RedundancyConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedundancyConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("redundancyTier", (n) -> { this.setRedundancyTier(n.getEnumValue(RedundancyTier.class)); });
        deserializerMap.put("zoneLocalIpAddress", (n) -> { this.setZoneLocalIpAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the redundancyTier property value. The redundancyTier property
     * @return a redundancyTier
     */
    @jakarta.annotation.Nullable
    public RedundancyTier getRedundancyTier() {
        return this.redundancyTier;
    }
    /**
     * Gets the zoneLocalIpAddress property value. Indicate the specific IP address used for establishing the Border Gateway Protocol (BGP) connection with Microsoft's network.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getZoneLocalIpAddress() {
        return this.zoneLocalIpAddress;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("redundancyTier", this.getRedundancyTier());
        writer.writeStringValue("zoneLocalIpAddress", this.getZoneLocalIpAddress());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the redundancyTier property value. The redundancyTier property
     * @param value Value to set for the redundancyTier property.
     */
    public void setRedundancyTier(@jakarta.annotation.Nullable final RedundancyTier value) {
        this.redundancyTier = value;
    }
    /**
     * Sets the zoneLocalIpAddress property value. Indicate the specific IP address used for establishing the Border Gateway Protocol (BGP) connection with Microsoft's network.
     * @param value Value to set for the zoneLocalIpAddress property.
     */
    public void setZoneLocalIpAddress(@jakarta.annotation.Nullable final String value) {
        this.zoneLocalIpAddress = value;
    }
}
