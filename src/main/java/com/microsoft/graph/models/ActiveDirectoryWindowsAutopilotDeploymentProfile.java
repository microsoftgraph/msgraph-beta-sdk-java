package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Autopilot Deployment Profile
 */
public class ActiveDirectoryWindowsAutopilotDeploymentProfile extends WindowsAutopilotDeploymentProfile implements Parsable {
    /**
     * Configuration to join Active Directory domain
     */
    private WindowsDomainJoinConfiguration domainJoinConfiguration;
    /**
     * The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.
     */
    private Boolean hybridAzureADJoinSkipConnectivityCheck;
    /**
     * Instantiates a new activeDirectoryWindowsAutopilotDeploymentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ActiveDirectoryWindowsAutopilotDeploymentProfile() {
        super();
        this.setOdataType("#microsoft.graph.activeDirectoryWindowsAutopilotDeploymentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activeDirectoryWindowsAutopilotDeploymentProfile
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
        return this.domainJoinConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainJoinConfiguration", (n) -> { this.setDomainJoinConfiguration(n.getObjectValue(WindowsDomainJoinConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("hybridAzureADJoinSkipConnectivityCheck", (n) -> { this.setHybridAzureADJoinSkipConnectivityCheck(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hybridAzureADJoinSkipConnectivityCheck property value. The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHybridAzureADJoinSkipConnectivityCheck() {
        return this.hybridAzureADJoinSkipConnectivityCheck;
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
        writer.writeObjectValue("domainJoinConfiguration", this.getDomainJoinConfiguration());
        writer.writeBooleanValue("hybridAzureADJoinSkipConnectivityCheck", this.getHybridAzureADJoinSkipConnectivityCheck());
    }
    /**
     * Sets the domainJoinConfiguration property value. Configuration to join Active Directory domain
     * @param value Value to set for the domainJoinConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainJoinConfiguration(@javax.annotation.Nullable final WindowsDomainJoinConfiguration value) {
        this.domainJoinConfiguration = value;
    }
    /**
     * Sets the hybridAzureADJoinSkipConnectivityCheck property value. The Autopilot Hybrid Azure AD join flow will continue even if it does not establish domain controller connectivity during OOBE.
     * @param value Value to set for the hybridAzureADJoinSkipConnectivityCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHybridAzureADJoinSkipConnectivityCheck(@javax.annotation.Nullable final Boolean value) {
        this.hybridAzureADJoinSkipConnectivityCheck = value;
    }
}
