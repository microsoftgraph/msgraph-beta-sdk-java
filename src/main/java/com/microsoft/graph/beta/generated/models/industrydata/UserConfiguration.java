package com.microsoft.graph.beta.models.industrydata;

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
public class UserConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserConfiguration} and sets the default values.
     */
    public UserConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static UserConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConfiguration();
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
     * Gets the defaultPasswordSettings property value. The password settings for the users to be provisioned with.
     * @return a {@link PasswordSettings}
     */
    @jakarta.annotation.Nullable
    public PasswordSettings getDefaultPasswordSettings() {
        return this.backingStore.get("defaultPasswordSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultPasswordSettings", (n) -> { this.setDefaultPasswordSettings(n.getObjectValue(PasswordSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseSkus", (n) -> { this.setLicenseSkus(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roleGroup", (n) -> { this.setRoleGroup(n.getObjectValue(RoleGroup::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the licenseSkus property value. The license skus for the users to be provisioned with.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLicenseSkus() {
        return this.backingStore.get("licenseSkus");
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
     * Gets the roleGroup property value. The roleGroup property
     * @return a {@link RoleGroup}
     */
    @jakarta.annotation.Nullable
    public RoleGroup getRoleGroup() {
        return this.backingStore.get("roleGroup");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultPasswordSettings", this.getDefaultPasswordSettings());
        writer.writeCollectionOfPrimitiveValues("licenseSkus", this.getLicenseSkus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("roleGroup", this.getRoleGroup());
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
     * Sets the defaultPasswordSettings property value. The password settings for the users to be provisioned with.
     * @param value Value to set for the defaultPasswordSettings property.
     */
    public void setDefaultPasswordSettings(@jakarta.annotation.Nullable final PasswordSettings value) {
        this.backingStore.set("defaultPasswordSettings", value);
    }
    /**
     * Sets the licenseSkus property value. The license skus for the users to be provisioned with.
     * @param value Value to set for the licenseSkus property.
     */
    public void setLicenseSkus(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("licenseSkus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the roleGroup property value. The roleGroup property
     * @param value Value to set for the roleGroup property.
     */
    public void setRoleGroup(@jakarta.annotation.Nullable final RoleGroup value) {
        this.backingStore.set("roleGroup", value);
    }
}
