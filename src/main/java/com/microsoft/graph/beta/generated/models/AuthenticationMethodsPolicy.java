package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationMethodsPolicy} and sets the default values.
     */
    public AuthenticationMethodsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationMethodsPolicy}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsPolicy();
    }
    /**
     * Gets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @return a {@link java.util.List<AuthenticationMethodConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodConfiguration> getAuthenticationMethodConfigurations() {
        return this.backingStore.get("authenticationMethodConfigurations");
    }
    /**
     * Gets the description property value. A description of the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethodConfigurations", (n) -> { this.setAuthenticationMethodConfigurations(n.getCollectionOfObjectValues(AuthenticationMethodConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("microsoftAuthenticatorPlatformSettings", (n) -> { this.setMicrosoftAuthenticatorPlatformSettings(n.getObjectValue(MicrosoftAuthenticatorPlatformSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("policyMigrationState", (n) -> { this.setPolicyMigrationState(n.getEnumValue(AuthenticationMethodsPolicyMigrationState::forValue)); });
        deserializerMap.put("policyVersion", (n) -> { this.setPolicyVersion(n.getStringValue()); });
        deserializerMap.put("reconfirmationInDays", (n) -> { this.setReconfirmationInDays(n.getIntegerValue()); });
        deserializerMap.put("registrationEnforcement", (n) -> { this.setRegistrationEnforcement(n.getObjectValue(RegistrationEnforcement::createFromDiscriminatorValue)); });
        deserializerMap.put("reportSuspiciousActivitySettings", (n) -> { this.setReportSuspiciousActivitySettings(n.getObjectValue(ReportSuspiciousActivitySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("systemCredentialPreferences", (n) -> { this.setSystemCredentialPreferences(n.getObjectValue(SystemCredentialPreferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time of the last update to the policy.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the microsoftAuthenticatorPlatformSettings property value. The microsoftAuthenticatorPlatformSettings property
     * @return a {@link MicrosoftAuthenticatorPlatformSettings}
     */
    @jakarta.annotation.Nullable
    public MicrosoftAuthenticatorPlatformSettings getMicrosoftAuthenticatorPlatformSettings() {
        return this.backingStore.get("microsoftAuthenticatorPlatformSettings");
    }
    /**
     * Gets the policyMigrationState property value. The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Don&apos;t use.
     * @return a {@link AuthenticationMethodsPolicyMigrationState}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsPolicyMigrationState getPolicyMigrationState() {
        return this.backingStore.get("policyMigrationState");
    }
    /**
     * Gets the policyVersion property value. The version of the policy in use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyVersion() {
        return this.backingStore.get("policyVersion");
    }
    /**
     * Gets the reconfirmationInDays property value. Days before the user will be asked to reconfirm their method.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReconfirmationInDays() {
        return this.backingStore.get("reconfirmationInDays");
    }
    /**
     * Gets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @return a {@link RegistrationEnforcement}
     */
    @jakarta.annotation.Nullable
    public RegistrationEnforcement getRegistrationEnforcement() {
        return this.backingStore.get("registrationEnforcement");
    }
    /**
     * Gets the reportSuspiciousActivitySettings property value. Enable users to report unexpected voice call or phone app notification multi-factor authentication prompts as suspicious.
     * @return a {@link ReportSuspiciousActivitySettings}
     */
    @jakarta.annotation.Nullable
    public ReportSuspiciousActivitySettings getReportSuspiciousActivitySettings() {
        return this.backingStore.get("reportSuspiciousActivitySettings");
    }
    /**
     * Gets the systemCredentialPreferences property value. Prompt users with their most-preferred credential for multifactor authentication.
     * @return a {@link SystemCredentialPreferences}
     */
    @jakarta.annotation.Nullable
    public SystemCredentialPreferences getSystemCredentialPreferences() {
        return this.backingStore.get("systemCredentialPreferences");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authenticationMethodConfigurations", this.getAuthenticationMethodConfigurations());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("microsoftAuthenticatorPlatformSettings", this.getMicrosoftAuthenticatorPlatformSettings());
        writer.writeEnumValue("policyMigrationState", this.getPolicyMigrationState());
        writer.writeStringValue("policyVersion", this.getPolicyVersion());
        writer.writeIntegerValue("reconfirmationInDays", this.getReconfirmationInDays());
        writer.writeObjectValue("registrationEnforcement", this.getRegistrationEnforcement());
        writer.writeObjectValue("reportSuspiciousActivitySettings", this.getReportSuspiciousActivitySettings());
        writer.writeObjectValue("systemCredentialPreferences", this.getSystemCredentialPreferences());
    }
    /**
     * Sets the authenticationMethodConfigurations property value. Represents the settings for each authentication method. Automatically expanded on GET /policies/authenticationMethodsPolicy.
     * @param value Value to set for the authenticationMethodConfigurations property.
     */
    public void setAuthenticationMethodConfigurations(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodConfiguration> value) {
        this.backingStore.set("authenticationMethodConfigurations", value);
    }
    /**
     * Sets the description property value. A description of the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time of the last update to the policy.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the microsoftAuthenticatorPlatformSettings property value. The microsoftAuthenticatorPlatformSettings property
     * @param value Value to set for the microsoftAuthenticatorPlatformSettings property.
     */
    public void setMicrosoftAuthenticatorPlatformSettings(@jakarta.annotation.Nullable final MicrosoftAuthenticatorPlatformSettings value) {
        this.backingStore.set("microsoftAuthenticatorPlatformSettings", value);
    }
    /**
     * Sets the policyMigrationState property value. The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable enumeration sentinel value. Don&apos;t use.
     * @param value Value to set for the policyMigrationState property.
     */
    public void setPolicyMigrationState(@jakarta.annotation.Nullable final AuthenticationMethodsPolicyMigrationState value) {
        this.backingStore.set("policyMigrationState", value);
    }
    /**
     * Sets the policyVersion property value. The version of the policy in use.
     * @param value Value to set for the policyVersion property.
     */
    public void setPolicyVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyVersion", value);
    }
    /**
     * Sets the reconfirmationInDays property value. Days before the user will be asked to reconfirm their method.
     * @param value Value to set for the reconfirmationInDays property.
     */
    public void setReconfirmationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("reconfirmationInDays", value);
    }
    /**
     * Sets the registrationEnforcement property value. Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication methods.
     * @param value Value to set for the registrationEnforcement property.
     */
    public void setRegistrationEnforcement(@jakarta.annotation.Nullable final RegistrationEnforcement value) {
        this.backingStore.set("registrationEnforcement", value);
    }
    /**
     * Sets the reportSuspiciousActivitySettings property value. Enable users to report unexpected voice call or phone app notification multi-factor authentication prompts as suspicious.
     * @param value Value to set for the reportSuspiciousActivitySettings property.
     */
    public void setReportSuspiciousActivitySettings(@jakarta.annotation.Nullable final ReportSuspiciousActivitySettings value) {
        this.backingStore.set("reportSuspiciousActivitySettings", value);
    }
    /**
     * Sets the systemCredentialPreferences property value. Prompt users with their most-preferred credential for multifactor authentication.
     * @param value Value to set for the systemCredentialPreferences property.
     */
    public void setSystemCredentialPreferences(@jakarta.annotation.Nullable final SystemCredentialPreferences value) {
        this.backingStore.set("systemCredentialPreferences", value);
    }
}
