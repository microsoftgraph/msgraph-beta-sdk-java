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
public class OnPremisesCurrentExportData implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OnPremisesCurrentExportData} and sets the default values.
     */
    public OnPremisesCurrentExportData() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesCurrentExportData}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesCurrentExportData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesCurrentExportData();
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
     * Gets the clientMachineName property value. The name of the onPremises client machine that ran the last export.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientMachineName() {
        return this.backingStore.get("clientMachineName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("clientMachineName", (n) -> { this.setClientMachineName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingObjectsAddition", (n) -> { this.setPendingObjectsAddition(n.getIntegerValue()); });
        deserializerMap.put("pendingObjectsDeletion", (n) -> { this.setPendingObjectsDeletion(n.getIntegerValue()); });
        deserializerMap.put("pendingObjectsUpdate", (n) -> { this.setPendingObjectsUpdate(n.getIntegerValue()); });
        deserializerMap.put("serviceAccount", (n) -> { this.setServiceAccount(n.getStringValue()); });
        deserializerMap.put("successfulLinksProvisioningCount", (n) -> { this.setSuccessfulLinksProvisioningCount(n.getLongValue()); });
        deserializerMap.put("successfulObjectsProvisioningCount", (n) -> { this.setSuccessfulObjectsProvisioningCount(n.getIntegerValue()); });
        deserializerMap.put("totalConnectorSpaceObjects", (n) -> { this.setTotalConnectorSpaceObjects(n.getIntegerValue()); });
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
     * Gets the pendingObjectsAddition property value. The count of pending adds from on-premises directory.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsAddition() {
        return this.backingStore.get("pendingObjectsAddition");
    }
    /**
     * Gets the pendingObjectsDeletion property value. The count of pending deletes from on-premises directory.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsDeletion() {
        return this.backingStore.get("pendingObjectsDeletion");
    }
    /**
     * Gets the pendingObjectsUpdate property value. The count of pending updates from on-premises directory.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsUpdate() {
        return this.backingStore.get("pendingObjectsUpdate");
    }
    /**
     * Gets the serviceAccount property value. The name of the dirsync service account that is configured to connect to the directory.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceAccount() {
        return this.backingStore.get("serviceAccount");
    }
    /**
     * Gets the successfulLinksProvisioningCount property value. The count of updated links during the current directory sync export run.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSuccessfulLinksProvisioningCount() {
        return this.backingStore.get("successfulLinksProvisioningCount");
    }
    /**
     * Gets the successfulObjectsProvisioningCount property value. The count of objects that were successfully provisioned during the current directory sync export run.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulObjectsProvisioningCount() {
        return this.backingStore.get("successfulObjectsProvisioningCount");
    }
    /**
     * Gets the totalConnectorSpaceObjects property value. The total number of objects in the AAD Connector Space.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalConnectorSpaceObjects() {
        return this.backingStore.get("totalConnectorSpaceObjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientMachineName", this.getClientMachineName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingObjectsAddition", this.getPendingObjectsAddition());
        writer.writeIntegerValue("pendingObjectsDeletion", this.getPendingObjectsDeletion());
        writer.writeIntegerValue("pendingObjectsUpdate", this.getPendingObjectsUpdate());
        writer.writeStringValue("serviceAccount", this.getServiceAccount());
        writer.writeLongValue("successfulLinksProvisioningCount", this.getSuccessfulLinksProvisioningCount());
        writer.writeIntegerValue("successfulObjectsProvisioningCount", this.getSuccessfulObjectsProvisioningCount());
        writer.writeIntegerValue("totalConnectorSpaceObjects", this.getTotalConnectorSpaceObjects());
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
     * Sets the clientMachineName property value. The name of the onPremises client machine that ran the last export.
     * @param value Value to set for the clientMachineName property.
     */
    public void setClientMachineName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientMachineName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pendingObjectsAddition property value. The count of pending adds from on-premises directory.
     * @param value Value to set for the pendingObjectsAddition property.
     */
    public void setPendingObjectsAddition(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingObjectsAddition", value);
    }
    /**
     * Sets the pendingObjectsDeletion property value. The count of pending deletes from on-premises directory.
     * @param value Value to set for the pendingObjectsDeletion property.
     */
    public void setPendingObjectsDeletion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingObjectsDeletion", value);
    }
    /**
     * Sets the pendingObjectsUpdate property value. The count of pending updates from on-premises directory.
     * @param value Value to set for the pendingObjectsUpdate property.
     */
    public void setPendingObjectsUpdate(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingObjectsUpdate", value);
    }
    /**
     * Sets the serviceAccount property value. The name of the dirsync service account that is configured to connect to the directory.
     * @param value Value to set for the serviceAccount property.
     */
    public void setServiceAccount(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceAccount", value);
    }
    /**
     * Sets the successfulLinksProvisioningCount property value. The count of updated links during the current directory sync export run.
     * @param value Value to set for the successfulLinksProvisioningCount property.
     */
    public void setSuccessfulLinksProvisioningCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successfulLinksProvisioningCount", value);
    }
    /**
     * Sets the successfulObjectsProvisioningCount property value. The count of objects that were successfully provisioned during the current directory sync export run.
     * @param value Value to set for the successfulObjectsProvisioningCount property.
     */
    public void setSuccessfulObjectsProvisioningCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulObjectsProvisioningCount", value);
    }
    /**
     * Sets the totalConnectorSpaceObjects property value. The total number of objects in the AAD Connector Space.
     * @param value Value to set for the totalConnectorSpaceObjects property.
     */
    public void setTotalConnectorSpaceObjects(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalConnectorSpaceObjects", value);
    }
}
