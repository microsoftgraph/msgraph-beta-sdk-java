package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ActiveDirectoryWindowsAutopilotDeploymentProfile extends WindowsAutopilotDeploymentProfile implements Parsable {
    /** Configuration to join Active Directory domain */
    private WindowsDomainJoinConfiguration _domainJoinConfiguration;
    /** The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE. */
    private Boolean _hybridAzureADJoinSkipConnectivityCheck;
    /**
     * Instantiates a new ActiveDirectoryWindowsAutopilotDeploymentProfile and sets the default values.
     * @return a void
     */
    public ActiveDirectoryWindowsAutopilotDeploymentProfile() {
        super();
        this.setOdataType("#microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ActiveDirectoryWindowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nonnull
    public static ActiveDirectoryWindowsAutopilotDeploymentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActiveDirectoryWindowsAutopilotDeploymentProfile();
    }
    /**
     * Gets the domainJoinConfiguration property value. Configuration to join Active Directory domain
     * @return a windowsDomainJoinConfiguration
     */
    @javax.annotation.Nullable
    public WindowsDomainJoinConfiguration getDomainJoinConfiguration() {
        return this._domainJoinConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ActiveDirectoryWindowsAutopilotDeploymentProfile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("domainJoinConfiguration", (n) -> { currentObject.setDomainJoinConfiguration(n.getObjectValue(WindowsDomainJoinConfiguration::createFromDiscriminatorValue)); });
            this.put("hybridAzureADJoinSkipConnectivityCheck", (n) -> { currentObject.setHybridAzureADJoinSkipConnectivityCheck(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hybridAzureADJoinSkipConnectivityCheck property value. The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHybridAzureADJoinSkipConnectivityCheck() {
        return this._hybridAzureADJoinSkipConnectivityCheck;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("domainJoinConfiguration", this.getDomainJoinConfiguration());
        writer.writeBooleanValue("hybridAzureADJoinSkipConnectivityCheck", this.getHybridAzureADJoinSkipConnectivityCheck());
    }
    /**
     * Sets the domainJoinConfiguration property value. Configuration to join Active Directory domain
     * @param value Value to set for the domainJoinConfiguration property.
     * @return a void
     */
    public void setDomainJoinConfiguration(@javax.annotation.Nullable final WindowsDomainJoinConfiguration value) {
        this._domainJoinConfiguration = value;
    }
    /**
     * Sets the hybridAzureADJoinSkipConnectivityCheck property value. The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.
     * @param value Value to set for the hybridAzureADJoinSkipConnectivityCheck property.
     * @return a void
     */
    public void setHybridAzureADJoinSkipConnectivityCheck(@javax.annotation.Nullable final Boolean value) {
        this._hybridAzureADJoinSkipConnectivityCheck = value;
    }
}
