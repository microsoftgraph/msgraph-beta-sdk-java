package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesCurrentExportData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the onPremises client machine which ran the last export.
     */
    private String clientMachineName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The count of pending adds from on-premises directory.
     */
    private Integer pendingObjectsAddition;
    /**
     * The count of pending deletes from on-premises directory.
     */
    private Integer pendingObjectsDeletion;
    /**
     * The count of pending updates from on-premises directory.
     */
    private Integer pendingObjectsUpdate;
    /**
     * The name of the dirsync service account which is configured to connect to the directory.
     */
    private String serviceAccount;
    /**
     * The count of updated links during the current directory sync export run.
     */
    private Long successfulLinksProvisioningCount;
    /**
     * The count of objects which were successfully provisioned during the current directory sync export run.
     */
    private Integer successfulObjectsProvisioningCount;
    /**
     * The total number of objects in the AAD Connector Space.
     */
    private Integer totalConnectorSpaceObjects;
    /**
     * Instantiates a new onPremisesCurrentExportData and sets the default values.
     */
    public OnPremisesCurrentExportData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesCurrentExportData
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesCurrentExportData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesCurrentExportData();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the clientMachineName property value. The name of the onPremises client machine which ran the last export.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClientMachineName() {
        return this.clientMachineName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the pendingObjectsAddition property value. The count of pending adds from on-premises directory.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsAddition() {
        return this.pendingObjectsAddition;
    }
    /**
     * Gets the pendingObjectsDeletion property value. The count of pending deletes from on-premises directory.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsDeletion() {
        return this.pendingObjectsDeletion;
    }
    /**
     * Gets the pendingObjectsUpdate property value. The count of pending updates from on-premises directory.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingObjectsUpdate() {
        return this.pendingObjectsUpdate;
    }
    /**
     * Gets the serviceAccount property value. The name of the dirsync service account which is configured to connect to the directory.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Gets the successfulLinksProvisioningCount property value. The count of updated links during the current directory sync export run.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSuccessfulLinksProvisioningCount() {
        return this.successfulLinksProvisioningCount;
    }
    /**
     * Gets the successfulObjectsProvisioningCount property value. The count of objects which were successfully provisioned during the current directory sync export run.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulObjectsProvisioningCount() {
        return this.successfulObjectsProvisioningCount;
    }
    /**
     * Gets the totalConnectorSpaceObjects property value. The total number of objects in the AAD Connector Space.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalConnectorSpaceObjects() {
        return this.totalConnectorSpaceObjects;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clientMachineName property value. The name of the onPremises client machine which ran the last export.
     * @param value Value to set for the clientMachineName property.
     */
    public void setClientMachineName(@jakarta.annotation.Nullable final String value) {
        this.clientMachineName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pendingObjectsAddition property value. The count of pending adds from on-premises directory.
     * @param value Value to set for the pendingObjectsAddition property.
     */
    public void setPendingObjectsAddition(@jakarta.annotation.Nullable final Integer value) {
        this.pendingObjectsAddition = value;
    }
    /**
     * Sets the pendingObjectsDeletion property value. The count of pending deletes from on-premises directory.
     * @param value Value to set for the pendingObjectsDeletion property.
     */
    public void setPendingObjectsDeletion(@jakarta.annotation.Nullable final Integer value) {
        this.pendingObjectsDeletion = value;
    }
    /**
     * Sets the pendingObjectsUpdate property value. The count of pending updates from on-premises directory.
     * @param value Value to set for the pendingObjectsUpdate property.
     */
    public void setPendingObjectsUpdate(@jakarta.annotation.Nullable final Integer value) {
        this.pendingObjectsUpdate = value;
    }
    /**
     * Sets the serviceAccount property value. The name of the dirsync service account which is configured to connect to the directory.
     * @param value Value to set for the serviceAccount property.
     */
    public void setServiceAccount(@jakarta.annotation.Nullable final String value) {
        this.serviceAccount = value;
    }
    /**
     * Sets the successfulLinksProvisioningCount property value. The count of updated links during the current directory sync export run.
     * @param value Value to set for the successfulLinksProvisioningCount property.
     */
    public void setSuccessfulLinksProvisioningCount(@jakarta.annotation.Nullable final Long value) {
        this.successfulLinksProvisioningCount = value;
    }
    /**
     * Sets the successfulObjectsProvisioningCount property value. The count of objects which were successfully provisioned during the current directory sync export run.
     * @param value Value to set for the successfulObjectsProvisioningCount property.
     */
    public void setSuccessfulObjectsProvisioningCount(@jakarta.annotation.Nullable final Integer value) {
        this.successfulObjectsProvisioningCount = value;
    }
    /**
     * Sets the totalConnectorSpaceObjects property value. The total number of objects in the AAD Connector Space.
     * @param value Value to set for the totalConnectorSpaceObjects property.
     */
    public void setTotalConnectorSpaceObjects(@jakarta.annotation.Nullable final Integer value) {
        this.totalConnectorSpaceObjects = value;
    }
}
