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
/**
 * License summary of a given app in a token.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VppTokenLicenseSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VppTokenLicenseSummary} and sets the default values.
     */
    public VppTokenLicenseSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VppTokenLicenseSummary}
     */
    @jakarta.annotation.Nonnull
    public static VppTokenLicenseSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppTokenLicenseSummary();
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
     * Gets the appleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppleId() {
        return this.backingStore.get("appleId");
    }
    /**
     * Gets the availableLicenseCount property value. The number of VPP licenses available.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAvailableLicenseCount() {
        return this.backingStore.get("availableLicenseCount");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("appleId", (n) -> { this.setAppleId(n.getStringValue()); });
        deserializerMap.put("availableLicenseCount", (n) -> { this.setAvailableLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("usedLicenseCount", (n) -> { this.setUsedLicenseCount(n.getIntegerValue()); });
        deserializerMap.put("vppTokenId", (n) -> { this.setVppTokenId(n.getStringValue()); });
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
     * Gets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.backingStore.get("organizationName");
    }
    /**
     * Gets the usedLicenseCount property value. The number of VPP licenses in use.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedLicenseCount() {
        return this.backingStore.get("usedLicenseCount");
    }
    /**
     * Gets the vppTokenId property value. Identifier of the VPP token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVppTokenId() {
        return this.backingStore.get("vppTokenId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appleId", this.getAppleId());
        writer.writeIntegerValue("availableLicenseCount", this.getAvailableLicenseCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeIntegerValue("usedLicenseCount", this.getUsedLicenseCount());
        writer.writeStringValue("vppTokenId", this.getVppTokenId());
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
     * Sets the appleId property value. The Apple Id associated with the given Apple Volume Purchase Program Token.
     * @param value Value to set for the appleId property.
     */
    public void setAppleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appleId", value);
    }
    /**
     * Sets the availableLicenseCount property value. The number of VPP licenses available.
     * @param value Value to set for the availableLicenseCount property.
     */
    public void setAvailableLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("availableLicenseCount", value);
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
     * Sets the organizationName property value. The organization associated with the Apple Volume Purchase Program Token.
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationName", value);
    }
    /**
     * Sets the usedLicenseCount property value. The number of VPP licenses in use.
     * @param value Value to set for the usedLicenseCount property.
     */
    public void setUsedLicenseCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedLicenseCount", value);
    }
    /**
     * Sets the vppTokenId property value. Identifier of the VPP token.
     * @param value Value to set for the vppTokenId property.
     */
    public void setVppTokenId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vppTokenId", value);
    }
}
