package com.microsoft.graph.beta.models.devicemanagement;

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
public class NotificationChannel implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link NotificationChannel} and sets the default values.
     */
    public NotificationChannel() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NotificationChannel}
     */
    @jakarta.annotation.Nonnull
    public static NotificationChannel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationChannel();
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
        deserializerMap.put("notificationChannelType", (n) -> { this.setNotificationChannelType(n.getEnumValue(NotificationChannelType::forValue)); });
        deserializerMap.put("notificationReceivers", (n) -> { this.setNotificationReceivers(n.getCollectionOfObjectValues(NotificationReceiver::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @return a {@link NotificationChannelType}
     */
    @jakarta.annotation.Nullable
    public NotificationChannelType getNotificationChannelType() {
        return this.backingStore.get("notificationChannelType");
    }
    /**
     * Gets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @return a {@link java.util.List<NotificationReceiver>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationReceiver> getNotificationReceivers() {
        return this.backingStore.get("notificationReceivers");
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
        writer.writeEnumValue("notificationChannelType", this.getNotificationChannelType());
        writer.writeCollectionOfObjectValues("notificationReceivers", this.getNotificationReceivers());
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
     * Sets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @param value Value to set for the notificationChannelType property.
     */
    public void setNotificationChannelType(@jakarta.annotation.Nullable final NotificationChannelType value) {
        this.backingStore.set("notificationChannelType", value);
    }
    /**
     * Sets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @param value Value to set for the notificationReceivers property.
     */
    public void setNotificationReceivers(@jakarta.annotation.Nullable final java.util.List<NotificationReceiver> value) {
        this.backingStore.set("notificationReceivers", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
