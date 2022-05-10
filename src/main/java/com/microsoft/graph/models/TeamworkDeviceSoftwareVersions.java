package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceSoftwareVersions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The software version for the admin agent running on the device. */
    private String _adminAgentSoftwareVersion;
    /** The software version for the firmware running on the device. */
    private String _firmwareSoftwareVersion;
    /** The software version for the operating system on the device. */
    private String _operatingSystemSoftwareVersion;
    /** The software version for the partner agent running on the device. */
    private String _partnerAgentSoftwareVersion;
    /** The software version for the Teams client running on the device. */
    private String _teamsClientSoftwareVersion;
    /**
     * Instantiates a new teamworkDeviceSoftwareVersions and sets the default values.
     * @return a void
     */
    public TeamworkDeviceSoftwareVersions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDeviceSoftwareVersions
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceSoftwareVersions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceSoftwareVersions();
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
     * Gets the adminAgentSoftwareVersion property value. The software version for the admin agent running on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdminAgentSoftwareVersion() {
        return this._adminAgentSoftwareVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDeviceSoftwareVersions currentObject = this;
        return new HashMap<>(5) {{
            this.put("adminAgentSoftwareVersion", (n) -> { currentObject.setAdminAgentSoftwareVersion(n.getStringValue()); });
            this.put("firmwareSoftwareVersion", (n) -> { currentObject.setFirmwareSoftwareVersion(n.getStringValue()); });
            this.put("operatingSystemSoftwareVersion", (n) -> { currentObject.setOperatingSystemSoftwareVersion(n.getStringValue()); });
            this.put("partnerAgentSoftwareVersion", (n) -> { currentObject.setPartnerAgentSoftwareVersion(n.getStringValue()); });
            this.put("teamsClientSoftwareVersion", (n) -> { currentObject.setTeamsClientSoftwareVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the firmwareSoftwareVersion property value. The software version for the firmware running on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirmwareSoftwareVersion() {
        return this._firmwareSoftwareVersion;
    }
    /**
     * Gets the operatingSystemSoftwareVersion property value. The software version for the operating system on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemSoftwareVersion() {
        return this._operatingSystemSoftwareVersion;
    }
    /**
     * Gets the partnerAgentSoftwareVersion property value. The software version for the partner agent running on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPartnerAgentSoftwareVersion() {
        return this._partnerAgentSoftwareVersion;
    }
    /**
     * Gets the teamsClientSoftwareVersion property value. The software version for the Teams client running on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsClientSoftwareVersion() {
        return this._teamsClientSoftwareVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("adminAgentSoftwareVersion", this.getAdminAgentSoftwareVersion());
        writer.writeStringValue("firmwareSoftwareVersion", this.getFirmwareSoftwareVersion());
        writer.writeStringValue("operatingSystemSoftwareVersion", this.getOperatingSystemSoftwareVersion());
        writer.writeStringValue("partnerAgentSoftwareVersion", this.getPartnerAgentSoftwareVersion());
        writer.writeStringValue("teamsClientSoftwareVersion", this.getTeamsClientSoftwareVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the adminAgentSoftwareVersion property value. The software version for the admin agent running on the device.
     * @param value Value to set for the adminAgentSoftwareVersion property.
     * @return a void
     */
    public void setAdminAgentSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._adminAgentSoftwareVersion = value;
    }
    /**
     * Sets the firmwareSoftwareVersion property value. The software version for the firmware running on the device.
     * @param value Value to set for the firmwareSoftwareVersion property.
     * @return a void
     */
    public void setFirmwareSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._firmwareSoftwareVersion = value;
    }
    /**
     * Sets the operatingSystemSoftwareVersion property value. The software version for the operating system on the device.
     * @param value Value to set for the operatingSystemSoftwareVersion property.
     * @return a void
     */
    public void setOperatingSystemSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._operatingSystemSoftwareVersion = value;
    }
    /**
     * Sets the partnerAgentSoftwareVersion property value. The software version for the partner agent running on the device.
     * @param value Value to set for the partnerAgentSoftwareVersion property.
     * @return a void
     */
    public void setPartnerAgentSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._partnerAgentSoftwareVersion = value;
    }
    /**
     * Sets the teamsClientSoftwareVersion property value. The software version for the Teams client running on the device.
     * @param value Value to set for the teamsClientSoftwareVersion property.
     * @return a void
     */
    public void setTeamsClientSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._teamsClientSoftwareVersion = value;
    }
}
