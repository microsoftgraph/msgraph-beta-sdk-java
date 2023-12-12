package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcOrganizationSettings extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPcOrganizationSettings and sets the default values.
     */
    public CloudPcOrganizationSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOrganizationSettings
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOrganizationSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOrganizationSettings();
    }
    /**
     * Gets the enableMEMAutoEnroll property value. Specifies whether new Cloud PCs will be automatically enrolled in Microsoft Endpoint Manager (MEM). The default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableMEMAutoEnroll() {
        return this.backingStore.get("enableMEMAutoEnroll");
    }
    /**
     * Gets the enableSingleSignOn property value. True if the provisioned Cloud PC can be accessed by single sign-on. False indicates that the provisioned Cloud PC doesn't support this feature. Default value is false. Windows 365 users can use single sign-on to authenticate to Microsoft Entra ID with passwordless options (for example, FIDO keys) to access their Cloud PC. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSingleSignOn() {
        return this.backingStore.get("enableSingleSignOn");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enableMEMAutoEnroll", (n) -> { this.setEnableMEMAutoEnroll(n.getBooleanValue()); });
        deserializerMap.put("enableSingleSignOn", (n) -> { this.setEnableSingleSignOn(n.getBooleanValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getEnumValue(CloudPcOperatingSystem::forValue)); });
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(CloudPcUserAccountType::forValue)); });
        deserializerMap.put("windowsSettings", (n) -> { this.setWindowsSettings(n.getObjectValue(CloudPcWindowsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. The possible values are: windows10, windows11, unknownFutureValue.
     * @return a CloudPcOperatingSystem
     */
    @jakarta.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. The possible values are: standardUser, administrator, unknownFutureValue.
     * @return a CloudPcUserAccountType
     */
    @jakarta.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.backingStore.get("userAccountType");
    }
    /**
     * Gets the windowsSettings property value. Represents the Cloud PC organization settings for a tenant. A tenant has only one cloudPcOrganizationSettings object. The default language value en-US.
     * @return a CloudPcWindowsSettings
     */
    @jakarta.annotation.Nullable
    public CloudPcWindowsSettings getWindowsSettings() {
        return this.backingStore.get("windowsSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableMEMAutoEnroll", this.getEnableMEMAutoEnroll());
        writer.writeBooleanValue("enableSingleSignOn", this.getEnableSingleSignOn());
        writer.writeEnumValue("osVersion", this.getOsVersion());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeObjectValue("windowsSettings", this.getWindowsSettings());
    }
    /**
     * Sets the enableMEMAutoEnroll property value. Specifies whether new Cloud PCs will be automatically enrolled in Microsoft Endpoint Manager (MEM). The default value is false.
     * @param value Value to set for the enableMEMAutoEnroll property.
     */
    public void setEnableMEMAutoEnroll(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableMEMAutoEnroll", value);
    }
    /**
     * Sets the enableSingleSignOn property value. True if the provisioned Cloud PC can be accessed by single sign-on. False indicates that the provisioned Cloud PC doesn't support this feature. Default value is false. Windows 365 users can use single sign-on to authenticate to Microsoft Entra ID with passwordless options (for example, FIDO keys) to access their Cloud PC. Optional.
     * @param value Value to set for the enableSingleSignOn property.
     */
    public void setEnableSingleSignOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSingleSignOn", value);
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. The possible values are: windows10, windows11, unknownFutureValue.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final CloudPcOperatingSystem value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. The possible values are: standardUser, administrator, unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     */
    public void setUserAccountType(@jakarta.annotation.Nullable final CloudPcUserAccountType value) {
        this.backingStore.set("userAccountType", value);
    }
    /**
     * Sets the windowsSettings property value. Represents the Cloud PC organization settings for a tenant. A tenant has only one cloudPcOrganizationSettings object. The default language value en-US.
     * @param value Value to set for the windowsSettings property.
     */
    public void setWindowsSettings(@jakarta.annotation.Nullable final CloudPcWindowsSettings value) {
        this.backingStore.set("windowsSettings", value);
    }
}
