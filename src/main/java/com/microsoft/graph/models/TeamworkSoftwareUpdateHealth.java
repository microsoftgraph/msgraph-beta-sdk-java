package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkSoftwareUpdateHealth implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The software update available for the admin agent. */
    private TeamworkSoftwareUpdateStatus _adminAgentSoftwareUpdateStatus;
    /** The software update available for the company portal. */
    private TeamworkSoftwareUpdateStatus _companyPortalSoftwareUpdateStatus;
    /** The software update available for the firmware. */
    private TeamworkSoftwareUpdateStatus _firmwareSoftwareUpdateStatus;
    /** The OdataType property */
    private String _odataType;
    /** The software update available for the operating system. */
    private TeamworkSoftwareUpdateStatus _operatingSystemSoftwareUpdateStatus;
    /** The software update available for the partner agent. */
    private TeamworkSoftwareUpdateStatus _partnerAgentSoftwareUpdateStatus;
    /** The software update available for the Teams client. */
    private TeamworkSoftwareUpdateStatus _teamsClientSoftwareUpdateStatus;
    /**
     * Instantiates a new teamworkSoftwareUpdateHealth and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateHealth() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkSoftwareUpdateHealth");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkSoftwareUpdateHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkSoftwareUpdateHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSoftwareUpdateHealth();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the adminAgentSoftwareUpdateStatus property value. The software update available for the admin agent.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getAdminAgentSoftwareUpdateStatus() {
        return this._adminAgentSoftwareUpdateStatus;
    }
    /**
     * Gets the companyPortalSoftwareUpdateStatus property value. The software update available for the company portal.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getCompanyPortalSoftwareUpdateStatus() {
        return this._companyPortalSoftwareUpdateStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkSoftwareUpdateHealth currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("adminAgentSoftwareUpdateStatus", (n) -> { currentObject.setAdminAgentSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
            this.put("companyPortalSoftwareUpdateStatus", (n) -> { currentObject.setCompanyPortalSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
            this.put("firmwareSoftwareUpdateStatus", (n) -> { currentObject.setFirmwareSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("operatingSystemSoftwareUpdateStatus", (n) -> { currentObject.setOperatingSystemSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
            this.put("partnerAgentSoftwareUpdateStatus", (n) -> { currentObject.setPartnerAgentSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
            this.put("teamsClientSoftwareUpdateStatus", (n) -> { currentObject.setTeamsClientSoftwareUpdateStatus(n.getObjectValue(TeamworkSoftwareUpdateStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the firmwareSoftwareUpdateStatus property value. The software update available for the firmware.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getFirmwareSoftwareUpdateStatus() {
        return this._firmwareSoftwareUpdateStatus;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the operatingSystemSoftwareUpdateStatus property value. The software update available for the operating system.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getOperatingSystemSoftwareUpdateStatus() {
        return this._operatingSystemSoftwareUpdateStatus;
    }
    /**
     * Gets the partnerAgentSoftwareUpdateStatus property value. The software update available for the partner agent.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getPartnerAgentSoftwareUpdateStatus() {
        return this._partnerAgentSoftwareUpdateStatus;
    }
    /**
     * Gets the teamsClientSoftwareUpdateStatus property value. The software update available for the Teams client.
     * @return a teamworkSoftwareUpdateStatus
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareUpdateStatus getTeamsClientSoftwareUpdateStatus() {
        return this._teamsClientSoftwareUpdateStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the adminAgentSoftwareUpdateStatus property value. The software update available for the admin agent.
     * @param value Value to set for the adminAgentSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminAgentSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._adminAgentSoftwareUpdateStatus = value;
    }
    /**
     * Sets the companyPortalSoftwareUpdateStatus property value. The software update available for the company portal.
     * @param value Value to set for the companyPortalSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyPortalSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._companyPortalSoftwareUpdateStatus = value;
    }
    /**
     * Sets the firmwareSoftwareUpdateStatus property value. The software update available for the firmware.
     * @param value Value to set for the firmwareSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirmwareSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._firmwareSoftwareUpdateStatus = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the operatingSystemSoftwareUpdateStatus property value. The software update available for the operating system.
     * @param value Value to set for the operatingSystemSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._operatingSystemSoftwareUpdateStatus = value;
    }
    /**
     * Sets the partnerAgentSoftwareUpdateStatus property value. The software update available for the partner agent.
     * @param value Value to set for the partnerAgentSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerAgentSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._partnerAgentSoftwareUpdateStatus = value;
    }
    /**
     * Sets the teamsClientSoftwareUpdateStatus property value. The software update available for the Teams client.
     * @param value Value to set for the teamsClientSoftwareUpdateStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsClientSoftwareUpdateStatus(@javax.annotation.Nullable final TeamworkSoftwareUpdateStatus value) {
        this._teamsClientSoftwareUpdateStatus = value;
    }
}
