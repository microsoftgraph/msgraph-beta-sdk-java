package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcOrganizationSettings extends Entity implements Parsable {
    /** The version of the operating system (OS) to provision on Cloud PCs. The possible values are: windows10, windows11, unknownFutureValue. */
    private CloudPcOperatingSystem _osVersion;
    /** The account type of the user on provisioned Cloud PCs. The possible values are: standardUser, administrator, unknownFutureValue. */
    private CloudPcUserAccountType _userAccountType;
    /** Represents the Cloud PC organization settings for a tenant. A tenant has only one cloudPcOrganizationSettings object. The default language value en-US. */
    private CloudPcWindowsSettings _windowsSettings;
    /**
     * Instantiates a new CloudPcOrganizationSettings and sets the default values.
     * @return a void
     */
    public CloudPcOrganizationSettings() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcOrganizationSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOrganizationSettings
     */
    @javax.annotation.Nonnull
    public static CloudPcOrganizationSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOrganizationSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcOrganizationSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getEnumValue(CloudPcOperatingSystem.class)); });
            this.put("userAccountType", (n) -> { currentObject.setUserAccountType(n.getEnumValue(CloudPcUserAccountType.class)); });
            this.put("windowsSettings", (n) -> { currentObject.setWindowsSettings(n.getObjectValue(CloudPcWindowsSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. The possible values are: windows10, windows11, unknownFutureValue.
     * @return a cloudPcOperatingSystem
     */
    @javax.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. The possible values are: standardUser, administrator, unknownFutureValue.
     * @return a cloudPcUserAccountType
     */
    @javax.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this._userAccountType;
    }
    /**
     * Gets the windowsSettings property value. Represents the Cloud PC organization settings for a tenant. A tenant has only one cloudPcOrganizationSettings object. The default language value en-US.
     * @return a cloudPcWindowsSettings
     */
    @javax.annotation.Nullable
    public CloudPcWindowsSettings getWindowsSettings() {
        return this._windowsSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeObjectValue("windowsSettings", this.getWindowsSettings());
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. The possible values are: windows10, windows11, unknownFutureValue.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final CloudPcOperatingSystem value) {
        this._osVersion = value;
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. The possible values are: standardUser, administrator, unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    public void setUserAccountType(@javax.annotation.Nullable final CloudPcUserAccountType value) {
        this._userAccountType = value;
    }
    /**
     * Sets the windowsSettings property value. Represents the Cloud PC organization settings for a tenant. A tenant has only one cloudPcOrganizationSettings object. The default language value en-US.
     * @param value Value to set for the windowsSettings property.
     * @return a void
     */
    public void setWindowsSettings(@javax.annotation.Nullable final CloudPcWindowsSettings value) {
        this._windowsSettings = value;
    }
}
