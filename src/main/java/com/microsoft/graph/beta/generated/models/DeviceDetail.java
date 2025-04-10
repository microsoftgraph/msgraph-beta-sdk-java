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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DeviceDetail} and sets the default values.
     */
    public DeviceDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceDetail}
     */
    @jakarta.annotation.Nonnull
    public static DeviceDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceDetail();
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
     * Gets the browser property value. Indicates the browser information of the used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.backingStore.get("browser");
    }
    /**
     * Gets the browserId property value. The browserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowserId() {
        return this.backingStore.get("browserId");
    }
    /**
     * Gets the deviceId property value. Refers to the unique ID of the device used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the displayName property value. Refers to the name of the device used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("browserId", (n) -> { this.setBrowserId(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isCompliant", (n) -> { this.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isManaged", (n) -> { this.setIsManaged(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("trustType", (n) -> { this.setTrustType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCompliant property value. Indicates whether the device is compliant or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCompliant() {
        return this.backingStore.get("isCompliant");
    }
    /**
     * Gets the isManaged property value. Indicates if the device is managed or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsManaged() {
        return this.backingStore.get("isManaged");
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
     * Gets the operatingSystem property value. Indicates the OS name and version used in the sign-in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the trustType property value. Indicates information on whether the device used in the sign-in is workplace-joined, Microsoft Entra-joined, domain-joined.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrustType() {
        return this.backingStore.get("trustType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("browserId", this.getBrowserId());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("trustType", this.getTrustType());
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
     * Sets the browser property value. Indicates the browser information of the used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browser", value);
    }
    /**
     * Sets the browserId property value. The browserId property
     * @param value Value to set for the browserId property.
     */
    public void setBrowserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browserId", value);
    }
    /**
     * Sets the deviceId property value. Refers to the unique ID of the device used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the displayName property value. Refers to the name of the device used in the sign-in. Populated for devices registered in Microsoft Entra.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isCompliant property value. Indicates whether the device is compliant or not.
     * @param value Value to set for the isCompliant property.
     */
    public void setIsCompliant(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCompliant", value);
    }
    /**
     * Sets the isManaged property value. Indicates if the device is managed or not.
     * @param value Value to set for the isManaged property.
     */
    public void setIsManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isManaged", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the operatingSystem property value. Indicates the OS name and version used in the sign-in.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the trustType property value. Indicates information on whether the device used in the sign-in is workplace-joined, Microsoft Entra-joined, domain-joined.
     * @param value Value to set for the trustType property.
     */
    public void setTrustType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("trustType", value);
    }
}
