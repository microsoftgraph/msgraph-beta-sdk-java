package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class TeamworkDisplayScreenConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TeamworkDisplayScreenConfiguration} and sets the default values.
     */
    public TeamworkDisplayScreenConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkDisplayScreenConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDisplayScreenConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDisplayScreenConfiguration();
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
     * Gets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBacklightBrightness() {
        return this.backingStore.get("backlightBrightness");
    }
    /**
     * Gets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getBacklightTimeout() {
        return this.backingStore.get("backlightTimeout");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("backlightBrightness", (n) -> { this.setBacklightBrightness(n.getIntegerValue()); });
        deserializerMap.put("backlightTimeout", (n) -> { this.setBacklightTimeout(n.getPeriodAndDurationValue()); });
        deserializerMap.put("isHighContrastEnabled", (n) -> { this.setIsHighContrastEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScreensaverEnabled", (n) -> { this.setIsScreensaverEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("screensaverTimeout", (n) -> { this.setScreensaverTimeout(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHighContrastEnabled() {
        return this.backingStore.get("isHighContrastEnabled");
    }
    /**
     * Gets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScreensaverEnabled() {
        return this.backingStore.get("isScreensaverEnabled");
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
     * Gets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getScreensaverTimeout() {
        return this.backingStore.get("screensaverTimeout");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("backlightBrightness", this.getBacklightBrightness());
        writer.writePeriodAndDurationValue("backlightTimeout", this.getBacklightTimeout());
        writer.writeBooleanValue("isHighContrastEnabled", this.getIsHighContrastEnabled());
        writer.writeBooleanValue("isScreensaverEnabled", this.getIsScreensaverEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writePeriodAndDurationValue("screensaverTimeout", this.getScreensaverTimeout());
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
     * Sets the backlightBrightness property value. The brightness level on the device (0-100). Not applicable for Microsoft Teams Rooms devices.
     * @param value Value to set for the backlightBrightness property.
     */
    public void setBacklightBrightness(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("backlightBrightness", value);
    }
    /**
     * Sets the backlightTimeout property value. Timeout for backlight (30-3600 secs). Not applicable for Teams Rooms devices.
     * @param value Value to set for the backlightTimeout property.
     */
    public void setBacklightTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("backlightTimeout", value);
    }
    /**
     * Sets the isHighContrastEnabled property value. True if high contrast mode is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isHighContrastEnabled property.
     */
    public void setIsHighContrastEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHighContrastEnabled", value);
    }
    /**
     * Sets the isScreensaverEnabled property value. True if screensaver is enabled. Not applicable for Teams Rooms devices.
     * @param value Value to set for the isScreensaverEnabled property.
     */
    public void setIsScreensaverEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isScreensaverEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the screensaverTimeout property value. Screensaver timeout from 30 to 3600 secs. Not applicable for Teams Rooms devices.
     * @param value Value to set for the screensaverTimeout property.
     */
    public void setScreensaverTimeout(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("screensaverTimeout", value);
    }
}
