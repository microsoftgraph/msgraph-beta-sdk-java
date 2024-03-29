package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 10 force update schedule for Kiosk devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskForceUpdateSchedule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsKioskForceUpdateSchedule} and sets the default values.
     */
    public WindowsKioskForceUpdateSchedule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsKioskForceUpdateSchedule}
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskForceUpdateSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskForceUpdateSchedule();
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
     * Gets the dayofMonth property value. Day of month. Valid values 1 to 31
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDayofMonth() {
        return this.backingStore.get("dayofMonth");
    }
    /**
     * Gets the dayofWeek property value. The dayofWeek property
     * @return a {@link DayOfWeek}
     */
    @jakarta.annotation.Nullable
    public DayOfWeek getDayofWeek() {
        return this.backingStore.get("dayofWeek");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dayofMonth", (n) -> { this.setDayofMonth(n.getIntegerValue()); });
        deserializerMap.put("dayofWeek", (n) -> { this.setDayofWeek(n.getEnumValue(DayOfWeek::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getEnumValue(Windows10AppsUpdateRecurrence::forValue)); });
        deserializerMap.put("runImmediatelyIfAfterStartDateTime", (n) -> { this.setRunImmediatelyIfAfterStartDateTime(n.getBooleanValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the recurrence property value. Possible values for App update on Windows10 recurrence.
     * @return a {@link Windows10AppsUpdateRecurrence}
     */
    @jakarta.annotation.Nullable
    public Windows10AppsUpdateRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the runImmediatelyIfAfterStartDateTime property value. If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRunImmediatelyIfAfterStartDateTime() {
        return this.backingStore.get("runImmediatelyIfAfterStartDateTime");
    }
    /**
     * Gets the startDateTime property value. The start time for the force restart.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dayofMonth", this.getDayofMonth());
        writer.writeEnumValue("dayofWeek", this.getDayofWeek());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("recurrence", this.getRecurrence());
        writer.writeBooleanValue("runImmediatelyIfAfterStartDateTime", this.getRunImmediatelyIfAfterStartDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
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
     * Sets the dayofMonth property value. Day of month. Valid values 1 to 31
     * @param value Value to set for the dayofMonth property.
     */
    public void setDayofMonth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dayofMonth", value);
    }
    /**
     * Sets the dayofWeek property value. The dayofWeek property
     * @param value Value to set for the dayofWeek property.
     */
    public void setDayofWeek(@jakarta.annotation.Nullable final DayOfWeek value) {
        this.backingStore.set("dayofWeek", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recurrence property value. Possible values for App update on Windows10 recurrence.
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final Windows10AppsUpdateRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the runImmediatelyIfAfterStartDateTime property value. If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     * @param value Value to set for the runImmediatelyIfAfterStartDateTime property.
     */
    public void setRunImmediatelyIfAfterStartDateTime(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("runImmediatelyIfAfterStartDateTime", value);
    }
    /**
     * Sets the startDateTime property value. The start time for the force restart.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
