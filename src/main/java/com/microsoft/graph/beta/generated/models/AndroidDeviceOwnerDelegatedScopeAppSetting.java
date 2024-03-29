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
 * Represents one item in the list of managed apps with app details and its associated delegated scope(s).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerDelegatedScopeAppSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AndroidDeviceOwnerDelegatedScopeAppSetting} and sets the default values.
     */
    public AndroidDeviceOwnerDelegatedScopeAppSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidDeviceOwnerDelegatedScopeAppSetting}
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerDelegatedScopeAppSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerDelegatedScopeAppSetting();
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
     * Gets the appDetail property value. Represents an app in the list of managed applications
     * @return a {@link AppListItem}
     */
    @jakarta.annotation.Nullable
    public AppListItem getAppDetail() {
        return this.backingStore.get("appDetail");
    }
    /**
     * Gets the appScopes property value. List of scopes an app has been assigned.
     * @return a {@link java.util.List<AndroidDeviceOwnerDelegatedAppScopeType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerDelegatedAppScopeType> getAppScopes() {
        return this.backingStore.get("appScopes");
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
        deserializerMap.put("appDetail", (n) -> { this.setAppDetail(n.getObjectValue(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopes", (n) -> { this.setAppScopes(n.getCollectionOfEnumValues(AndroidDeviceOwnerDelegatedAppScopeType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appDetail", this.getAppDetail());
        writer.writeCollectionOfEnumValues("appScopes", this.getAppScopes());
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
     * Sets the appDetail property value. Represents an app in the list of managed applications
     * @param value Value to set for the appDetail property.
     */
    public void setAppDetail(@jakarta.annotation.Nullable final AppListItem value) {
        this.backingStore.set("appDetail", value);
    }
    /**
     * Sets the appScopes property value. List of scopes an app has been assigned.
     * @param value Value to set for the appScopes property.
     */
    public void setAppScopes(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerDelegatedAppScopeType> value) {
        this.backingStore.set("appScopes", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
