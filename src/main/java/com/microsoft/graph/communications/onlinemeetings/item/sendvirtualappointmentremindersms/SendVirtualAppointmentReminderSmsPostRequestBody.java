package com.microsoft.graph.communications.onlinemeetings.item.sendvirtualappointmentremindersms;

import com.microsoft.graph.models.RemindBeforeTimeInMinutesType;
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
public class SendVirtualAppointmentReminderSmsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SendVirtualAppointmentReminderSmsPostRequestBody and sets the default values.
     */
    public SendVirtualAppointmentReminderSmsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SendVirtualAppointmentReminderSmsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SendVirtualAppointmentReminderSmsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendVirtualAppointmentReminderSmsPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("phoneNumbers", (n) -> { this.setPhoneNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("remindBeforeTimeInMinutesType", (n) -> { this.setRemindBeforeTimeInMinutesType(n.getEnumValue(RemindBeforeTimeInMinutesType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the phoneNumbers property value. The phoneNumbers property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPhoneNumbers() {
        return this.backingStore.get("phoneNumbers");
    }
    /**
     * Gets the remindBeforeTimeInMinutesType property value. The remindBeforeTimeInMinutesType property
     * @return a RemindBeforeTimeInMinutesType
     */
    @jakarta.annotation.Nullable
    public RemindBeforeTimeInMinutesType getRemindBeforeTimeInMinutesType() {
        return this.backingStore.get("remindBeforeTimeInMinutesType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("phoneNumbers", this.getPhoneNumbers());
        writer.writeEnumValue("remindBeforeTimeInMinutesType", this.getRemindBeforeTimeInMinutesType());
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
     * Sets the phoneNumbers property value. The phoneNumbers property
     * @param value Value to set for the phoneNumbers property.
     */
    public void setPhoneNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("phoneNumbers", value);
    }
    /**
     * Sets the remindBeforeTimeInMinutesType property value. The remindBeforeTimeInMinutesType property
     * @param value Value to set for the remindBeforeTimeInMinutesType property.
     */
    public void setRemindBeforeTimeInMinutesType(@jakarta.annotation.Nullable final RemindBeforeTimeInMinutesType value) {
        this.backingStore.set("remindBeforeTimeInMinutesType", value);
    }
}
