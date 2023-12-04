package com.microsoft.graph.models;

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
 * Enrollment status screen setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsEnrollmentStatusScreenSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new WindowsEnrollmentStatusScreenSettings and sets the default values.
     */
    public WindowsEnrollmentStatusScreenSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsEnrollmentStatusScreenSettings
     */
    @jakarta.annotation.Nonnull
    public static WindowsEnrollmentStatusScreenSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsEnrollmentStatusScreenSettings();
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
     * Gets the allowDeviceUseBeforeProfileAndAppInstallComplete property value. Allow or block user to use device before profile and app installation complete
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceUseBeforeProfileAndAppInstallComplete() {
        return this.backingStore.get("allowDeviceUseBeforeProfileAndAppInstallComplete");
    }
    /**
     * Gets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeviceUseOnInstallFailure() {
        return this.backingStore.get("allowDeviceUseOnInstallFailure");
    }
    /**
     * Gets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLogCollectionOnInstallFailure() {
        return this.backingStore.get("allowLogCollectionOnInstallFailure");
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
     * Gets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockDeviceSetupRetryByUser() {
        return this.backingStore.get("blockDeviceSetupRetryByUser");
    }
    /**
     * Gets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomErrorMessage() {
        return this.backingStore.get("customErrorMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("allowDeviceUseBeforeProfileAndAppInstallComplete", (n) -> { this.setAllowDeviceUseBeforeProfileAndAppInstallComplete(n.getBooleanValue()); });
        deserializerMap.put("allowDeviceUseOnInstallFailure", (n) -> { this.setAllowDeviceUseOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("allowLogCollectionOnInstallFailure", (n) -> { this.setAllowLogCollectionOnInstallFailure(n.getBooleanValue()); });
        deserializerMap.put("blockDeviceSetupRetryByUser", (n) -> { this.setBlockDeviceSetupRetryByUser(n.getBooleanValue()); });
        deserializerMap.put("customErrorMessage", (n) -> { this.setCustomErrorMessage(n.getStringValue()); });
        deserializerMap.put("hideInstallationProgress", (n) -> { this.setHideInstallationProgress(n.getBooleanValue()); });
        deserializerMap.put("installProgressTimeoutInMinutes", (n) -> { this.setInstallProgressTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hideInstallationProgress property value. Show or hide installation progress to user
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHideInstallationProgress() {
        return this.backingStore.get("hideInstallationProgress");
    }
    /**
     * Gets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInstallProgressTimeoutInMinutes() {
        return this.backingStore.get("installProgressTimeoutInMinutes");
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
        writer.writeBooleanValue("allowDeviceUseBeforeProfileAndAppInstallComplete", this.getAllowDeviceUseBeforeProfileAndAppInstallComplete());
        writer.writeBooleanValue("allowDeviceUseOnInstallFailure", this.getAllowDeviceUseOnInstallFailure());
        writer.writeBooleanValue("allowLogCollectionOnInstallFailure", this.getAllowLogCollectionOnInstallFailure());
        writer.writeBooleanValue("blockDeviceSetupRetryByUser", this.getBlockDeviceSetupRetryByUser());
        writer.writeStringValue("customErrorMessage", this.getCustomErrorMessage());
        writer.writeBooleanValue("hideInstallationProgress", this.getHideInstallationProgress());
        writer.writeIntegerValue("installProgressTimeoutInMinutes", this.getInstallProgressTimeoutInMinutes());
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
     * Sets the allowDeviceUseBeforeProfileAndAppInstallComplete property value. Allow or block user to use device before profile and app installation complete
     * @param value Value to set for the allowDeviceUseBeforeProfileAndAppInstallComplete property.
     */
    public void setAllowDeviceUseBeforeProfileAndAppInstallComplete(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowDeviceUseBeforeProfileAndAppInstallComplete", value);
    }
    /**
     * Sets the allowDeviceUseOnInstallFailure property value. Allow the user to continue using the device on installation failure
     * @param value Value to set for the allowDeviceUseOnInstallFailure property.
     */
    public void setAllowDeviceUseOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowDeviceUseOnInstallFailure", value);
    }
    /**
     * Sets the allowLogCollectionOnInstallFailure property value. Allow or block log collection on installation failure
     * @param value Value to set for the allowLogCollectionOnInstallFailure property.
     */
    public void setAllowLogCollectionOnInstallFailure(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowLogCollectionOnInstallFailure", value);
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
     * Sets the blockDeviceSetupRetryByUser property value. Allow the user to retry the setup on installation failure
     * @param value Value to set for the blockDeviceSetupRetryByUser property.
     */
    public void setBlockDeviceSetupRetryByUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockDeviceSetupRetryByUser", value);
    }
    /**
     * Sets the customErrorMessage property value. Set custom error message to show upon installation failure
     * @param value Value to set for the customErrorMessage property.
     */
    public void setCustomErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customErrorMessage", value);
    }
    /**
     * Sets the hideInstallationProgress property value. Show or hide installation progress to user
     * @param value Value to set for the hideInstallationProgress property.
     */
    public void setHideInstallationProgress(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hideInstallationProgress", value);
    }
    /**
     * Sets the installProgressTimeoutInMinutes property value. Set installation progress timeout in minutes
     * @param value Value to set for the installProgressTimeoutInMinutes property.
     */
    public void setInstallProgressTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("installProgressTimeoutInMinutes", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
