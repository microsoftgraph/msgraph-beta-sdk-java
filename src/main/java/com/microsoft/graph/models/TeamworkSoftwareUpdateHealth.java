package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkSoftwareUpdateHealth implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The software update available for the admin agent.
     */
    private TeamworkSoftwareUpdateStatus adminAgentSoftwareUpdateStatus;
    /**
     * The software update available for the company portal.
     */
    private TeamworkSoftwareUpdateStatus companyPortalSoftwareUpdateStatus;
    /**
     * The software update available for the firmware.
     */
    private TeamworkSoftwareUpdateStatus firmwareSoftwareUpdateStatus;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The software update available for the operating system.
     */
    private TeamworkSoftwareUpdateStatus operatingSystemSoftwareUpdateStatus;
    /**
     * The software update available for the partner agent.
     */
    private TeamworkSoftwareUpdateStatus partnerAgentSoftwareUpdateStatus;
    /**
     * The software update available for the Teams client.
     */
    private TeamworkSoftwareUpdateStatus teamsClientSoftwareUpdateStatus;
    /**
     * Instantiates a new teamworkSoftwareUpdateHealth and sets the default values.
     */
    public TeamworkSoftwareUpdateHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSoftwareUpdateHealth
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSoftwareUpdateHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSoftwareUpdateHealth();
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
     * Gets the adminAgentSoftwareUpdateStatus property value. The software update available for the admin agent.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getAdminAgentSoftwareUpdateStatus() {
        return this.adminAgentSoftwareUpdateStatus;
    }
    /**
     * Gets the companyPortalSoftwareUpdateStatus property value. The software update available for the company portal.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getCompanyPortalSoftwareUpdateStatus() {
        return this.companyPortalSoftwareUpdateStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("adminAgentSoftwareUpdateStatus", (n) -> { this.setAdminAgentSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("companyPortalSoftwareUpdateStatus", (n) -> { this.setCompanyPortalSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("firmwareSoftwareUpdateStatus", (n) -> { this.setFirmwareSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystemSoftwareUpdateStatus", (n) -> { this.setOperatingSystemSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("partnerAgentSoftwareUpdateStatus", (n) -> { this.setPartnerAgentSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsClientSoftwareUpdateStatus", (n) -> { this.setTeamsClientSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareSoftwareUpdateStatus property value. The software update available for the firmware.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getFirmwareSoftwareUpdateStatus() {
        return this.firmwareSoftwareUpdateStatus;
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
     * Gets the operatingSystemSoftwareUpdateStatus property value. The software update available for the operating system.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getOperatingSystemSoftwareUpdateStatus() {
        return this.operatingSystemSoftwareUpdateStatus;
    }
    /**
     * Gets the partnerAgentSoftwareUpdateStatus property value. The software update available for the partner agent.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getPartnerAgentSoftwareUpdateStatus() {
        return this.partnerAgentSoftwareUpdateStatus;
    }
    /**
     * Gets the teamsClientSoftwareUpdateStatus property value. The software update available for the Teams client.
     * @return a teamworkSoftwareUpdateStatus
     */
    @jakarta.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getTeamsClientSoftwareUpdateStatus() {
        return this.teamsClientSoftwareUpdateStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adminAgentSoftwareUpdateStatus", this.getAdminAgentSoftwareUpdateStatus());
        writer.writeObjectValue("companyPortalSoftwareUpdateStatus", this.getCompanyPortalSoftwareUpdateStatus());
        writer.writeObjectValue("firmwareSoftwareUpdateStatus", this.getFirmwareSoftwareUpdateStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("operatingSystemSoftwareUpdateStatus", this.getOperatingSystemSoftwareUpdateStatus());
        writer.writeObjectValue("partnerAgentSoftwareUpdateStatus", this.getPartnerAgentSoftwareUpdateStatus());
        writer.writeObjectValue("teamsClientSoftwareUpdateStatus", this.getTeamsClientSoftwareUpdateStatus());
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
     * Sets the adminAgentSoftwareUpdateStatus property value. The software update available for the admin agent.
     * @param value Value to set for the adminAgentSoftwareUpdateStatus property.
     */
    public void setAdminAgentSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.adminAgentSoftwareUpdateStatus = value;
    }
    /**
     * Sets the companyPortalSoftwareUpdateStatus property value. The software update available for the company portal.
     * @param value Value to set for the companyPortalSoftwareUpdateStatus property.
     */
    public void setCompanyPortalSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.companyPortalSoftwareUpdateStatus = value;
    }
    /**
     * Sets the firmwareSoftwareUpdateStatus property value. The software update available for the firmware.
     * @param value Value to set for the firmwareSoftwareUpdateStatus property.
     */
    public void setFirmwareSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.firmwareSoftwareUpdateStatus = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operatingSystemSoftwareUpdateStatus property value. The software update available for the operating system.
     * @param value Value to set for the operatingSystemSoftwareUpdateStatus property.
     */
    public void setOperatingSystemSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.operatingSystemSoftwareUpdateStatus = value;
    }
    /**
     * Sets the partnerAgentSoftwareUpdateStatus property value. The software update available for the partner agent.
     * @param value Value to set for the partnerAgentSoftwareUpdateStatus property.
     */
    public void setPartnerAgentSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.partnerAgentSoftwareUpdateStatus = value;
    }
    /**
     * Sets the teamsClientSoftwareUpdateStatus property value. The software update available for the Teams client.
     * @param value Value to set for the teamsClientSoftwareUpdateStatus property.
     */
    public void setTeamsClientSoftwareUpdateStatus(@jakarta.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this.teamsClientSoftwareUpdateStatus = value;
    }
}
