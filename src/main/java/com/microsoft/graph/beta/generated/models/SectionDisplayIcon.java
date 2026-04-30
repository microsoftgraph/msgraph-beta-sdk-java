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
public class SectionDisplayIcon implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SectionDisplayIcon} and sets the default values.
     */
    public SectionDisplayIcon() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SectionDisplayIcon}
     */
    @jakarta.annotation.Nonnull
    public static SectionDisplayIcon createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SectionDisplayIcon();
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
     * Gets the contentUrl property value. The URL to a custom icon image. Applicable when iconType is custom.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.backingStore.get("contentUrl");
    }
    /**
     * Gets the displayName property value. The human-readable name of the icon.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("iconType", (n) -> { this.setIconType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skinTone", (n) -> { this.setSkinTone(n.getEnumValue(SectionIconSkinTone::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iconType property value. The type of icon. Use an emoji character such as  for an emoji icon, or custom for a custom image icon.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIconType() {
        return this.backingStore.get("iconType");
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
     * Gets the skinTone property value. The skin tone variant applied to the icon. Read-only. The possible values are: light, mediumLight, medium, mediumDark, dark, unknownFutureValue.
     * @return a {@link SectionIconSkinTone}
     */
    @jakarta.annotation.Nullable
    public SectionIconSkinTone getSkinTone() {
        return this.backingStore.get("skinTone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("iconType", this.getIconType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("skinTone", this.getSkinTone());
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
     * Sets the contentUrl property value. The URL to a custom icon image. Applicable when iconType is custom.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentUrl", value);
    }
    /**
     * Sets the displayName property value. The human-readable name of the icon.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the iconType property value. The type of icon. Use an emoji character such as  for an emoji icon, or custom for a custom image icon.
     * @param value Value to set for the iconType property.
     */
    public void setIconType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iconType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the skinTone property value. The skin tone variant applied to the icon. Read-only. The possible values are: light, mediumLight, medium, mediumDark, dark, unknownFutureValue.
     * @param value Value to set for the skinTone property.
     */
    public void setSkinTone(@jakarta.annotation.Nullable final SectionIconSkinTone value) {
        this.backingStore.set("skinTone", value);
    }
}
