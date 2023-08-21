package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkDeviceSoftwareVersions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The software version for the admin agent running on the device.
     */
    private String adminAgentSoftwareVersion;
    /**
     * The software version for the firmware running on the device.
     */
    private String firmwareSoftwareVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The software version for the operating system on the device.
     */
    private String operatingSystemSoftwareVersion;
    /**
     * The software version for the partner agent running on the device.
     */
    private String partnerAgentSoftwareVersion;
    /**
     * The software version for the Teams client running on the device.
     */
    private String teamsClientSoftwareVersion;
    /**
     * Instantiates a new teamworkDeviceSoftwareVersions and sets the default values.
     */
    public TeamworkDeviceSoftwareVersions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDeviceSoftwareVersions
     */
    @jakarta.annotation.Nonnull
    public static TeamworkDeviceSoftwareVersions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceSoftwareVersions();
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
     * Gets the adminAgentSoftwareVersion property value. The software version for the admin agent running on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdminAgentSoftwareVersion() {
        return this.adminAgentSoftwareVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("adminAgentSoftwareVersion", (n) -> { this.setAdminAgentSoftwareVersion(n.getStringValue()); });
        deserializerMap.put("firmwareSoftwareVersion", (n) -> { this.setFirmwareSoftwareVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("operatingSystemSoftwareVersion", (n) -> { this.setOperatingSystemSoftwareVersion(n.getStringValue()); });
        deserializerMap.put("partnerAgentSoftwareVersion", (n) -> { this.setPartnerAgentSoftwareVersion(n.getStringValue()); });
        deserializerMap.put("teamsClientSoftwareVersion", (n) -> { this.setTeamsClientSoftwareVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareSoftwareVersion property value. The software version for the firmware running on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFirmwareSoftwareVersion() {
        return this.firmwareSoftwareVersion;
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
     * Gets the operatingSystemSoftwareVersion property value. The software version for the operating system on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemSoftwareVersion() {
        return this.operatingSystemSoftwareVersion;
    }
    /**
     * Gets the partnerAgentSoftwareVersion property value. The software version for the partner agent running on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPartnerAgentSoftwareVersion() {
        return this.partnerAgentSoftwareVersion;
    }
    /**
     * Gets the teamsClientSoftwareVersion property value. The software version for the Teams client running on the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTeamsClientSoftwareVersion() {
        return this.teamsClientSoftwareVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adminAgentSoftwareVersion", this.getAdminAgentSoftwareVersion());
        writer.writeStringValue("firmwareSoftwareVersion", this.getFirmwareSoftwareVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("operatingSystemSoftwareVersion", this.getOperatingSystemSoftwareVersion());
        writer.writeStringValue("partnerAgentSoftwareVersion", this.getPartnerAgentSoftwareVersion());
        writer.writeStringValue("teamsClientSoftwareVersion", this.getTeamsClientSoftwareVersion());
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
     * Sets the adminAgentSoftwareVersion property value. The software version for the admin agent running on the device.
     * @param value Value to set for the adminAgentSoftwareVersion property.
     */
    public void setAdminAgentSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.adminAgentSoftwareVersion = value;
    }
    /**
     * Sets the firmwareSoftwareVersion property value. The software version for the firmware running on the device.
     * @param value Value to set for the firmwareSoftwareVersion property.
     */
    public void setFirmwareSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.firmwareSoftwareVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the operatingSystemSoftwareVersion property value. The software version for the operating system on the device.
     * @param value Value to set for the operatingSystemSoftwareVersion property.
     */
    public void setOperatingSystemSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.operatingSystemSoftwareVersion = value;
    }
    /**
     * Sets the partnerAgentSoftwareVersion property value. The software version for the partner agent running on the device.
     * @param value Value to set for the partnerAgentSoftwareVersion property.
     */
    public void setPartnerAgentSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.partnerAgentSoftwareVersion = value;
    }
    /**
     * Sets the teamsClientSoftwareVersion property value. The software version for the Teams client running on the device.
     * @param value Value to set for the teamsClientSoftwareVersion property.
     */
    public void setTeamsClientSoftwareVersion(@jakarta.annotation.Nullable final String value) {
        this.teamsClientSoftwareVersion = value;
    }
}
