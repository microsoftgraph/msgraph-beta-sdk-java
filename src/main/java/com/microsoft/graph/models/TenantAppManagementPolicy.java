package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantAppManagementPolicy extends PolicyBase implements Parsable {
    /** Restrictions that apply as default to all application objects in the tenant.  */
    private AppManagementConfiguration _applicationRestrictions;
    /** Denotes whether the policy is enabled. Default value is false.  */
    private Boolean _isEnabled;
    /** Restrictions that apply as default to all service principal objects in the tenant.  */
    private AppManagementConfiguration _servicePrincipalRestrictions;
    /**
     * Instantiates a new tenantAppManagementPolicy and sets the default values.
     * @return a void
     */
    public TenantAppManagementPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantAppManagementPolicy
     */
    @javax.annotation.Nonnull
    public static TenantAppManagementPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAppManagementPolicy();
    }
    /**
     * Gets the applicationRestrictions property value. Restrictions that apply as default to all application objects in the tenant.
     * @return a appManagementConfiguration
     */
    @javax.annotation.Nullable
    public AppManagementConfiguration getApplicationRestrictions() {
        return this._applicationRestrictions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantAppManagementPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationRestrictions", (n) -> { currentObject.setApplicationRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("servicePrincipalRestrictions", (n) -> { currentObject.setServicePrincipalRestrictions(n.getObjectValue(AppManagementConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isEnabled property value. Denotes whether the policy is enabled. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the servicePrincipalRestrictions property value. Restrictions that apply as default to all service principal objects in the tenant.
     * @return a appManagementConfiguration
     */
    @javax.annotation.Nullable
    public AppManagementConfiguration getServicePrincipalRestrictions() {
        return this._servicePrincipalRestrictions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationRestrictions", this.getApplicationRestrictions());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("servicePrincipalRestrictions", this.getServicePrincipalRestrictions());
    }
    /**
     * Sets the applicationRestrictions property value. Restrictions that apply as default to all application objects in the tenant.
     * @param value Value to set for the applicationRestrictions property.
     * @return a void
     */
    public void setApplicationRestrictions(@javax.annotation.Nullable final AppManagementConfiguration value) {
        this._applicationRestrictions = value;
    }
    /**
     * Sets the isEnabled property value. Denotes whether the policy is enabled. Default value is false.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the servicePrincipalRestrictions property value. Restrictions that apply as default to all service principal objects in the tenant.
     * @param value Value to set for the servicePrincipalRestrictions property.
     * @return a void
     */
    public void setServicePrincipalRestrictions(@javax.annotation.Nullable final AppManagementConfiguration value) {
        this._servicePrincipalRestrictions = value;
    }
}
