package com.microsoft.graph.app.onlinemeetings.item.sendvirtualappointmentsms;

import com.microsoft.graph.models.VirtualAppointmentSmsType;
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
public class SendVirtualAppointmentSmsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SendVirtualAppointmentSmsPostRequestBody and sets the default values.
     */
    public SendVirtualAppointmentSmsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SendVirtualAppointmentSmsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SendVirtualAppointmentSmsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendVirtualAppointmentSmsPostRequestBody();
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
        deserializerMap.put("smsType", (n) -> { this.setSmsType(n.getEnumValue(VirtualAppointmentSmsType::forValue)); });
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
     * Gets the smsType property value. The smsType property
     * @return a VirtualAppointmentSmsType
     */
    @jakarta.annotation.Nullable
    public VirtualAppointmentSmsType getSmsType() {
        return this.backingStore.get("smsType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("phoneNumbers", this.getPhoneNumbers());
        writer.writeEnumValue("smsType", this.getSmsType());
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
     * Sets the smsType property value. The smsType property
     * @param value Value to set for the smsType property.
     */
    public void setSmsType(@jakarta.annotation.Nullable final VirtualAppointmentSmsType value) {
        this.backingStore.set("smsType", value);
    }
}
