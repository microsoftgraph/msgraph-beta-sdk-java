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
public class CopilotConversationAttribution implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CopilotConversationAttribution} and sets the default values.
     */
    public CopilotConversationAttribution() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotConversationAttribution}
     */
    @jakarta.annotation.Nonnull
    public static CopilotConversationAttribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotConversationAttribution();
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
     * Gets the attributionSource property value. The source of the attribution.
     * @return a {@link CopilotConversationAttributionSource}
     */
    @jakarta.annotation.Nullable
    public CopilotConversationAttributionSource getAttributionSource() {
        return this.backingStore.get("attributionSource");
    }
    /**
     * Gets the attributionType property value. The type of attribution.
     * @return a {@link CopilotConversationAttributionType}
     */
    @jakarta.annotation.Nullable
    public CopilotConversationAttributionType getAttributionType() {
        return this.backingStore.get("attributionType");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("attributionSource", (n) -> { this.setAttributionSource(n.getEnumValue(CopilotConversationAttributionSource::forValue)); });
        deserializerMap.put("attributionType", (n) -> { this.setAttributionType(n.getEnumValue(CopilotConversationAttributionType::forValue)); });
        deserializerMap.put("imageFavIcon", (n) -> { this.setImageFavIcon(n.getStringValue()); });
        deserializerMap.put("imageHeight", (n) -> { this.setImageHeight(n.getIntegerValue()); });
        deserializerMap.put("imageWebUrl", (n) -> { this.setImageWebUrl(n.getStringValue()); });
        deserializerMap.put("imageWidth", (n) -> { this.setImageWidth(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("providerDisplayName", (n) -> { this.setProviderDisplayName(n.getStringValue()); });
        deserializerMap.put("seeMoreWebUrl", (n) -> { this.setSeeMoreWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the imageFavIcon property value. The imageFavIcon property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageFavIcon() {
        return this.backingStore.get("imageFavIcon");
    }
    /**
     * Gets the imageHeight property value. The imageHeight property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageHeight() {
        return this.backingStore.get("imageHeight");
    }
    /**
     * Gets the imageWebUrl property value. The imageWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageWebUrl() {
        return this.backingStore.get("imageWebUrl");
    }
    /**
     * Gets the imageWidth property value. The imageWidth property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getImageWidth() {
        return this.backingStore.get("imageWidth");
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
     * Gets the providerDisplayName property value. The providerDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderDisplayName() {
        return this.backingStore.get("providerDisplayName");
    }
    /**
     * Gets the seeMoreWebUrl property value. The seeMoreWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeeMoreWebUrl() {
        return this.backingStore.get("seeMoreWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("attributionSource", this.getAttributionSource());
        writer.writeEnumValue("attributionType", this.getAttributionType());
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
     * Sets the attributionSource property value. The source of the attribution.
     * @param value Value to set for the attributionSource property.
     */
    public void setAttributionSource(@jakarta.annotation.Nullable final CopilotConversationAttributionSource value) {
        this.backingStore.set("attributionSource", value);
    }
    /**
     * Sets the attributionType property value. The type of attribution.
     * @param value Value to set for the attributionType property.
     */
    public void setAttributionType(@jakarta.annotation.Nullable final CopilotConversationAttributionType value) {
        this.backingStore.set("attributionType", value);
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
     * Sets the imageFavIcon property value. The imageFavIcon property
     * @param value Value to set for the imageFavIcon property.
     */
    public void setImageFavIcon(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageFavIcon", value);
    }
    /**
     * Sets the imageHeight property value. The imageHeight property
     * @param value Value to set for the imageHeight property.
     */
    public void setImageHeight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("imageHeight", value);
    }
    /**
     * Sets the imageWebUrl property value. The imageWebUrl property
     * @param value Value to set for the imageWebUrl property.
     */
    public void setImageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageWebUrl", value);
    }
    /**
     * Sets the imageWidth property value. The imageWidth property
     * @param value Value to set for the imageWidth property.
     */
    public void setImageWidth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("imageWidth", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the providerDisplayName property value. The providerDisplayName property
     * @param value Value to set for the providerDisplayName property.
     */
    public void setProviderDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerDisplayName", value);
    }
    /**
     * Sets the seeMoreWebUrl property value. The seeMoreWebUrl property
     * @param value Value to set for the seeMoreWebUrl property.
     */
    public void setSeeMoreWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("seeMoreWebUrl", value);
    }
}
