package com.microsoft.graph.beta.models.windowsupdates;

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
 * Per-MDM-application settings for a tenant, identified by a unique MDM app ID (GUID-formatted string).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MdmAppSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link MdmAppSetting} and sets the default values.
     */
    public MdmAppSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MdmAppSetting}
     */
    @jakarta.annotation.Nonnull
    public static MdmAppSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MdmAppSetting();
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
        deserializerMap.put("isHotpatchEnabled", (n) -> { this.setIsHotpatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("mdmAppId", (n) -> { this.setMdmAppId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHotpatchEnabled property value. Whether hotpatch is enabled for this MDM application. The default is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHotpatchEnabled() {
        return this.backingStore.get("isHotpatchEnabled");
    }
    /**
     * Gets the mdmAppId property value. The unique identifier of the MDM application as a GUID-formatted string. This property is the resource key and can&apos;t be updated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMdmAppId() {
        return this.backingStore.get("mdmAppId");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isHotpatchEnabled", this.getIsHotpatchEnabled());
        writer.writeStringValue("mdmAppId", this.getMdmAppId());
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
     * Sets the isHotpatchEnabled property value. Whether hotpatch is enabled for this MDM application. The default is true.
     * @param value Value to set for the isHotpatchEnabled property.
     */
    public void setIsHotpatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHotpatchEnabled", value);
    }
    /**
     * Sets the mdmAppId property value. The unique identifier of the MDM application as a GUID-formatted string. This property is the resource key and can&apos;t be updated.
     * @param value Value to set for the mdmAppId property.
     */
    public void setMdmAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mdmAppId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
