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
public class AppsAndServicesSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AppsAndServicesSettings and sets the default values.
     */
    public AppsAndServicesSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppsAndServicesSettings
     */
    @jakarta.annotation.Nonnull
    public static AppsAndServicesSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppsAndServicesSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("isAppAndServicesTrialEnabled", (n) -> { this.setIsAppAndServicesTrialEnabled(n.getBooleanValue()); });
        deserializerMap.put("isOfficeStoreEnabled", (n) -> { this.setIsOfficeStoreEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAppAndServicesTrialEnabled property value. Controls whether users can start trial subscriptions for apps and services in your organization.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAppAndServicesTrialEnabled() {
        return this.backingStore.get("isAppAndServicesTrialEnabled");
    }
    /**
     * Gets the isOfficeStoreEnabled property value. Controls whether users can access the Microsoft Store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOfficeStoreEnabled() {
        return this.backingStore.get("isOfficeStoreEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeBooleanValue("isAppAndServicesTrialEnabled", this.getIsAppAndServicesTrialEnabled());
        writer.writeBooleanValue("isOfficeStoreEnabled", this.getIsOfficeStoreEnabled());
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
     * Sets the isAppAndServicesTrialEnabled property value. Controls whether users can start trial subscriptions for apps and services in your organization.
     * @param value Value to set for the isAppAndServicesTrialEnabled property.
     */
    public void setIsAppAndServicesTrialEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAppAndServicesTrialEnabled", value);
    }
    /**
     * Sets the isOfficeStoreEnabled property value. Controls whether users can access the Microsoft Store.
     * @param value Value to set for the isOfficeStoreEnabled property.
     */
    public void setIsOfficeStoreEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOfficeStoreEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
