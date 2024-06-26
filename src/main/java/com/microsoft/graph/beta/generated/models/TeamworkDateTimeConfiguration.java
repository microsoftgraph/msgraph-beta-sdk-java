package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDateTimeConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TeamworkDateTimeConfiguration} and sets the default values.
     */
    public TeamworkDateTimeConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TeamworkDateTimeConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDateTimeConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDateTimeConfiguration();
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
     * Gets the dateFormat property value. The date format for the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDateFormat() {
        return this.backingStore.get("dateFormat");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dateFormat", (n) -> { this.setDateFormat(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeHoursEndTime", (n) -> { this.setOfficeHoursEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("officeHoursStartTime", (n) -> { this.setOfficeHoursStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("timeFormat", (n) -> { this.setTimeFormat(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
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
     * Gets the officeHoursEndTime property value. The time of the day when the device is turned off.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getOfficeHoursEndTime() {
        return this.backingStore.get("officeHoursEndTime");
    }
    /**
     * Gets the officeHoursStartTime property value. The time of the day when the device is turned on.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getOfficeHoursStartTime() {
        return this.backingStore.get("officeHoursStartTime");
    }
    /**
     * Gets the timeFormat property value. The time format for the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeFormat() {
        return this.backingStore.get("timeFormat");
    }
    /**
     * Gets the timeZone property value. The time zone to which the office hours apply.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dateFormat", this.getDateFormat());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("officeHoursEndTime", this.getOfficeHoursEndTime());
        writer.writeLocalTimeValue("officeHoursStartTime", this.getOfficeHoursStartTime());
        writer.writeStringValue("timeFormat", this.getTimeFormat());
        writer.writeStringValue("timeZone", this.getTimeZone());
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
     * Sets the dateFormat property value. The date format for the device.
     * @param value Value to set for the dateFormat property.
     */
    public void setDateFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dateFormat", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the officeHoursEndTime property value. The time of the day when the device is turned off.
     * @param value Value to set for the officeHoursEndTime property.
     */
    public void setOfficeHoursEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("officeHoursEndTime", value);
    }
    /**
     * Sets the officeHoursStartTime property value. The time of the day when the device is turned on.
     * @param value Value to set for the officeHoursStartTime property.
     */
    public void setOfficeHoursStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("officeHoursStartTime", value);
    }
    /**
     * Sets the timeFormat property value. The time format for the device.
     * @param value Value to set for the timeFormat property.
     */
    public void setTimeFormat(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeFormat", value);
    }
    /**
     * Sets the timeZone property value. The time zone to which the office hours apply.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeZone", value);
    }
}
