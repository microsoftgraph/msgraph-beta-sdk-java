package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the deviceRegistrationPolicy singleton. */
public class DeviceRegistrationPolicy extends Entity implements Parsable {
    /** Specifies the authorization policy for controlling registration of new devices using Azure AD Join within your organization. Required. For more information, see What is a device identity?. */
    private AzureAdJoinPolicy _azureADJoin;
    /** Specifies the authorization policy for controlling registration of new devices using Azure AD registered within your organization. Required. For more information, see What is a device identity?. */
    private AzureADRegistrationPolicy _azureADRegistration;
    /** The description of the device registration policy. It is always set to Tenant-wide policy that manages intial provisioning controls using quota restrictions, additional authentication and authorization checks. Read-only. */
    private String _description;
    /** The name of the device registration policy. It is always set to Device Registration Policy. Read-only. */
    private String _displayName;
    /** Specifies the authentication policy for a user to complete registration using Azure AD Join or Azure AD registered within your organization. The possible values are: 0 (meaning notRequired), 1 (meaning required), and 2 (meaning unknownFutureValue). The default value is 0. */
    private MultiFactorAuthConfiguration _multiFactorAuthConfiguration;
    /** Specifies the maximum number of devices that a user can have within your organization before blocking new device registrations. The default value is set to 50. If this property is not specified during the policy update operation, it is automatically reset to 0 to indicate that users are not allowed to join any devices. */
    private Integer _userDeviceQuota;
    /**
     * Instantiates a new deviceRegistrationPolicy and sets the default values.
     * @return a void
     */
    public DeviceRegistrationPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceRegistrationPolicy
     */
    @javax.annotation.Nonnull
    public static DeviceRegistrationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceRegistrationPolicy();
    }
    /**
     * Gets the azureADJoin property value. Specifies the authorization policy for controlling registration of new devices using Azure AD Join within your organization. Required. For more information, see What is a device identity?.
     * @return a azureAdJoinPolicy
     */
    @javax.annotation.Nullable
    public AzureAdJoinPolicy getAzureADJoin() {
        return this._azureADJoin;
    }
    /**
     * Gets the azureADRegistration property value. Specifies the authorization policy for controlling registration of new devices using Azure AD registered within your organization. Required. For more information, see What is a device identity?.
     * @return a azureADRegistrationPolicy
     */
    @javax.annotation.Nullable
    public AzureADRegistrationPolicy getAzureADRegistration() {
        return this._azureADRegistration;
    }
    /**
     * Gets the description property value. The description of the device registration policy. It is always set to Tenant-wide policy that manages intial provisioning controls using quota restrictions, additional authentication and authorization checks. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the device registration policy. It is always set to Device Registration Policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceRegistrationPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("azureADJoin", (n) -> { currentObject.setAzureADJoin(n.getObjectValue(AzureAdJoinPolicy::createFromDiscriminatorValue)); });
            this.put("azureADRegistration", (n) -> { currentObject.setAzureADRegistration(n.getObjectValue(AzureADRegistrationPolicy::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("multiFactorAuthConfiguration", (n) -> { currentObject.setMultiFactorAuthConfiguration(n.getEnumValue(MultiFactorAuthConfiguration.class)); });
            this.put("userDeviceQuota", (n) -> { currentObject.setUserDeviceQuota(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the multiFactorAuthConfiguration property value. Specifies the authentication policy for a user to complete registration using Azure AD Join or Azure AD registered within your organization. The possible values are: 0 (meaning notRequired), 1 (meaning required), and 2 (meaning unknownFutureValue). The default value is 0.
     * @return a multiFactorAuthConfiguration
     */
    @javax.annotation.Nullable
    public MultiFactorAuthConfiguration getMultiFactorAuthConfiguration() {
        return this._multiFactorAuthConfiguration;
    }
    /**
     * Gets the userDeviceQuota property value. Specifies the maximum number of devices that a user can have within your organization before blocking new device registrations. The default value is set to 50. If this property is not specified during the policy update operation, it is automatically reset to 0 to indicate that users are not allowed to join any devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUserDeviceQuota() {
        return this._userDeviceQuota;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("azureADJoin", this.getAzureADJoin());
        writer.writeObjectValue("azureADRegistration", this.getAzureADRegistration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("multiFactorAuthConfiguration", this.getMultiFactorAuthConfiguration());
        writer.writeIntegerValue("userDeviceQuota", this.getUserDeviceQuota());
    }
    /**
     * Sets the azureADJoin property value. Specifies the authorization policy for controlling registration of new devices using Azure AD Join within your organization. Required. For more information, see What is a device identity?.
     * @param value Value to set for the azureADJoin property.
     * @return a void
     */
    public void setAzureADJoin(@javax.annotation.Nullable final AzureAdJoinPolicy value) {
        this._azureADJoin = value;
    }
    /**
     * Sets the azureADRegistration property value. Specifies the authorization policy for controlling registration of new devices using Azure AD registered within your organization. Required. For more information, see What is a device identity?.
     * @param value Value to set for the azureADRegistration property.
     * @return a void
     */
    public void setAzureADRegistration(@javax.annotation.Nullable final AzureADRegistrationPolicy value) {
        this._azureADRegistration = value;
    }
    /**
     * Sets the description property value. The description of the device registration policy. It is always set to Tenant-wide policy that manages intial provisioning controls using quota restrictions, additional authentication and authorization checks. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the device registration policy. It is always set to Device Registration Policy. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the multiFactorAuthConfiguration property value. Specifies the authentication policy for a user to complete registration using Azure AD Join or Azure AD registered within your organization. The possible values are: 0 (meaning notRequired), 1 (meaning required), and 2 (meaning unknownFutureValue). The default value is 0.
     * @param value Value to set for the multiFactorAuthConfiguration property.
     * @return a void
     */
    public void setMultiFactorAuthConfiguration(@javax.annotation.Nullable final MultiFactorAuthConfiguration value) {
        this._multiFactorAuthConfiguration = value;
    }
    /**
     * Sets the userDeviceQuota property value. Specifies the maximum number of devices that a user can have within your organization before blocking new device registrations. The default value is set to 50. If this property is not specified during the policy update operation, it is automatically reset to 0 to indicate that users are not allowed to join any devices.
     * @param value Value to set for the userDeviceQuota property.
     * @return a void
     */
    public void setUserDeviceQuota(@javax.annotation.Nullable final Integer value) {
        this._userDeviceQuota = value;
    }
}
