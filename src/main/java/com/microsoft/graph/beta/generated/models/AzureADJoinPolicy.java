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
public class AzureADJoinPolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AzureADJoinPolicy} and sets the default values.
     */
    public AzureADJoinPolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureADJoinPolicy}
     */
    @jakarta.annotation.Nonnull
    public static AzureADJoinPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADJoinPolicy();
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
     * Gets the allowedToJoin property value. Determines if Microsoft Entra join is allowed.
     * @return a {@link DeviceRegistrationMembership}
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationMembership getAllowedToJoin() {
        return this.backingStore.get("allowedToJoin");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowedToJoin", (n) -> { this.setAllowedToJoin(n.getObjectValue(DeviceRegistrationMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("isAdminConfigurable", (n) -> { this.setIsAdminConfigurable(n.getBooleanValue()); });
        deserializerMap.put("localAdmins", (n) -> { this.setLocalAdmins(n.getObjectValue(LocalAdminSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAdminConfigurable property value. Determines if administrators can modify this policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAdminConfigurable() {
        return this.backingStore.get("isAdminConfigurable");
    }
    /**
     * Gets the localAdmins property value. The localAdmins property
     * @return a {@link LocalAdminSettings}
     */
    @jakarta.annotation.Nullable
    public LocalAdminSettings getLocalAdmins() {
        return this.backingStore.get("localAdmins");
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
        writer.writeObjectValue("allowedToJoin", this.getAllowedToJoin());
        writer.writeBooleanValue("isAdminConfigurable", this.getIsAdminConfigurable());
        writer.writeObjectValue("localAdmins", this.getLocalAdmins());
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
     * Sets the allowedToJoin property value. Determines if Microsoft Entra join is allowed.
     * @param value Value to set for the allowedToJoin property.
     */
    public void setAllowedToJoin(@jakarta.annotation.Nullable final DeviceRegistrationMembership value) {
        this.backingStore.set("allowedToJoin", value);
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
     * Sets the isAdminConfigurable property value. Determines if administrators can modify this policy.
     * @param value Value to set for the isAdminConfigurable property.
     */
    public void setIsAdminConfigurable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAdminConfigurable", value);
    }
    /**
     * Sets the localAdmins property value. The localAdmins property
     * @param value Value to set for the localAdmins property.
     */
    public void setLocalAdmins(@jakarta.annotation.Nullable final LocalAdminSettings value) {
        this.backingStore.set("localAdmins", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
