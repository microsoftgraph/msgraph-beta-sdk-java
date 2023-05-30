package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvalidLicenseAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /** The tenantLicenseStatus property */
    private String tenantLicenseStatus;
    /**
     * Instantiates a new InvalidLicenseAlertIncident and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InvalidLicenseAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.invalidLicenseAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InvalidLicenseAlertIncident
     */
    @javax.annotation.Nonnull
    public static InvalidLicenseAlertIncident createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvalidLicenseAlertIncident();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("tenantLicenseStatus", (n) -> { this.setTenantLicenseStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the tenantLicenseStatus property value. The tenantLicenseStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantLicenseStatus() {
        return this.tenantLicenseStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("tenantLicenseStatus", this.getTenantLicenseStatus());
    }
    /**
     * Sets the tenantLicenseStatus property value. The tenantLicenseStatus property
     * @param value Value to set for the tenantLicenseStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantLicenseStatus(@javax.annotation.Nullable final String value) {
        this.tenantLicenseStatus = value;
    }
}
