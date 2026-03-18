package com.microsoft.graph.beta.devicemanagement.deponboardingsettings.item.releaseappledevices;

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
public class ReleaseAppleDevicesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReleaseAppleDevicesPostRequestBody} and sets the default values.
     */
    public ReleaseAppleDevicesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReleaseAppleDevicesPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReleaseAppleDevicesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReleaseAppleDevicesPostRequestBody();
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
     * Gets the depToken property value. The depToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepToken() {
        return this.backingStore.get("depToken");
    }
    /**
     * Gets the deviceSerialNumbers property value. The deviceSerialNumbers property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeviceSerialNumbers() {
        return this.backingStore.get("deviceSerialNumbers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("depToken", (n) -> { this.setDepToken(n.getStringValue()); });
        deserializerMap.put("deviceSerialNumbers", (n) -> { this.setDeviceSerialNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("depToken", this.getDepToken());
        writer.writeCollectionOfPrimitiveValues("deviceSerialNumbers", this.getDeviceSerialNumbers());
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
     * Sets the depToken property value. The depToken property
     * @param value Value to set for the depToken property.
     */
    public void setDepToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("depToken", value);
    }
    /**
     * Sets the deviceSerialNumbers property value. The deviceSerialNumbers property
     * @param value Value to set for the deviceSerialNumbers property.
     */
    public void setDeviceSerialNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("deviceSerialNumbers", value);
    }
}
