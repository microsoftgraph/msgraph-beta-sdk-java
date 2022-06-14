package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to allow the app from printing during the test. */
    private Boolean _allowPrinting;
    /** Indicates whether or not to allow screen capture capability during a test. */
    private Boolean _allowScreenCapture;
    /** Indicates whether or not to allow text suggestions during the test. */
    private Boolean _allowTextSuggestion;
    /** Specifies the application user model ID of the assessment app launched when a user signs in to a secure assessment with a local guest account. Important notice: this property must be set with localGuestAccountName in order to make the local guest account sign-in experience work properly for secure assessments. */
    private String _assessmentAppUserModelId;
    /** The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username). */
    private String _configurationAccount;
    /** The account type used to by ConfigurationAccount. Possible values are: azureADAccount, domainAccount, localAccount, localGuestAccount. */
    private SecureAssessmentAccountType _configurationAccountType;
    /** Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/). */
    private String _launchUri;
    /** Specifies the display text for the local guest account shown on the sign-in screen. Typically is the name of an assessment. When the user clicks the local guest account on the sign-in screen, an assessment app is launched with a specified assessment URL. Secure assessments can only be configured with local guest account sign-in on devices running Windows 10, version 1903 or later. Important notice: this property must be set with assessmentAppUserModelID in order to make the local guest account sign-in experience work properly for secure assessments. */
    private String _localGuestAccountName;
    /**
     * Instantiates a new Windows10SecureAssessmentConfiguration and sets the default values.
     * @return a void
     */
    public Windows10SecureAssessmentConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10SecureAssessmentConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10SecureAssessmentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10SecureAssessmentConfiguration();
    }
    /**
     * Gets the allowPrinting property value. Indicates whether or not to allow the app from printing during the test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPrinting() {
        return this._allowPrinting;
    }
    /**
     * Gets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowScreenCapture() {
        return this._allowScreenCapture;
    }
    /**
     * Gets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTextSuggestion() {
        return this._allowTextSuggestion;
    }
    /**
     * Gets the assessmentAppUserModelId property value. Specifies the application user model ID of the assessment app launched when a user signs in to a secure assessment with a local guest account. Important notice: this property must be set with localGuestAccountName in order to make the local guest account sign-in experience work properly for secure assessments.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssessmentAppUserModelId() {
        return this._assessmentAppUserModelId;
    }
    /**
     * Gets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigurationAccount() {
        return this._configurationAccount;
    }
    /**
     * Gets the configurationAccountType property value. The account type used to by ConfigurationAccount. Possible values are: azureADAccount, domainAccount, localAccount, localGuestAccount.
     * @return a secureAssessmentAccountType
     */
    @javax.annotation.Nullable
    public SecureAssessmentAccountType getConfigurationAccountType() {
        return this._configurationAccountType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10SecureAssessmentConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowPrinting", (n) -> { currentObject.setAllowPrinting(n.getBooleanValue()); });
            this.put("allowScreenCapture", (n) -> { currentObject.setAllowScreenCapture(n.getBooleanValue()); });
            this.put("allowTextSuggestion", (n) -> { currentObject.setAllowTextSuggestion(n.getBooleanValue()); });
            this.put("assessmentAppUserModelId", (n) -> { currentObject.setAssessmentAppUserModelId(n.getStringValue()); });
            this.put("configurationAccount", (n) -> { currentObject.setConfigurationAccount(n.getStringValue()); });
            this.put("configurationAccountType", (n) -> { currentObject.setConfigurationAccountType(n.getEnumValue(SecureAssessmentAccountType.class)); });
            this.put("launchUri", (n) -> { currentObject.setLaunchUri(n.getStringValue()); });
            this.put("localGuestAccountName", (n) -> { currentObject.setLocalGuestAccountName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the launchUri property value. Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLaunchUri() {
        return this._launchUri;
    }
    /**
     * Gets the localGuestAccountName property value. Specifies the display text for the local guest account shown on the sign-in screen. Typically is the name of an assessment. When the user clicks the local guest account on the sign-in screen, an assessment app is launched with a specified assessment URL. Secure assessments can only be configured with local guest account sign-in on devices running Windows 10, version 1903 or later. Important notice: this property must be set with assessmentAppUserModelID in order to make the local guest account sign-in experience work properly for secure assessments.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalGuestAccountName() {
        return this._localGuestAccountName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowPrinting", this.getAllowPrinting());
        writer.writeBooleanValue("allowScreenCapture", this.getAllowScreenCapture());
        writer.writeBooleanValue("allowTextSuggestion", this.getAllowTextSuggestion());
        writer.writeStringValue("assessmentAppUserModelId", this.getAssessmentAppUserModelId());
        writer.writeStringValue("configurationAccount", this.getConfigurationAccount());
        writer.writeEnumValue("configurationAccountType", this.getConfigurationAccountType());
        writer.writeStringValue("launchUri", this.getLaunchUri());
        writer.writeStringValue("localGuestAccountName", this.getLocalGuestAccountName());
    }
    /**
     * Sets the allowPrinting property value. Indicates whether or not to allow the app from printing during the test.
     * @param value Value to set for the allowPrinting property.
     * @return a void
     */
    public void setAllowPrinting(@javax.annotation.Nullable final Boolean value) {
        this._allowPrinting = value;
    }
    /**
     * Sets the allowScreenCapture property value. Indicates whether or not to allow screen capture capability during a test.
     * @param value Value to set for the allowScreenCapture property.
     * @return a void
     */
    public void setAllowScreenCapture(@javax.annotation.Nullable final Boolean value) {
        this._allowScreenCapture = value;
    }
    /**
     * Sets the allowTextSuggestion property value. Indicates whether or not to allow text suggestions during the test.
     * @param value Value to set for the allowTextSuggestion property.
     * @return a void
     */
    public void setAllowTextSuggestion(@javax.annotation.Nullable final Boolean value) {
        this._allowTextSuggestion = value;
    }
    /**
     * Sets the assessmentAppUserModelId property value. Specifies the application user model ID of the assessment app launched when a user signs in to a secure assessment with a local guest account. Important notice: this property must be set with localGuestAccountName in order to make the local guest account sign-in experience work properly for secure assessments.
     * @param value Value to set for the assessmentAppUserModelId property.
     * @return a void
     */
    public void setAssessmentAppUserModelId(@javax.annotation.Nullable final String value) {
        this._assessmentAppUserModelId = value;
    }
    /**
     * Sets the configurationAccount property value. The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     * @param value Value to set for the configurationAccount property.
     * @return a void
     */
    public void setConfigurationAccount(@javax.annotation.Nullable final String value) {
        this._configurationAccount = value;
    }
    /**
     * Sets the configurationAccountType property value. The account type used to by ConfigurationAccount. Possible values are: azureADAccount, domainAccount, localAccount, localGuestAccount.
     * @param value Value to set for the configurationAccountType property.
     * @return a void
     */
    public void setConfigurationAccountType(@javax.annotation.Nullable final SecureAssessmentAccountType value) {
        this._configurationAccountType = value;
    }
    /**
     * Sets the launchUri property value. Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     * @param value Value to set for the launchUri property.
     * @return a void
     */
    public void setLaunchUri(@javax.annotation.Nullable final String value) {
        this._launchUri = value;
    }
    /**
     * Sets the localGuestAccountName property value. Specifies the display text for the local guest account shown on the sign-in screen. Typically is the name of an assessment. When the user clicks the local guest account on the sign-in screen, an assessment app is launched with a specified assessment URL. Secure assessments can only be configured with local guest account sign-in on devices running Windows 10, version 1903 or later. Important notice: this property must be set with assessmentAppUserModelID in order to make the local guest account sign-in experience work properly for secure assessments.
     * @param value Value to set for the localGuestAccountName property.
     * @return a void
     */
    public void setLocalGuestAccountName(@javax.annotation.Nullable final String value) {
        this._localGuestAccountName = value;
    }
}
