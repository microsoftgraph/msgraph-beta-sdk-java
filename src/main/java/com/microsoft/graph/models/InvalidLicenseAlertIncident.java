package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvalidLicenseAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /**
     * Instantiates a new InvalidLicenseAlertIncident and sets the default values.
     */
    public InvalidLicenseAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.invalidLicenseAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InvalidLicenseAlertIncident
     */
    @jakarta.annotation.Nonnull
    public static InvalidLicenseAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvalidLicenseAlertIncident();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("tenantLicenseStatus", (n) -> { this.setTenantLicenseStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantLicenseStatus property value. Status of the tenant's Microsoft Entra ID P2 license.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantLicenseStatus() {
        return this.backingStore.get("tenantLicenseStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("tenantLicenseStatus", this.getTenantLicenseStatus());
    }
    /**
     * Sets the tenantLicenseStatus property value. Status of the tenant's Microsoft Entra ID P2 license.
     * @param value Value to set for the tenantLicenseStatus property.
     */
    public void setTenantLicenseStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantLicenseStatus", value);
    }
}
