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
 * Specifies how the device coordinates a restart after the app is installed. These settings control the grace period before a restart is initiated, when the user sees a countdown notification, and how long the user can defer the restart by snoozing. When null, no restart coordination is applied (the device may still restart based on the app&apos;s deviceRestartBehavior setting).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutoUpdateCatalogAppRestartSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsAutoUpdateCatalogAppRestartSettings} and sets the default values.
     */
    public WindowsAutoUpdateCatalogAppRestartSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsAutoUpdateCatalogAppRestartSettings}
     */
    @jakarta.annotation.Nonnull
    public static WindowsAutoUpdateCatalogAppRestartSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutoUpdateCatalogAppRestartSettings();
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
     * Gets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the scheduled restart at which a countdown notification is displayed to the user. Must be between 1 and the value of gracePeriodInMinutes. This countdown is non-dismissible and warns the user that a restart is imminent. For example, a value of 15 means the countdown appears 15 minutes before the restart.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCountdownDisplayBeforeRestartInMinutes() {
        return this.backingStore.get("countdownDisplayBeforeRestartInMinutes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("countdownDisplayBeforeRestartInMinutes", (n) -> { this.setCountdownDisplayBeforeRestartInMinutes(n.getIntegerValue()); });
        deserializerMap.put("gracePeriodInMinutes", (n) -> { this.setGracePeriodInMinutes(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restartNotificationSnoozeDurationInMinutes", (n) -> { this.setRestartNotificationSnoozeDurationInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInMinutes property value. The number of minutes the device waits after app installation before initiating a restart. During this period, the user can continue working and save their documents. For example, a value of 1440 means the device waits 24 hours before restarting.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInMinutes() {
        return this.backingStore.get("gracePeriodInMinutes");
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
     * Gets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes by which the user can defer (snooze) the restart notification each time they press the snooze button. When null, the snooze option is not available and the user cannot defer the restart. For example, a value of 240 allows the user to defer the restart by 4 hours each time.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRestartNotificationSnoozeDurationInMinutes() {
        return this.backingStore.get("restartNotificationSnoozeDurationInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("countdownDisplayBeforeRestartInMinutes", this.getCountdownDisplayBeforeRestartInMinutes());
        writer.writeIntegerValue("gracePeriodInMinutes", this.getGracePeriodInMinutes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("restartNotificationSnoozeDurationInMinutes", this.getRestartNotificationSnoozeDurationInMinutes());
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
     * Sets the countdownDisplayBeforeRestartInMinutes property value. The number of minutes before the scheduled restart at which a countdown notification is displayed to the user. Must be between 1 and the value of gracePeriodInMinutes. This countdown is non-dismissible and warns the user that a restart is imminent. For example, a value of 15 means the countdown appears 15 minutes before the restart.
     * @param value Value to set for the countdownDisplayBeforeRestartInMinutes property.
     */
    public void setCountdownDisplayBeforeRestartInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("countdownDisplayBeforeRestartInMinutes", value);
    }
    /**
     * Sets the gracePeriodInMinutes property value. The number of minutes the device waits after app installation before initiating a restart. During this period, the user can continue working and save their documents. For example, a value of 1440 means the device waits 24 hours before restarting.
     * @param value Value to set for the gracePeriodInMinutes property.
     */
    public void setGracePeriodInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("gracePeriodInMinutes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restartNotificationSnoozeDurationInMinutes property value. The number of minutes by which the user can defer (snooze) the restart notification each time they press the snooze button. When null, the snooze option is not available and the user cannot defer the restart. For example, a value of 240 allows the user to defer the restart by 4 hours each time.
     * @param value Value to set for the restartNotificationSnoozeDurationInMinutes property.
     */
    public void setRestartNotificationSnoozeDurationInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("restartNotificationSnoozeDurationInMinutes", value);
    }
}
