package com.microsoft.graph.beta.devicemanagement.comanageddevices.item.sendcustomnotificationtocompanyportal;

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
public class SendCustomNotificationToCompanyPortalPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SendCustomNotificationToCompanyPortalPostRequestBody} and sets the default values.
     */
    public SendCustomNotificationToCompanyPortalPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendCustomNotificationToCompanyPortalPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SendCustomNotificationToCompanyPortalPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendCustomNotificationToCompanyPortalPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("notificationBody", (n) -> { this.setNotificationBody(n.getStringValue()); });
        deserializerMap.put("notificationTitle", (n) -> { this.setNotificationTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notificationBody property value. The notificationBody property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationBody() {
        return this.backingStore.get("notificationBody");
    }
    /**
     * Gets the notificationTitle property value. The notificationTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationTitle() {
        return this.backingStore.get("notificationTitle");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("notificationBody", this.getNotificationBody());
        writer.writeStringValue("notificationTitle", this.getNotificationTitle());
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
     * Sets the notificationBody property value. The notificationBody property
     * @param value Value to set for the notificationBody property.
     */
    public void setNotificationBody(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationBody", value);
    }
    /**
     * Sets the notificationTitle property value. The notificationTitle property
     * @param value Value to set for the notificationTitle property.
     */
    public void setNotificationTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationTitle", value);
    }
}
