package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPartnerAgentInstallResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The status of a partner agent installation. Possible values are: installed, installFailed, installing, uninstalling, uninstallFailed and licensed. Read-Only.
     */
    private CloudPcPartnerAgentInstallStatus installStatus;
    /**
     * Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent.  When 'FALSE', the agent is a Microsoft agent or is not known.  The default value is 'FALSE'.
     */
    private Boolean isThirdPartyPartner;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the name of a partner agent and includes first-party and third-party. Currently, Citrix is the only third-party value. Read-Only.
     */
    private CloudPcPartnerAgentName partnerAgentName;
    /**
     * Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent. When 'FALSE', the agent is a Microsoft agent or is not known. The default value is 'FALSE'.
     */
    private Boolean retriable;
    /**
     * Instantiates a new cloudPcPartnerAgentInstallResult and sets the default values.
     */
    public CloudPcPartnerAgentInstallResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcPartnerAgentInstallResult
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPartnerAgentInstallResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcPartnerAgentInstallResult();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("installStatus", (n) -> { this.setInstallStatus(n.getEnumValue(CloudPcPartnerAgentInstallStatus.class)); });
        deserializerMap.put("isThirdPartyPartner", (n) -> { this.setIsThirdPartyPartner(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("partnerAgentName", (n) -> { this.setPartnerAgentName(n.getEnumValue(CloudPcPartnerAgentName.class)); });
        deserializerMap.put("retriable", (n) -> { this.setRetriable(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installStatus property value. The status of a partner agent installation. Possible values are: installed, installFailed, installing, uninstalling, uninstallFailed and licensed. Read-Only.
     * @return a cloudPcPartnerAgentInstallStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcPartnerAgentInstallStatus getInstallStatus() {
        return this.installStatus;
    }
    /**
     * Gets the isThirdPartyPartner property value. Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent.  When 'FALSE', the agent is a Microsoft agent or is not known.  The default value is 'FALSE'.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsThirdPartyPartner() {
        return this.isThirdPartyPartner;
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
     * Gets the partnerAgentName property value. Indicates the name of a partner agent and includes first-party and third-party. Currently, Citrix is the only third-party value. Read-Only.
     * @return a cloudPcPartnerAgentName
     */
    @jakarta.annotation.Nullable
    public CloudPcPartnerAgentName getPartnerAgentName() {
        return this.partnerAgentName;
    }
    /**
     * Gets the retriable property value. Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent. When 'FALSE', the agent is a Microsoft agent or is not known. The default value is 'FALSE'.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRetriable() {
        return this.retriable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("installStatus", this.getInstallStatus());
        writer.writeBooleanValue("isThirdPartyPartner", this.getIsThirdPartyPartner());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("partnerAgentName", this.getPartnerAgentName());
        writer.writeBooleanValue("retriable", this.getRetriable());
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
     * Sets the installStatus property value. The status of a partner agent installation. Possible values are: installed, installFailed, installing, uninstalling, uninstallFailed and licensed. Read-Only.
     * @param value Value to set for the installStatus property.
     */
    public void setInstallStatus(@jakarta.annotation.Nullable final CloudPcPartnerAgentInstallStatus value) {
        this.installStatus = value;
    }
    /**
     * Sets the isThirdPartyPartner property value. Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent.  When 'FALSE', the agent is a Microsoft agent or is not known.  The default value is 'FALSE'.
     * @param value Value to set for the isThirdPartyPartner property.
     */
    public void setIsThirdPartyPartner(@jakarta.annotation.Nullable final Boolean value) {
        this.isThirdPartyPartner = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the partnerAgentName property value. Indicates the name of a partner agent and includes first-party and third-party. Currently, Citrix is the only third-party value. Read-Only.
     * @param value Value to set for the partnerAgentName property.
     */
    public void setPartnerAgentName(@jakarta.annotation.Nullable final CloudPcPartnerAgentName value) {
        this.partnerAgentName = value;
    }
    /**
     * Sets the retriable property value. Indicates if the partner agent is a third party. When 'TRUE', the agent is a third-party (non-Microsoft) agent. When 'FALSE', the agent is a Microsoft agent or is not known. The default value is 'FALSE'.
     * @param value Value to set for the retriable property.
     */
    public void setRetriable(@jakarta.annotation.Nullable final Boolean value) {
        this.retriable = value;
    }
}
