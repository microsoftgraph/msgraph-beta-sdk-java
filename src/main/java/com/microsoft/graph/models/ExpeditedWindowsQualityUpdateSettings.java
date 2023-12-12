package com.microsoft.graph.models;

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
 * A complex type to store the expedited quality update settings such as release date and days until forced reboot.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpeditedWindowsQualityUpdateSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ExpeditedWindowsQualityUpdateSettings and sets the default values.
     */
    public ExpeditedWindowsQualityUpdateSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExpeditedWindowsQualityUpdateSettings
     */
    @jakarta.annotation.Nonnull
    public static ExpeditedWindowsQualityUpdateSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpeditedWindowsQualityUpdateSettings();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the daysUntilForcedReboot property value. The number of days after installation that forced reboot will happen.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDaysUntilForcedReboot() {
        return this.backingStore.get("daysUntilForcedReboot");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("daysUntilForcedReboot", (n) -> { this.setDaysUntilForcedReboot(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("qualityUpdateRelease", (n) -> { this.setQualityUpdateRelease(n.getStringValue()); });
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
     * Gets the qualityUpdateRelease property value. The release date to identify a quality update.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQualityUpdateRelease() {
        return this.backingStore.get("qualityUpdateRelease");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("daysUntilForcedReboot", this.getDaysUntilForcedReboot());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("qualityUpdateRelease", this.getQualityUpdateRelease());
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
     * Sets the daysUntilForcedReboot property value. The number of days after installation that forced reboot will happen.
     * @param value Value to set for the daysUntilForcedReboot property.
     */
    public void setDaysUntilForcedReboot(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("daysUntilForcedReboot", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the qualityUpdateRelease property value. The release date to identify a quality update.
     * @param value Value to set for the qualityUpdateRelease property.
     */
    public void setQualityUpdateRelease(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("qualityUpdateRelease", value);
    }
}
