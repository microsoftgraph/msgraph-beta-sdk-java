package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Endpoint privilege management (EPM) tenant provisioning status contains tenant level license and onboarding state information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndpointPrivilegeManagementProvisioningStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EndpointPrivilegeManagementProvisioningStatus} and sets the default values.
     */
    public EndpointPrivilegeManagementProvisioningStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndpointPrivilegeManagementProvisioningStatus}
     */
    @jakarta.annotation.Nonnull
    public static EndpointPrivilegeManagementProvisioningStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndpointPrivilegeManagementProvisioningStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(LicenseType::forValue)); });
        deserializerMap.put("onboardedToMicrosoftManagedPlatform", (n) -> { this.setOnboardedToMicrosoftManagedPlatform(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the licenseType property value. Indicates whether tenant has a valid Intune Endpoint Privilege Management license. Possible value are : 0 - notPaid, 1 - paid, 2 - trial. See LicenseType enum for more details. Default notPaid .
     * @return a {@link LicenseType}
     */
    @jakarta.annotation.Nullable
    public LicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Gets the onboardedToMicrosoftManagedPlatform property value. Indicates whether tenant is onboarded to Microsoft Managed Platform - Cloud (MMPC). When set to true, implies tenant is onboarded and when set to false, implies tenant is not onboarded. Default set to false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOnboardedToMicrosoftManagedPlatform() {
        return this.backingStore.get("onboardedToMicrosoftManagedPlatform");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeBooleanValue("onboardedToMicrosoftManagedPlatform", this.getOnboardedToMicrosoftManagedPlatform());
    }
    /**
     * Sets the licenseType property value. Indicates whether tenant has a valid Intune Endpoint Privilege Management license. Possible value are : 0 - notPaid, 1 - paid, 2 - trial. See LicenseType enum for more details. Default notPaid .
     * @param value Value to set for the licenseType property.
     */
    public void setLicenseType(@jakarta.annotation.Nullable final LicenseType value) {
        this.backingStore.set("licenseType", value);
    }
    /**
     * Sets the onboardedToMicrosoftManagedPlatform property value. Indicates whether tenant is onboarded to Microsoft Managed Platform - Cloud (MMPC). When set to true, implies tenant is onboarded and when set to false, implies tenant is not onboarded. Default set to false.
     * @param value Value to set for the onboardedToMicrosoftManagedPlatform property.
     */
    public void setOnboardedToMicrosoftManagedPlatform(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onboardedToMicrosoftManagedPlatform", value);
    }
}
