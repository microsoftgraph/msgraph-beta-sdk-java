package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Authentication extends Entity implements Parsable {
    /**
     * Represents the email addresses registered to a user for authentication.
     */
    private java.util.List<EmailAuthenticationMethod> emailMethods;
    /**
     * Represents the FIDO2 security keys registered to a user for authentication.
     */
    private java.util.List<Fido2AuthenticationMethod> fido2Methods;
    /**
     * Represents all authentication methods registered to a user.
     */
    private java.util.List<AuthenticationMethod> methods;
    /**
     * The details of the Microsoft Authenticator app registered to a user for authentication.
     */
    private java.util.List<MicrosoftAuthenticatorAuthenticationMethod> microsoftAuthenticatorMethods;
    /**
     * The operations property
     */
    private java.util.List<LongRunningOperation> operations;
    /**
     * Represents the Microsoft Authenticator Passwordless Phone Sign-in methods registered to a user for authentication.
     */
    private java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> passwordlessMicrosoftAuthenticatorMethods;
    /**
     * Represents the details of the password authentication method registered to a user for authentication.
     */
    private java.util.List<PasswordAuthenticationMethod> passwordMethods;
    /**
     * Represents the phone registered to a user for authentication.
     */
    private java.util.List<PhoneAuthenticationMethod> phoneMethods;
    /**
     * The platformCredentialMethods property
     */
    private java.util.List<PlatformCredentialAuthenticationMethod> platformCredentialMethods;
    /**
     * The settings and preferences for to the sign-in experience of a user.
     */
    private SignInPreferences signInPreferences;
    /**
     * The softwareOathMethods property
     */
    private java.util.List<SoftwareOathAuthenticationMethod> softwareOathMethods;
    /**
     * Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     */
    private java.util.List<TemporaryAccessPassAuthenticationMethod> temporaryAccessPassMethods;
    /**
     * Represents the Windows Hello for Business authentication method registered to a user for authentication.
     */
    private java.util.List<WindowsHelloForBusinessAuthenticationMethod> windowsHelloForBusinessMethods;
    /**
     * Instantiates a new Authentication and sets the default values.
     */
    public Authentication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Authentication
     */
    @jakarta.annotation.Nonnull
    public static Authentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Authentication();
    }
    /**
     * Gets the emailMethods property value. Represents the email addresses registered to a user for authentication.
     * @return a java.util.List<EmailAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAuthenticationMethod> getEmailMethods() {
        return this.emailMethods;
    }
    /**
     * Gets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @return a java.util.List<Fido2AuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Fido2AuthenticationMethod> getFido2Methods() {
        return this.fido2Methods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailMethods", (n) -> { this.setEmailMethods(n.getCollectionOfObjectValues(EmailAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("fido2Methods", (n) -> { this.setFido2Methods(n.getCollectionOfObjectValues(Fido2AuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("methods", (n) -> { this.setMethods(n.getCollectionOfObjectValues(AuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftAuthenticatorMethods", (n) -> { this.setMicrosoftAuthenticatorMethods(n.getCollectionOfObjectValues(MicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(LongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordlessMicrosoftAuthenticatorMethods", (n) -> { this.setPasswordlessMicrosoftAuthenticatorMethods(n.getCollectionOfObjectValues(PasswordlessMicrosoftAuthenticatorAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordMethods", (n) -> { this.setPasswordMethods(n.getCollectionOfObjectValues(PasswordAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneMethods", (n) -> { this.setPhoneMethods(n.getCollectionOfObjectValues(PhoneAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("platformCredentialMethods", (n) -> { this.setPlatformCredentialMethods(n.getCollectionOfObjectValues(PlatformCredentialAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("signInPreferences", (n) -> { this.setSignInPreferences(n.getObjectValue(SignInPreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareOathMethods", (n) -> { this.setSoftwareOathMethods(n.getCollectionOfObjectValues(SoftwareOathAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("temporaryAccessPassMethods", (n) -> { this.setTemporaryAccessPassMethods(n.getCollectionOfObjectValues(TemporaryAccessPassAuthenticationMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsHelloForBusinessMethods", (n) -> { this.setWindowsHelloForBusinessMethods(n.getCollectionOfObjectValues(WindowsHelloForBusinessAuthenticationMethod::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the methods property value. Represents all authentication methods registered to a user.
     * @return a java.util.List<AuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethod> getMethods() {
        return this.methods;
    }
    /**
     * Gets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @return a java.util.List<MicrosoftAuthenticatorAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftAuthenticatorAuthenticationMethod> getMicrosoftAuthenticatorMethods() {
        return this.microsoftAuthenticatorMethods;
    }
    /**
     * Gets the operations property value. The operations property
     * @return a java.util.List<LongRunningOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LongRunningOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the passwordlessMicrosoftAuthenticatorMethods property value. Represents the Microsoft Authenticator Passwordless Phone Sign-in methods registered to a user for authentication.
     * @return a java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> getPasswordlessMicrosoftAuthenticatorMethods() {
        return this.passwordlessMicrosoftAuthenticatorMethods;
    }
    /**
     * Gets the passwordMethods property value. Represents the details of the password authentication method registered to a user for authentication.
     * @return a java.util.List<PasswordAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordAuthenticationMethod> getPasswordMethods() {
        return this.passwordMethods;
    }
    /**
     * Gets the phoneMethods property value. Represents the phone registered to a user for authentication.
     * @return a java.util.List<PhoneAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneAuthenticationMethod> getPhoneMethods() {
        return this.phoneMethods;
    }
    /**
     * Gets the platformCredentialMethods property value. The platformCredentialMethods property
     * @return a java.util.List<PlatformCredentialAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlatformCredentialAuthenticationMethod> getPlatformCredentialMethods() {
        return this.platformCredentialMethods;
    }
    /**
     * Gets the signInPreferences property value. The settings and preferences for to the sign-in experience of a user.
     * @return a SignInPreferences
     */
    @jakarta.annotation.Nullable
    public SignInPreferences getSignInPreferences() {
        return this.signInPreferences;
    }
    /**
     * Gets the softwareOathMethods property value. The softwareOathMethods property
     * @return a java.util.List<SoftwareOathAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SoftwareOathAuthenticationMethod> getSoftwareOathMethods() {
        return this.softwareOathMethods;
    }
    /**
     * Gets the temporaryAccessPassMethods property value. Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     * @return a java.util.List<TemporaryAccessPassAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TemporaryAccessPassAuthenticationMethod> getTemporaryAccessPassMethods() {
        return this.temporaryAccessPassMethods;
    }
    /**
     * Gets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @return a java.util.List<WindowsHelloForBusinessAuthenticationMethod>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsHelloForBusinessAuthenticationMethod> getWindowsHelloForBusinessMethods() {
        return this.windowsHelloForBusinessMethods;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("emailMethods", this.getEmailMethods());
        writer.writeCollectionOfObjectValues("fido2Methods", this.getFido2Methods());
        writer.writeCollectionOfObjectValues("methods", this.getMethods());
        writer.writeCollectionOfObjectValues("microsoftAuthenticatorMethods", this.getMicrosoftAuthenticatorMethods());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("passwordlessMicrosoftAuthenticatorMethods", this.getPasswordlessMicrosoftAuthenticatorMethods());
        writer.writeCollectionOfObjectValues("passwordMethods", this.getPasswordMethods());
        writer.writeCollectionOfObjectValues("phoneMethods", this.getPhoneMethods());
        writer.writeCollectionOfObjectValues("platformCredentialMethods", this.getPlatformCredentialMethods());
        writer.writeObjectValue("signInPreferences", this.getSignInPreferences());
        writer.writeCollectionOfObjectValues("softwareOathMethods", this.getSoftwareOathMethods());
        writer.writeCollectionOfObjectValues("temporaryAccessPassMethods", this.getTemporaryAccessPassMethods());
        writer.writeCollectionOfObjectValues("windowsHelloForBusinessMethods", this.getWindowsHelloForBusinessMethods());
    }
    /**
     * Sets the emailMethods property value. Represents the email addresses registered to a user for authentication.
     * @param value Value to set for the emailMethods property.
     */
    public void setEmailMethods(@jakarta.annotation.Nullable final java.util.List<EmailAuthenticationMethod> value) {
        this.emailMethods = value;
    }
    /**
     * Sets the fido2Methods property value. Represents the FIDO2 security keys registered to a user for authentication.
     * @param value Value to set for the fido2Methods property.
     */
    public void setFido2Methods(@jakarta.annotation.Nullable final java.util.List<Fido2AuthenticationMethod> value) {
        this.fido2Methods = value;
    }
    /**
     * Sets the methods property value. Represents all authentication methods registered to a user.
     * @param value Value to set for the methods property.
     */
    public void setMethods(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethod> value) {
        this.methods = value;
    }
    /**
     * Sets the microsoftAuthenticatorMethods property value. The details of the Microsoft Authenticator app registered to a user for authentication.
     * @param value Value to set for the microsoftAuthenticatorMethods property.
     */
    public void setMicrosoftAuthenticatorMethods(@jakarta.annotation.Nullable final java.util.List<MicrosoftAuthenticatorAuthenticationMethod> value) {
        this.microsoftAuthenticatorMethods = value;
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<LongRunningOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the passwordlessMicrosoftAuthenticatorMethods property value. Represents the Microsoft Authenticator Passwordless Phone Sign-in methods registered to a user for authentication.
     * @param value Value to set for the passwordlessMicrosoftAuthenticatorMethods property.
     */
    public void setPasswordlessMicrosoftAuthenticatorMethods(@jakarta.annotation.Nullable final java.util.List<PasswordlessMicrosoftAuthenticatorAuthenticationMethod> value) {
        this.passwordlessMicrosoftAuthenticatorMethods = value;
    }
    /**
     * Sets the passwordMethods property value. Represents the details of the password authentication method registered to a user for authentication.
     * @param value Value to set for the passwordMethods property.
     */
    public void setPasswordMethods(@jakarta.annotation.Nullable final java.util.List<PasswordAuthenticationMethod> value) {
        this.passwordMethods = value;
    }
    /**
     * Sets the phoneMethods property value. Represents the phone registered to a user for authentication.
     * @param value Value to set for the phoneMethods property.
     */
    public void setPhoneMethods(@jakarta.annotation.Nullable final java.util.List<PhoneAuthenticationMethod> value) {
        this.phoneMethods = value;
    }
    /**
     * Sets the platformCredentialMethods property value. The platformCredentialMethods property
     * @param value Value to set for the platformCredentialMethods property.
     */
    public void setPlatformCredentialMethods(@jakarta.annotation.Nullable final java.util.List<PlatformCredentialAuthenticationMethod> value) {
        this.platformCredentialMethods = value;
    }
    /**
     * Sets the signInPreferences property value. The settings and preferences for to the sign-in experience of a user.
     * @param value Value to set for the signInPreferences property.
     */
    public void setSignInPreferences(@jakarta.annotation.Nullable final SignInPreferences value) {
        this.signInPreferences = value;
    }
    /**
     * Sets the softwareOathMethods property value. The softwareOathMethods property
     * @param value Value to set for the softwareOathMethods property.
     */
    public void setSoftwareOathMethods(@jakarta.annotation.Nullable final java.util.List<SoftwareOathAuthenticationMethod> value) {
        this.softwareOathMethods = value;
    }
    /**
     * Sets the temporaryAccessPassMethods property value. Represents a Temporary Access Pass registered to a user for authentication through time-limited passcodes.
     * @param value Value to set for the temporaryAccessPassMethods property.
     */
    public void setTemporaryAccessPassMethods(@jakarta.annotation.Nullable final java.util.List<TemporaryAccessPassAuthenticationMethod> value) {
        this.temporaryAccessPassMethods = value;
    }
    /**
     * Sets the windowsHelloForBusinessMethods property value. Represents the Windows Hello for Business authentication method registered to a user for authentication.
     * @param value Value to set for the windowsHelloForBusinessMethods property.
     */
    public void setWindowsHelloForBusinessMethods(@jakarta.annotation.Nullable final java.util.List<WindowsHelloForBusinessAuthenticationMethod> value) {
        this.windowsHelloForBusinessMethods = value;
    }
}
