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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPartnerAgentInstallResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CloudPcPartnerAgentInstallResult and sets the default values.
     */
    public CloudPcPartnerAgentInstallResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcPartnerAgentInstallResult
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPartnerAgentInstallResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcPartnerAgentInstallResult();
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
     * Gets the errorMessage property value. The errorMessage property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.backingStore.get("errorMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("installStatus", (n) -> { this.setInstallStatus(n.getEnumValue(CloudPcPartnerAgentInstallStatus::forValue)); });
        deserializerMap.put("isThirdPartyPartner", (n) -> { this.setIsThirdPartyPartner(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("partnerAgentName", (n) -> { this.setPartnerAgentName(n.getEnumValue(CloudPcPartnerAgentName::forValue)); });
        deserializerMap.put("retriable", (n) -> { this.setRetriable(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installStatus property value. The status of a partner agent installation. Possible values are: installed, installFailed, installing, uninstalling, uninstallFailed and licensed. Read-Only.
     * @return a CloudPcPartnerAgentInstallStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcPartnerAgentInstallStatus getInstallStatus() {
        return this.backingStore.get("installStatus");
    }
    /**
     * Gets the isThirdPartyPartner property value. Indicates if the partner agent is a third party. When 'TRUE' the agent is a third-party (non-Microsoft) agent and when 'FALSE' the agent is a Microsoft agent or isn't known.  The default value is 'FALSE'
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsThirdPartyPartner() {
        return this.backingStore.get("isThirdPartyPartner");
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
     * Gets the partnerAgentName property value. The name of the first-party or third-party partner agent. Possible values for third-party partners are Citrix, VMware and HP. Read-Only.
     * @return a CloudPcPartnerAgentName
     */
    @jakarta.annotation.Nullable
    public CloudPcPartnerAgentName getPartnerAgentName() {
        return this.backingStore.get("partnerAgentName");
    }
    /**
     * Gets the retriable property value. Indicates if the partner agent is a third party. When 'TRUE' the agent is a third-party (non-Microsoft) agent and when 'FALSE' the agent is a Microsoft agent or isn't known. The default value is 'FALSE'
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRetriable() {
        return this.backingStore.get("retriable");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeEnumValue("installStatus", this.getInstallStatus());
        writer.writeBooleanValue("isThirdPartyPartner", this.getIsThirdPartyPartner());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("partnerAgentName", this.getPartnerAgentName());
        writer.writeBooleanValue("retriable", this.getRetriable());
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
     * Sets the errorMessage property value. The errorMessage property
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorMessage", value);
    }
    /**
     * Sets the installStatus property value. The status of a partner agent installation. Possible values are: installed, installFailed, installing, uninstalling, uninstallFailed and licensed. Read-Only.
     * @param value Value to set for the installStatus property.
     */
    public void setInstallStatus(@jakarta.annotation.Nullable final CloudPcPartnerAgentInstallStatus value) {
        this.backingStore.set("installStatus", value);
    }
    /**
     * Sets the isThirdPartyPartner property value. Indicates if the partner agent is a third party. When 'TRUE' the agent is a third-party (non-Microsoft) agent and when 'FALSE' the agent is a Microsoft agent or isn't known.  The default value is 'FALSE'
     * @param value Value to set for the isThirdPartyPartner property.
     */
    public void setIsThirdPartyPartner(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isThirdPartyPartner", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the partnerAgentName property value. The name of the first-party or third-party partner agent. Possible values for third-party partners are Citrix, VMware and HP. Read-Only.
     * @param value Value to set for the partnerAgentName property.
     */
    public void setPartnerAgentName(@jakarta.annotation.Nullable final CloudPcPartnerAgentName value) {
        this.backingStore.set("partnerAgentName", value);
    }
    /**
     * Sets the retriable property value. Indicates if the partner agent is a third party. When 'TRUE' the agent is a third-party (non-Microsoft) agent and when 'FALSE' the agent is a Microsoft agent or isn't known. The default value is 'FALSE'
     * @param value Value to set for the retriable property.
     */
    public void setRetriable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("retriable", value);
    }
}
